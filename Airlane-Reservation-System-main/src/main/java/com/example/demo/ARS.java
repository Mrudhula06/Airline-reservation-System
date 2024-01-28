//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo;

import animatefx.animation.Bounce;
import animatefx.animation.FadeIn;
import animatefx.animation.Flash;
import animatefx.animation.Shake;
import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ARS extends Application {
    Stage window;
    Scene scene1;
    Scene scene2;
    GridPane paygp = new GridPane();
    Scene payscene;
    DatabaseConnection dbConnection;
    Connection connectDB;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    String UserName;
    Label hl;
    Label sl;
    Label bl;
    Label ll;
    Label cl;
    MenuBar menu;
    Menu fmenu;
    Menu fmenu1;
    Menu fmenu2;
    Menu fmenu3;
    Menu fmenu4;
    Label hml;
    Label shl;
    Label bhl;
    Label lhl;
    Label chl;
    Menu hmenu;
    Menu hmenu1;
    Menu hmenu2;
    Menu hmenu3;
    Menu hmenu4;
    GridPane loghomgrid;

    AnchorPane loghomap;
    BorderPane loghombp;
    FlowPane loghomstack;
    Scene loghomscene;
    MenuBar loghommenu;
    Label loghomtxt;
    TextField tfUserName;
    TextField tfPhone;
    TextField tfNationality;
    TextField tfAddress;
    TextField tfCity;
    TextField tfState;
    TextField tfCountry;
    TextField tfEmailId;
    DatePicker dpick;
    PasswordField pf;
    PasswordField cpf;
    ComboBox<String> cb;
    Button btnSignup;
    Button btnHome;
    FlowPane fp;
    TextField t1;
    ComboBox cbo2;
    ComboBox cbo1;
    ComboBox<String> cbo;
    TextField te3;
    TextField te1;
    ComboBox<String> bookcom;
    TextField bookt14;
    TextField bookt12;
    TextField bookt11;
    ComboBox<String> secbo1;
    ComboBox<String> seo1;
    DatePicker sed;
    ComboBox secbo;
    BorderPane loginPane;
    Scene loginScene;
    PasswordField p;



    Integer User_Id =1;
    GridPane tickgp=new GridPane();
    Scene ticksc = new Scene(tickgp, 1540.0, 835.0);
    Label tick;
    Label ticnm;
    Label ticcls;
    Label ticseat;
    Label ticflino;
    Label ticfrom;
    Label ticto;

    Label ticprice;
    Label lblUname ;
    Menu unMenu ;
    public ARS() {
        this.payscene = new Scene(this.paygp, 1540.0, 835.0);
        this.st = null;
        this.pst = null;
        this.rs = null;
        this.UserName = "";
        this.User_Id = 1;
        this.hl = new Label("Home");
        this.sl = new Label("Search Flight");
        this.bl = new Label("Booking");
        this.ll = new Label("Login");
        this.cl = new Label("Cancellation");
        this.menu = new MenuBar();
        this.fmenu = new Menu("", this.hl);
        this.fmenu1 = new Menu("", this.sl);
        this.fmenu2 = new Menu("", this.bl);
        this.fmenu3 = new Menu("", this.ll);
        this.fmenu4 = new Menu("", this.cl);
        this.hml = new Label("Home");
        this.shl = new Label("Search");
        this.bhl = new Label("Booking");
        this.lhl = new Label("Login");
        this.chl = new Label("Cancellation");
        this.hmenu = new Menu("", this.hml);
        this.hmenu1 = new Menu("", this.shl);
        this.hmenu2 = new Menu("", this.bhl);
        this.hmenu3 = new Menu("", this.lhl);
        this.hmenu4 = new Menu("", this.chl);
        this.loghomgrid = new GridPane();
        this.loghomstack = new FlowPane();
        this.loghomap = new AnchorPane();
        this.loghombp=new BorderPane();
        this.loghomscene = new Scene(this.loghombp, 1540.0, 835.0);
        this.loghommenu = new MenuBar();
        this.loghomtxt = new Label();
        this.cb = new ComboBox();
        this.btnSignup = new Button("SIGN UP");
        this.btnHome = new Button("Home");
        this.fp = new FlowPane();
        this.t1 = new TextField();
        this.cbo2 = new ComboBox();
        this.cbo1 = new ComboBox();
        this.cbo = new ComboBox();
        this.te3 = new TextField();
        this.te1 = new TextField();
        this.bookcom = new ComboBox();
        this.bookt14 = new TextField();
        this.bookt12 = new TextField();
        this.bookt11 = new TextField();
        this.secbo1 = new ComboBox();
        this.seo1 = new ComboBox();
        this.sed = new DatePicker();
        this.secbo = new ComboBox();
        this.loginPane = new BorderPane();
        this.loginScene = new Scene(this.loginPane, 1540.0, 835.0);
        this.p = new PasswordField();
        this.tick = new Label("TICKET");
        this.ticnm = new Label("NAME :");
        this.ticcls = new Label("CLASS :");
        this.ticseat = new Label("SEAT NO :");
        this.ticflino = new Label("FLIGHT NO :");
        this.ticfrom = new Label("FROM :");
        this.ticto = new Label("TO :");
        this.ticprice = new Label("TOTAL AMOUNT : ");
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws FileNotFoundException {
        this.window = primaryStage;


//       ------------------------------SIGNUP PAGE STARTS----------------------------------------



        FlowPane fp = new FlowPane();
//        new Label("Welcome to First Scene!");
        GridPane g = new GridPane();
        g.setHgap(18.0);
        g.setVgap(10.0);
        g.setAlignment(Pos.CENTER);


        this.menu.getMenus().addAll(new Menu[]{this.fmenu});
        this.menu.getMenus().addAll(new Menu[]{this.fmenu3});
        this.menu.prefWidthProperty().bind(fp.widthProperty());
        fp.getChildren().add(0, this.menu);

        BackgroundFill background_fill1 = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background2 = new Background(new BackgroundFill[]{background_fill1});
        this.menu.setBackground(background2);


        FileInputStream input = null;

        try {
            input = new FileInputStream("images/blurbg.png");
        } catch (FileNotFoundException var163) {
            throw new RuntimeException(var163);
        }

        Image image = new Image(input);
        BackgroundImage backgroundimage3 = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background3 = new Background(new BackgroundImage[]{backgroundimage3});
        g.setBackground(background3);


//        this.window.setTitle("ARS");


        Label l1 = new Label("NAME  : ");
        l1.setTextFill(Color.BLACK);
        l1.setStyle("-fx-font-weight: bold");


        this.tfUserName = new TextField();
        this.tfUserName.setPromptText("Your Name");
        Pattern pattern = Pattern.compile("[a-zA-Z.]*");
        UnaryOperator<TextFormatter.Change> filter = (c) -> {
            return pattern.matcher(c.getControlNewText()).matches() ? c : null;
        };
        TextFormatter<String> formatter = new TextFormatter(filter);
        this.tfUserName.setTextFormatter(formatter);


        Label l2 = new Label("PHONE NUMBER  : ");
        l2.setTextFill(Color.BLACK);
        l2.setStyle("-fx-font-weight: bold");


        this.tfPhone = new TextField();
        this.tfPhone.setPromptText("Your PhoneNumber");
        this.tfPhone.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ARS.this.tfPhone.setText(newValue.replaceAll("[^\\d]", ""));
                }

            }
        });
        new Label("\n");
        g.addRow(1, new Node[]{l1, this.tfUserName, l2, this.tfPhone});


        Label l3 = new Label("DOB  : ");
        l3.setTextFill(Color.BLACK);
        l3.setStyle("-fx-font-weight: bold");
        Label l4 = new Label("GENDER  : ");
        l4.setTextFill(Color.BLACK);
        l4.setStyle("-fx-font-weight: bold");
        this.dpick = new DatePicker();

        this.dpick.setPromptText("Your DateOfBirth");
        this.cb = new ComboBox();
        this.cb.setPromptText("Select Gender");
        ObservableList<String> lst = this.cb.getItems();
        lst.add("Male");
        lst.add("Female");
        lst.add("Not specified");
        new Label("\n");
        g.addRow(5, new Node[]{l3, this.dpick, l4, this.cb});


        Label l5 = new Label("NATIONALITY  : ");
        l5.setTextFill(Color.BLACK);
        l5.setStyle("-fx-font-weight: bold");
        this.tfNationality = new TextField();
        this.tfNationality.setPromptText("Your Nationality");
        TextFormatter<String> formatter1 = new TextFormatter(filter);
        this.tfNationality.setTextFormatter(formatter1);
        Label l6 = new Label("ADDRESS  : ");
        l6.setTextFill(Color.BLACK);
        l6.setStyle("-fx-font-weight: bold");
        this.tfAddress = new TextField();
        this.tfAddress.setPromptText("Your Address");
        new Label("\n");
        g.addRow(9, new Node[]{l5, this.tfNationality, l6, this.tfAddress});


        Label l7 = new Label("CITY  : ");
        l7.setTextFill(Color.BLACK);
        l7.setStyle("-fx-font-weight: bold");
        this.tfCity = new TextField();
        this.tfCity.setPromptText("Your City");
        TextFormatter<String> formatter2 = new TextFormatter(filter);
        this.tfCity.setTextFormatter(formatter2);
        Label l8 = new Label("STATE  : ");
        l8.setTextFill(Color.BLACK);
        l8.setStyle("-fx-font-weight: bold");
        this.tfState = new TextField();
        this.tfState.setPromptText("Your State");
        TextFormatter<String> formatter3 = new TextFormatter(filter);
        this.tfState.setTextFormatter(formatter3);
        new Label("\n");
        g.addRow(13, new Node[]{l7, this.tfCity, l8, this.tfState});


        Label l9 = new Label("COUNTRY  : ");
        l9.setTextFill(Color.BLACK);
        l9.setStyle("-fx-font-weight: bold");
        this.tfCountry = new TextField();
        this.tfCountry.setPromptText("Your Country");
        TextFormatter<String> formatter4 = new TextFormatter(filter);
        this.tfCountry.setTextFormatter(formatter4);
        Label l10 = new Label("EMAIL ID  : ");
        l10.setTextFill(Color.BLACK);
        l10.setStyle("-fx-font-weight: bold");
        this.tfEmailId = new TextField();
        this.tfEmailId.setPromptText("Your Email id");
        new Label("\n");
        g.addRow(17, new Node[]{l9, this.tfCountry, l10, this.tfEmailId});


        Label l11 = new Label("PASSWORD  : ");
        l11.setTextFill(Color.BLACK);
        l11.setStyle("-fx-font-weight: bold");
        this.pf = new PasswordField();
        this.pf.setPromptText("Your password");
        Label l12 = new Label("CONFIRM PASSWORD : ");
        l12.setTextFill(Color.BLACK);
        l12.setStyle("-fx-font-weight: bold");
        this.cpf = new PasswordField();
        this.cpf.setPromptText("Your password");
        new Label("\n");
        g.addRow(21, new Node[]{l11, this.pf, l12, this.cpf});


        btnSignup.setStyle("-fx-background-color: #deb887");
        this.btnSignup.setFont(Font.font("SanSerif", 15.0));
        this.btnSignup.setAlignment(Pos.BOTTOM_CENTER);
