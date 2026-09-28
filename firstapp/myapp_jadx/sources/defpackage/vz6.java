package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface vz6 {

    public static final class a implements vz6 {
        public final UiText a;
        public final boolean b;

        public a(UiText uiText, boolean z) {
            uiText.getClass();
            this.a = uiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorDialog(message=" + this.a + ", refreshOnDismiss=" + this.b + ")";
        }
    }

    public static final class b implements vz6 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 28250151;
        }

        public final String toString() {
            return "NoDialog";
        }
    }
}
