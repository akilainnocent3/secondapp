package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gwe {
    public final String a;
    public final boolean b;
    public final eye c;
    public final boolean d;

    public gwe(String str, boolean z, eye eyeVar, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = eyeVar;
        this.d = z2;
    }

    public static gwe a(gwe gweVar, String str, boolean z, eye eyeVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = gweVar.a;
        }
        if ((i & 2) != 0) {
            z = gweVar.b;
        }
        if ((i & 4) != 0) {
            eyeVar = gweVar.c;
        }
        if ((i & 8) != 0) {
            z2 = gweVar.d;
        }
        gweVar.getClass();
        str.getClass();
        eyeVar.getClass();
        return new gwe(str, z, eyeVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwe)) {
            return false;
        }
        gwe gweVar = (gwe) obj;
        return Intrinsics.g(this.a, gweVar.a) && this.b == gweVar.b && this.c == gweVar.c && this.d == gweVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("DobSectionUiState(birthday=", this.a, ", shouldShowDatePicker=", ", verificationStatus=", this.b);
        sbA.append(this.c);
        sbA.append(", isDobEditable=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