//        this.btnSignup.setTranslateX(260.0);
//        this.btnSignup.setTranslateY(0.0);
        g.addRow(27, new Node[]{this.btnSignup});


        BorderPane pane = new BorderPane();
        pane.setCenter(g);
        pane.setTop(fp);
        Scene scene = new Scene(pane, 1540.0, 835.0);


        this.btnSignup.setOnAction((e) -> {
            if (this.validateFields() && this.validateMobileNo() & this.validateEmail() & this.validatePassword() & this.signequals()) {
                this.registerUser();
                this.tfUserName.clear();
                this.tfPhone.clear();
                this.dpick.setValue(null);
                this.cb.setValue("0");
                this.tfNationality.clear();
                this.tfAddress.clear();
                this.tfCity.clear();
                this.tfState.clear();
                this.tfCountry.clear();
                this.tfEmailId.clear();
                this.pf.clear();
                this.cpf.clear();
//                fmenu.setText("HOME");
                this.window.setScene(this.loginScene);

            }

        });


        final DropShadow shadow = new DropShadow();
        this.btnSignup.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                ARS.this.btnSignup.setEffect(shadow);
            }
        });
        this.btnSignup.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                ARS.this.btnSignup.setEffect((Effect)null);
            }
        });
        this.btnHome.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                ARS.this.btnHome.setEffect(shadow);
            }
        });
        this.btnHome.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                ARS.this.btnHome.setEffect((Effect)null);
            }
        });
        this.hl.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
            }
        });
        this.hl.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
            }
        });


        final Button res1 = new Button("RESET");
        res1.setFont(Font.font("SanSerif", 15.0));
        res1.setStyle("-fx-background-color: #deb887");
        g.addRow(27, new Node[]{res1});
        res1.setOnAction((e) -> {
            this.tfUserName.clear();
            this.tfPhone.clear();
            this.dpick.setValue(null);
            this.cb.setValue("0");
            this.tfNationality.clear();
            this.tfAddress.clear();
            this.tfCity.clear();
            this.tfState.clear();
            this.tfCountry.clear();
            this.tfEmailId.clear();
            this.pf.clear();
            this.cpf.clear();
        });


        res1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                res1.setEffect(shadow);
            }
        });
        res1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                res1.setEffect((Effect)null);
            }
        });


        this.btnSignup.setTranslateX(170.0);
        this.btnSignup.setTranslateY(0.0);
        res1.setTranslateX(200.0);
        res1.setTranslateY(0.0);


//        -------------------------------LOGIN PAGE STARTS---------------------------------------------



        FlowPane loginfp = new FlowPane();
        GridPane logingp = new GridPane();
        logingp.setHgap(18.0);
        logingp.setVgap(18.0);
        logingp.setAlignment(Pos.CENTER);


        Label t = new Label("LOGIN");
        t.setStyle("-fx-font-weight: bold");
        t.setTextFill(Color.RED);
        t.setTextAlignment(TextAlignment.CENTER);
        logingp.addRow(1, new Node[]{t});


        Label nm = new Label("USER NAME :");
        nm.setTextFill(Color.BLACK);
        nm.setStyle("-fx-font-weight: bold");
        this.t1 = new TextField();
        this.t1.setPromptText("Enter Username");
        Pattern loginpattern = Pattern.compile("[a-zA-Z]*");

        
        UnaryOperator<TextFormatter.Change> loginfilter = (c) -> {
            return loginpattern.matcher(c.getControlNewText()).matches() ? c : null;
        };
        TextFormatter<String> loginformatter = new TextFormatter(filter);
        this.t1.setTextFormatter(loginformatter);
        logingp.addRow(2, new Node[]{nm, this.t1});
        Label pass = new Label("PASSWORD :");
        pass.setTextFill(Color.BLACK);
        pass.setStyle("-fx-font-weight: bold");
        this.p = new PasswordField();
        this.p.setPromptText("Your password");
        logingp.addRow(3, new Node[]{pass, this.p});


        final Button btnlogin = new Button("LOGIN");
//        btnlogin.setFont(Font.font("SanSerif", 15.0));
//        btnlogin.setStyle("-fx-background-color: #00ff00");
        btnlogin.setStyle("-fx-text-fill: #0000ff");

        final Button signup = new Button("SIGN UP");
//        signup.setFont(Font.font("SanSerif", 15.0));
        signup.setStyle("-fx-background-color: #deb887");
        signup.setTranslateX(-10.0);
        signup.setTranslateY(150.0);
        logingp.addRow(4, new Node[]{btnlogin, signup});


        MenuBar lmenuBar = new MenuBar();
        Label L_hl = new Label("Home");
        Menu lhmenu = new Menu("", L_hl);
        lmenuBar.getMenus().addAll(new Menu[]{lhmenu});
        lmenuBar.prefWidthProperty().bind(loginfp.widthProperty());
        loginfp.getChildren().add(0, lmenuBar);
        BackgroundFill background_fill_login = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
        Background backgroundLogin = new Background(new BackgroundFill[]{background_fill_login});
        lmenuBar.setBackground(backgroundLogin);


