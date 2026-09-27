package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface B7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58491a = "uuidEnabled";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(Context context, long j10);
    }

    String A(Context context);

    File B(Context context);

    boolean C(Context context);

    int D(Context context);

    float E(Context context);

    String F(Context context);

    String G(Context context);

    List<ApplicationInfo> H(Context context);

    @oy.m
    String I(Context context);

    boolean J(Context context);

    int K(Context context);

    @oy.m
    String L(Context context);

    String M(Context context);

    int N(Context context);

    long a();

    long a(String str);

    @oy.m
    Long a(@oy.m ActivityManager.MemoryInfo memoryInfo);

    boolean a(Activity activity);

    boolean a(Context context);

    int b();

    @oy.m
    Boolean b(@oy.m ActivityManager.MemoryInfo memoryInfo);

    @oy.m
    String b(Context context);

    int c();

    @oy.m
    Long c(@oy.m ActivityManager.MemoryInfo memoryInfo);

    String c(Context context);

    String d();

    String d(Context context);

    int e();

    boolean e(Context context);

    File f(Context context);

    String f();

    long g();

    boolean g(Context context);

    long h();

    boolean h(Context context);

    String i();

    String i(Context context);

    File j(Context context);

    boolean j();

    int k();

    int k(Context context);

    File l(Context context);

    String l();

    int m();

    String m(Context context);

    @oy.m
    ActivityManager.MemoryInfo n(Context context);

    boolean n();

    int o();

    int o(Context context);

    boolean p();

    boolean p(Context context);

    long q(Context context);

    String q();

    float r();

    String r(Context context);

    int s(Context context);

    String s();

    int t(Context context);

    @oy.m
    String t();

    String u(Context context);

    String v(Context context);

    boolean w(Context context);

    String x(Context context);

    String y(Context context);

    int z(Context context);
}
