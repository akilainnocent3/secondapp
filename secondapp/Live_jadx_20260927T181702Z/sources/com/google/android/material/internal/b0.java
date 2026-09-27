package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f51022o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f51023p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f51024q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f51025r = "android.text.TextDirectionHeuristic";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f51026s = "android.text.TextDirectionHeuristics";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f51027t = "LTR";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f51028u = "RTL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f51029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f51030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public static Object f51031x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f51032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f51033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51034c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51036e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f51043l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public c0 f51045n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51035d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Layout.Alignment f51037f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51038g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f51039h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f51040i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51041j = f51022o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51042k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f51044m = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends Exception {
        public a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    public b0(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f51032a = charSequence;
        this.f51033b = textPaint;
        this.f51034c = i10;
        this.f51036e = charSequence.length();
    }

    @NonNull
    public static b0 c(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @k.e0(from = 0) int i10) {
        return new b0(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f51032a == null) {
            this.f51032a = "";
        }
        int iMax = Math.max(0, this.f51034c);
        CharSequence charSequenceEllipsize = this.f51032a;
        if (this.f51038g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f51033b, iMax, this.f51044m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f51036e);
        this.f51036e = iMin;
        if (this.f51043l && this.f51038g == 1) {
            this.f51037f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f51035d, iMin, this.f51033b, iMax);
        builderObtain.setAlignment(this.f51037f);
        builderObtain.setIncludePad(this.f51042k);
        builderObtain.setTextDirection(this.f51043l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f51044m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f51038g);
        float f10 = this.f51039h;
        if (f10 != 0.0f || this.f51040i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f51040i);
        }
        if (this.f51038g > 1) {
            builderObtain.setHyphenationFrequency(this.f51041j);
        }
        c0 c0Var = this.f51045n;
        if (c0Var != null) {
            c0Var.a(builderObtain);
        }
        return builderObtain.build();
    }

    public final void b() throws a {
        if (f51029v) {
            return;
        }
        try {
            f51031x = this.f51043l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f51030w = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f51029v = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    @NonNull
    @qj.a
    public b0 d(@NonNull Layout.Alignment alignment) {
        this.f51037f = alignment;
        return this;
    }

    @NonNull
    @qj.a
    public b0 e(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f51044m = truncateAt;
        return this;
    }

    @NonNull
    @qj.a
    public b0 f(@k.e0(from = 0) int i10) {
        this.f51036e = i10;
        return this;
    }

    @NonNull
    @qj.a
    public b0 g(int i10) {
        this.f51041j = i10;
        return this;
    }

    @NonNull
    @qj.a
    public b0 h(boolean z10) {
        this.f51042k = z10;
        return this;
    }

    public b0 i(boolean z10) {
        this.f51043l = z10;
        return this;
    }

    @NonNull
    @qj.a
    public b0 j(float f10, float f11) {
        this.f51039h = f10;
        this.f51040i = f11;
        return this;
    }

    @NonNull
    @qj.a
    public b0 k(@k.e0(from = 0) int i10) {
        this.f51038g = i10;
        return this;
    }

    @NonNull
    @qj.a
    public b0 l(@k.e0(from = 0) int i10) {
        this.f51035d = i10;
        return this;
    }

    @NonNull
    @qj.a
    public b0 m(@Nullable c0 c0Var) {
        this.f51045n = c0Var;
        return this;
    }
}
