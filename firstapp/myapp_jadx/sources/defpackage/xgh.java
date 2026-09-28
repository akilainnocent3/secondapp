package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface xgh {

    public static final class a implements xgh {
        public final chh a;

        public a(chh chhVar) {
            chhVar.getClass();
            this.a = chhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfirmLeaveWithoutSubmitting(leaveAction=" + this.a + ")";
        }
    }

    public static final class b implements xgh {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1288846925;
        }

        public final String toString() {
            return "ConfirmReportBug";
        }
    }

    public static final class c implements xgh {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -674944713;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public static final class d implements xgh {
        public final UiText a;

        public d(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "Error(message=", ")");
        }
    }
}
