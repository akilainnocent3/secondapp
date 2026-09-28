package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i88 {
    public final String a;
    public final String b;
    public final JSONObject c;

    public i88(String str, String str2, JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i88)) {
            return false;
        }
        i88 i88Var = (i88) obj;
        return Intrinsics.g(this.a, i88Var.a) && Intrinsics.g(this.b, i88Var.b) && Intrinsics.g(this.c, i88Var.c);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        JSONObject jSONObject = this.c;
        return iA + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("Command(appName=", this.a, ", eventType=", this.b, ", data=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
