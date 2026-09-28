package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class dv5 {
    public final String a;
    public final String b;

    public dv5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv5)) {
            return false;
        }
        dv5 dv5Var = (dv5) obj;
        return this.a.equals(dv5Var.a) && this.b.equals(dv5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("CallParams(voiceChatId=", this.a, ", requesterId=", this.b, ")");
    }
}
