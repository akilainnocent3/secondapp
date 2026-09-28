package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface wo50 {

    public static final class a implements wo50 {
        public final ResourceUiText a;
        public final cp50 b;

        public a(ResourceUiText resourceUiText, cp50 cp50Var) {
            cp50Var.getClass();
            this.a = resourceUiText;
            this.b = cp50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomServiceError(title=" + this.a + ", onDismissAction=" + this.b + ")";
        }
    }

    public static final class b implements wo50 {
        public final UiText a;
        public final UiText b;
        public final cp50 c;

        public b(UiText uiText, UiText uiText2, cp50 cp50Var) {
            uiText.getClass();
            uiText2.getClass();
            cp50Var.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = cp50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "Error(title=", ", text=", ", onDismissAction=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements wo50 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 477103375;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class e implements wo50 {
        public final d120 a;

        public e(d120 d120Var) {
            this.a = d120Var;
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
            return "PollingDialog(status=" + this.a + ")";
        }
    }

    public static final class c implements wo50 {
        public final cp50 a;

        public c(cp50 cp50Var) {
            this.a = cp50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            cp50 cp50Var = this.a;
            if (cp50Var == null) {
                return 0;
            }
            return cp50Var.hashCode();
        }

        public final String toString() {
            return "Loaded(followingEvent=" + this.a + ")";
        }

        public c() {
            this(null);
        }
    }
}
