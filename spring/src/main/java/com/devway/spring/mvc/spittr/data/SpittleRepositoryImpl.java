package com.devway.spring.mvc.spittr.data;

import com.devway.spring.mvc.spittr.Spitter;
import com.devway.spring.mvc.spittr.Spittle;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author devway
 * @date 2017-12-20
 */
@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            list.add(new Spittle("spittle" + i, new Date()));
        }
        return list;
    }

    @Override
    public Spittle findOne(long i) {
        return  new Spittle("Hello", new Date());
    }

    @Override
    public void save(Spitter spitter) {
        System.out.println("sname="+spitter.getName()+",password="+spitter.getPassword());
    }

}
