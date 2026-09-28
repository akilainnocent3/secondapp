package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij0 extends mj0 {
    public float a;
    public final int b = 1;

    public ij0(float f) {
        this.a = f;
    }

    @Override // defpackage.mj0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.mj0
    public final int b() {
        return this.b;
    }

    @Override // defpackage.mj0
    public final mj0 c() {
        return new ij0(0.0f);
    }

    @Override // defpackage.mj0
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.mj0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ij0) && ((ij0) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
