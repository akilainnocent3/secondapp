package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface jz20 {

    public static final class a implements jz20 {
        public final ResourceUiText a;
        public final UiText b;

        public a(ResourceUiText resourceUiText, UiText uiText) {
            uiText.getClass();
            this.a = resourceUiText;
            this.b = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicApiDialog(title=" + this.a + ", message=" + this.b + ")";
        }
    }

    public static final class b implements jz20 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1445574481;
        }

        public final String toString() {
            return "GeneralErrorDialog";
        }
    }

    public static final class c implements jz20 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 753548315;
        }

        public final String toString() {
            return "LoadingDialog";
        }
    }

    public static final class d implements jz20 {
        public final ResourceUiText a;
        public final UiText b;

        public d(ResourceUiText resourceUiText, UiText uiText) {
            uiText.getClass();
            this.a = resourceUiText;
            this.b = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ResendEmailDialog(title=" + this.a + ", message=" + this.b + ")";
        }
    }
}
