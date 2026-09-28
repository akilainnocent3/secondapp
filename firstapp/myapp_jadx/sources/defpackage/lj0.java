package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;

/* JADX INFO: loaded from: classes.dex */
public final class lj0 extends mj0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e = 4;

    public lj0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.mj0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.mj0
    public final int b() {
        return this.e;
    }

    @Override // defpackage.mj0
    public final mj0 c() {
        return new lj0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.mj0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.mj0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return lj0Var.a == this.a && lj0Var.b == this.b && lj0Var.c == this.c && lj0Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + YAzniTbXHYQ.sOBFaAlZVWbxM + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
