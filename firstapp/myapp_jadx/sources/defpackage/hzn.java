package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hzn implements yyn {
    public final String a;
    public final String b;
    public final qcn<String> c;
    public final qcn<b> d;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public final jzn a;
        public final String b;
        public final qgy c;

        public a(jzn jznVar, String str, qgy qgyVar) {
            this.a = jznVar;
            this.b = str;
            this.c = qgyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "OddsButton(marketType=" + this.a + ", outcomeId=" + this.b + ", oddsButtonState=" + this.c + ")";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b {
        public final wyn a;
        public final qcn<a> b;

        public b(wyn wynVar, qcn<a> qcnVar) {
            qcnVar.getClass();
            this.a = wynVar;
            this.b = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Row(racerState=" + this.a + ", oddsButtons=" + this.b + ")";
        }
    }

    public hzn(String str, String str2, qcn<String> qcnVar, qcn<b> qcnVar2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = qcnVar;
        this.d = qcnVar2;
    }

    @Override // defpackage.yyn
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzn)) {
            return false;
        }
        hzn hznVar = (hzn) obj;
        return this.a.equals(hznVar.a) && this.b.equals(hznVar.b) && Intrinsics.g(this.c, hznVar.c) && Intrinsics.g(this.d, hznVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shu.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingMarketLayoutVerticalState(marketCategoryId=", this.a, ", guide=", this.b, ", marketBannerTitles=");
        sbA.append(this.c);
        sbA.append(OdQr.wVO);
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
