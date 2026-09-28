package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rry {
    public final String a;
    public final List<a> b;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("Step(title=", this.a, ", description=", this.b, ")");
        }
    }

    public rry(String str, List<a> list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rry)) {
            return false;
        }
        rry rryVar = (rry) obj;
        return this.a.equals(rryVar.a) && this.b.equals(rryVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("OneTimeBankHowToDeposit(header=", this.a, ", steps=", ")", this.b);
    }
}