//        this.window.setTitle("ARS");


        FileInputStream login_input = null;

        try {
            login_input = new FileInputStream("images/blurbg.png");
        } catch (FileNotFoundException var162) {
            throw new RuntimeException(var162);
        }

        new Image(login_input);
        BackgroundImage login_backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background login_background = new Background(new BackgroundImage[]{login_backgroundimage});
        logingp.setBackground(login_background);


        final DropShadow login_shadow = new DropShadow();
        btnlogin.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                btnlogin.setEffect(login_shadow);
            }
        });
        btnlogin.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                btnlogin.setEffect((Effect)null);
            }
        });


        final Button res = new Button("RESET");
//        res.setFont(Font.font("SanSerif", 15.0));
        res.setStyle("-fx-text-fill: #FF0000");
        logingp.addRow(4, new Node[]{res});
        signup.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                signup.setEffect(shadow);
            }
        });
        signup.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                signup.setEffect((Effect)null);
            }
        });
        res.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                res.setEffect(shadow);
            }
        });
        res.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                res.setEffect((Effect)null);
            }
        });
        res.setOnAction((e) -> {
            this.t1.clear();
            this.p.clear();
        });
        btnlogin.setTranslateX(0.0);
        btnlogin.setTranslateY(30.0);
        res.setTranslateX(-80.0);
        res.setTranslateY(30.0);


        Label or = new Label("(OR)");
        or.setTranslateX(100.0);
        or.setTranslateY(50.0);
        or.setStyle("-fx-font-weight: bold");
        or.setTextFill(Color.RED);
        logingp.addRow(5, new Node[]{or});



        this.loginPane.setCenter(logingp);
        this.loginPane.setTop(loginfp);
        signup.setOnAction((e) -> {
            this.window.setScene(scene);
        });
        this.ll.setOnMouseClicked((mouseEvent) -> {
            this.window.setScene(this.loginScene);
        });



//        -----------------------------------------Home Page -----------------------------------------------------




        GridPane Hmgrid = new GridPane();



        FileInputStream input1 = new FileInputStream("images/flight2.png");
        Image himage = new Image(input1);
        BackgroundImage backgroundimage = new BackgroundImage(himage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(new BackgroundImage[]{backgroundimage});
        Hmgrid.setBackground(background);


        MenuBar hmMenu = new MenuBar();
        hmMenu.getMenus().addAll(new Menu[]{this.hmenu});
        hmMenu.getMenus().addAll(new Menu[]{this.hmenu3});
        hmMenu.getMenus().addAll(new Menu[]{this.hmenu4});
        hmMenu.prefWidthProperty().bind(Hmgrid.widthProperty());
        Hmgrid.addRow(0, new Node[]{hmMenu});
//        this.window.setTitle("Homepage");
        BackgroundFill background_fill = new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(new BackgroundFill[]{background_fill});
        hmMenu.setBackground(background1);


        Label txt = new Label();
        txt.setText("Welcome to Skylane Airline Reservation System \uD83D\uDCA8 " + "✈");
        txt.setFont(Font.font("Sanserif", 60.0));
        txt.setTextFill(Color.BEIGE);
        txt.setTranslateX(60.0);
        txt.setTranslateY(110.0);
        Hmgrid.addRow(1, new Node[]{txt});

        Label time = new Label();
        time.setFont(Font.font("Sanserif", 20.0));
        time.setTranslateX(1380.0);
        time.setTranslateY(-70.0);
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e ->
                time.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("\uD83D\uDCC5  dd-MM-yyyy \n\uD83D\uDD51  HH:mm:ss")))
        ),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();


        KeyFrame kfP3 = new KeyFrame(Duration.seconds(1), new KeyValue(time.textFillProperty(), Color.AZURE));
        Timeline TIMER3 = new Timeline();
        TIMER3.getKeyFrames().add(kfP3);
        TIMER3.setCycleCount(Animation.INDEFINITE);          // Label Blinking
        TIMER3.setAutoReverse(true);
        TIMER3.play();



        Hmgrid.addRow(2, time);

        Scene hmscene = new Scene(Hmgrid, 1540.0, 835.0);
        this.hl.setOnMouseClicked((mouseEvent) -> {
            this.window.setScene(hmscene);
        });
        this.lhl.setOnMouseClicked((mouseEvent) -> {
            this.window.setScene(this.loginScene);
        });
        L_hl.setOnMouseClicked((mouseEvent) -> {
            this.window.setScene(hmscene);
        });
        FlowPane fp1 = new FlowPane();
        new Scene(fp1, 1540.0, 835.0);
        MenuBar cmenu = new MenuBar();
        cmenu.getMenus().addAll(new Menu[]{this.fmenu});
        cmenu.getMenus().addAll(new Menu[]{this.fmenu4});
        cmenu.prefWidthProperty().bind(fp1.widthProperty());
        fp1.getChildren().add(cmenu);
        BackgroundFill cbackground_fill = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
        Background cbackground1 = new Background(new BackgroundFill[]{cbackground_fill});
        cmenu.setBackground(cbackground1);
        GridPane gr = new GridPane();
        gr.setHgap(18.0);
        gr.setVgap(10.0);
        gr.setAlignment(Pos.CENTER);
        FileInputStream cinput = new FileInputStream("images/blurbg.png");
        Image cimage = new Image(cinput);
        BackgroundImage cbackgroundimage = new BackgroundImage(cimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background cbackground = new Background(new BackgroundImage[]{cbackgroundimage});
        gr.setBackground(cbackground);



        this.window.setTitle("Skylane Airline Reservation System");


        Label zt = new Label("CANCELLATION DETAILS");

        KeyFrame kfP = new KeyFrame(Duration.seconds(1), new KeyValue(zt.textFillProperty(), Color.RED));
        Timeline TIMER = new Timeline();
        TIMER.getKeyFrames().add(kfP);
        TIMER.setCycleCount(Animation.INDEFINITE);          // Label Blinking
        TIMER.setAutoReverse(true);
        TIMER.play();


        zt.setStyle("-fx-font-weight: bold");
        zt.setTextFill(Color.RED);
        zt.setTextAlignment(TextAlignment.RIGHT);
        gr.getChildren().add(0, zt);
        Label lt1 = new Label("FLIGHT NUMBER  : ");
        lt1.setTextFill(Color.BLACK);
        lt1.setStyle("-fx-font-weight: bold");
        this.te1.setPromptText("flight number");
        gr.addRow(1, new Node[]{lt1, this.te1});
        Label lt2 = new Label("CLASS  : ");
        lt2.setTextFill(Color.BLACK);
        lt2.setStyle("-fx-font-weight: bold");
        this.cbo.setPromptText("Select Class");
        ObservableList<String> ls6 = this.cbo.getItems();
        ls6.add("PREMIUM ECONOMY");
        ls6.add("ECONOMY");
        ls6.add("FIRST CLASS");
        ls6.add("BUSSINESS");
//        gr.addRow(2, new Node[]{lt2, this.cbo});
        this.cbo.setTranslateX(0.0);
        this.cbo.setTranslateY(-10.0);
        Label lt3 = new Label("SEAT NUMBER  : ");
        lt3.setTextFill(Color.BLACK);
        lt3.setStyle("-fx-font-weight: bold");
        this.te3.setPromptText("seat number");
        this.te3.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    ARS.this.te3.setText(newValue.replaceAll("[^\\d]", ""));
                }

            }
        });
        gr.addRow(5, new Node[]{lt3, this.te3});
        Label lt4 = new Label("DAYS LEFT  : ");
        lt4.setTextFill(Color.BLACK);
        lt4.setStyle("-fx-font-weight: bold");
        ObservableList<Node> fPaneControls3 = gr.getChildren();
        this.cbo1 = new ComboBox();
        this.cbo1.setPromptText("Select days  ");
        ObservableList cboItems = this.cbo1.getItems();

        for(int i = 1; i < 6; ++i) {
            cboItems.add(i);
        }

        fPaneControls3.add(this.cbo1);
        this.cbo1.setVisibleRowCount(3);
        gr.addRow(3, new Node[]{lt4});
        this.cbo1.setTranslateX(160.0);
        this.cbo1.setTranslateY(78.0);
