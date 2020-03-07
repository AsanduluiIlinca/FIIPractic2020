package fii.practic.demo.Controller;

import fii.practic.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    //http:localhost:8080/test?name=fiipractic
    //http:localhost:8080/test/1
    //http://localhost:8080/test/1?name=fiipractic
    //http://localhost:8080/doctors?pageNumber=0&pageSize=10

//    public String getTestMessage(@RequestParam(value = "name", required = false ) String name, /*daca nu o sa dau valoarea la name o sa mearga, de asta punem required false*/
//                                 @PathVariable Long id){
//        return "Am primit id-ul : " + id + " si name: " + name;
//    }
    @Autowired
    private TestService testService;

    @GetMapping
    @RequestMapping //(value="/test")
    public String getTestMessage(){
        return testService.getTestMessage();
    }

    @GetMapping
    public String getNames(){
        return testService.getAll();
    }

    @PostMapping
    public void save(@RequestBody String name){
        testService.save(name);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody String newValue){
        testService.update(id, newValue);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
    }
}
