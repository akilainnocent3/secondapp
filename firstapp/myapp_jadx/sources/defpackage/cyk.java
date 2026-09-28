package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface cyk {

    public static final class a implements cyk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1827595627;
        }

        public final String toString() {
            return "All";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b implements cyk {
        public final ijf0 a;
        public final UiText b;

        public b(int i) {
            this(new ijf0((String) null, 0L, 7), vch0.a);
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
            return yFmFZvuWxAYfEj.DiveWepP + this.a + ", partialValueErrorMessage=" + this.b + ")";
        }

        public b(ijf0 ijf0Var, UiText uiText) {
            ijf0Var.getClass();
            uiText.getClass();
            this.a = ijf0Var;
            this.b = uiText;
        }
    }
}
