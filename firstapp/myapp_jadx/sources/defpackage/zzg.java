package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zzg {
    public final String a;
    public final lxf0 b;

    public zzg(String str, lxf0 lxf0Var) {
        str.getClass();
        this.a = str;
        this.b = lxf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        return Intrinsics.g(this.a, zzgVar.a) && this.b == zzgVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpirationTime(time=" + this.a + ", unit=" + this.b + ")";
    }
}
