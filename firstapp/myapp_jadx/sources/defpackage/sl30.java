package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface sl30 {

    public static final class a implements sl30 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -608345012;
        }

        public final String toString() {
            return "Closed";
        }
    }

    public static final class b implements sl30 {
        public final tq30 a;
        public final String b;
        public final CMSRes c;
        public final ul30 d;

        public b(tq30 tq30Var, String str, CMSRes cMSRes, ul30 ul30Var) {
            tq30Var.getClass();
            str.getClass();
            cMSRes.getClass();
            ul30Var.getClass();
            this.a = tq30Var;
            this.b = str;
            this.c = cMSRes;
            this.d = ul30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "Opened(userPick=" + this.a + ", ticketId=" + this.b + ", resultImg=" + this.c + ", giftState=" + this.d + ')';
        }

        public b() {
            this(0);
        }

        public b(int i) {
            this(tq30.d, "", jn30.c0.J, ul30.d.a);
        }
    }
}
