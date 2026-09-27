package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5011e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f97242a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f97243b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f97244c;

    public C5011e5(Context context) {
        this.f97244c = context.getApplicationContext();
    }

    public final Ha a(R4 r10, C5316q4 c5316q4, P7 p10, HashMap map) {
        Ha ha2 = (Ha) map.get(r10.toString());
        if (ha2 != null) {
            ha2.a(c5316q4);
            return ha2;
        }
        Ha haA = p10.a(this.f97244c, r10, c5316q4);
        map.put(r10.toString(), haA);
        return haA;
    }
}
