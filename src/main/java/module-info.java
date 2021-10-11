module ba.unsa.etf.rpr.probnijavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ba.unsa.etf.rpr.probnijavafx to javafx.fxml;
    exports ba.unsa.etf.rpr.probnijavafx;
}