package com.satanbakespancakes;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.zip.CRC32;

public class HashComp implements Comparator<Integer> {
    CRC32 crc32 = new CRC32();
    @Override
    public int compare(Integer o1, Integer o2) {
        crc32.update(o1);
        long hash1 = crc32.getValue();
        crc32.reset();
        crc32.update(o2);
        long hash2 = crc32.getValue();
        crc32.reset();

        if(hash1>hash2){
            return 1;
        } else if (hash1 < hash2){
            return -1;
        }
        return 0;
    }
}
