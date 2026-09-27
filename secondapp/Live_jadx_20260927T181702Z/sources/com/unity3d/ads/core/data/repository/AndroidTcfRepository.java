package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidTcfRepository implements TcfRepository {

    @l
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(@l TcfDataSource tcfDataSource) {
        m0.p(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    @l
    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    @m
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
