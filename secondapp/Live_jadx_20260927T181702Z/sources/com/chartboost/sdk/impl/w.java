package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static final void a(qb qbVar, ds.l isSuccess, ds.p isError) {
        kotlin.jvm.internal.m0.p(qbVar, "<this>");
        kotlin.jvm.internal.m0.p(isSuccess, "isSuccess");
        kotlin.jvm.internal.m0.p(isError, "isError");
        if (qbVar.b() == null) {
            isSuccess.invoke(qbVar);
        } else {
            isError.invoke(qbVar, qbVar.b());
        }
    }
}
