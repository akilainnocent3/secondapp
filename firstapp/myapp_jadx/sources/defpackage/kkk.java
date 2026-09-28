package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kkk {
    public final String a;
    public final uf00<String> b;

    public kkk(String str, uf00<String> uf00Var) {
        str.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkk)) {
            return false;
        }
        kkk kkkVar = (kkk) obj;
        return Intrinsics.g(this.a, kkkVar.a) && Intrinsics.g(this.b, kkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GiftGrabInfoPage(imgUrl=" + this.a + ", htmlInfoList=" + this.b + ")";
    }
}
