package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ygc0 {
    public final String a;

    public ygc0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygc0) && this.a.equals(((ygc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyLegendsRoundInfo(roundId=", this.a, ")");
    }
}
