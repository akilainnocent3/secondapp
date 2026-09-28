package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class awf {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g;
    public float h;
    public float i;
    public float j;
    public RectF[] k;

    public awf(float f, float f2, float f3, float f4, float f5) {
        this.g = f5;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return (this.c + this.a) * 0.5f;
    }

    public final float b() {
        return (this.d + this.b) * 0.5f;
    }

    public final RectF[] c() {
        if (this.k == null) {
            return new RectF[]{new RectF(this.a, this.b, this.c, this.d)};
        }
        ArrayList arrayList = new ArrayList();
        for (RectF rectF : this.k) {
            arrayList.add(new RectF((i() * rectF.left) + this.a, (d() * rectF.top) + this.b, (i() * rectF.right) + this.a, (d() * rectF.bottom) + this.b));
        }
        return (RectF[]) arrayList.toArray(new RectF[0]);
    }

    public final float d() {
        return this.d - this.b;
    }

    public final void e(float f) {
        this.g = Math.min(Math.max(f, 0.0f), 1.0f);
    }

    public final void f(float f, float f2) {
        g(f, f2, i(), d());
    }

    public final void g(float f, float f2, float f3, float f4) {
        RectF rectFB = bsh0.b(f, f2, f3, f4);
        float f5 = rectFB.left;
        float f6 = rectFB.top;
        float f7 = rectFB.right;
        float f8 = rectFB.bottom;
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
    }

    public final void h(RectF[] rectFArr) {
        for (RectF rectF : rectFArr) {
            if (rectF.left >= 0.0f) {
                float f = rectF.right;
                if (f <= 1.0f) {
                    float f2 = rectF.top;
                    if (f2 >= 0.0f && f2 <= 1.0f && f >= 0.0f && f <= 1.0f) {
                        float f3 = rectF.bottom;
                        if (f3 >= 0.0f && f3 <= 1.0f) {
                        }
                    }
                }
            }
            hb5.a("collision area data is incorrect");
            return;
        }
        this.k = rectFArr;
    }

    public final float i() {
        return this.c - this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Element{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append(", scaleX=");
        sb.append(this.e);
        sb.append(", scaleY=");
        sb.append(this.f);
        sb.append(", alphaProportion=");
        sb.append(this.g);
        sb.append(", rollingXDegrees=");
        sb.append(this.h);
        sb.append(", rollingYDegrees=");
        sb.append(this.i);
        sb.append(", rotateDegrees=");
        sb.append(this.j);
        sb.append(", collisionArea=");
        return j26.a(sb, Arrays.toString(this.k), '}');
    }
}
