package defpackage;

import android.os.Bundle;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface nvp {

    public static final class a implements nvp {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2081271177;
        }

        public final String toString() {
            return "CancelSnackBar";
        }
    }

    public static final class b implements nvp {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1424333620;
        }

        public final String toString() {
            return "FinishActivity";
        }
    }

    public static final class c implements nvp {
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

    public static final class e implements nvp {
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

    /* JADX INFO: loaded from: classes2.dex */
    public static final class g<T> implements nvp {
        public final dq7 a;

        public g(dq7 dq7Var) {
            this.a = dq7Var;
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
            return LGxrN.iup + this.a + ", inclusive=false, saveState=false)";
        }
    }

    public static final class h implements nvp {
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
            return vf5.a(this.a, "PreLoadImage(urls=", ")");
        }
    }

    public static final class i implements nvp {
        public final String a;

        public i(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SelectGift(giftId=", this.a, ")");
        }
    }

    public static final class j implements nvp {
        public final ResourceUiText a;
        public final boolean b;

        public j(ResourceUiText resourceUiText, boolean z) {
            this.a = resourceUiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && this.b == jVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowSnackBar(message=" + this.a + ", hasCancelButton=" + this.b + ")";
        }
    }

    public static final class k implements nvp {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -190473079;
        }

        public final String toString() {
            return "UpdateBalance";
        }
    }

    public static final class d implements nvp {
        public final wae a;
        public final qcn<Pair<String, String>> b;

        public d(wae waeVar) {
            this.a = waeVar;
            this.b = null;
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

        public d(wae waeVar, uf00 uf00Var) {
            this.a = waeVar;
            this.b = uf00Var;
        }
    }

    public static final class f implements nvp {
        public final qcn<Pair<String, Object>> a;
        public final ygp<? extends Object> b;

        public f(qcn qcnVar, dq7 dq7Var) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = dq7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            ygp<? extends Object> ygpVar = this.b;
            return iHashCode + (ygpVar == null ? 0 : ygpVar.hashCode());
        }

        public final String toString() {
            return "PopBackStack(returnData=" + this.a + ", route=" + this.b + ")";
        }

        public f(int i, uf00 uf00Var) {
            this((i & 1) != 0 ? n1a0.c : uf00Var, (dq7) null);
        }
    }
}
