package defpackage;

import android.os.Bundle;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface f7q {

    public static final class a implements f7q {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -538422271;
        }

        public final String toString() {
            return "CancelSnackBar";
        }
    }

    public static final class b implements f7q {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 250940228;
        }

        public final String toString() {
            return "FinishActivity";
        }
    }

    public static final class c implements f7q {
        public final Object a;

        public c(Object obj) {
            obj.getClass();
            this.a = obj;
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
            return aya.b(this.a, "NavigateToScreen(screen=", ")");
        }
    }

    public static final class d implements f7q {
        public final wae a;
        public final qcn<Pair<String, String>> b;

        public d(wae waeVar, qcn<Pair<String, String>> qcnVar) {
            waeVar.getClass();
            this.a = waeVar;
            this.b = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            qcn<Pair<String, String>> qcnVar = this.b;
            return iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode());
        }

        public final String toString() {
            return "OpenDeepLink(destination=" + this.a + ", uriQueryParameters=" + this.b + ")";
        }
    }

    public static final class e implements f7q {
        public final String a;
        public final Bundle b;

        public e(String str, Bundle bundle) {
            str.getClass();
            this.a = str;
            this.b = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Bundle bundle = this.b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            return "OpenUrl(url=" + this.a + ", extras=" + this.b + ")";
        }
    }

    public static final class f implements f7q {
        public final qcn<Pair<String, Object>> a;

        public f(qcn qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() * 31;
        }

        public final String toString() {
            return vf5.a(this.a, "PopBackStack(returnData=", ", route=null)");
        }
    }

    public static final class g<T> implements f7q {
        public final ygp<T> a;

        public g(ygp ygpVar) {
            ygpVar.getClass();
            this.a = ygpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + mtg0.a(this.a.hashCode() * 31, 31, false);
        }

        public final String toString() {
            return "PopBackStackTo(route=" + this.a + ", inclusive=false, saveState=false)";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class h implements f7q {
        public final qcn<String> a;

        public h(qcn<String> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vf5.a(this.a, dqvOSm.voD, ")");
        }
    }

    public static final class i implements f7q {
        public final ResourceUiText a;
        public final boolean b;

        public i(ResourceUiText resourceUiText, boolean z) {
            this.a = resourceUiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.g(this.a, iVar.a) && this.b == iVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowSnackBar(message=" + this.a + ", hasCancelButton=" + this.b + ")";
        }
    }
}
