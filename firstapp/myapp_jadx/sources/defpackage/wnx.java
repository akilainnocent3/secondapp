package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wnx {
    public final String a;
    public final String b;
    public final anx c;
    public final xnx d;
    public final p4h e;

    public wnx(String str, String str2, anx anxVar, xnx xnxVar, p4h p4hVar) {
        this.a = str;
        this.b = str2;
        this.c = anxVar;
        this.d = xnxVar;
        this.e = p4hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnx)) {
            return false;
        }
        wnx wnxVar = (wnx) obj;
        return this.a.equals(wnxVar.a) && Intrinsics.g(this.b, wnxVar.b) && this.c.equals(wnxVar.c) && Intrinsics.g(this.d, wnxVar.d) && Intrinsics.g(this.e, wnxVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.a.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        xnx xnxVar = this.d;
        return this.e.a.hashCode() + ((iHashCode + (xnxVar == null ? 0 : xnxVar.hashCode())) * 31);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.a + ", method=" + this.b + ", headers=" + this.c + ", body=" + this.d + ", extras=" + this.e + ')';
    }
}
