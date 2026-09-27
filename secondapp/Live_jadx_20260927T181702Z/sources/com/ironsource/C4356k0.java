package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4356k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C4356k0 f62172a = new C4356k0();

    private C4356k0() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    @cs.o
    @oy.m
    public static final MeasurementManager a(@oy.l Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return v8.q.a(context.getSystemService(v8.p.a()));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @cs.o
    public static /* synthetic */ void b() {
    }
}
