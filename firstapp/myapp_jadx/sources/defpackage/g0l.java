package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface g0l {

    public static final class a implements g0l {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -873230634;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class c implements g0l {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1899361460;
        }

        public final String toString() {
            return "Success";
        }
    }

    public static final class b implements g0l {
        public final UiText a;
        public final wae b;

        public b(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            wae waeVar = this.b;
            return iHashCode + (waeVar == null ? 0 : waeVar.hashCode());
        }

        public final String toString() {
            return "Error(message=" + this.a + ", errorClickableDestination=" + this.b + ")";
        }

        public b(UiText uiText, wae waeVar) {
            this.a = uiText;
            this.b = waeVar;
        }
    }
}
