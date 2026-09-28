package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tdc0 {
    public final String a;
    public final String b;
    public final List<String> c;

    public tdc0(String str, String str2, List<String> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdc0)) {
            return false;
        }
        tdc0 tdc0Var = (tdc0) obj;
        return this.a.equals(tdc0Var.a) && this.b.equals(tdc0Var.b) && Intrinsics.g(this.c, tdc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(ux5.a("SportyLegendsMarketCategory(id=", this.a, ", name=", this.b, ", marketTypes="), this.c, ")");
    }
}
