package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class syn implements yyn {
    public final String a;
    public final String b;
    public final qcn<a> c;
    public final jzn d;

    public static final class a {
        public final String a;
        public final qgy b;

        public a(String str, qgy qgyVar) {
            this.a = str;
            this.b = qgyVar;
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
            return "OddsButton(outcomeId=" + this.a + ", oddsButtonState=" + this.b + ")";
        }
    }

    public syn(String str, String str2, qcn<a> qcnVar, jzn jznVar) {
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = qcnVar;
        this.d = jznVar;
    }

    @Override // defpackage.yyn
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syn)) {
            return false;
        }
        syn synVar = (syn) obj;
        return this.a.equals(synVar.a) && this.b.equals(synVar.b) && Intrinsics.g(this.c, synVar.c) && this.d == synVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + shu.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingMarketLayoutNoneState(marketCategoryId=", this.a, ", guide=", this.b, ", oddsButtons=");
        sbA.append(this.c);
        sbA.append(", marketType=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
