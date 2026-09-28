package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fro implements Serializable {
    public final String a;
    public final BigDecimal b;
    public final boolean c;

    public fro(String str, BigDecimal bigDecimal, boolean z) {
        str.getClass();
        bigDecimal.getClass();
        this.a = str;
        this.b = bigDecimal;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fro)) {
            return false;
        }
        fro froVar = (fro) obj;
        return Intrinsics.g(this.a, froVar.a) && Intrinsics.g(this.b, froVar.b) && this.c == froVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return mq0.a(yz80.a(this.b, "InstantWinWinningDialogInput(sportId=", this.a, ", totalReturn=", ", isShowOffAvailable="), this.c, ")");
    }
}
