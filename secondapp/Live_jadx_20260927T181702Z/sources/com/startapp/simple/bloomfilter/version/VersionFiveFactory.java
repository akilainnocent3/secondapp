package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.GZipBase64TokenCompression;
import com.startapp.simple.bloomfilter.compression.ToUrlStringReplacer;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class VersionFiveFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    public VersionFiveFactory() {
        BloomVersion bloomVersion = BloomVersion.FIVE;
        super(bloomVersion, new GZipBase64TokenCompression(new ToUrlStringReplacer()), new DeserializerTokenToBitSet(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()), new BitSetHandling(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()));
    }
}
