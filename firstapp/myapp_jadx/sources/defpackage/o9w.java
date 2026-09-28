package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface o9w {

    public static final class a implements o9w {
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
            return "DynamicApi(title=" + this.a + ", message=" + this.b + ")";
        }
    }

    public static final class b implements o9w {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1786744091;
        }

        public final String toString() {
            return "GeneralError";
        }
    }

    public static final class c implements o9w {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1217575233;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements o9w {
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
            return "ResendEmail(title=" + this.a + ", message=" + this.b + ")";
        }
    }
}
