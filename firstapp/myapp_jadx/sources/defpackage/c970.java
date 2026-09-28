package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;

/* JADX INFO: loaded from: classes2.dex */
public final class c970 {
    public final String a;
    public final String b;

    public c970(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c970)) {
            return false;
        }
        c970 c970Var = (c970) obj;
        return this.a.equals(c970Var.a) && this.b.equals(c970Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a(YAzniTbXHYQ.JpQMEsDIJ, this.a, ", marketType=", this.b, ")");
    }
}
