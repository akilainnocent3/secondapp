package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tsa0 {
    public final String a;
    public final String b;
    public final boolean c;

    public tsa0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsa0)) {
            return false;
        }
        tsa0 tsa0Var = (tsa0) obj;
        return Intrinsics.g(this.a, tsa0Var.a) && Intrinsics.g(this.b, tsa0Var.b) && this.c == tsa0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(ux5.a("SpecifierButtonState(specifierType=", this.a, ", specifierText=", this.b, ", activate="), this.c, ")");
    }
}
