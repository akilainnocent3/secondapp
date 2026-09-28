package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface vne0 {

    public static final class a implements vne0 {
        public static final a a = new a();
    }

    public static final class b implements vne0 {
        public static final b a = new b();
    }

    public static final class c implements vne0 {
        public final aoe0 a;

        public c(aoe0 aoe0Var) {
            this.a = aoe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestDelete(itemState=" + this.a + ")";
        }
    }

    public static final class d implements vne0 {
        public final aoe0 a;

        public d(aoe0 aoe0Var) {
            this.a = aoe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestSetDefault(itemState=" + this.a + ")";
        }
    }

    public static final class e implements vne0 {
        public final aoe0 a;

        public e(aoe0 aoe0Var) {
            this.a = aoe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Select(itemState=" + this.a + ")";
        }
    }

    public static final class f implements vne0 {
        public final UiText a;

        public f(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "Toast(message=", ")");
        }
    }
}
