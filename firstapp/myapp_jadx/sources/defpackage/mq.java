package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mq {
    public final String a;
    public final String b;

    public mq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq)) {
            return false;
        }
        mq mqVar = (mq) obj;
        return this.a.equals(mqVar.a) && this.b.equals(mqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("AfricanCupTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
