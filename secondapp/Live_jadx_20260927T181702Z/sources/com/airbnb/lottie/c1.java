package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Bitmap f24980f;

    @k.y0({k.y0.a.LIBRARY})
    public c1(int i10, int i11, String str, String str2, String str3) {
        this.f24975a = i10;
        this.f24976b = i11;
        this.f24977c = str;
        this.f24978d = str2;
        this.f24979e = str3;
    }

    public c1 a(float f10) {
        c1 c1Var = new c1((int) (this.f24975a * f10), (int) (this.f24976b * f10), this.f24977c, this.f24978d, this.f24979e);
        Bitmap bitmap = this.f24980f;
        if (bitmap != null) {
            c1Var.i(Bitmap.createScaledBitmap(bitmap, c1Var.f24975a, c1Var.f24976b, true));
        }
        return c1Var;
    }

    @Nullable
    public Bitmap b() {
        return this.f24980f;
    }

    public String c() {
        return this.f24979e;
    }

    public String d() {
        return this.f24978d;
    }

    public int e() {
        return this.f24976b;
    }

    public String f() {
        return this.f24977c;
    }

    public int g() {
        return this.f24975a;
    }

    public boolean h() {
        if (this.f24980f == null) {
            return this.f24978d.startsWith("data:") && this.f24978d.indexOf("base64,") > 0;
        }
        return true;
    }

    public void i(@Nullable Bitmap bitmap) {
        this.f24980f = bitmap;
    }
}
