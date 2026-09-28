package defpackage;

import androidx.camera.core.c;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends ry20.b {
    public final sy20 a;
    public final c b;

    public bk1(sy20 sy20Var, c cVar) {
        if (sy20Var == null) {
            bmy.a("Null processingRequest");
            throw null;
        }
        this.a = sy20Var;
        this.b = cVar;
    }

    @Override // ry20.b
    public final c a() {
        return this.b;
    }

    @Override // ry20.b
    public final sy20 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ry20.b)) {
            return false;
        }
        ry20.b bVar = (ry20.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
