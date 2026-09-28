package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wr90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<xr90> f;

    public wr90(String str, String str2, String str3, String str4, String str5, List<xr90> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr90)) {
            return false;
        }
        wr90 wr90Var = (wr90) obj;
        return this.a.equals(wr90Var.a) && this.b.equals(wr90Var.b) && this.c.equals(wr90Var.c) && this.d.equals(wr90Var.d) && this.e.equals(wr90Var.e) && Intrinsics.g(this.f, wr90Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketDetailMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddTitles=");
        return nve.a(this.e, TEFcJcMqR.JtGyePd, ")", sbA, this.f);
    }
}
