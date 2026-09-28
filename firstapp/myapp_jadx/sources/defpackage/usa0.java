package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class usa0 {
    public final String a;
    public final String b;
    public final qcn<ata0> c;

    public usa0(qcn qcnVar, String str, String str2) {
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usa0)) {
            return false;
        }
        usa0 usa0Var = (usa0) obj;
        return this.a.equals(usa0Var.a) && this.b.equals(usa0Var.b) && Intrinsics.g(this.c, usa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ts3.a(ux5.a("SpecifierDropdownMenuCellState(specifierType=", this.a, ", specifierText=", this.b, ", oddsButtonStates="), this.c, ")");
    }
}
