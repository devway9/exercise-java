package com.devway.spring.mvc.spittr.web;

import com.devway.spring.mvc.spittr.Spittle;
import com.devway.spring.mvc.spittr.data.SpittleRepository;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.mockito.Mockito.*;

/**
 * @author devway
 * @date 2017-12-20
 */
public class SpittleControllerTest {

    @Test
    public void spittlesTest() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(1000, 20)).thenReturn(expectedSpittles);

        SpittleController controller = new SpittleController(mockRepository);

        MockMvc mockMvc = standaloneSetup(controller).setSingleView(
                new InternalResourceView("/WEB-INF/views/spittles.jsp?max=1000&count=20")).build();
        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attribute("spittleList", IsCollectionContaining.hasItems(expectedSpittles.toArray())));
    }

    @Test
    public void spittlesTest2() throws Exception {
        Spittle spittle = new Spittle("Hello", new Date());
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findOne(12345)).thenReturn(spittle);

        SpittleController controller = new SpittleController(mockRepository);

        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles/12345"))
                .andExpect(view().name("spittle"))
                .andExpect(model().attribute("spittle", spittle));
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> list = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            list.add(new Spittle("spittle" + i, new Date()));
        }
        return list;
    }
}
