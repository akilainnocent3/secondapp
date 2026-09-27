package com.startapp.simple.bloomfilter.parsing;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.creation.Serializer;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import com.startapp.simple.bloomfilter.version.VersionFactoryHolder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class TokenBuilder {
    public static final String TOKEN_DELIMITER = "-";
    private final Serializer serializer;
    private final VersionFactoryHolder versionFactoryHolder;

    public TokenBuilder(Serializer serializer, VersionFactoryHolder versionFactoryHolder) {
        this.versionFactoryHolder = versionFactoryHolder;
        this.serializer = serializer;
    }

    public String asToken(BloomVersion bloomVersion, OpenBitSet openBitSet, long j10) {
        try {
            String strSerialize = this.serializer.serialize(openBitSet);
            return j10 + TOKEN_DELIMITER + bloomVersion.getVersion() + TOKEN_DELIMITER + this.versionFactoryHolder.getTokenCompression(bloomVersion).compress(strSerialize);
        } catch (Throwable unused) {
            return null;
        }
    }
}
