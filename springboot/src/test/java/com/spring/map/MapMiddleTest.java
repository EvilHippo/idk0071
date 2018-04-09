package com.spring.map;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MapMiddleTest {

    MapMiddle mapMiddle;
    @Before
    public void setUp() throws Exception {
        mapMiddle = new MapMiddle();
    }
    @Test
    public void testReadOneRandomFileOfMiddlePlatformData() {
        mapMiddle.readOneRandomFileOfMiddlePlatformData();
        assertEquals(ArrayList.class, mapMiddle.getData().getClass());
    }
    @Test
    public void testReadOneRandomFileOfMiddlePlatformData2() {
        mapMiddle.readOneRandomFileOfMiddlePlatformData();
        assert(mapMiddle.getData().size() > 1);
    }
}