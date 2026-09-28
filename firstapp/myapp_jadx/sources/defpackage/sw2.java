package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class sw2 {
    public final String a;
    public final String b;
    public final String c;
    public final a88 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final jrn h;

    public sw2(String str, String str2, String str3, a88 a88Var, boolean z, boolean z2, jrn jrnVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a88Var;
        this.e = z2;
        this.f = z;
        this.g = false;
        this.h = jrnVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetOddsItem{marketTitle='");
        sb.append(this.a);
        sb.append("', betOutcomeDesc='");
        sb.append(this.b);
        sb.append("', odd='");
        sb.append(this.c);
        sb.append("', combinedOutcomeTag=");
        sb.append(this.d);
        sb.append(", isHit=");
        return ruw.a(sb, this.e, '}');
    }

    public sw2(String str, String str2, String str3, a88 a88Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a88Var;
        this.e = z3;
        this.f = z;
        this.g = z2;
    }
}
