package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aqa0 implements sih {
    public final nbn a;
    public final String b;
    public final bqc c;

    public aqa0(nbn nbnVar, String str, bqc bqcVar) {
        this.a = nbnVar;
        this.b = str;
        this.c = bqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqa0)) {
            return false;
        }
        aqa0 aqa0Var = (aqa0) obj;
        return Intrinsics.g(this.a, aqa0Var.a) && Intrinsics.g(this.b, aqa0Var.b) && this.c == aqa0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ')';
    }
}
