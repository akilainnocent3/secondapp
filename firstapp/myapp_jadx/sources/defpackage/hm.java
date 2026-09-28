package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hm {
    public final im a;
    public final op8 b;

    public hm(im imVar, op8 op8Var) {
        imVar.getClass();
        this.a = imVar;
        this.b = op8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        return Intrinsics.g(this.a, hmVar.a) && Intrinsics.g(this.b, hmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdvancedSequentialBottomSheetItem(transition=" + this.a + ", content=" + this.b + ")";
    }

    public /* synthetic */ hm(op8 op8Var) {
        this(im.b.a, op8Var);
    }
}
