package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uy80 {
    public final u4b a;
    public final u4b b;
    public final u4b c;
    public final u4b d;
    public final u4b e;
    public final u4b f;
    public final u4b g;
    public final u4b h;

    public uy80() {
        this(xx80.a, xx80.b, xx80.c, xx80.d, xx80.f, xx80.e, xx80.g, xx80.h);
    }

    public static uy80 a(uy80 uy80Var, i060 i060Var) {
        u4b u4bVar = uy80Var.b;
        u4b u4bVar2 = uy80Var.c;
        u4b u4bVar3 = uy80Var.d;
        u4b u4bVar4 = uy80Var.e;
        uy80Var.getClass();
        return new uy80(i060Var, u4bVar, u4bVar2, u4bVar3, u4bVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy80)) {
            return false;
        }
        uy80 uy80Var = (uy80) obj;
        return Intrinsics.g(this.a, uy80Var.a) && Intrinsics.g(this.b, uy80Var.b) && Intrinsics.g(this.c, uy80Var.c) && Intrinsics.g(this.d, uy80Var.d) && Intrinsics.g(this.e, uy80Var.e) && Intrinsics.g(this.f, uy80Var.f) && Intrinsics.g(this.g, uy80Var.g) && Intrinsics.g(this.h, uy80Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    public uy80(u4b u4bVar, u4b u4bVar2, u4b u4bVar3, u4b u4bVar4, u4b u4bVar5, u4b u4bVar6, u4b u4bVar7, u4b u4bVar8) {
        this.a = u4bVar;
        this.b = u4bVar2;
        this.c = u4bVar3;
        this.d = u4bVar4;
        this.e = u4bVar5;
        this.f = u4bVar6;
        this.g = u4bVar7;
        this.h = u4bVar8;
    }

    public uy80(u4b u4bVar, u4b u4bVar2, u4b u4bVar3, u4b u4bVar4, u4b u4bVar5) {
        this(u4bVar, u4bVar2, u4bVar3, u4bVar4, u4bVar5, xx80.e, xx80.g, xx80.h);
    }
}
