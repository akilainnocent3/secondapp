package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jl1 extends s4f0 {
    public final Executor c;
    public final utp d;
    public final h8n.g e;
    public final Rect f;
    public final Matrix g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final List<tz5> l;

    public jl1(Executor executor, utp utpVar, h8n.g gVar, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        if (executor == null) {
            bmy.a("Null appExecutor");
            throw null;
        }
        this.c = executor;
        this.d = utpVar;
        this.e = gVar;
        this.f = rect;
        this.g = matrix;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z;
        if (list != null) {
            this.l = list;
        } else {
            bmy.a("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    @Override // defpackage.s4f0
    public final Executor a() {
        return this.c;
    }

    @Override // defpackage.s4f0
    public final int b() {
        return this.j;
    }

    @Override // defpackage.s4f0
    public final Rect c() {
        return this.f;
    }

    @Override // defpackage.s4f0
    public final h8n.e d() {
        return null;
    }

    @Override // defpackage.s4f0
    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s4f0) {
            s4f0 s4f0Var = (s4f0) obj;
            if (this.c.equals(s4f0Var.a())) {
                s4f0Var.d();
                utp utpVar = this.d;
                if (utpVar == null) {
                    if (s4f0Var.f() == null) {
                    }
                } else if (utpVar != s4f0Var.f()) {
                    return false;
                }
                h8n.g gVar = this.e;
                if (gVar == null) {
                    if (s4f0Var.g() == null) {
                    }
                } else if (gVar != s4f0Var.g()) {
                    return false;
                }
                if (s4f0Var.i() == null && this.f.equals(s4f0Var.c()) && this.g.equals(s4f0Var.j()) && this.h == s4f0Var.h() && this.i == s4f0Var.e() && this.j == s4f0Var.b() && this.k == s4f0Var.m() && this.l.equals(s4f0Var.k())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.s4f0
    public final h8n.f f() {
        return this.d;
    }

    @Override // defpackage.s4f0
    public final h8n.g g() {
        return this.e;
    }

    @Override // defpackage.s4f0
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() ^ 1000003) * (-721379959);
        utp utpVar = this.d;
        int iHashCode2 = (iHashCode ^ (utpVar == null ? 0 : utpVar.hashCode())) * 1000003;
        h8n.g gVar = this.e;
        return this.l.hashCode() ^ ((((((((((((((iHashCode2 ^ (gVar != null ? gVar.hashCode() : 0)) * (-721379959)) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003);
    }

    @Override // defpackage.s4f0
    public final h8n.g i() {
        return null;
    }

    @Override // defpackage.s4f0
    public final Matrix j() {
        return this.g;
    }

    @Override // defpackage.s4f0
    public final List<tz5> k() {
        return this.l;
    }

    @Override // defpackage.s4f0
    public final boolean m() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.c);
        sb.append(", inMemoryCallback=null, onDiskCallback=");
        sb.append(this.d);
        sb.append(", outputFileOptions=");
        sb.append(this.e);
        sb.append(", secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.f);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.g);
        sb.append(", rotationDegrees=");
        sb.append(this.h);
        sb.append(", jpegQuality=");
        sb.append(this.i);
        sb.append(", captureMode=");
        sb.append(this.j);
        sb.append(", simultaneousCapture=");
        sb.append(this.k);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return ng1.a(sb, this.l, "}");
    }
}
