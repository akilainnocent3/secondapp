package com.startapp.simple.bloomfilter.algo;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface BloomContainer {
    void addNewKeys(List<String> list);

    boolean contains(String str);

    boolean contains(long[] jArr);

    OpenBitSet getBitSet();

    BloomVersion getBloomVersion();

    boolean isValid();
}