//        Label lt5 = new Label("PASSENGER COUNT  : ");
//        lt5.setTextFill(Color.BLACK);
//        lt5.setStyle("-fx-font-weight: bold");
//        ObservableList<Node> fPaneControls1 = gr.getChildren();
//        this.cbo2.setPromptText("Select count");
//        ObservableList cboItems1 = this.cbo2.getItems();
//
//        for(int i = 1; i < 6; ++i) {
//            cboItems1.add(i);
//        }
//
//        fPaneControls1.add(this.cbo2);
//        this.cbo2.setVisibleRowCount(3);
//        gr.addRow(4, new Node[]{lt5});
//        this.cbo2.setTranslateX(160.0);
//        this.cbo2.setTranslateY(130.0);
        final Button refbt = new Button("REFUND AMOUNT");
        refbt.setFont(Font.font("SanSerif", 15.0));
        refbt.setStyle("-fx-background-color: #deb887");
        gr.addRow(6, new Node[]{refbt});
        refbt.setTranslateX(100.0);
        refbt.setTranslateY(30.0);
        final DropShadow cshadow = new DropShadow();
        refbt.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                refbt.setEffect(cshadow);
            }
        });
        refbt.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                refbt.setEffect((Effect)null);
            }
        });
        refbt.setOnAction((e) -> {
            if (this.cvalidateFields()) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Refund payment");
                alert.setHeaderText((String)null);
                alert.setContentText("Your amount will be refunded soon");
                alert.showAndWait();
                this.cbo.setValue("0");
                this.cbo1.setValue("0");
                this.cbo2.setValue("0");
                this.te3.clear();
                this.te1.clear();
                this.window.setScene(hmscene);

            }

        });
        BorderPane panel1 = new BorderPane();
        panel1.setCenter(gr);
        panel1.setTop(fp1);
        Scene cbscene = new Scene(panel1, 1540.0, 835.0);
        this.chl.setOnMouseClicked((mouseEvent) -> {
            this.window.setScene(cbscene);
        });



        FileInputStream loghominput = new FileInputStream("images/blurbg1.jpg");
        Image loghomimage = new Image(loghominput);
        BackgroundImage loghombackgroundimage = new BackgroundImage(loghomimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background loghombackground = new Background(new BackgroundImage[]{loghombackgroundimage});
        this.loghombp.setBackground(loghombackground);
        if (!this.UserName.equals("") ) {
           // lblUname = new Label(this.UserName);
            lblUname.setText(this.UserName);
           // unMenu = new Menu("", lblUname);
            //this.loghommenu.getMenus().addAll(new Menu[]{unMenu});
           // this.loghomtxt.setText("Welcome " + this.UserName);

        }

        Label loghomfill = new Label();
        loghomfill.setText("➢ Convenience fee will be charged as per the applicability.\n\n➢ It’s super-easy to avail budget airfare while booking your cheap flight tickets on Skylane.\n\n➢ Skylane shall not be liable for any loss or damage arising due to force majeure.\n\n➢ We suggest, you double-check online flight booking prices when purchasing flight tickets, as the airfare might have been dynamically updated since you \n    first selected the air travel dates or planned your itinerary.\n\n➢ After booking changes in names are not allowed.\n\n➢ For best flight ticket prices and flight ticket offers, it is recommended to book at least 3 to 4 weeks in advance.\n\n➢ Personal seatback entertainment, thoughtfully prepared multi-course meals, and telephone and email service at every seat are just some of the features \n    Skylane designed with your comfort and convenience in mind.\n\n➢ Young passengers receive the utmost in care and attention.\n\n➢ From carefully selected entertainment to thoughtfully crafted meals, Skylane make every effort to make travel for families and children fun and relaxing.");
        loghomfill.setFont(Font.font("Sanserif", 21.0));
        loghomfill.setTextFill(Color.BEIGE);
        loghomfill.setTranslateX(50);
        loghomfill.setTranslateY(110);
//        (new Flash(loghomfill)).play();

        loghomstack.getChildren().add( loghomfill);

        KeyFrame kfP1 = new KeyFrame(Duration.seconds(1), new KeyValue(loghomfill.textFillProperty(), Color.DARKGOLDENROD));
        Timeline TIMER1 = new Timeline();
       TIMER1.getKeyFrames().add(kfP1);
        TIMER1.setCycleCount(Animation.INDEFINITE);          // Label Blinking
       TIMER1.setAutoReverse(true);
        TIMER1.play();




//loghomfill.



        Group root = new Group();


        // create ticker area
        final Group tickerArea = new Group();
        final Rectangle tickerRect = new Rectangle();
        tickerRect.setX(0);
        tickerRect.setY(0);
        tickerRect.setWidth(scene.getWidth());
        tickerRect.setHeight(30);
        tickerRect.setStroke(Color.rgb(255, 255, 255, .70));
        Rectangle clipRegion = new Rectangle();
        clipRegion.setX(0);
        clipRegion.setY(0);
        clipRegion.setWidth(scene.getWidth());
        clipRegion.setHeight(30);

        tickerArea.setClip(clipRegion);

        // Resize the ticker area when the window is resized
        tickerArea.setTranslateX(6);
        tickerArea.translateYProperty().bind(scene.heightProperty().subtract(tickerRect.getHeight() + 6));
        tickerRect.widthProperty().bind(scene.widthProperty().subtract(0));
        clipRegion.widthProperty().bind(scene.widthProperty().subtract(0));
        tickerArea.getChildren().add(tickerRect);
        root.getChildren().add(tickerArea); // add news text
        Text news = new Text();
        news.setText("Skylane online reservation system resides on a secure server that encrypts purchase information.  We use all reasonable endeavors to protect personal information from loss, misuse and alteration. Only authorized employees or agents, who are under appropriate confidentiality obligations, will have access to personal information. However, Customers will be responsible for any user ID or password that is used on our web site. Customers should take due care to protect them.  Further, the information, software, products, and services published on the website may include inaccuracies or typographical errors. Changes are periodically made to the information herein. We may make improvements and/or changes to the website at any time.\n" +
                "\n ");
        news.setTranslateY(18);
        news.setFill(Color.RED);
        tickerArea.getChildren().add(news);

        final TranslateTransition ticker = new TranslateTransition();
        ticker.setNode(news);
        int newsLength = 300;
        ticker.setDuration(Duration.millis((newsLength * 4 / 300) * 15000));
        ticker.setFromX(scene.widthProperty().doubleValue());
        ticker.setToX(-scene.widthProperty().doubleValue() - (newsLength * 5));
        ticker.setFromY(19);
        ticker.setInterpolator(Interpolator.LINEAR);
        ticker.setCycleCount(100);

        // when ticker has finished reset and replay ticker animation
        ticker.setOnFinished((ActionEvent ae) -> {
            ticker.stop();
            ticker.setFromX(scene.getWidth());
            ticker.setDuration(new Duration((newsLength * 4 / 300) * 15000));
            ticker.playFromStart();
        });

        tickerArea.setOnMouseEntered((MouseEvent me) -> {
            ticker.pause();
        });

        tickerArea.setOnMouseExited((MouseEvent me) -> {
            ticker.play();
        });

        ticker.play();



loghombp.setTop(loghomgrid);
loghombp.setBottom(root);
loghombp.setCenter(loghomstack);

        this.loghommenu.getMenus().addAll(new Menu[]{this.fmenu1});
        this.loghommenu.prefWidthProperty().bind(this.loghomgrid.widthProperty());
        this.loghomgrid.addRow(0, new Node[]{this.loghommenu});
        this.loghomtxt.setFont(Font.font("SanSerif", 75.0));
        this.loghomtxt.setTranslateX(50.0);
        this.loghomtxt.setTranslateY(50.0);
        this.loghomtxt.setFont(Font.font("Sanserif", 30.0));
        this.loghomtxt.setTextFill(Color.BISQUE);
        this.loghomgrid.addRow(1, new Node[]{this.loghomtxt});

        BackgroundFill loghombackground_fill = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
        Background loghombackground1 = new Background(new BackgroundFill[]{loghombackground_fill});
        this.loghommenu.setBackground(loghombackground1);



        btnlogin.setOnAction((e) -> {
            if (this.Login_validateFields() && this.userCheck()) {
                this.p.clear();
                this.t1.clear();
                this.window.setScene(this.loghomscene);
            }

        });






        GridPane bookgp = new GridPane();
        bookgp.setHgap(18.0);
        bookgp.setVgap(10.0);
        bookgp.setAlignment(Pos.CENTER);
        FileInputStream bookinput = new FileInputStream("images/blurbg.png");
        Image bookimage = new Image(bookinput);
        BackgroundImage bookbackgroundimage = new BackgroundImage(bookimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background bookbackground = new Background(new BackgroundImage[]{bookbackgroundimage});
        bookgp.setBackground(bookbackground);


//        this.window.setTitle("Booking");
        Label bookl10 = new Label("PASSENGER DETAILS : ");
        bookl10.setTextFill(Color.RED);
        bookl10.setStyle("-fx-font-weight: bold");
        bookgp.addRow(8, new Node[]{bookl10});
        Label bookl11 = new Label("NAME  : ");
        bookl11.setStyle("-fx-font-weight: bold");
        Pattern bookpattern = Pattern.compile("[a-zA-Z.]*");
        UnaryOperator<TextFormatter.Change> bookfilter = (bookc) -> {
            return bookpattern.matcher(bookc.getControlNewText()).matches() ? bookc : null;
        };
        TextFormatter<String> bookformatter = new TextFormatter(filter);
        this.bookt11.setTextFormatter(bookformatter);
        bookgp.addRow(9, new Node[]{bookl11, this.bookt11});
        Label bookl12 = new Label("AGE  : ");
        bookl12.setStyle("-fx-font-weight: bold");
        this.bookt12.setPromptText("Your Age");
        Pattern bookpattern2 = Pattern.compile("[0-9]*");
        UnaryOperator<TextFormatter.Change> bookfilter3 = (bookc3) -> {
            return bookpattern2.matcher(bookc3.getControlNewText()).matches() ? bookc3 : null;
        };
        TextFormatter<String> bookformatter3 = new TextFormatter(bookfilter3);
        this.bookt12.setTextFormatter(bookformatter3);
        bookgp.addRow(10, new Node[]{bookl12, this.bookt12});
        Label bookl13 = new Label("GENDER  : ");
        bookl13.setStyle("-fx-font-weight: bold");
        new TextField();
        this.bookcom.setPromptText("Select Gender");
        ObservableList<String> bookls = this.bookcom.getItems();
        bookls.add("Male");
        bookls.add("Female");
        bookls.add("Not specified");
        bookgp.addRow(11, new Node[]{bookl13, this.bookcom});
        Label bookl14 = new Label("ID PROOF  : ");
        bookl14.setStyle("-fx-font-weight: bold");
        this.bookt14.setPromptText("Your Aadhar Number");
//        UnaryOperator<TextFormatter.Change> bookfilter4 = (bookc4) -> {
//            return bookpattern2.matcher(bookc4.getControlNewText()).matches() ? bookc4 : null;
//        };
//        TextFormatter<String> bookformatter4 = new TextFormatter(bookfilter4);
//        this.bookt14.setTextFormatter(bookformatter4);
        bookgp.addRow(12, new Node[]{bookl14, this.bookt14});
        final Button bookb1 = new Button("BOOK TICKETS");
        bookb1.setStyle("-fx-background-color: #deb887");
        bookb1.setAlignment(Pos.BOTTOM_CENTER);
        bookb1.setTranslateX(180);
        bookb1.setTranslateY(20);
        final Button bookb3 = new Button("Go Back");
        bookb3.setStyle("-fx-background-color: #deb887");
        bookb3.setAlignment(Pos.BOTTOM_CENTER);
        bookb3.setTranslateX(-100);
        bookb3.setTranslateY(20);
        bookgp.addRow(13, new Node[]{bookb1, bookb3});
        Scene bookscene = new Scene(bookgp, 1540.0, 835.0);
        bookb3.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                bookb3.setEffect(shadow);
            }
        });
        bookb3.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                bookb3.setEffect((Effect)null);
            }
        });
        bookb1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                bookb1.setEffect(shadow);
            }
        });
        bookb1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                bookb1.setEffect((Effect)null);
            }
        });
        new DropShadow();
        bookb1.setOnAction((e) -> {
            if (this.bookvalidateFields()) {
                bookb1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {

                        bookb1.setText("TICKETS BOOKED");
                        ARS.this.window.setScene(ARS.this.payscene);
                    }
                });
            }

        });




        GridPane seg1 = new GridPane();
        seg1.setHgap(18.0);
        seg1.setVgap(10.0);
        seg1.setAlignment(Pos.CENTER);
