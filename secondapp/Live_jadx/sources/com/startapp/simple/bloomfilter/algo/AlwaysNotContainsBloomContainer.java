package com.startapp.simple.bloomfilter.algo;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AlwaysNotContainsBloomContainer implements BloomContainer {
    private final BloomVersion bloomVersion;

    public AlwaysNotContainsBloomContainer(BloomVersion bloomVersion) {
        this.bloomVersion = bloomVersion;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean contains(String str) {
        return false;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public OpenBitSet getBitSet() {
        return new OpenBitSet(0L);
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public BloomVersion getBloomVersion() {
        return this.bloomVersion;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean isValid() {
        return false;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean contains(long[] jArr) {
        return false;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public void addNewKeys(List<String> list) {
    }
}
