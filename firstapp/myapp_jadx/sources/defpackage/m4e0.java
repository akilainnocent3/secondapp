package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface m4e0 {

    public static final class a implements m4e0 {
        public final UiText a;

        public a(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
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
            return xh8.a(this.a, "Error(message=", ")");
        }
    }

    public static final class b implements m4e0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -882735659;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements m4e0 {
        public final n7e0 a;

        public c() {
            this.a = new n7e0(null, 0, 0, null, null, null, null, false, null, false, null, null, null, null, null, null, false, null, 4194303);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.a + ")";
        }

        public c(n7e0 n7e0Var) {
            n7e0Var.getClass();
            this.a = n7e0Var;
        }
    }
}