//        this.window.setTitle("Skylane Airline Reservation System");
        seg1.setHgap(10.0);
        seg1.setVgap(10.0);
        Label zz = new Label("SEARCH FLIGHT DETAILS");
        zz.setStyle("-fx-font-weight: bold");
        zz.setTextFill(Color.RED);
        zz.setTextAlignment(TextAlignment.RIGHT);
        seg1.getChildren().add(0, zz);
        FileInputStream seinput = new FileInputStream("images/blurbg.png");
        Image seimage = new Image(seinput);
        BackgroundImage sebackgroundimage = new BackgroundImage(seimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background sebackground = new Background(new BackgroundImage[]{sebackgroundimage});
        seg1.setBackground(sebackground);
        Label e1 = new Label("DATE OF TRAVEL  : ");
        e1.setTextFill(Color.BLACK);
        e1.setStyle("-fx-font-weight: bold");
        sed.setDayCellFactory(picker -> new DateCell() {
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);                          ////// Disable past dates
                LocalDate today = LocalDate.now();

                setDisable(empty || date.compareTo(today) < 0 );
            }
        });
        seg1.addRow(1, new Node[]{e1, this.sed});
        Label e2 = new Label("PLACE  : ");
        e2.setTextFill(Color.BLACK);
        e2.setStyle("-fx-font-weight: bold");
        seg1.addRow(2, new Node[]{e2});
        ObservableList<Node> fPaneControls5 = seg1.getChildren();
        this.secbo1.setPromptText("TO");
        ObservableList<String> secboItems1 = this.secbo1.getItems();
        secboItems1.add("CHENNAI");
        secboItems1.add("COIMBATORE");
        secboItems1.add("SALEM");
        secboItems1.add("MADURAI");
        fPaneControls5.add(this.secbo1);
        this.secbo1.setVisibleRowCount(3);
        this.secbo1.setTranslateX(280.0);
        this.secbo1.setTranslateY(70.0);
        this.seo1.setPromptText("FROM");
        ObservableList<String> lst2 = this.seo1.getItems();
        ObservableList<Node> cfPaneControls = seg1.getChildren();
        lst2.add("CHENNAI");
        lst2.add("COIMBATORE");
        lst2.add("SALEM");
        lst2.add("MADURAI");
        cfPaneControls.add(this.seo1);
        this.seo1.setVisibleRowCount(3);
        this.seo1.setTranslateX(152.0);
        this.seo1.setTranslateY(70.0);
        Scene sescene = new Scene(seg1, 1540.0, 835.0);
        seg1.getChildren();


        Image img = new Image("D:\\Ingoo.jpg");
        Image img1 = new Image("D:\\AI.jpg");
        ImageView view = new ImageView(img);
        ImageView view1 = new ImageView(img1);
        view.setFitHeight(80.0);
        view.setPreserveRatio(true);
        view1.setFitHeight(80.0);
        view1.setPreserveRatio(true);
        final Button button = new Button();
        final Button button1 = new Button();
        button.setTranslateX(40.0);
        button.setTranslateY(60.0);
        button1.setTranslateX(60.0);
        button1.setTranslateY(60.0);
        button.setPrefSize(80.0, 80.0);
        button1.setPrefSize(80.0, 80.0);
        button.setGraphic(view);

