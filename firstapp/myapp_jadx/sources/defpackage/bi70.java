package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bi70 {
    public final String a;
    public final l770 b;
    public final e970 c;
    public final z370 d;
    public final g870 e;
    public final ad70 f;

    public bi70(String str, l770 l770Var, e970 e970Var, z370 z370Var, g870 g870Var, ad70 ad70Var) {
        g870Var.getClass();
        ad70Var.getClass();
        this.a = str;
        this.b = l770Var;
        this.c = e970Var;
        this.d = z370Var;
        this.e = g870Var;
        this.f = ad70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi70)) {
            return false;
        }
        bi70 bi70Var = (bi70) obj;
        return this.a.equals(bi70Var.a) && this.b.equals(bi70Var.b) && this.c.equals(bi70Var.c) && this.d.equals(bi70Var.d) && Intrinsics.g(this.e, bi70Var.e) && Intrinsics.g(this.f, bi70Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ScheduledFootballSelection(matchdayId=" + this.a + ", league=" + this.b + LhMGMAwwhzjwfz.xuwdUBMBMAHmLq + this.c + ", event=" + this.d + ", market=" + this.e + ", outcome=" + this.f + ")";
    }
}
