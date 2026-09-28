package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h8q {
    public final d8q a;
    public final e8q b;

    public h8q(d8q d8qVar, e8q e8qVar) {
        d8qVar.getClass();
        e8qVar.getClass();
        this.a = d8qVar;
        this.b = e8qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8q)) {
            return false;
        }
        h8q h8qVar = (h8q) obj;
        return Intrinsics.g(this.a, h8qVar.a) && Intrinsics.g(this.b, h8qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNFeatureMatchConfigVerification(request=" + this.a + ", result=" + this.b + ")";
    }
}
