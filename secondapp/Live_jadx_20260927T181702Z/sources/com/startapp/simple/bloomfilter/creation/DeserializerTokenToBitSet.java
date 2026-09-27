package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class DeserializerTokenToBitSet extends TokenToBitSet {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public DeserializerTokenToBitSet(int i10, int i11) {
        this.numberOfHashes = i10;
        this.sizeOfBucket = i11;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSet(dataInput, openBitSet, openBitSet.getNumWords());
        return openBitSet;
    }
}
