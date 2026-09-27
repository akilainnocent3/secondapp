package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.NoCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSetVersionsOneAndThree;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
class VersionThreeFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    public VersionThreeFactory() {
        BloomVersion bloomVersion = BloomVersion.THREE;
        super(bloomVersion, new NoCompression(), new TokenToBitSetVersionsOneAndThree(), new BitSetHandling(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()));
    }
}
