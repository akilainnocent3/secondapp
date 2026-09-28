package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface zoi0 {

    public static final class a implements zoi0 {
        public final ijf0 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a(ijf0 ijf0Var, boolean z, boolean z2, boolean z3, boolean z4) {
            ijf0Var.getClass();
            this.a = ijf0Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetAmount(amount=");
            sb.append(this.a);
            sb.append(", minEnable=");
            sb.append(this.b);
            sb.append(", minusEnable=");
            sb.append(this.c);
            sb.append(", addEnable=");
            sb.append(this.d);
            sb.append(", maxEnable=");
            return ruw.a(sb, this.e, ')');
        }
    }

    public static final class b implements zoi0 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j26.a(new StringBuilder("Gift(amount="), this.a, ')');
        }
    }
}
