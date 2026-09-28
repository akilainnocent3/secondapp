package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qbf0 implements pdd0 {
    public final String a;
    public final j6c b;

    public qbf0(j6c j6cVar) {
        j6cVar.getClass();
        this.a = "otp__tg_user__view";
        this.b = j6cVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", StringsKt.a0(this.b.a, "android_")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbf0)) {
            return false;
        }
        qbf0 qbf0Var = (qbf0) obj;
        return this.a.equals(qbf0Var.a) && this.b == qbf0Var.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OtpTgUserViewEvent(name=" + this.a + ", source=" + this.b + ")";
    }
}
