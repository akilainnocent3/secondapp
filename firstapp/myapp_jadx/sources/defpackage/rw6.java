package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface rw6 {

    public static final class a implements rw6 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 839988795;
        }

        public final String toString() {
            return "CancelBottomSheet";
        }
    }

    public static final class b implements rw6 {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "ClickAcceptChallenge(id=", ")");
        }
    }

    public static final class c implements rw6 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2039930192;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    public static final class d implements rw6 {
        public final long a;

        public d(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "ClickCancel(id=", ")");
        }
    }

    public static final class e implements rw6 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1118965681;
        }

        public final String toString() {
            return "ClickTermsAndConditions";
        }
    }

    public static final class f implements rw6 {
        public final long a;

        public f(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "ClickViewLeaderboard(id=", ")");
        }
    }

    public static final class g implements rw6 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1692849133;
        }

        public final String toString() {
            return "ConfirmBottomSheet";
        }
    }

    public static final class h implements rw6 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1857557375;
        }

        public final String toString() {
            return "DismissPopup";
        }
    }

    public static final class i implements rw6 {
        public final String a;
        public final j b;

        public i(String str, j jVar) {
            this.a = str;
            this.b = jVar;
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
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "PlaceBet(url=" + this.a + ", source=" + this.b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        public static final j a;
        public static final j b;
        public static final j c;
        public static final /* synthetic */ j[] d;

        static {
            j jVar = new j("CardButton", 0);
            a = jVar;
            j jVar2 = new j("DetailLink", 1);
            b = jVar2;
            j jVar3 = new j("LockedLeaderboard", 2);
            c = jVar3;
            d = new j[]{jVar, jVar2, jVar3};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) d.clone();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class k implements rw6 {
        public final f07 a;

        public k(f07 f07Var) {
            this.a = f07Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return CaBJCMnsV.ShLWnGRpkBNgbD + this.a + ")";
        }
    }

    public static final class l implements rw6 {
        public final long a;

        public l(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "ToggleDetails(id=", ")");
        }
    }
}
