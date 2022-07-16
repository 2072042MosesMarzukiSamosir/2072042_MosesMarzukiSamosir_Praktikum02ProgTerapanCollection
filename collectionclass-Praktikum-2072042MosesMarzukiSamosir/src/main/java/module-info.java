module com.example.collectionclass2072042mosesmarzukisamosir {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.collectionclass2072042mosesmarzukisamosir to javafx.fxml;
    opens com.example.collectionclass2072042mosesmarzukisamosir.model to javafx.base;
    exports com.example.collectionclass2072042mosesmarzukisamosir;
}