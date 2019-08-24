package controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import com.banksteel.controller.HelloController;

public class HelloControllerTest {

    @Test
    public void testHello() throws Exception {
        HelloController helloController = new HelloController();
        StandaloneMockMvcBuilder standaloneSetup = MockMvcBuilders.standaloneSetup(helloController);
        MockMvc mockMvc = standaloneSetup.build();
        ResultActions resultActions =
            mockMvc.perform(MockMvcRequestBuilders.get("hello"));
        System.out.println(resultActions.andReturn().getResponse().getStatus());
//        MvcResult andReturn = resultActions.andReturn();
//        int status = andReturn.getResponse().getStatus();
//        System.out.println("status:" + status);
    }

}
