package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4379l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f62263a = new Date().getTime();

    public static long a(C4379l5 c4379l5) {
        if (c4379l5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4379l5.f62263a;
    }
}
