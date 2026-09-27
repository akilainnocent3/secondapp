package qh;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f122268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f122269b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    @w(from = 0.0d, to = 1.0d)
    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f122269b;
    }

    public float d() {
        return this.f122268a;
    }

    public void e(Context context) {
        float fH = this.f122268a;
        if (fH <= 0.0f) {
            fH = com.google.android.material.carousel.a.h(context);
        }
        this.f122268a = fH;
        float fG = this.f122269b;
        if (fG <= 0.0f) {
            fG = com.google.android.material.carousel.a.g(context);
        }
        this.f122269b = fG;
    }

    public boolean f() {
        return true;
    }

    public abstract com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view);

    public void h(float f10) {
        this.f122269b = f10;
    }

    public void i(float f10) {
        this.f122268a = f10;
    }

    public boolean j(b bVar, int i10) {
        return false;
    }
}
