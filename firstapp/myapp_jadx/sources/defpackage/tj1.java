package defpackage;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class tj1 extends xaz {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public tj1(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            bmy.a("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.xaz
    public final EGLSurface a() {
        return this.a;
    }

    @Override // defpackage.xaz
    public final int b() {
        return this.c;
    }

    @Override // defpackage.xaz
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xaz)) {
            return false;
        }
        xaz xazVar = (xaz) obj;
        return this.a.equals(xazVar.a()) && this.b == xazVar.c() && this.c == xazVar.b();
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zk1.a(this.c, "}", sb);
    }
}