//        button.setStyle("-fx-border-color: #ff0000; -fx-border-width: 8px;");

        button1.setGraphic(view1);
        seg1.addRow(5, new Node[]{button});
        seg1.addRow(5, new Node[]{button1});
        final Button seb1 = new Button("Go Back");
        seb1.setStyle("-fx-background-color: #deb887");
        seb1.setAlignment(Pos.BOTTOM_CENTER);
        seb1.setTranslateX(100.0);
        seb1.setTranslateY(100.0);
        seg1.addRow(6, new Node[]{seb1});
        seb1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                seb1.setEffect(shadow);
            }
        });
        seb1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                seb1.setEffect((Effect)null);
            }
        });
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                button.setEffect(shadow);
            }
        });
        button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                button.setEffect((Effect)null);
            }
        });
        button1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                button1.setEffect(shadow);
            }
        });
        button1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                button1.setEffect((Effect)null);
            }
        });
        button.setOnAction((e) -> {
            if (this.sevalidateFields() && this.equal()) {
                //test db
                this.window.setScene(bookscene);
            }

        });
        button1.setOnAction((e) -> {
            if (this.sevalidateFields() && this.equal()) {
                this.window.setScene(bookscene);
            }

        });
        this.sl.setOnMouseClicked((mouseEvent) -> {
            this.window.setScene(sescene);
        });
        bookb3.setOnAction((e) -> {
            this.window.setScene(sescene);
        });
        seb1.setOnAction((e) -> {
            this.window.setScene(this.loghomscene);
        });
        this.paygp.setHgap(100.0);
        this.paygp.setVgap(50.0);
        this.paygp.setAlignment(Pos.TOP_CENTER);
//        this.window.setTitle("Skylane Airline Reservation System");
        FileInputStream payinput = new FileInputStream("images/blurbg.png");
        Image payimage = new Image(payinput);
        BackgroundImage paybackgroundimage = new BackgroundImage(payimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background paybackground = new Background(new BackgroundImage[]{paybackgroundimage});
        this.paygp.setBackground(paybackground);
        Label nb = new Label("MODE OF PAYMENT");

        nb.setStyle("-fx-font-weight: bold");
        nb.setFont(Font.font("Sanserif", 50.0));
        nb.setTextFill(Color.RED);
        nb.setTranslateX(250.0);
        nb.setTranslateY(0.0);
        this.paygp.addRow(0, new Node[]{nb});
        Image payimg = new Image("D:\\NB.jpg");
        Image payimg1 = new Image("D:\\upi.jpg");
        Image payimg2 = new Image("D:\\dbcard.jpg");
        ImageView payview = new ImageView(payimg);
        ImageView payview1 = new ImageView(payimg1);
        ImageView payview2 = new ImageView(payimg2);
        payview.setFitHeight(80.0);
        payview.setPreserveRatio(true);
        payview1.setFitHeight(80.0);
        payview1.setPreserveRatio(true);
        payview2.setFitHeight(80.0);
        payview2.setPreserveRatio(true);
        final Button paybutton = new Button();
        final Button paybutton1 = new Button();
        final Button paybutton2 = new Button();
        paybutton.setTranslateX(60.0);
        paybutton.setTranslateY(-110.0);
        paybutton1.setTranslateX(-210.0);
        paybutton1.setTranslateY(-110.0);
        paybutton2.setTranslateX(-150.0);
        paybutton2.setTranslateY(-110.0);
        paybutton.setPrefSize(80.0, 80.0);
        paybutton1.setPrefSize(80.0, 80.0);
        paybutton2.setPrefSize(80.0, 80.0);
        paybutton.setGraphic(payview);
        paybutton1.setGraphic(payview1);
        paybutton2.setGraphic(payview2);
        this.paygp.addRow(5, new Node[]{paybutton});
        this.paygp.addRow(5, new Node[]{paybutton1});
        this.paygp.addRow(5, new Node[]{paybutton2});
        this.paygp.setAlignment(Pos.CENTER);
        paybutton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton.setEffect(shadow);
            }
        });
        paybutton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton.setEffect((Effect)null);
            }
        });
        paybutton1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton1.setEffect(shadow);
            }
        });
        paybutton1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton1.setEffect((Effect)null);
            }
        });
        paybutton2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton2.setEffect(shadow);
            }
        });
        paybutton2.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton2.setEffect((Effect)null);
            }
        });
        paybutton.setOnAction((e) -> {
            SaveTicketDetails();
            getTicketDetails();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Mode Of Payment - NetBanking");
            alert.setHeaderText((String)null);
            alert.setContentText("Transaction Successful");
            alert.showAndWait();
            this.window.setScene(ticksc);
        });
        paybutton1.setOnAction((e) -> {
            SaveTicketDetails();
            getTicketDetails();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Mode Of Payment - UPI");
            alert.setHeaderText((String)null);
            alert.setContentText("Transaction Successful");
            alert.showAndWait();
            this.window.setScene(ticksc);
        });
        paybutton2.setOnAction((e) -> {
            SaveTicketDetails();
            getTicketDetails();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Mode Of Payment - Debit/Credit card");
            alert.setHeaderText((String)null);
            alert.setContentText("Transaction Successful");
            alert.showAndWait();
            this.window.setScene(ticksc);
        });

        tickgp.setAlignment(Pos.CENTER);
        FileInputStream ticinput = new FileInputStream("images/airplane-ticket.png");
        Image ticimage = new Image(ticinput);
        BackgroundImage ticbackgroundimage = new BackgroundImage(ticimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background ticbackground = new Background(ticbackgroundimage);
        tickgp.setBackground(ticbackground);

        tickgp.setHgap(18);
        tickgp.setVgap(20);

        Label tick = new Label("TICKET");
        tick.setStyle("-fx-font-weight: bold");
        tick.setTextFill(Color.RED);
        tick.setFont(Font.font("Sanserif",20));
        tick.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(0,tick);

        tick.setTranslateX(100);
        tick.setTranslateY(-50);
        //Get & Set Ticket Details Start


        // Get & Set Ticket Details End


        //Label ticnm = new Label("NAME :"+this.rs.getString("PassengerName"));
        ticnm.setStyle("-fx-font-weight: bold");
        ticnm.setTextFill(Color.BLACK);
        ticnm.setFont(Font.font("Sanserif",20));
        ticnm.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(1,ticnm);

        // Label ticcls = new Label("CLASS :" + this.rs.getString("PassengerClass"));
        ticcls.setStyle("-fx-font-weight: bold");
        ticcls.setTextFill(Color.BLACK);
        ticcls.setFont(Font.font("Sanserif",20));
        ticcls.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(2,ticcls);

        //  Label ticseat = new Label("SEAT NO :" +this.rs.getString("PassengerSeatNo"));
        ticseat.setStyle("-fx-font-weight: bold");
        ticseat.setTextFill(Color.BLACK);
        ticseat.setFont(Font.font("Sanserif",20));
        ticseat.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(3,ticseat);

        // Label ticflino = new Label("FLIGHT NO :" + this.rs.getString("PassengerFlightNo"));
        ticflino.setStyle("-fx-font-weight: bold");
        ticflino.setTextFill(Color.BLACK);
        ticflino.setFont(Font.font("Sanserif",20));
        ticflino.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(4,ticflino);

        // Label ticfrom = new Label("FROM :" + this.rs.getString("TravelFrom"));
        ticfrom.setStyle("-fx-font-weight: bold");
        ticfrom.setTextFill(Color.BLACK);
        ticfrom.setFont(Font.font("Sanserif",20));
        ticfrom.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(5,ticfrom);

        // Label ticto = new Label("TO :" + this.rs.getString("TravelTo"));
        ticto.setStyle("-fx-font-weight: bold");
        ticto.setTextFill(Color.BLACK);
        ticto.setFont(Font.font("Sanserif",20));
        ticto.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(6,ticto);

        ticprice.setStyle("-fx-font-weight: bold");
        ticprice.setTextFill(Color.BLACK);
        ticprice.setFont(Font.font("Sanserif",20));
        ticprice.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(7,ticprice);



        Button ticdown=new Button("DOWNLOAD TICKET");
        tickgp.addRow(7,ticdown);
        ticdown.setTranslateX(100);
        ticdown.setTranslateY(30);



        ticdown.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        ticdown.setEffect(shadow);
                    }
                });
        ticdown.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        ticdown.setEffect(null);
                    }
                });
        ticdown.setOnAction(e ->{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("TICKET");
            alert.setHeaderText(null);
            alert.setContentText("Ticket has been Downloaded Successfully");
            alert.showAndWait();
            Integer UserId=0;
            this.sed.getEditor().clear();
            this.seo1.setValue("0");
            this.secbo1.setValue("0");

            this.bookt11.clear();
            this.bookt12.clear();
            this.bookcom.setValue("0");
            this.bookt14.clear();
            window.setScene(hmscene);
        });

