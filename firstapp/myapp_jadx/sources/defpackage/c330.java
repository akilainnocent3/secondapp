package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface c330 {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements c330 {
        public final boolean a;
        public final UiText b;

        public a(UiText uiText, boolean z) {
            this.a = z;
            this.b = uiText;
        }

        public static a a(a aVar, boolean z, ResourceUiText resourceUiText, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            UiText uiText = resourceUiText;
            if ((i & 2) != 0) {
                uiText = aVar.b;
            }
            aVar.getClass();
            return new a(uiText, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            UiText uiText = this.b;
            return iHashCode + (uiText == null ? 0 : uiText.hashCode());
        }

        public final String toString() {
            return "Idle(isEnabled=" + this.a + ", uiText=" + this.b + ")";
        }
    }

    public static final class b implements c330 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 383997466;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
