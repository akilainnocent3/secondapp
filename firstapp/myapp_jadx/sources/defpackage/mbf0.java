package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class mbf0 implements pdd0 {
    public final String a = "otp__send__view";
    public final ubf0 b;

    public mbf0(ubf0 ubf0Var) {
        this.b = ubf0Var;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("mark_str", this.b.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbf0)) {
            return false;
        }
        mbf0 mbf0Var = (mbf0) obj;
        return this.a.equals(mbf0Var.a) && this.b == mbf0Var.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OtpSendViewEvent(name=" + this.a + ", marker=" + this.b + ")";
    }
}
