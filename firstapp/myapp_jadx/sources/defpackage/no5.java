package defpackage;

import com.appsflyer.internal.x;

/* JADX INFO: loaded from: classes5.dex */
public final class no5 {
    public final String a;
    public final long b;

    public no5(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no5)) {
            return false;
        }
        no5 no5Var = (no5) obj;
        return this.a.equals(no5Var.a) && this.b == no5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "CMSPage(pageName=", this.a, ", version=");
        sbA.append(")");
        return sbA.toString();
    }
}
