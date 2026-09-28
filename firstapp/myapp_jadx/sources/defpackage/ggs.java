package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;

/* JADX INFO: loaded from: classes4.dex */
public final class ggs {
    public final String a;
    public final imf0 b;

    public ggs(String str, imf0 imf0Var) {
        this.a = str;
        this.b = imf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggs)) {
            return false;
        }
        ggs ggsVar = (ggs) obj;
        return this.a.equals(ggsVar.a) && this.b.equals(ggsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkedText(url=, urlText=" + this.a + ", style=" + this.b + oAudzpbdOhCI.QCU;
    }
}
