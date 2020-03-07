package fii.practic.demo.service;

public interface TestService {

    void save(String name);
    String getAll();
    String getTestMessage();
    void update(Integer id, String newValue);
    void delete(Integer id);
}
