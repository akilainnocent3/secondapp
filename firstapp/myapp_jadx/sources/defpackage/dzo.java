package defpackage;

import com.appsflyer.internal.h;

/* JADX INFO: loaded from: classes5.dex */
public final class dzo {
    public final int a;
    public final String b;

    public dzo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzo)) {
            return false;
        }
        dzo dzoVar = (dzo) obj;
        return this.a == dzoVar.a && this.b.equals(dzoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h.a(this.a, "InternalRedBlack(number=", ", color=", this.b, ")");
    }
}
