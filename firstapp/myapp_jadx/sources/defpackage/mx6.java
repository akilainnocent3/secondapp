package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface mx6 {

    public static final class a implements mx6 {
        public final long a;
        public final dua b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final UiText f;
        public final uxs g;

        public a(long j, dua duaVar, UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, uxs uxsVar) {
            this.a = j;
            this.b = duaVar;
            this.c = uiText;
            this.d = uiText2;
            this.e = uiText3;
            this.f = uiText4;
            this.g = uxsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            return this.g.hashCode() + yvf.a(yvf.a(yvf.a(yvf.a((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            return "ConfirmationBottomSheet(challengeId=" + this.a + ", scenario=" + this.b + ", title=" + this.c + ", description=" + this.d + ", confirmText=" + this.e + ", cancelText=" + this.f + ", confirmButtonStatus=" + this.g + ")";
        }
    }

    public static final class c implements mx6 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -507913637;
        }

        public final String toString() {
            return "NoBottomSheet";
        }
    }

    public static final class d implements mx6 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 315368453;
        }

        public final String toString() {
            return "TermsBottomSheet";
        }
    }

    public static final class b implements mx6 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("LeaderboardLockedBottomSheet(betUrl=", this.a, ")");
        }

        public b() {
            this(null);
        }
    }
}
