package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public interface u04 {

    public static final class a implements u04 {
        public final ResourceUiText a;
        public final ResourceUiText b;

        public a(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
            this.a = resourceUiText;
            this.b = resourceUiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ClickInfoButton(title=" + this.a + ", message=" + this.b + ")";
        }
    }

    public static final class b implements u04 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1834826737;
        }

        public final String toString() {
            return "HideBottomSheet";
        }
    }
}
