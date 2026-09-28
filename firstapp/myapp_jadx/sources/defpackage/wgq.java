package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wgq {
    public final qcn<lxq> a;
    public final vgq b;

    public wgq(uf00 uf00Var, vgq vgqVar) {
        uf00Var.getClass();
        vgqVar.getClass();
        this.a = uf00Var;
        this.b = vgqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgq)) {
            return false;
        }
        wgq wgqVar = (wgq) obj;
        return Intrinsics.g(this.a, wgqVar.a) && Intrinsics.g(this.b, wgqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNHistoryData(data=" + this.a + yFmFZvuWxAYfEj.RZZAnoc + this.b + ")";
    }
}
