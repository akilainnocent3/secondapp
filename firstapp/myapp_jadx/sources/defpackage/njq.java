package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public interface njq {

    public static final class a implements njq {
        public final nvp a;

        public a(nvp nvpVar) {
            this.a = nvpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RootAction(action=" + this.a + ")";
        }
    }

    public static final class b implements njq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 679408180;
        }

        public final String toString() {
            return "ScrollToTop";
        }
    }

    public static final class c implements njq {
        public final ResourceUiText a;

        public c(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oe90.a(this.a, "SnackerBar(message=", ")");
        }
    }
}
