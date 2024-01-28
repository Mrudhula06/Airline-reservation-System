package com.example.demo;

import com.example.demo.DatabaseConnection;
//import com.example.demo.Home;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
//import java.sql.Connection;
import java.sql.*;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



//import static java.awt.Color.white;
//import static java.awt.SystemColor.text;

public class HelloApplication extends Application {
    DatabaseConnection dbConnection;
    Connection connectDB;
    Statement st = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    MenuBar menu=new MenuBar();
    Menu homeMenu=new Menu("Home");
    Menu fmenu1=new Menu("Search");
    Menu fmenu2=new Menu("Booking");
    Menu fmenu3=new Menu("Login");

    TextField tfUserName,tfPhone,tfNationality,tfAddress,tfCity,tfState,tfCountry,tfEmailId ;
    DatePicker dpick;
    PasswordField pf,cpf;
    ComboBox<String> cb=new ComboBox<>();
    Button btnSignup = new Button("SIGN UP");
    Button btnHome = new Button("Home");
    private Stage primaryStage;
    Scene scene1;
    public Scene getScene()
    {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validate Mobile Number");
        alert.setHeaderText(null);
        alert.setContentText("Please Enter Valid Mobile Number" + scene1);
        alert.showAndWait();
        return scene1;
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        FlowPane fp=new FlowPane();
        scene1 = new Scene(fp, 320, 240);

        stage.setScene(scene1);
        stage.show();
        this.primaryStage = stage;
        primaryStage.setTitle("Flowerstyle Net");
        GridPane g=new GridPane();

        g.setHgap(18);
        g.setVgap(10);
        g.setAlignment(Pos.CENTER);

        menu.getMenus().addAll(homeMenu);

        menu.getMenus().addAll(fmenu1);
        menu.getMenus().addAll(fmenu2);
        menu.getMenus().addAll(fmenu3);

        menu.prefWidthProperty().bind(fp.widthProperty());
        fp.getChildren().add(0,menu);

        BackgroundFill background_fill = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(background_fill);
        menu.setBackground(background1);





        FileInputStream input = new FileInputStream("D:\\fli.png");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundimage);
        g.setBackground(background);

        stage.setTitle("ARS");

        Label l1=new Label("NAME  : ");
        l1.setTextFill(Color.BLACK);
        l1.setStyle("-fx-font-weight: bold");

        // TextField t1=new TextField();
        tfUserName=new TextField();
        tfUserName.setPromptText("Your Name");

        Pattern pattern = Pattern.compile("[a-zA-Z.]*");
        UnaryOperator<TextFormatter.Change> filter = c -> {
            if (pattern.matcher(c.getControlNewText()).matches()) {
                return c ;
            } else {
                return null ;
            }
        };
        TextFormatter<String> formatter = new TextFormatter<>(filter);
        tfUserName.setTextFormatter(formatter);

        Label l2=new Label("PHONE NUMBER  : ");
        l2.setTextFill(Color.BLACK);
        l2.setStyle("-fx-font-weight: bold");
        //TextField t2=new TextField();
        tfPhone=new TextField();
        tfPhone.setPromptText("Your PhoneNumber");

