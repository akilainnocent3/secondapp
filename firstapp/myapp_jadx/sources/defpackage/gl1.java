package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class gl1 extends cie0.d {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public gl1(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = matrix;
        this.f = z2;
    }

    @Override // cie0.d
    public final Rect a() {
        return this.a;
    }

    @Override // cie0.d
    public final int b() {
        return this.b;
    }

    @Override // cie0.d
    public final Matrix c() {
        return this.e;
    }

    @Override // cie0.d
    public final int d() {
        return this.c;
    }

    @Override // cie0.d
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cie0.d)) {
            return false;
        }
        cie0.d dVar = (cie0.d) obj;
        return this.a.equals(dVar.a()) && this.b == dVar.b() && this.c == dVar.d() && this.d == dVar.e() && this.e.equals(dVar.c()) && this.f == dVar.f();
    }

    @Override // cie0.d
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return mq0.a(sb, this.f, "}");
    }
}
