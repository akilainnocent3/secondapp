package gb;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f86361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f86362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f86363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public float[] f86365e;

    public d() {
        this.f86361a = 0.0f;
        this.f86362b = 0.0f;
        this.f86363c = 0.0f;
        this.f86364d = 0;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f86364d) > 0) {
            paint.setShadowLayer(Math.max(this.f86361a, Float.MIN_VALUE), this.f86362b, this.f86363c, this.f86364d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(x.b bVar) {
        if (Color.alpha(this.f86364d) > 0) {
            bVar.f86421d = this;
        } else {
            bVar.f86421d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = z.l(Color.alpha(this.f86364d), l.d(i10, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f86361a, Float.MIN_VALUE), this.f86362b, this.f86363c, Color.argb(iL, Color.red(this.f86364d), Color.green(this.f86364d), Color.blue(this.f86364d)));
        }
    }

    public void d(int i10, x.b bVar) {
        d dVar = new d(this);
        bVar.f86421d = dVar;
        dVar.i(i10);
    }

    public int e() {
        return this.f86364d;
    }

    public float f() {
        return this.f86362b;
    }

    public float g() {
        return this.f86363c;
    }

    public float h() {
        return this.f86361a;
    }

    public void i(int i10) {
        this.f86364d = Color.argb(Math.round((Color.alpha(this.f86364d) * l.d(i10, 0, 255)) / 255.0f), Color.red(this.f86364d), Color.green(this.f86364d), Color.blue(this.f86364d));
    }

    public boolean j(d dVar) {
        return this.f86361a == dVar.f86361a && this.f86362b == dVar.f86362b && this.f86363c == dVar.f86363c && this.f86364d == dVar.f86364d;
    }

    public void k(int i10) {
        this.f86364d = i10;
    }

    public void l(float f10) {
        this.f86362b = f10;
    }

    public void m(float f10) {
        this.f86363c = f10;
    }

    public void n(float f10) {
        this.f86361a = f10;
    }

    public void o(Matrix matrix) {
        if (this.f86365e == null) {
            this.f86365e = new float[2];
        }
        float[] fArr = this.f86365e;
        fArr[0] = this.f86362b;
        fArr[1] = this.f86363c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f86365e;
        this.f86362b = fArr2[0];
        this.f86363c = fArr2[1];
        this.f86361a = matrix.mapRadius(this.f86361a);
    }

    public d(float f10, float f11, float f12, int i10) {
        this.f86361a = f10;
        this.f86362b = f11;
        this.f86363c = f12;
        this.f86364d = i10;
        this.f86365e = null;
    }

    public d(d dVar) {
        this.f86361a = 0.0f;
        this.f86362b = 0.0f;
        this.f86363c = 0.0f;
        this.f86364d = 0;
        this.f86361a = dVar.f86361a;
        this.f86362b = dVar.f86362b;
        this.f86363c = dVar.f86363c;
        this.f86364d = dVar.f86364d;
        this.f86365e = null;
    }
}
