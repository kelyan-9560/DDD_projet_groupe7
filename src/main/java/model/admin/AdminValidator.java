package model.admin;

import model.Validator;
import model.admin.exception.AdminException;

public class AdminValidator extends Validator<Admin> {
    public void check(Admin admin) {
        try {
            verifier.checkAdmin(admin);
        } catch (NullPointerException e) {
            throw new AdminException();
        }
    }
}
