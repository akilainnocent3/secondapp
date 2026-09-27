package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f95888c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95890b;

    static {
        SparseArray sparseArray = new SparseArray();
        f95888c = sparseArray;
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Hc("jvm", "binder"));
        sparseArray.put(5890, new Hc("jvm", C4235d4.i.f61404b));
        sparseArray.put(5889, new Hc("jvm", C4235d4.i.f61404b));
        sparseArray.put(5897, new Hc("jni_native", C4235d4.i.f61404b));
        sparseArray.put(5898, new Hc("jni_native", C4235d4.i.f61404b));
    }

    public Hc(String str, String str2) {
        this.f95889a = str;
        this.f95890b = str2;
    }
}
