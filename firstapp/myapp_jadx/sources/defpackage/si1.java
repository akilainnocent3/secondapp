package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class si1 extends mcn {
    public final c4f0 a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public si1(c4f0 c4f0Var, long j, int i, Matrix matrix, int i2) {
        if (c4f0Var == null) {
            bmy.a("Null tagBundle");
            throw null;
        }
        this.a = c4f0Var;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            bmy.a("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.d = matrix;
        this.e = i2;
    }

    @Override // defpackage.mcn, defpackage.c9n
    public final int b() {
        return this.e;
    }

    @Override // defpackage.c9n
    public final c4f0 c() {
        return this.a;
    }

    @Override // defpackage.c9n
    public final long d() {
        return this.b;
    }

    @Override // defpackage.mcn
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mcn)) {
            return false;
        }
        mcn mcnVar = (mcn) obj;
        si1 si1Var = (si1) mcnVar;
        return this.a.equals(si1Var.a) && this.b == si1Var.b && this.c == mcnVar.e() && this.d.equals(mcnVar.f()) && this.e == mcnVar.b();
    }

    @Override // defpackage.mcn
    public final Matrix f() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.e ^ ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return zk1.a(this.e, "}", sb);
    }
}
