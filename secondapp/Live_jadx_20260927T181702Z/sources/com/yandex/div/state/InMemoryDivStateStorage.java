package com.yandex.div.state;

import java.util.List;
import k.i1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InMemoryDivStateStorage implements DivStateStorage {

    @l
    private final InMemoryDivStateCache cache = new InMemoryDivStateCache();

    @Override // com.yandex.div.state.DivStateStorage
    @i1
    public void deleteAllStates() {
        getCache().clear();
    }

    @Override // com.yandex.div.state.DivStateStorage
    @l
    public InMemoryDivStateCache getCache() {
        return this.cache;
    }

    @Override // com.yandex.div.state.DivStateStorage
    @i1
    public void deleteStatesExceptGiven(@l List<String> list) {
    }

    @Override // com.yandex.div.state.DivStateStorage
    @k.d
    public void preloadState(@l String str) {
    }
}
