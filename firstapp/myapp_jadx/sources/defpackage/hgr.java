package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hgr {
    public final String a;
    public final qcn<ggr> b;
    public final igr c;

    public hgr(String str, qcn<ggr> qcnVar, igr igrVar) {
        str.getClass();
        qcnVar.getClass();
        igrVar.getClass();
        this.a = str;
        this.b = qcnVar;
        this.c = igrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgr)) {
            return false;
        }
        hgr hgrVar = (hgr) obj;
        return Intrinsics.g(this.a, hgrVar.a) && Intrinsics.g(this.b, hgrVar.b) && this.c == hgrVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + shu.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LNStreamTicketContentState(ticketId=" + this.a + ", balls=" + this.b + QWvyvNzGsBpRT.wgCxkNo + this.c + ")";
    }
}
