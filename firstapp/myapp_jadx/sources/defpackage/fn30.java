package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface fn30 {

    public interface a extends fn30 {

        /* JADX INFO: renamed from: fn30$a$a, reason: collision with other inner class name */
        public static final class C0575a implements a {
            public final CMSRes a;

            public C0575a(CMSRes cMSRes) {
                cMSRes.getClass();
                this.a = cMSRes;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0575a) && Intrinsics.g(this.a, ((C0575a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Lose(loseText=" + this.a + ')';
            }
        }

        public static final class b implements a {
            public final String a;
            public final fq30 b;

            public b(String str, fq30 fq30Var) {
                fq30Var.getClass();
                this.a = str;
                this.b = fq30Var;
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
                return "Win(actualCreditedAmt=" + this.a + ", gift=" + this.b + ')';
            }
        }
    }

    public static final class b implements fn30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1926279375;
        }

        public final String toString() {
            return "None";
        }
    }
}
