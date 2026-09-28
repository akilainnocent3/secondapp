package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface fdj {

    public static final class a implements fdj {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 898441196;
        }

        public final String toString() {
            return "ChangeCountry";
        }
    }

    public static final class b implements fdj {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1335766558;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements fdj {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LaunchLink(link=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements fdj {
        public final String a;
        public final boolean b;

        public d(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("LaunchLogin(phone=", this.a, dqvOSm.dNOkkPchabMNlQ, ")", this.b);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class e implements fdj {
        public final String a;

        public e(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LaunchPasswordPage(phone=", this.a, LxHElgWAiSeM.zrPRy);
        }
    }
}
