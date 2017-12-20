package com.devway.spring.mvc.spittr.data;

import com.devway.spring.mvc.spittr.Spitter;
import com.devway.spring.mvc.spittr.Spittle;

import java.util.List;

/**
 * @author devway
 * @date 2017-12-20
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);

    Spittle findOne(long i);

    void save(Spitter spitter);
}
