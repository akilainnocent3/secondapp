package defpackage;

import com.appsflyer.internal.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b4r {
    public final int a;
    public final String b;

    public b4r(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4r)) {
            return false;
        }
        b4r b4rVar = (b4r) obj;
        return this.a == b4rVar.a && this.b.equals(b4rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h.a(this.a, "LNQuickPickItemState(balls=", ", multiplier=", this.b, ")");
    }
}
