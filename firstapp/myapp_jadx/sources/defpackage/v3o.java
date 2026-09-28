package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class v3o implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public v3o(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3o)) {
            return false;
        }
        v3o v3oVar = (v3o) obj;
        return this.a.equals(v3oVar.a) && this.b.equals(v3oVar.b) && this.c.equals(v3oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantRacingSettleRoundLeague(id=", this.a, ", name=", this.b, ", sportId="), this.c, ")");
    }
}
