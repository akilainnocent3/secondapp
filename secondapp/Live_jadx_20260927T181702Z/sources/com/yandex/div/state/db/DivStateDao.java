package com.yandex.div.state.db;

import java.util.List;
import k.i1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivStateDao {
    @i1
    void deleteAll();

    @i1
    void deleteAllExcept(@l List<String> list);

    @i1
    void deleteByCardId(@l String str);

    @i1
    void deleteCardRootState(@l String str);

    @i1
    void deleteModifiedBefore(long j10);

    @i1
    @m
    String getRootStateId(@l String str);

    @i1
    @l
    List<PathToState> getStates(@l String str);

    @i1
    void updateState(@l DivStateEntity divStateEntity);
}
