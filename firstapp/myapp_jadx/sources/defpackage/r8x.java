package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface r8x {

    public interface a extends r8x {

        /* JADX INFO: renamed from: r8x$a$a, reason: collision with other inner class name */
        public static final class C1043a implements a {
            public final CMSRes a;

            public C1043a(CMSRes cMSRes) {
                cMSRes.getClass();
                this.a = cMSRes;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1043a) && Intrinsics.g(this.a, ((C1043a) obj).a);
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
            public final yax b;

            public b(String str, yax yaxVar) {
                yaxVar.getClass();
                this.a = str;
                this.b = yaxVar;
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

    public static final class b implements r8x {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1897902644;
        }

        public final String toString() {
            return "None";
        }
    }
}
