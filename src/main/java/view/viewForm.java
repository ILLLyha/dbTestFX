package view;

import javafx.event.ActionEvent;
import model.User;
import util.DbService;

import java.util.ArrayList;
import java.util.List;

public class viewForm {
    public void addButtonaction(ActionEvent actionEvent) {
        DbService dbService = new DbService();
        List<User> users = new ArrayList<User>();
    }

    public void editButtonaction(ActionEvent actionEvent) {

    }

    public void deleteButtonaction(ActionEvent actionEvent) {

    }
}
