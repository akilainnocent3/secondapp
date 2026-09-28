package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dfe0 implements dbn {
    public final u7n a;
    public final nan b;
    public final bqc c;
    public final vlv.b d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public dfe0(u7n u7nVar, nan nanVar, bqc bqcVar, vlv.b bVar, String str, boolean z, boolean z2) {
        this.a = u7nVar;
        this.b = nanVar;
        this.c = bqcVar;
        this.d = bVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.dbn
    public final nan a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfe0)) {
            return false;
        }
        dfe0 dfe0Var = (dfe0) obj;
        return Intrinsics.g(this.a, dfe0Var.a) && this.b.equals(dfe0Var.b) && this.c == dfe0Var.c && Intrinsics.g(this.d, dfe0Var.d) && Intrinsics.g(this.e, dfe0Var.e) && this.f == dfe0Var.f && this.g == dfe0Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        vlv.b bVar = this.d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + mtg0.a((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // defpackage.dbn
    public final u7n t() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return ruw.a(sb, this.g, ')');
    }
}
