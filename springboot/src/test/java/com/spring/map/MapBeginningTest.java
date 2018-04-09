package com.spring.map;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MapBeginningTest {
    MapBeginning mapBeginning;
    @Before
    public void setUp() throws Exception {
        mapBeginning = new MapBeginning();
    }
    @Test
    public void testReadOneRandomFileOfBeginningPlatformData() {
        mapBeginning.readOneRandomFileOfBeginningPlatformData();
        assertEquals(ArrayList.class, mapBeginning.getData().getClass());
    }
    @Test
    public void testReadOneRandomFileOfBeginningPlatformData2() {
        mapBeginning.readOneRandomFileOfBeginningPlatformData();
        assert(mapBeginning.getData().size() > 1);
    }

}