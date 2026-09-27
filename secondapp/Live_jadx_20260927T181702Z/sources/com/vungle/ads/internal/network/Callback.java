package com.vungle.ads.internal.network;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Callback<T> {
    void onFailure(@m Call<T> call, @m Throwable th2);

    void onResponse(@m Call<T> call, @m Response<T> response);
}
