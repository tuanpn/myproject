package vn.bigthomas.myproject.test.quartz;

import org.springframework.stereotype.Service;

import java.util.Date;

public class TestService {

    public void doIt() {
        // do the actual work
        System.out.println("test service doIt " + new Date());
    }

}
