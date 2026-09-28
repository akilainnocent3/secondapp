package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;

/* JADX INFO: loaded from: classes2.dex */
public final class qa1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public qa1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa1)) {
            return false;
        }
        qa1 qa1Var = (qa1) obj;
        return this.a.equals(qa1Var.a) && this.b == qa1Var.b && this.c == qa1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(z620.a("AutoBetUiChecklistRow(stateKey=", this.a, ", expectAutoBetSwitchEnabled=", OdQr.AOwrvCHa, this.b), this.c, ")");
    }
}
