package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface sb50 {

    public static final class a implements sb50 {
        public final UiText a;
        public final rb50 b;

        public a(UiText uiText, rb50 rb50Var) {
            uiText.getClass();
            rb50Var.getClass();
            this.a = uiText;
            this.b = rb50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorDialog(message=" + this.a + ", action=" + this.b + ")";
        }
    }

    public static final class b implements sb50 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1888053914;
        }

        public final String toString() {
            return "NoDialog";
        }
    }
}
