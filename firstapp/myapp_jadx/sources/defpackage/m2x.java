package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface m2x {

    public static final class a implements m2x {
        public final hvw a;
        public final Long b;
        public final UiText c;

        public a(hvw hvwVar, Long l, UiText uiText) {
            this.a = hvwVar;
            this.b = l;
            this.c = uiText;
        }

        public static a a(a aVar, hvw hvwVar, Long l, UiText uiText, int i) {
            if ((i & 1) != 0) {
                hvwVar = aVar.a;
            }
            if ((i & 2) != 0) {
                l = aVar.b;
            }
            if ((i & 4) != 0) {
                uiText = aVar.c;
            }
            hvwVar.getClass();
            return new a(hvwVar, l, uiText);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.a.hashCode() * 31;
            Long l = this.b;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            UiText uiText = this.c;
            return iHashCode2 + (uiText != null ? uiText.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(model=");
            sb.append(this.a);
            sb.append(", applyingThemeId=");
            sb.append(this.b);
            sb.append(", errorText=");
            return plf.a(sb, this.c, ")");
        }
    }

    public static final class b implements m2x {
        public final UiText a;

        public b(UiText uiText) {
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "Error(message=", ")");
        }
    }

    public static final class c implements m2x {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 928673566;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
