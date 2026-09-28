package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yty {
    public final Selection a;
    public final boolean b;
    public final gty c;
    public final boolean d;
    public final nty e;
    public final psy f;

    public yty(Selection selection, boolean z, gty gtyVar, boolean z2, nty ntyVar, psy psyVar) {
        selection.getClass();
        gtyVar.getClass();
        ntyVar.getClass();
        this.a = selection;
        this.b = z;
        this.c = gtyVar;
        this.d = z2;
        this.e = ntyVar;
        this.f = psyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yty)) {
            return false;
        }
        yty ytyVar = (yty) obj;
        return Intrinsics.g(this.a, ytyVar.a) && this.b == ytyVar.b && this.c == ytyVar.c && this.d == ytyVar.d && Intrinsics.g(this.e, ytyVar.e) && Intrinsics.g(this.f, ytyVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + mtg0.a((this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31;
        psy psyVar = this.f;
        return iHashCode + (psyVar == null ? 0 : psyVar.hashCode());
    }

    public final String toString() {
        return "OneUpSelectionContext(selection=" + this.a + ", selected=" + this.b + ", surface=" + this.c + ", pageOneUpEnabled=" + this.d + ", tagStateAtSelection=" + this.e + ", experimentSession=" + this.f + ")";
    }
}
