package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 extends mj0 {
    public float a;
    public float b;
    public final int c = 2;

    public jj0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.mj0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.mj0
    public final int b() {
        return this.c;
    }

    @Override // defpackage.mj0
    public final mj0 c() {
        return new jj0(0.0f, 0.0f);
    }

    @Override // defpackage.mj0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.mj0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return jj0Var.a == this.a && jj0Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
