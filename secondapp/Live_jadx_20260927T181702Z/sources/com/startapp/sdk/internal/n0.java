package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f75223c = si.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f75224d = si.a(66, 3, 5, -9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f75225e = si.a(61, 12, -14, 17, 1, -14);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f75226f = si.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f75227g = si.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f75229b = new AtomicInteger(0);

    public n0(Context context) {
        this.f75228a = context;
    }

    public final String a() {
        Context context = this.f75228a;
        StringBuilder sb2 = new StringBuilder();
        String str = f75223c;
        sb2.append(str);
        sb2.append(f75225e);
        String str2 = f75227g;
        sb2.append(str2);
        int[] iArrA = si.a(context, sb2.toString(), str + f75224d + str2, str + f75226f + str2);
        StringBuilder sb3 = new StringBuilder(iArrA.length);
        for (int i10 : iArrA) {
            sb3.append(i10);
        }
        return sb3.toString();
    }
}
