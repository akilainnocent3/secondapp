package defpackage;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d970 {
    public final String a;
    public final String b;

    public d970(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d970)) {
            return false;
        }
        d970 d970Var = (d970) obj;
        return Intrinsics.g(this.a, d970Var.a) && Intrinsics.g(this.b, d970Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a(tYcQsJyaojE.afTayhVEY, this.a, ", marketTitleText=", this.b, ")");
    }
}
