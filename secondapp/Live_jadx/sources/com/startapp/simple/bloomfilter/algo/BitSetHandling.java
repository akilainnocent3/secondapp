package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class BitSetHandling {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public BitSetHandling(int i10, int i11) {
        this.numberOfHashes = i10;
        this.sizeOfBucket = i11;
    }

    private void add(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        for (long j10 : getHashBuckets(byteBuffer, openBitSet.size())) {
            openBitSet.set(j10);
        }
    }

    private long[] getHashBuckets(ByteBuffer byteBuffer, long j10) {
        int i10 = this.numberOfHashes;
        long[] jArr = new long[i10];
        long j11 = j10 / ((long) i10);
        long jHash64 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0L);
        long jHash65 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), jHash64);
        for (int i11 = 0; i11 < this.numberOfHashes; i11++) {
            long j12 = i11;
            jArr[i11] = (j12 * j11) + Math.abs(((j12 * jHash65) + jHash64) % j11);
        }
        return jArr;
    }

    public void fillBitSetWithKeys(List<String> list, OpenBitSet openBitSet) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            add(ByteBuffer.wrap(it.next().getBytes()), openBitSet);
        }
    }

    public long[] hashBucketsFromApplication(String str) {
        return getHashBuckets(ByteBuffer.wrap(str.getBytes()), new OpenBitSet(this.numberOfHashes * this.sizeOfBucket).size());
    }

    public boolean isPresent(long[] jArr, OpenBitSet openBitSet) {
        if (jArr.length == 0) {
            return false;
        }
        for (long j10 : jArr) {
            if (!openBitSet.indexInBits(j10)) {
                return false;
            }
        }
        return true;
    }

    public OpenBitSet keysToBitSet(List<String> list) {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSetWithKeys(list, openBitSet);
        return openBitSet;
    }

    public boolean isPresent(String str, OpenBitSet openBitSet) {
        return isPresent(ByteBuffer.wrap(str.getBytes()), openBitSet);
    }

    private boolean isPresent(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        return isPresent(getHashBuckets(byteBuffer, openBitSet.size()), openBitSet);
    }
}
