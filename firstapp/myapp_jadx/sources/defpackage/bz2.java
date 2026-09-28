package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface bz2 {

    public static final class b implements bz2 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtraBallQuestion(currency=");
            sb.append(this.a);
            sb.append(", price=");
            return j26.a(sb, this.b, ')');
        }
    }

    public static final class a implements bz2 {
        public final pj2 a;
        public final boolean b;
        public final s760 c;
        public final gg60 d;
        public final boolean e;

        public /* synthetic */ a(int i) {
            this(pj2.b.a, true, new s760.a(true), new gg60(false), true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetRow(betButtonState=");
            sb.append(this.a);
            sb.append(", betSettingEnable=");
            sb.append(this.b);
            sb.append(", autoBetButtonState=");
            sb.append(this.c);
            sb.append(", turboState=");
            sb.append(this.d);
            sb.append(", modifyCardEnable=");
            return ruw.a(sb, this.e, ')');
        }

        public a(pj2 pj2Var, boolean z, s760 s760Var, gg60 gg60Var, boolean z2) {
            pj2Var.getClass();
            this.a = pj2Var;
            this.b = z;
            this.c = s760Var;
            this.d = gg60Var;
            this.e = z2;
        }
    }
}
