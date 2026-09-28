package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class doi0 {
    public final boolean a;
    public final String b;
    public final dv5 c;
    public final h0y d;

    public doi0(boolean z, String str, dv5 dv5Var, h0y h0yVar) {
        this.a = z;
        this.b = str;
        this.c = dv5Var;
        this.d = h0yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doi0)) {
            return false;
        }
        doi0 doi0Var = (doi0) obj;
        return this.a == doi0Var.a && this.b.equals(doi0Var.b) && this.c.equals(doi0Var.c) && this.d.equals(doi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("VoicePayload(useTwilioVoice=", ", accessToken=", this.b, ", callParams=", this.a);
        sbA.append(this.c);
        sbA.append(", notification=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
