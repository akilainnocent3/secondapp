package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kjy extends rgy {
    public final Float d;
    public final Float e;
    public final boolean f;
    public final int g;

    public kjy(Float f, Float f2, boolean z, int i) {
        super(f, f2, z);
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.rgy
    public final Float a() {
        return this.e;
    }

    @Override // defpackage.rgy
    public final Float b() {
        return this.d;
    }

    @Override // defpackage.rgy
    public final boolean c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjy)) {
            return false;
        }
        kjy kjyVar = (kjy) obj;
        return Intrinsics.g(this.d, kjyVar.d) && Intrinsics.g(this.e, kjyVar.e) && this.f == kjyVar.f && this.g == kjyVar.g;
    }

    public final int hashCode() {
        Float f = this.d;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.e;
        return Integer.hashCode(this.g) + mtg0.a((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "OddsFilterWithResults(min=" + this.d + ", max=" + this.e + ", isCustom=" + this.f + ", numResults=" + this.g + ")";
    }
}
