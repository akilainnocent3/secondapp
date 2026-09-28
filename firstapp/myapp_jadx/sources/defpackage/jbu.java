package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jbu {
    public final boolean a;
    public final boolean b;
    public final t8u c;
    public final ccb0 d;
    public final p9u e;
    public final boolean f;
    public final k9u g;
    public final boolean h;
    public final ibu i;
    public final u8u j;

    public jbu(boolean z, boolean z2, t8u t8uVar, ccb0 ccb0Var, p9u p9uVar, boolean z3, k9u k9uVar, boolean z4, ibu ibuVar, u8u u8uVar) {
        this.a = z;
        this.b = z2;
        this.c = t8uVar;
        this.d = ccb0Var;
        this.e = p9uVar;
        this.f = z3;
        this.g = k9uVar;
        this.h = z4;
        this.i = ibuVar;
        this.j = u8uVar;
    }

    public static jbu a(jbu jbuVar, boolean z, boolean z2, t8u t8uVar, ccb0 ccb0Var, p9u p9uVar, boolean z3, k9u k9uVar, boolean z4, ibu ibuVar, u8u.a aVar, int i) {
        if ((i & 1) != 0) {
            z = jbuVar.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = jbuVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            t8uVar = jbuVar.c;
        }
        t8u t8uVar2 = t8uVar;
        if ((i & 8) != 0) {
            ccb0Var = jbuVar.d;
        }
        ccb0 ccb0Var2 = ccb0Var;
        p9u p9uVar2 = (i & 16) != 0 ? jbuVar.e : p9uVar;
        boolean z7 = (i & 32) != 0 ? jbuVar.f : z3;
        k9u k9uVar2 = (i & 64) != 0 ? jbuVar.g : k9uVar;
        boolean z8 = (i & 128) != 0 ? jbuVar.h : z4;
        ibu ibuVar2 = (i & 256) != 0 ? jbuVar.i : ibuVar;
        u8u u8uVar = (i & 512) != 0 ? jbuVar.j : aVar;
        jbuVar.getClass();
        t8uVar2.getClass();
        ccb0Var2.getClass();
        k9uVar2.getClass();
        return new jbu(z5, z6, t8uVar2, ccb0Var2, p9uVar2, z7, k9uVar2, z8, ibuVar2, u8uVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbu)) {
            return false;
        }
        jbu jbuVar = (jbu) obj;
        return this.a == jbuVar.a && this.b == jbuVar.b && Intrinsics.g(this.c, jbuVar.c) && this.d == jbuVar.d && Intrinsics.g(this.e, jbuVar.e) && this.f == jbuVar.f && this.g == jbuVar.g && this.h == jbuVar.h && Intrinsics.g(this.i, jbuVar.i) && Intrinsics.g(this.j, jbuVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        p9u p9uVar = this.e;
        int iA = mtg0.a((this.g.hashCode() + mtg0.a((iHashCode + (p9uVar == null ? 0 : p9uVar.hashCode())) * 31, 31, this.f)) * 31, 31, this.h);
        ibu ibuVar = this.i;
        int iHashCode2 = (iA + (ibuVar == null ? 0 : ibuVar.hashCode())) * 31;
        u8u u8uVar = this.j;
        return iHashCode2 + (u8uVar != null ? u8uVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("LuckyWheelState(isLoading=", ", isError=", ", dataState=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", spinState=");
        sbA.append(this.d);
        sbA.append(", winningPrize=");
        sbA.append(this.e);
        sbA.append(", isSoundEnabled=");
        sbA.append(this.f);
        sbA.append(", lightsState=");
        sbA.append(this.g);
        sbA.append(", isCoinRainPaused=");
        sbA.append(this.h);
        sbA.append(", result=");
        sbA.append(this.i);
        sbA.append(", dialog=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }

    public jbu() {
        this(0);
    }

    public /* synthetic */ jbu(int i) {
        this(true, false, new t8u(0), ccb0.a, null, true, k9u.a, false, null, null);
    }
}
