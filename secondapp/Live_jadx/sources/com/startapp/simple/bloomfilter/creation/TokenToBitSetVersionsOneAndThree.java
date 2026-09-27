package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class TokenToBitSetVersionsOneAndThree extends TokenToBitSet {
    private void incrementInputStreamForBackwordCompatability(DataInput dataInput) {
        try {
            dataInput.readInt();
        } catch (IOException e10) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", e10);
        }
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public DataInput createDataInput(byte[] bArr) {
        DataInput dataInputCreateDataInput = super.createDataInput(bArr);
        incrementInputStreamForBackwordCompatability(dataInputCreateDataInput);
        return dataInputCreateDataInput;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        long j10 = dataInput.readInt();
        OpenBitSet openBitSet = new OpenBitSet(j10 << 6);
        fillBitSet(dataInput, openBitSet, j10);
        return openBitSet;
    }
}
