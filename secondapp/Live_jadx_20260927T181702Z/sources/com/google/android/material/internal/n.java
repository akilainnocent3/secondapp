package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51098a = "lge";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51099b = "samsung";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51100c = "meizu";

    @NonNull
    public static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return c() || e();
    }

    public static boolean c() {
        return a().equals(f51098a);
    }

    public static boolean d() {
        return a().equals(f51100c);
    }

    public static boolean e() {
        return a().equals(f51099b);
    }
}