        tfPhone.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {                                                      //Numeric values only
                if (!newValue.matches("\\d*")) {
                    tfPhone.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        Label p1=new Label("\n");
        g.addRow(1,l1,tfUserName,l2,tfPhone);

        Label l3=new Label("DOB  : ");
        l3.setTextFill(Color.BLACK);
        l3.setStyle("-fx-font-weight: bold");
        // DatePicker d = new DatePicker();
        Label l4=new Label("GENDER  : ");
        l4.setTextFill(Color.BLACK);
        l4.setStyle("-fx-font-weight: bold");
        dpick = new DatePicker();
        dpick.setPromptText("Your DateOfBirth");

        // ComboBox<String> c=new ComboBox<>();
        cb=new ComboBox<>();
        cb.setPromptText("Select Gender");
        ObservableList<String> lst = cb.getItems();
        lst.add("Male");
        lst.add("Female");
        lst.add("Not specified");
        Label p2=new Label("\n");
        g.addRow(5,l3,dpick,l4,cb);

        Label l5=new Label("NATIONALITY  : ");
        l5.setTextFill(Color.BLACK);
        l5.setStyle("-fx-font-weight: bold");
        // TextField t5=new TextField();
        tfNationality=new TextField();
        tfNationality.setPromptText("Your Nationality");

        TextFormatter<String> formatter1 = new TextFormatter<>(filter);
        tfNationality.setTextFormatter(formatter1);

        Label l6=new Label("ADDRESS  : ");
        l6.setTextFill(Color.BLACK);
        l6.setStyle("-fx-font-weight: bold");
        // TextField t6=new TextField();
        tfAddress=new TextField();
        tfAddress.setPromptText("Your Address");
        Label p3=new Label("\n");
        g.addRow(9,l5,tfNationality,l6,tfAddress);

        Label l7=new Label("CITY  : ");
        l7.setTextFill(Color.BLACK);
        l7.setStyle("-fx-font-weight: bold");
        // TextField t7=new TextField();
        tfCity=new TextField();
        tfCity.setPromptText("Your City");

        TextFormatter<String> formatter2 = new TextFormatter<>(filter);
        tfCity.setTextFormatter(formatter2);
        Label l8=new Label("STATE  : ");
        l8.setTextFill(Color.BLACK);
        l8.setStyle("-fx-font-weight: bold");
        //TextField t8=new TextField();
        tfState=new TextField();
        tfState.setPromptText("Your State");
        TextFormatter<String> formatter3 = new TextFormatter<>(filter);
        tfState.setTextFormatter(formatter3);
        Label p4=new Label("\n");
        g.addRow(13,l7,tfCity,l8,tfState);

        Label l9=new Label("COUNTRY  : ");
        l9.setTextFill(Color.BLACK);
        l9.setStyle("-fx-font-weight: bold");
        // TextField t9=new TextField();
        tfCountry=new TextField();
        tfCountry.setPromptText("Your Country");
        TextFormatter<String> formatter4 = new TextFormatter<>(filter);
        tfCountry.setTextFormatter(formatter4);
        Label l10=new Label("EMAIL ID  : ");
        l10.setTextFill(Color.BLACK);
        l10.setStyle("-fx-font-weight: bold");
        // TextField t10=new TextField();
        tfEmailId=new TextField();
        tfEmailId.setPromptText("Your Email id");

        Label p5=new Label("\n");
        g.addRow(17,l9,tfCountry,l10,tfEmailId);


        Label l11=new Label("PASSWORD  : ");
        l11.setTextFill(Color.BLACK);
        l11.setStyle("-fx-font-weight: bold");
        // TextField t11=new TextField();
        // PasswordField p= new PasswordField();
        pf= new PasswordField();
        pf.setPromptText("Your password");
        Label l12=new Label("CONFIRM PASSWORD : ");
        l12.setTextFill(Color.BLACK);
        l12.setStyle("-fx-font-weight: bold");
        // TextField t12=new TextField();
        //PasswordField k= new PasswordField();
        cpf= new PasswordField();
        cpf.setPromptText("Your password");
        Label p6=new Label("\n");
        g.addRow(21,l11,pf,l12,cpf);

        //Button btnSignup = new Button("SIGN UP");
        btnSignup.setFont(Font.font("SanSerif",15));
        btnSignup.setAlignment(Pos.BOTTOM_CENTER);

        btnSignup.setTranslateX(260);
        btnSignup.setTranslateY(0);

        g.addRow(27, btnSignup);

//        btnHome = new Button("Home");
//        btnHome.setFont(Font.font("SanSerif",15));
//        btnHome.setAlignment(Pos.BOTTOM_RIGHT);
//
//        g.addRow(28, btnHome);

        BorderPane pane = new BorderPane();

        pane.setCenter(g);
        pane.setTop(fp);
        Scene scene = new Scene(pane, 300, 250);

        stage.setScene(scene);
        stage.show();

        btnSignup.setOnAction(e ->{
            if(validateFields()){
                if(validateMobileNo() &  validateEmail() & validatePassword() ){
                    // l10.setTextFill(Color.GREEN);
                    registerUser();
                }
            }
        });
//        btnHome.setOnAction(e ->{
//            changeScenes();
//        });
//
//        homeMenu.setOnHidden(new EventHandler<Event>() {
//            @Override
//            public void handle(Event event) {
//                changeScenesMenu(event);
//            }
//        });

        DropShadow shadow = new DropShadow();
        btnSignup.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        btnSignup.setEffect(shadow);
                    }
                });
        btnSignup.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        btnSignup.setEffect(null);
                    }
                });

        btnHome.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        btnHome.setEffect(shadow);
                    }
                });
        btnHome.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        btnHome.setEffect(null);
                    }
                });
        homeMenu.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        // homeMenu.setEffect(shadow);
                    }
                });
        homeMenu.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        // homeMenu.setEffect(null);
                    }
                });
        Button res1=new Button("RESET");
        res1.setFont(Font.font("SanSerif",15));
        g.addRow(27,res1);


        res1.setOnAction(e -> {
            tfUserName.clear();
                    tfPhone.clear();
            tfNationality.clear();
                    tfAddress.clear();
            tfCity.clear();
                    tfState.clear();
            tfCountry.clear();
                    tfEmailId.clear();
            pf.clear();
                    cpf.clear();


        });

