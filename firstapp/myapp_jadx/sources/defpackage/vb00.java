package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vb00 {
    public final nnt a;
    public final nnt b;
    public final nnt c;
    public final nnt d;
    public final nnt e;

    public vb00(ont ontVar, ont ontVar2, ont ontVar3, ont ontVar4, ont ontVar5) {
        ontVar.getClass();
        ontVar2.getClass();
        ontVar3.getClass();
        ontVar4.getClass();
        ontVar5.getClass();
        this.a = ontVar;
        this.b = ontVar2;
        this.c = ontVar3;
        this.d = ontVar4;
        this.e = ontVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb00)) {
            return false;
        }
        vb00 vb00Var = (vb00) obj;
        return Intrinsics.g(this.a, vb00Var.a) && Intrinsics.g(this.b, vb00Var.b) && Intrinsics.g(this.c, vb00Var.c) && Intrinsics.g(this.d, vb00Var.d) && Intrinsics.g(this.e, vb00Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PendingKickCompositions(goalkeeperIdleComposition=" + this.a + ", goalkeeperGuardComposition=" + this.b + ", playerIdleComposition=" + this.c + ", playerKickComposition=" + this.d + ", ballComposition=" + this.e + ")";
    }
}
