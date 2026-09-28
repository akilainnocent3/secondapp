package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class kyo<T> implements e21<T> {
    public final g21 a;
    public final String b;
    public final int c;
    public byte[] d;

    public kyo(g21 g21Var, String str) {
        this.a = g21Var;
        this.b = str;
        this.c = ((g21Var.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static kyo a(g21 g21Var, String str) {
        if (str == null) {
            str = "";
        }
        return new kyo(g21Var, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kyo)) {
            return false;
        }
        kyo kyoVar = (kyo) obj;
        return this.a.equals(kyoVar.a) && this.b.equals(kyoVar.b);
    }

    @Override // defpackage.e21
    public final String getKey() {
        return this.b;
    }

    @Override // defpackage.e21
    public final g21 getType() {
        return this.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.b;
    }
}
