package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5499xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C5520y9 f98580a;

    public static final synchronized C5520y9 a(Context context) {
        C5520y9 c5520y9;
        c5520y9 = f98580a;
        if (c5520y9 == null) {
            c5520y9 = new C5520y9(context, "uuid.dat");
            f98580a = c5520y9;
        }
        return c5520y9;
    }
}
