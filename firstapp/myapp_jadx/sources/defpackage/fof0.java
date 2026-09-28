package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fof0 {
    public final String a;
    public final List<mof0> b;

    public fof0(String str, List<mof0> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fof0)) {
            return false;
        }
        fof0 fof0Var = (fof0) obj;
        return Intrinsics.g(this.a, fof0Var.a) && Intrinsics.g(this.b, fof0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("ThemeCategoryUi(title=", this.a, ", themes=", ")", this.b);
    }
}
