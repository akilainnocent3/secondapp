package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface afe {

    public static final class a implements afe {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("ClickBlock(deviceId=", this.a, ")");
        }
    }

    public static final class b implements afe {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("ClickLogOut(deviceId=", this.a, ")");
        }
    }

    public static final class c implements afe {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -617833350;
        }

        public final String toString() {
            return "ClickLogoutOtherDevices";
        }
    }

    public static final class d implements afe {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("ClickUnblock(deviceId=", this.a, ")");
        }
    }

    public static final class e implements afe {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2124012643;
        }

        public final String toString() {
            return "ConfirmDialog";
        }
    }

    public static final class f implements afe {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2058561709;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class g implements afe {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1195651286;
        }

        public final String toString() {
            return "DismissSnackbar";
        }
    }

    public static final class h implements afe {
        public final cie a;

        public h(cie cieVar) {
            this.a = cieVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectTab(tab=" + this.a + ")";
        }
    }

    public static final class i implements afe {
        public final UiText a;

        public i(UiText uiText) {
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a.equals(((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "ShowLogoutSuccess(message=", ")");
        }
    }

    public static final class j implements afe {
        public final String a;

        public j(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.g(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("ToggleMenu(deviceId=", this.a, ")");
        }
    }
}
