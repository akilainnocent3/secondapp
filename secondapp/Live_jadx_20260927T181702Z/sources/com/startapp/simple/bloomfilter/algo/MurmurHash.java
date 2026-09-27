package com.startapp.simple.bloomfilter.algo;

import gj.m;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class MurmurHash {
    public static long hash64(ByteBuffer byteBuffer, int i10, int i11, long j10) {
        long j11 = m.f86907f;
        long j12 = (j10 & 4294967295L) ^ (((long) i11) * m.f86907f);
        int i12 = i11 >> 3;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10 + (i13 << 3);
            long j13 = j11;
            long j14 = ((((long) byteBuffer.get(i14)) & 255) + ((((long) byteBuffer.get(i14 + 1)) & 255) << 8) + ((((long) byteBuffer.get(i14 + 2)) & 255) << 16) + ((((long) byteBuffer.get(i14 + 3)) & 255) << 24) + ((((long) byteBuffer.get(i14 + 4)) & 255) << 32) + ((((long) byteBuffer.get(i14 + 5)) & 255) << 40) + ((((long) byteBuffer.get(i14 + 6)) & 255) << 48) + ((((long) byteBuffer.get(i14 + 7)) & 255) << 56)) * j13;
            j12 = (j12 ^ ((j14 ^ (j14 >>> 47)) * j13)) * j13;
            i13++;
            j11 = j13;
        }
        long j15 = j11;
        int i15 = i11 & 7;
        switch (i15) {
            case 7:
                j12 ^= ((long) byteBuffer.get(((i10 + i11) - i15) + 6)) << 48;
            case 6:
                j12 ^= ((long) byteBuffer.get(((i10 + i11) - i15) + 5)) << 40;
            case 5:
                j12 ^= ((long) byteBuffer.get(((i10 + i11) - i15) + 4)) << 32;
            case 4:
                j12 ^= ((long) byteBuffer.get(((i10 + i11) - i15) + 3)) << 24;
            case 3:
                j12 ^= ((long) byteBuffer.get(((i10 + i11) - i15) + 2)) << 16;
            case 2:
                j12 ^= ((long) byteBuffer.get(((i10 + i11) - i15) + 1)) << 8;
            case 1:
                j12 = (((long) byteBuffer.get((i10 + i11) - i15)) ^ j12) * j15;
                break;
        }
        long j16 = ((j12 >>> 47) ^ j12) * j15;
        return j16 ^ (j16 >>> 47);
    }
}
