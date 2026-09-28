package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wmi {
    public final boolean a;
    public final py90 b;
    public final dbi c;
    public final smi d;

    public wmi(boolean z, py90 py90Var, dbi dbiVar, smi smiVar) {
        py90Var.getClass();
        dbiVar.getClass();
        smiVar.getClass();
        this.a = z;
        this.b = py90Var;
        this.c = dbiVar;
        this.d = smiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmi)) {
            return false;
        }
        wmi wmiVar = (wmi) obj;
        return this.a == wmiVar.a && this.b == wmiVar.b && Intrinsics.g(this.c, wmiVar.c) && Intrinsics.g(this.d, wmiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FootballState(isShowBack=" + this.a + ", isSkipProcessing=" + this.b + ", errorState=" + this.c + ", screenState=" + this.d + ")";
    }
}
