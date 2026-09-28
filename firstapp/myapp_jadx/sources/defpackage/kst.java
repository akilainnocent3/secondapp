package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface kst {

    public static final class a implements kst {
        public final ResourceUiText a;
        public final igm b;

        public a(ResourceUiText resourceUiText) {
            igm.i iVar = igm.i.a;
            iVar.getClass();
            this.a = resourceUiText;
            this.b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HtmlDialog(html=" + this.a + ", onCloseEvent=" + this.b + ")";
        }
    }

    public static final class b implements kst {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoDialog(onCloseEvent=null)";
        }
    }

    public static final class c implements kst {
        public final UiText a;
        public final UiText b;
        public final igm c;

        public c(UiText uiText, UiText uiText2, igm igmVar) {
            uiText.getClass();
            uiText2.getClass();
            igmVar.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = igmVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "NormalDialog(title=", ", content=", ", onCloseEvent=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ c(UiText uiText, UiText uiText2) {
            this(uiText, uiText2, igm.i.a);
        }
    }
}
