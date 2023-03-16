package infrasructure;

import model.admin.Admin;
import model.admin.AdminRepository;
import model.player.Player;

import java.util.HashMap;
import java.util.Map;

public class InMemoryAdminRepository implements AdminRepository {
    private static Map<String, Admin> db = new HashMap<>();
    @Override
    public Admin getById(int id) {
        return db.get(Integer.toString(id));
    }
}
