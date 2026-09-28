package defpackage;

import androidx.camera.core.c;

/* JADX INFO: loaded from: classes.dex */
public final class ai1 extends yte.a {
    public final c a;
    public final int b;
    public final h8n.g c;

    public ai1(c cVar, int i, h8n.g gVar) {
        if (cVar == null) {
            bmy.a("Null imageProxy");
            throw null;
        }
        this.a = cVar;
        this.b = i;
        this.c = gVar;
    }

    @Override // yte.a
    public final c a() {
        return this.a;
    }

    @Override // yte.a
    public final h8n.g b() {
        return this.c;
    }

    @Override // yte.a
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yte.a)) {
            return false;
        }
        yte.a aVar = (yte.a) obj;
        return this.a.equals(aVar.a()) && this.b == aVar.c() && this.c.equals(aVar.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "In{imageProxy=" + this.a + ", rotationDegrees=" + this.b + ", outputFileOptions=" + this.c + "}";
    }
}
