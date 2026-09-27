package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d9 {
    public static final ChartboostError a(com.chartboost.sdk.internal.Networking.okhttp.a aVar, String url) {
        kotlin.jvm.internal.m0.p(aVar, "<this>");
        kotlin.jvm.internal.m0.p(url, "url");
        if (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.i) {
            return new ChartboostError.Load.AssetUnavailable(url, "Asset not found.", aVar);
        }
        if ((aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.b) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.n) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.f) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.e)) {
            return new ChartboostError.Load.InvalidRequest(aVar.getMessage(), aVar);
        }
        if ((aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.l) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.C0416a) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.h) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.k)) {
            return new ChartboostError.Connectivity.ServerError(aVar.getMessage(), aVar);
        }
        if ((aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.j) || (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.g)) {
            return ChartboostError.Connectivity.TimedOut.INSTANCE;
        }
        if (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.m) {
            return ChartboostError.Load.RateLimited.INSTANCE;
        }
        if (aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.c) {
            return new ChartboostError.Load.InvalidRequest(aVar.getMessage(), aVar);
        }
        return aVar instanceof com.chartboost.sdk.internal.Networking.okhttp.a.o ? new ChartboostError.Connectivity.Unknown(aVar.getMessage(), aVar) : new ChartboostError.Connectivity.Unknown(aVar.getMessage(), aVar);
    }
}
