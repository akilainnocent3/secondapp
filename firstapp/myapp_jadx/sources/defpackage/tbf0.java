package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tbf0 implements pdd0 {
    public final String a;
    public final ubf0 b;
    public final j6c c;

    public tbf0(ubf0 ubf0Var, j6c j6cVar) {
        j6cVar.getClass();
        this.a = "otp__view";
        this.b = ubf0Var;
        this.c = j6cVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("mark_str", this.b.a), new Pair("source", StringsKt.a0(this.c.a, "android_")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbf0)) {
            return false;
        }
        tbf0 tbf0Var = (tbf0) obj;
        return this.a.equals(tbf0Var.a) && this.b == tbf0Var.b && this.c == tbf0Var.c;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OtpViewEvent(name=" + this.a + ", marker=" + this.b + ", source=" + this.c + ")";
    }
}
