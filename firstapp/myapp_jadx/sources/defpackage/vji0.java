package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface vji0 {

    public static final class a implements vji0 {
        public final UiText a;

        public a(int i, UiText uiText) {
            this.a = (i & 2) != 0 ? null : uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            if (uiText == null) {
                return 0;
            }
            return uiText.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "Failure(error=null, errorText=", ")");
        }
    }

    public static final class b implements vji0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 867570065;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements vji0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -5951473;
        }

        public final String toString() {
            return "NotLoggedIn";
        }
    }

    public static final class d implements vji0 {
        public final iki0 a;

        public d() {
            this.a = new iki0(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(uiState=" + this.a + ")";
        }

        public d(iki0 iki0Var) {
            this.a = iki0Var;
        }
    }
}
