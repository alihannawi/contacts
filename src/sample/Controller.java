package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import sample.model.Contact;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Controller {

    @FXML private ListView nameView;
    @FXML private Label dateLabel;
    @FXML private Label phoneNumLabel;

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void initialize() {

        contacts.add(new Contact("Ali" , "Hannawi" , "3137441313" ,
                LocalDate.of(2020 , Month.MAY , 22)));
        contacts.add(new Contact("Mom" , "" , "3136735782" ,
                LocalDate.of(2020 , Month.MAY , 25))) ;
        contacts.add(new Contact("Dad" , "" , "3136455656" ,
                LocalDate.of(2020 , Month.MAY , 25)));
        contacts.add(new Contact("Joe" , "B" , "3136150190" ,
                LocalDate.of(2020 , Month.JUNE , 1)));
        contacts.add(new Contact("Hassan" , "Hannawi" , "1613" ,
                LocalDate.of(2020 , Month.JUNE , 20)));

        nameView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {

                if (t1 != null) {

                    Contact contact = (Contact) nameView.getSelectionModel().getSelectedItem();
                    dateLabel.setText(contact.getDateAssigned().toString());
                }
            }
        });

        nameView.getItems().setAll(contacts);
        nameView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //nameView.getSelectionModel().selectFirst();
    }

    @FXML public void handle() {

        Contact contact = (Contact) nameView.getSelectionModel().getSelectedItem();
        dateLabel.setText("Date assigned: " + contact.getDateAssigned().toString());
        phoneNumLabel.setText(String.valueOf(contact.getPhoneNum()).replaceFirst("(\\d{3})(\\d{3})(\\d+)" ,
                "($1)-$2-$3"));
    }
}