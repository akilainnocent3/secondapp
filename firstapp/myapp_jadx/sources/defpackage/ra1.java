package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ra1 {

    public static final class a extends ra1 {
        public final UiText a;
        public final UiText b;

        public a(UiText uiText, UiText uiText2) {
            uiText.getClass();
            uiText2.getClass();
            this.a = uiText;
            this.b = uiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowErrorDialog(title=" + this.a + ", content=" + this.b + ")";
        }
    }

    public static final class b extends ra1 {
        public final UiText a;
        public final UiText b;
        public final ResourceUiText c;

        public b(ResourceUiText resourceUiText, UiText uiText, UiText uiText2) {
            uiText.getClass();
            uiText2.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = resourceUiText;
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
            StringBuilder sbA = uh8.a(this.a, this.b, "ShowErrorDialogWithAction(title=", ", content=", ", actionText=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c extends ra1 {
        public final ResourceUiText a;

        public c(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
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
            return oe90.a(this.a, "ShowErrorSnackBar(content=", ")");
        }
    }

    public static final class d extends ra1 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1815533132;
        }

        public final String toString() {
            return "ShowNotificationDialog";
        }
    }
}
