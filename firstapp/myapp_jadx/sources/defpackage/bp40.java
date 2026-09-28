package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface bp40 {

    public static final class a implements bp40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 208161833;
        }

        public final String toString() {
            return "NavigateBackWithSuccess";
        }
    }

    public static final class b implements bp40 {
        public final UiText a;

        public b(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "ShowAlertDialog(message=", ")");
        }
    }

    public static final class c implements bp40 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1653950004;
        }

        public final String toString() {
            return "ShowNetworkErrorToast";
        }
    }

    public static final class d implements bp40 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2128179997;
        }

        public final String toString() {
            return "ShowSuccessToast";
        }
    }
}
