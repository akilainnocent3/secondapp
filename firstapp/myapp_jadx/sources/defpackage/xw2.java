package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface xw2 {

    public static final class a implements xw2 {
        public final qcn<GiftItem> a;
        public final double b;
        public final double c;
        public final double d;

        public a(qcn<GiftItem> qcnVar, double d, double d2, double d3) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = d;
            this.c = d2;
            this.d = d3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Double.compare(this.b, aVar.b) == 0 && Double.compare(this.c, aVar.c) == 0 && Double.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + nrg0.a(nrg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftDialog(giftList=");
            sb.append(this.a);
            sb.append(", maxAmount=");
            sb.append(this.b);
            sb.append(", minAmount=");
            sb.append(this.c);
            sb.append(", betAmount=");
            return org0.a(sb, this.d, ')');
        }
    }

    public static final class b implements xw2 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1010615974;
        }

        public final String toString() {
            return "GiftInfo";
        }
    }

    public static final class c implements xw2 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1648627259;
        }

        public final String toString() {
            return "NoDialog";
        }
    }
}
