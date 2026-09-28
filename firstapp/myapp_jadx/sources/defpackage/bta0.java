package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bta0 {
    public final boolean a;
    public final String b;
    public final qcn<usa0> c;

    public bta0(qcn qcnVar, String str, boolean z) {
        qcnVar.getClass();
        this.a = z;
        this.b = str;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bta0)) {
            return false;
        }
        bta0 bta0Var = (bta0) obj;
        return this.a == bta0Var.a && this.b.equals(bta0Var.b) && Intrinsics.g(this.c, bta0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ts3.a(t160.a("SpecifierDropdownMenuState(expanded=", ACKxwYRsuWyGz.pDYodZteqE, this.b, ", cellStates=", this.a), this.c, ")");
    }
}