//        DropShadow shadow = new DropShadow();
        res1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        res1.setEffect(shadow);
                    }
                });
        res1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        res1.setEffect(null);
                    }
                });

//mannuuu      ???? call? boost NICE(Star emoji)romba imp? eeeeee(angry emoji) ahn ahn ponadhum call me gone na kudichitu tha pannuvan ohhhh ohhhh appo boost ah illa proj ah??BOOST... Ahhnn ahnnn
        btnSignup.setTranslateX(170);
        btnSignup.setTranslateY(0);
        res1.setTranslateX(200);
        res1.setTranslateY(0);






    }

    public static void main(String[] args) {
        launch();
    }

//    private void changeScenes()
//    {
//        Home hScene = new Home();
//        Scene scene = hScene.getScene();
//
//        // set new title
//        // stage.setTitle("Customer Information");
//
//        // change the scene on the stage
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//    }
//    private void changeScenesMenu(Event event)
//    {
//        Home hScene = new Home();
//        Scene scene = hScene.getScene();
//        // set new title
//        // stage.setTitle("Customer Information");
//
//        // change the scene on the stage
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
    private boolean validateMobileNo(){
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(tfPhone.getText());
        if(m.find() && m.group().equals(tfPhone.getText())){
            try{
                String isMobileExistQuery= "Select PhoneNumber from tbl_User where PhoneNumber= '"+tfPhone.getText() +"'";
                dbConnection= new DatabaseConnection();
                connectDB= dbConnection.getConnection();
                pst = connectDB.prepareStatement(isMobileExistQuery);
                rs= pst.executeQuery();
                if(rs.next()){
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("User Already Exist");
                    alert.setHeaderText(null);
                    alert.setContentText("Mobile Number Already Exist!");
                    alert.showAndWait();
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
                e.getCause();
            }
            return true;
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Mobile Number");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter Valid Mobile Number");
            alert.showAndWait();
            return false;
        }
    }

    private boolean validateEmail(){
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(tfEmailId.getText());
        if(m.find() && m.group().equals(tfEmailId.getText())){
            try{
                String isEmailExistQuery= "Select EmailId from tbl_User where EmailId= '"+tfEmailId.getText() +"'";
                dbConnection= new DatabaseConnection();
                connectDB= dbConnection.getConnection();
                pst = connectDB.prepareStatement(isEmailExistQuery);
                rs= pst.executeQuery();
                if(rs.next()){
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("User Already Exist");
                    alert.setHeaderText(null);
                    alert.setContentText("EmailId Already Exist!");
                    alert.showAndWait();
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
                e.getCause();
            }

            return true;
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Email");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter Valid Email");
            alert.showAndWait();
            return false;
        }
    }

    private boolean validatePassword(){
        Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
        Matcher m = p.matcher(pf.getText());
        if(m.matches()){
            return true;
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Password");
            alert.setHeaderText(null);
            alert.setContentText("Password must contain at least one(Digit, Lowercase, UpperCase and Special Character) and length must be between 6 -15");
            alert.showAndWait();
            return false;
        }
    }
    private boolean validateFields(){
        if( tfUserName.getText().isEmpty()){
            tfUserName.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Bounce(tfUserName).play();
            return false;
        }else{
            tfUserName.setStyle(null);
        }
        if( tfPhone.getText().isEmpty()){
            tfPhone.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfPhone).play();
            return false;
        }else{
            tfPhone.setStyle(null);
        }
        if(dpick.getEditor().getText().isEmpty()){
            dpick.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(dpick).play();
            return false;
        }else{
            dpick.setStyle(null);
        }
        if(cb.getSelectionModel().isEmpty()) {
            cb.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(cb).play();
            return false;
        }else{
            dpick.setStyle(null);
        }
        if( tfNationality.getText().isEmpty()){
            tfNationality.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfNationality).play();
            return false;
        }else{
            tfNationality.setStyle(null);
        }
        if( tfAddress.getText().isEmpty()){
            tfAddress.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfAddress).play();
            return false;
        }else{
            tfAddress.setStyle(null);
        }
        if( tfCity.getText().isEmpty()){
            tfCity.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfCity).play();
            return false;
        }else{
            tfCity.setStyle(null);
        }
        if( tfState.getText().isEmpty()){
            tfState.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfState).play();
            return false;
        }else{
            tfState.setStyle(null);
        }
        if( tfCountry.getText().isEmpty()){
            tfCountry.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfCountry).play();
            return false;
        }else{
            tfCountry.setStyle(null);
        }
        if( tfEmailId.getText().isEmpty()){
            tfEmailId.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(tfEmailId).play();
            return false;
        }else{
            tfEmailId.setStyle(null);
        }
        if( pf.getText().isEmpty()){
            pf.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(pf).play();
            return false;
        }else{
            pf.setStyle(null);
        }
        if( cpf.getText().isEmpty()){
            cpf.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.Shake(cpf).play();
            return false;
        }else{
            cpf.setStyle(null);
        }
        return true;
    }


    public void registerUser()
    {
        try{
            dbConnection= new DatabaseConnection();
            connectDB= dbConnection.getConnection();
            String UserName = tfUserName.getText();
            String PhoneNumber = tfPhone.getText();
            String DOB = dpick.getEditor().getText();
            String Gender = cb.getSelectionModel().getSelectedItem();
            String Nationality = tfNationality.getText();
            String Address = tfAddress.getText();
            String City = tfCity.getText();
            String State = tfState.getText();
            String Country = tfCity.getText();
            String EmailId = tfEmailId.getText();
            String Password = pf.getText();

            String insertItems = "INSERT INTO tbl_User(UserName, PhoneNumber, DOB, Gender, Nationality, Address, City, State, Country, EmailId,Password) VALUES('";
            String insertValues=  UserName + "','" + PhoneNumber+ "','" + DOB+ "','" + Gender+ "','" + Nationality+ "','" + Address+ "','" + City + "','" +State + "','" + Country+ "','" + EmailId+ "','" +Password +"')";
            String insertQry= insertItems + insertValues;

            st = connectDB.createStatement();
            st.executeUpdate(insertQry);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("User has been created.");
            alert.showAndWait();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}