//        Image icon = new Image(ModuleLayer.Controller.class.getResource("/airplane-ticket.png").toExternalForm(), false);
//        primaryStage.getIcons().add(icon);

        primaryStage.getIcons().add(new Image("file:images/fli_icon4.png"));

        this.window.setScene(hmscene);
        this.window.setTitle("SKYLANE AIRLINE RESERVATION");
        this.window.show();
    }

    private boolean validateMobileNo() {
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(this.tfPhone.getText());
        if (m.find() && m.group().equals(this.tfPhone.getText())) {
            try {
                String isMobileExistQuery = "Select PhoneNumber from tbl_User where PhoneNumber= '" + this.tfPhone.getText() + "'";
                this.dbConnection = new DatabaseConnection();
                this.connectDB = this.dbConnection.getConnection();
                this.pst = this.connectDB.prepareStatement(isMobileExistQuery);
                this.rs = this.pst.executeQuery();
                if (this.rs.next()) {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setTitle("User Already Exist");
                    alert.setHeaderText((String)null);
                    alert.setContentText("Mobile Number Already Exist!");
                    alert.showAndWait();
                    return false;
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                var5.getCause();
            }

            return true;
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Validate Mobile Number");
            alert.setHeaderText((String)null);
            alert.setContentText("Please Enter Valid Mobile Number");
            alert.showAndWait();
            return false;
        }
    }

    private boolean validateEmail() {
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(this.tfEmailId.getText());
        if (m.find() && m.group().equals(this.tfEmailId.getText())) {
            try {
                String isEmailExistQuery = "Select EmailId from tbl_User where EmailId= '" + this.tfEmailId.getText() + "'";
                this.dbConnection = new DatabaseConnection();
                this.connectDB = this.dbConnection.getConnection();
                this.pst = this.connectDB.prepareStatement(isEmailExistQuery);
                this.rs = this.pst.executeQuery();
                if (this.rs.next()) {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setTitle("User Already Exist");
                    alert.setHeaderText((String)null);
                    alert.setContentText("EmailId Already Exist!");
                    alert.showAndWait();
                    return false;
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                var5.getCause();
            }

            return true;
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Validate Email");
            alert.setHeaderText((String)null);
            alert.setContentText("Please Enter Valid Email");
            alert.showAndWait();
            return false;
        }
    }

    private boolean validatePassword() {
        Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
        Matcher m = p.matcher(this.pf.getText());
        if (m.matches()) {
            return true;
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Validate Password");
            alert.setHeaderText((String)null);
            alert.setContentText("Password must contain at least one(Digit, Lowercase, UpperCase and Special Character) and length must be between 6 -15");
            alert.showAndWait();
            return false;
        }
    }

    private boolean validateFields() {
        if (this.tfUserName.getText().isEmpty()) {
            this.tfUserName.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.tfUserName)).play();
            return false;
        } else {
            this.tfUserName.setStyle((String)null);
            if (this.tfPhone.getText().isEmpty()) {
                this.tfPhone.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                (new FadeIn(this.tfPhone)).play();
                return false;
            } else {
                this.tfPhone.setStyle((String)null);
                if (this.dpick.getEditor().getText().isEmpty()) {
                    this.dpick.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                    (new FadeIn(this.dpick)).play();
                    return false;
                } else {
                    this.dpick.setStyle((String)null);
                    if (this.cb.getSelectionModel().isEmpty()) {
                        this.cb.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.cb)).play();
                        return false;
                    } else {
                        this.dpick.setStyle((String)null);
                        if (this.tfNationality.getText().isEmpty()) {
                            this.tfNationality.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                            (new FadeIn(this.tfNationality)).play();
                            return false;
                        } else {
                            this.tfNationality.setStyle((String)null);
                            if (this.tfAddress.getText().isEmpty()) {
                                this.tfAddress.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                (new FadeIn(this.tfAddress)).play();
                                return false;
                            } else {
                                this.tfAddress.setStyle((String)null);
                                if (this.tfCity.getText().isEmpty()) {
                                    this.tfCity.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                    (new FadeIn(this.tfCity)).play();
                                    return false;
                                } else {
                                    this.tfCity.setStyle((String)null);
                                    if (this.tfState.getText().isEmpty()) {
                                        this.tfState.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                        (new FadeIn(this.tfState)).play();
                                        return false;
                                    } else {
                                        this.tfState.setStyle((String)null);
                                        if (this.tfCountry.getText().isEmpty()) {
                                            this.tfCountry.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                            (new FadeIn(this.tfCountry)).play();
                                            return false;
                                        } else {
                                            this.tfCountry.setStyle((String)null);
                                            if (this.tfEmailId.getText().isEmpty()) {
                                                this.tfEmailId.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                                (new FadeIn(this.tfEmailId)).play();
                                                return false;
                                            } else {
                                                this.tfEmailId.setStyle((String)null);
                                                if (this.pf.getText().isEmpty()) {
                                                    this.pf.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                                    (new FadeIn(this.pf)).play();
                                                    return false;
                                                } else {
                                                    this.pf.setStyle((String)null);
                                                    if (this.cpf.getText().isEmpty()) {
                                                        this.cpf.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                                                        (new FadeIn(this.cpf)).play();
                                                        return false;
                                                    } else {
                                                        this.cpf.setStyle((String)null);
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void registerUser() {
        try {
            this.dbConnection = new DatabaseConnection();
            this.connectDB = this.dbConnection.getConnection();
            String UserName = this.tfUserName.getText();
            String PhoneNumber = this.tfPhone.getText();
            String DOB = this.dpick.getEditor().getText();
            String Gender = (String)this.cb.getSelectionModel().getSelectedItem();
            String Nationality = this.tfNationality.getText();
            String Address = this.tfAddress.getText();
            String City = this.tfCity.getText();
            String State = this.tfState.getText();
            String Country = this.tfCity.getText();
            String EmailId = this.tfEmailId.getText();
            String Password = this.pf.getText();
            String insertItems = "INSERT INTO tbl_User(UserName, PhoneNumber, DOB, Gender, Nationality, Address, City, State, Country, EmailId,Password) VALUES('";
            String insertValues = UserName + "','" + PhoneNumber + "','" + DOB + "','" + Gender + "','" + Nationality + "','" + Address + "','" + City + "','" + State + "','" + Country + "','" + EmailId + "','" + Password + "')";
            String insertQry = insertItems + insertValues;
            this.st = this.connectDB.createStatement();
            this.st.executeUpdate(insertQry);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText((String)null);
            alert.setContentText("User has been created.");
            alert.showAndWait();
        } catch (Exception var16) {
            var16.printStackTrace();
            var16.getCause();
        }

    }

    public void SaveTicketDetails()
    {
        try {
            this.dbConnection = new DatabaseConnection();
            this.connectDB = this.dbConnection.getConnection();
            Integer UserId=this.User_Id;
            String TravelDate = this.sed.getEditor().getText();
            String From = (String)this.seo1.getSelectionModel().getSelectedItem();
            String To = (String)this.secbo1.getSelectionModel().getSelectedItem();
            Random ran=new Random();
            String PassengerName = this.bookt11.getText();
            String PassengerAge = this.bookt12.getText();
            String PassengerGender = this.bookcom.getSelectionModel().getSelectedItem();
            String IdProof = this.bookt14.getText();
            String SeatNo = "5"+ran.nextInt(1,5);
            String Class = "Business Class";
            String FlightNo = "FLN"+ ran.nextInt(10);
            String PNRNo = "PNRAES12345";
            Integer TicketPrice = ran.nextInt(2000,3000);

            // e1,lst2,secboItems1
            String insertItems = "INSERT INTO user_ticket_details(UserId, TravelDate, TravelFrom, TravelTo, PassengerName, PassengerAge, PassengerGender, PassengerIdProof, PassengerSeatNo, PassengerClass,PassengerFlightNo,PNRNo,TicketPrice) VALUES('";
            String insertValues = UserId + "','" + TravelDate + "','" + From   + "','" + To + "','" + PassengerName + "','" + PassengerAge + "','" + PassengerGender + "','" + IdProof + "','" + SeatNo + "','" + Class + "','" + FlightNo + "','" + PNRNo + "',"+ TicketPrice +")";
            String insertQry = insertItems + insertValues;

            this.st = this.connectDB.createStatement();
            this.st.executeUpdate(insertQry);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText((String)null);
            alert.setContentText("Ticket has been created.");
            alert.showAndWait();
        } catch (Exception var16) {
            var16.printStackTrace();
            var16.getCause();
        }
    }

    public boolean userCheck() {
        try {
            this.dbConnection = new DatabaseConnection();
            this.connectDB = this.dbConnection.getConnection();
            String var10000 = this.t1.getText();
            String isUserExistQuery = "Select * from tbl_User where UserName ='" + var10000 + "' and Password= '" + this.p.getText() + "'";
            this.dbConnection = new DatabaseConnection();
            this.connectDB = this.dbConnection.getConnection();
            this.pst = this.connectDB.prepareStatement(isUserExistQuery);
            this.rs = this.pst.executeQuery();
            if (!this.rs.next()) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText((String)null);
                alert.setContentText("User Doesn't Exit!");
                alert.showAndWait();
                return false;
            }

            this.UserName = this.rs.getString("UserName");
            this.User_Id = this.rs.getInt("UserId");
            Label lblUname = new Label(this.UserName);
//            Menu unMenu = new Menu("", lblUname);
//            this.loghommenu.getMenus().addAll(new Menu[]{unMenu});
            this.loghomtxt.setText("Welcome " + this.UserName);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("User Logged In");
            alert.setHeaderText((String)null);
            alert.setContentText("Welcome back " + this.UserName + "!");
            alert.showAndWait();
        } catch (Exception var5) {
            var5.printStackTrace();
            var5.getCause();
        }

        return true;
    }

    public boolean getTicketDetails() {
        try {
            this.dbConnection = new DatabaseConnection();
            this.connectDB = this.dbConnection.getConnection();
            String isTicketExistQuery = "select * from user_ticket_details where UserId = " + User_Id +" order by TicketDetailsId desc limit 1";
            this.dbConnection = new DatabaseConnection();
            this.connectDB = this.dbConnection.getConnection();
            this.pst = this.connectDB.prepareStatement(isTicketExistQuery);
            this.rs = this.pst.executeQuery();
            if (!this.rs.next()) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText((String)null);
                alert.setContentText("There is no valid tickets!");
                alert.showAndWait();
                return false;
            }
            ticnm.setText("NAME : " + this.rs.getString("PassengerName"));
            ticcls.setText("CLASS : " +this.rs.getString("PassengerClass"));
            ticseat.setText("SEAT NO : " +this.rs.getString("PassengerSeatNo"));
            ticflino.setText("FLIGHT NO : " +this.rs.getString("PassengerFlightNo"));
            ticfrom.setText("FROM : " +this.rs.getString("TravelFrom"));
            ticto.setText("TO : " +this.rs.getString("TravelTo"));
            ticprice.setText("TOTAL AMOUNT : " +this.rs.getInt("TicketPrice"));

        } catch (Exception var5) {
            var5.printStackTrace();
            var5.getCause();
        }

        return true;
    }

    public boolean Login_validateFields() {
        if (this.t1.getText().isEmpty()) {
            this.t1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.t1)).play();
            return false;
        } else {
            this.t1.setStyle((String)null);
            if (this.p.getText().isEmpty()) {
                this.p.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                (new FadeIn(this.p)).play();
                return false;
            } else {
                this.p.setStyle((String)null);
                return true;
            }
        }
    }

    private boolean cvalidateFields() {
        if (this.te1.getText().isEmpty()) {
            this.te1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.te1)).play();
            return false;
        } else {
            this.te1.setStyle((String)null);
            if (this.cbo.getSelectionModel().isEmpty()) {
                this.cbo.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                (new FadeIn(this.cbo)).play();
                return false;
            } else {
                this.cb.setStyle((String)null);
                if (this.cbo1.getSelectionModel().isEmpty()) {
                    this.cbo1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                    (new FadeIn(this.cbo1)).play();
                    return false;
                } else {
                    this.cbo1.setStyle((String)null);
                    if (this.cbo2.getSelectionModel().isEmpty()) {
                        this.cbo2.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.cbo2)).play();
                        return false;
                    } else {
                        this.cbo2.setStyle((String)null);
                        if (this.te3.getText().isEmpty()) {
                            this.te3.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                            (new FadeIn(this.te3)).play();
                            return false;
                        } else {
                            this.te3.setStyle((String)null);
                            return true;
                        }
                    }
                }
            }
        }
    }

    public boolean equal() {
        Alert alert;
        if (this.secbo1.getSelectionModel().getSelectedItem() == this.seo1.getSelectionModel().getSelectedItem()) {
            alert = new Alert(AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText((String)null);
            alert.setContentText("Same Destination!");
            alert.showAndWait();
            return false;
        } else {
            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Searching Flight");
            alert.setHeaderText((String)null);
            alert.setContentText("Flights Available!");
            alert.showAndWait();
            return true;
        }
    }

    public boolean signequals() {
        if (!this.pf.getText().equals(this.cpf.getText())) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText((String)null);
            alert.setContentText("Both the Passwords are not same!");
            alert.showAndWait();
            return false;
        } else {
            return true;
        }
    }

    private boolean sevalidateFields() {
        if (this.sed.getEditor().getText().isEmpty()) {
            this.sed.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.sed)).play();
            return false;
        } else {
            this.sed.setStyle((String)null);
            if (this.seo1.getSelectionModel().isEmpty()) {
                this.seo1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                (new FadeIn(this.seo1)).play();
                return false;
            } else {
                this.seo1.setStyle((String)null);
                if (this.secbo1.getSelectionModel().isEmpty()) {
                    this.secbo1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                    (new FadeIn(this.secbo1)).play();
                    return false;
                } else {
                    this.secbo1.setStyle((String)null);
                    return true;
                }
            }
        }
    }

    private boolean bookvalidateFields() {
        if (this.bookt11.getText().isEmpty()) {
            this.bookt11.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.bookt11)).play();
            return false;
        } else {
            this.bookt11.setStyle((String)null);
            if (this.bookt12.getText().isEmpty()) {
                this.bookt12.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                (new FadeIn(this.bookt12)).play();
                return false;
            } else {
                this.bookt12.setStyle((String)null);
                if (this.bookcom.getSelectionModel().isEmpty()) {
                    this.bookcom.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                    (new FadeIn(this.bookcom)).play();
                    return false;
                } else {
                    this.bookcom.setStyle((String)null);
                    if (this.bookt14.getText().isEmpty()) {
                        this.bookt14.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.bookt14)).play();
                        return false;
                    } else {
                        this.bookt14.setStyle((String)null);
                        return true;
                    }
                }
            }
        }
    }
}
