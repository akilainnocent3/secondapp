package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface zs00 {

    public static final class b implements zs00 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1377819344;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    public static final class c implements zs00 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -237269039;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class a implements zs00 {
        public final UiText a;
        public final boolean b;

        public a(UiText uiText) {
            this.a = uiText;
            this.b = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Failed(errorMsg=" + this.a + ", isShowLogin=" + this.b + ")";
        }

        public a(UiText uiText, boolean z) {
            this.a = uiText;
            this.b = z;
        }
    }
}
