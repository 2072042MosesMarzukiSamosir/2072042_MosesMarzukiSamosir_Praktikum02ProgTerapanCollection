package com.example.collectionclass2072042mosesmarzukisamosir;

import com.example.collectionclass2072042mosesmarzukisamosir.model.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class HelloController {
    public TextField txtNRP;
    public TextField txtNama;
    public TableView tableView;
    public TextField txtNilai_IPA;
    public TextField txtNilai_IPS;
    public Button btnAdd;
    public Button btnDelete;
    public Button btnEdit;


    private ObservableList<Mahasiswa> oList;

    public void initialize() {
        TableColumn column1 = new TableColumn("NRP");
        TableColumn column2 = new TableColumn("Nama");
        TableColumn column3 = new TableColumn("Nilai IPA");
        TableColumn column4 = new TableColumn("Nilai IPS");
        tableView.getColumns().addAll(column1, column2, column3, column4);
        oList = FXCollections.observableArrayList(
                new Mahasiswa("2072042", "moses", "80", "85")
        );
        tableView.setItems(oList);
        column1.setCellValueFactory(new PropertyValueFactory<>("nrp"));
        column2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        column3.setCellValueFactory(new PropertyValueFactory<>("nilai_ipa"));
        column4.setCellValueFactory(new PropertyValueFactory<>("nilai_ips"));


    }

    public void onAdd(ActionEvent event) {
        Mahasiswa mahasiswa = new Mahasiswa(txtNRP.getText(), txtNama.getText(), txtNilai_IPA.getText(), txtNilai_IPS.getText());
        tableView.getItems().add(mahasiswa);
        clearField();

    }

    public void onDelete(ActionEvent event) {
        ObservableList<Mahasiswa> allData, selectedData;
        allData = tableView.getItems();
        selectedData = tableView.getSelectionModel().getSelectedItems();
        selectedData.forEach(allData::remove);
        clearField();
        btnAdd.setDisable(false);
    }

    public void clearField() {
        txtNRP.clear();
        txtNama.clear();
        txtNilai_IPA.clear();
        txtNilai_IPS.clear();
    }

    private Mahasiswa selMahasiswa;

    public void onEdit(ActionEvent event) {
        selMahasiswa.setNrp(txtNRP.getText());
        selMahasiswa.setNama(txtNama.getText());
        selMahasiswa.setNilai_ipa(txtNilai_IPA.getText());
        selMahasiswa.setNilai_ips(txtNilai_IPS.getText());
        clearField();
        oList.set(tableView.getSelectionModel().getFocusedIndex(), selMahasiswa);
        btnAdd.setDisable(false);
    }

    public void onTableClicked(MouseEvent event) {
        selMahasiswa = (Mahasiswa) tableView.getSelectionModel().getSelectedItem();
        if(!tableView.getSelectionModel().getSelectedCells().isEmpty()){
            btnAdd.setDisable(true);
        }
        if (selMahasiswa != null) {
            txtNRP.setText(selMahasiswa.getNrp());
            txtNama.setText(selMahasiswa.getNama());
            txtNilai_IPA.setText(selMahasiswa.getNilai_ipa());
            txtNilai_IPS.setText(selMahasiswa.getNilai_ips());
        }

    }
}