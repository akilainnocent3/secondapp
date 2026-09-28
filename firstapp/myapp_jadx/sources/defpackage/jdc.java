package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface jdc {

    public static final class a implements jdc {
        public final hdc a;
        public final boolean b;

        public a(hdc hdcVar, boolean z) {
            this.a = hdcVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomCodes(codeList=" + this.a + ", isCreator=" + this.b + ")";
        }
    }

    public static final class b implements jdc {
        public final hdc a;
        public final boolean b;

        public b(hdc hdcVar, boolean z) {
            this.a = hdcVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Empty(codeList=" + this.a + ", isCreator=" + this.b + ")";
        }
    }

    public static final class c implements jdc {
        public final Throwable a;
        public final UiText b;

        public c(Throwable th, UiText uiText) {
            this.a = th;
            this.b = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            Throwable th = this.a;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            UiText uiText = this.b;
            return iHashCode + (uiText != null ? uiText.hashCode() : 0);
        }

        public final String toString() {
            return "Failure(error=" + this.a + ", errorText=" + this.b + ")";
        }
    }

    public static final class d implements jdc {
        public final hdc a;
        public final boolean b;

        public d(hdc hdcVar, boolean z) {
            this.a = hdcVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LoadCustomCode(codeList=" + this.a + ", isCreator=" + this.b + ")";
        }
    }

    public static final class e implements jdc {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1360165255;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
