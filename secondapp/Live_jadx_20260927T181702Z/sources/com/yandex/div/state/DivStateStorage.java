package com.yandex.div.state;

import com.yandex.div.core.annotations.PublicApi;
import java.util.List;
import k.i1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivStateStorage {
    @i1
    void deleteAllStates();

    @i1
    void deleteStatesExceptGiven(@l List<String> list);

    @l
    DivStateCache getCache();

    @k.d
    void preloadState(@l String str);
}
