package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y78 {
    public final hxs a;
    public final hxs b;
    public final hxs c;
    public final jxs d;
    public final jxs e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public y78(hxs hxsVar, hxs hxsVar2, hxs hxsVar3, jxs jxsVar, jxs jxsVar2) {
        boolean z;
        boolean z2;
        hxsVar.getClass();
        hxsVar2.getClass();
        hxsVar3.getClass();
        jxsVar.getClass();
        this.a = hxsVar;
        this.b = hxsVar2;
        this.c = hxsVar3;
        this.d = jxsVar;
        this.e = jxsVar2;
        if (jxsVar.e) {
            if (jxsVar2 != null ? jxsVar2.e : true) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f = z;
        if (!jxsVar.d) {
            z2 = jxsVar2 != null ? jxsVar2.d : false;
        }
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y78.class != obj.getClass()) {
            return false;
        }
        y78 y78Var = (y78) obj;
        return Intrinsics.g(this.a, y78Var.a) && Intrinsics.g(this.b, y78Var.b) && Intrinsics.g(this.c, y78Var.c) && Intrinsics.g(this.d, y78Var.d) && Intrinsics.g(this.e, y78Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        jxs jxsVar = this.e;
        return iHashCode + (jxsVar != null ? jxsVar.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
