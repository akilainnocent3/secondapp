package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface gsq extends hpq {

    public static final class a implements gsq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 386486245;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements gsq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -433234983;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements gsq, gpq {
        public final jxp a;
        public final qcn<jpq> b;
        public final UiText c;
        public final mmq d;

        public c(jxp jxpVar, qcn<jpq> qcnVar, UiText uiText, mmq mmqVar) {
            jxpVar.getClass();
            qcnVar.getClass();
            uiText.getClass();
            mmqVar.getClass();
            this.a = jxpVar;
            this.b = qcnVar;
            this.c = uiText;
            this.d = mmqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + yvf.a(shu.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            return "Success(bannerState=" + this.a + ", tag=" + this.b + ", listTitle=" + this.c + ", list=" + this.d + ")";
        }
    }

    @Override // defpackage.hpq
    default fpq a() {
        return fpq.b;
    }
}
