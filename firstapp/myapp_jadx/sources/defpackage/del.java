package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class del implements y5i {
    public final q65 a;
    public final a b;
    public final y5i.b c;

    public static final class a {
        public static final a b = new a("FOLD");
        public static final a c = new a("HINGE");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public del(q65 q65Var, a aVar, y5i.b bVar) {
        int i = q65Var.b;
        this.a = q65Var;
        this.b = aVar;
        this.c = bVar;
        int i2 = q65Var.c;
        int i3 = q65Var.a;
        if (i2 - i3 == 0 && q65Var.d - i == 0) {
            hb5.a("Bounds must be non zero");
            throw null;
        }
        if (i3 == 0 || i == 0) {
            return;
        }
        hb5.a("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    @Override // defpackage.y5i
    public final y5i.a a() {
        q65 q65Var = this.a;
        return q65Var.c - q65Var.a > q65Var.d - q65Var.b ? y5i.a.c : y5i.a.b;
    }

    @Override // defpackage.y5i
    public final boolean b() {
        a aVar = a.c;
        a aVar2 = this.b;
        return aVar2 == aVar || (aVar2 == a.b && this.c == y5i.b.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (del.class.equals(obj == null ? null : obj.getClass())) {
            if (obj != null) {
                del delVar = (del) obj;
                return this.a.equals(delVar.a) && this.b == delVar.b && this.c == delVar.c;
            }
            bmy.a("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
            return false;
        }
        return false;
    }

    @Override // defpackage.kse
    public final Rect getBounds() {
        q65 q65Var = this.a;
        return new Rect(q65Var.a, q65Var.b, q65Var.c, q65Var.d);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return ((Object) del.class.getSimpleName()) + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
