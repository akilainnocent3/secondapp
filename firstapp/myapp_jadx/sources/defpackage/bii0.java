package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bii0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final cii0 d;

    public bii0(String str, String str2, ArrayList arrayList, cii0 cii0Var) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = cii0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bii0)) {
            return false;
        }
        bii0 bii0Var = (bii0) obj;
        return Intrinsics.g(this.a, bii0Var.a) && this.b.equals(bii0Var.b) && this.c.equals(bii0Var.c) && Intrinsics.g(this.d, bii0Var.d);
    }

    public final int hashCode() {
        int iA = vt5.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        cii0 cii0Var = this.d;
        return iA + (cii0Var == null ? 0 : cii0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("VirtualLobbyGetStarted(sportName=", this.a, ", tabKey=", this.b, ", cmsContents=");
        sbA.append(this.c);
        sbA.append(", bottomCallToAction=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
