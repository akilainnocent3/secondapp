package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface dyk {

    public static final class a implements dyk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -934769340;
        }

        public final String toString() {
            return "All";
        }
    }

    public static final class b implements dyk {
        public final ijf0 a;
        public final UiText b;

        public b(ijf0 ijf0Var, int i) {
            this((i & 1) != 0 ? new ijf0((String) null, 0L, 7) : ijf0Var, vch0.a);
        }

        public static b a(b bVar, ijf0 ijf0Var, UiText uiText, int i) {
            if ((i & 1) != 0) {
                ijf0Var = bVar.a;
            }
            if ((i & 2) != 0) {
                uiText = bVar.b;
            }
            ijf0Var.getClass();
            uiText.getClass();
            return new b(ijf0Var, uiText);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Partial(partialValueTextFieldValue=" + this.a + ", partialValueErrorMessage=" + this.b + ")";
        }

        public b(ijf0 ijf0Var, UiText uiText) {
            ijf0Var.getClass();
            uiText.getClass();
            this.a = ijf0Var;
            this.b = uiText;
        }
    }
}
