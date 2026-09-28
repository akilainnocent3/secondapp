package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class wj1<T> {
    public final T a;
    public final uug b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final e06 h;

    public wj1(T t, uug uugVar, int i, Size size, Rect rect, int i2, Matrix matrix, e06 e06Var) {
        if (t == null) {
            bmy.a("Null data");
            throw null;
        }
        this.a = t;
        this.b = uugVar;
        this.c = i;
        if (size == null) {
            bmy.a("Null size");
            throw null;
        }
        this.d = size;
        if (rect == null) {
            bmy.a("Null cropRect");
            throw null;
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            bmy.a("Null sensorToBufferTransform");
            throw null;
        }
        this.g = matrix;
        if (e06Var != null) {
            this.h = e06Var;
        } else {
            bmy.a("Null cameraCaptureResult");
            throw null;
        }
    }

    public final e06 a() {
        return this.h;
    }

    public final Rect b() {
        return this.e;
    }

    public final T c() {
        return this.a;
    }

    public final uug d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wj1) {
            wj1 wj1Var = (wj1) obj;
            if (this.a.equals(wj1Var.c())) {
                uug uugVar = this.b;
                if (uugVar == null) {
                    if (wj1Var.d() == null) {
                    }
                } else if (uugVar != wj1Var.d()) {
                    return false;
                }
                if (this.c == wj1Var.e() && this.d.equals(wj1Var.h()) && this.e.equals(wj1Var.b()) && this.f == wj1Var.f() && this.g.equals(wj1Var.g()) && this.h.equals(wj1Var.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final Matrix g() {
        return this.g;
    }

    public final Size h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        uug uugVar = this.b;
        return this.h.hashCode() ^ ((((((((((((iHashCode ^ (uugVar == null ? 0 : uugVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
