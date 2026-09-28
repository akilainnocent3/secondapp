package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class arb {
    public final brb a;
    public final String b;
    public final boolean c;

    public arb(brb brbVar, String str, int i) {
        str = (i & 2) != 0 ? "" : str;
        boolean z = (i & 4) == 0;
        str.getClass();
        this.a = brbVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arb)) {
            return false;
        }
        arb arbVar = (arb) obj;
        return this.a == arbVar.a && this.b.equals(arbVar.b) && this.c == arbVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashTopicMessage(crashTopicType=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", errorOccurred=");
        return mq0.a(sb, this.c, ")");
    }
}
