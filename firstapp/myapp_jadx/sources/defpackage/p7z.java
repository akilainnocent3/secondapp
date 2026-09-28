package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class p7z implements pdd0 {
    public final String a = "otp__leave_btn__click";
    public final String b;

    public p7z(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7z)) {
            return false;
        }
        p7z p7zVar = (p7z) obj;
        return this.a.equals(p7zVar.a) && this.b.equals(p7zVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("OtpLeaveBtnClickEvent(name=", this.a, ", source=", this.b, ")");
    }
}
