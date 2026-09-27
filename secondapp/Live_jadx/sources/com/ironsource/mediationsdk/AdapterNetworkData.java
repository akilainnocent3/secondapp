package com.ironsource.mediationsdk;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdapterNetworkData {
    @oy.l
    JSONObject allData();

    @oy.m
    <T> T dataByKeyIgnoreCase(@oy.l String str, @oy.l Class<T> cls);

    @oy.l
    JSONObject networkDataByAdUnit(@oy.l IronSource.a aVar);
}
