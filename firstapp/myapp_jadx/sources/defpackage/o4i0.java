package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o4i0 {
    public final boolean a;
    public final o3i0 b;
    public final alc c;
    public final boolean d;
    public final boolean e;
    public final uf00<o3i0> f;
    public final boolean g;

    public o4i0(boolean z, o3i0 o3i0Var, alc alcVar, boolean z2, boolean z3, uf00<o3i0> uf00Var, boolean z4) {
        uf00Var.getClass();
        this.a = z;
        this.b = o3i0Var;
        this.c = alcVar;
        this.d = z2;
        this.e = z3;
        this.f = uf00Var;
        this.g = z4;
    }

    public static o4i0 a(o4i0 o4i0Var, boolean z, o3i0 o3i0Var, alc alcVar, boolean z2, boolean z3, uf00 uf00Var, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = o4i0Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            o3i0Var = o4i0Var.b;
        }
        o3i0 o3i0Var2 = o3i0Var;
        if ((i & 4) != 0) {
            alcVar = o4i0Var.c;
        }
        alc alcVar2 = alcVar;
        if ((i & 8) != 0) {
            z2 = o4i0Var.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = o4i0Var.e;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            uf00Var = o4i0Var.f;
        }
        uf00 uf00Var2 = uf00Var;
        if ((i & 64) != 0) {
            z4 = o4i0Var.g;
        }
        o4i0Var.getClass();
        uf00Var2.getClass();
        return new o4i0(z5, o3i0Var2, alcVar2, z6, z7, uf00Var2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4i0)) {
            return false;
        }
        o4i0 o4i0Var = (o4i0) obj;
        return this.a == o4i0Var.a && Intrinsics.g(this.b, o4i0Var.b) && Intrinsics.g(this.c, o4i0Var.c) && this.d == o4i0Var.d && this.e == o4i0Var.e && Intrinsics.g(this.f, o4i0Var.f) && this.g == o4i0Var.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        o3i0 o3i0Var = this.b;
        int iHashCode2 = (iHashCode + (o3i0Var == null ? 0 : o3i0Var.hashCode())) * 31;
        alc alcVar = this.c;
        return Boolean.hashCode(this.g) + yvz.a(this.f, mtg0.a(mtg0.a((iHashCode2 + (alcVar != null ? alcVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDetailUiState(isVideoDetailLoading=");
        sb.append(this.a);
        sb.append(", videoDetail=");
        sb.append(this.b);
        sb.append(", videoPlayerState=");
        sb.append(this.c);
        sb.append(", videoDetailError=");
        sb.append(this.d);
        sb.append(", isRecommendedLoading=");
        sb.append(this.e);
        sb.append(", recommendedVideos=");
        sb.append(this.f);
        sb.append(", recommendedError=");
        return mq0.a(sb, this.g, ")");
    }

    public o4i0() {
        this(0);
    }

    public o4i0(int i) {
        this(true, null, null, false, true, n1a0.c, false);
    }
}
