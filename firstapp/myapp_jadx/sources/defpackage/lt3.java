package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface lt3 {

    public static final class a implements lt3 {
        public final ResourceUiText a;

        public a(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(150) + gpp.a(50, this.a.hashCode() * 31, 31);
        }

        @Override // defpackage.lt3
        public final boolean isVisible() {
            return true;
        }

        public final String toString() {
            return oe90.a(this.a, "Empty(message=", ", contentTopPaddingDp=50, bottomSpacerHeightDp=150)");
        }
    }

    public static final class b implements lt3 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 372551977;
        }

        @Override // defpackage.lt3
        public final boolean isVisible() {
            return false;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public static final class c implements lt3 {
        public final UiText a;
        public final boolean b;
        public final float c;
        public final qcn<us3> d;
        public final int e;

        public c(ResourceUiText resourceUiText, boolean z, float f, qcn qcnVar, int i) {
            this.a = resourceUiText;
            this.b = z;
            this.c = f;
            this.d = qcnVar;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Float.compare(this.c, cVar.c) == 0 && this.d.equals(cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            UiText uiText = this.a;
            return Integer.hashCode(this.e) + shu.a(this.d, tvh.a(this.c, mtg0.a((uiText == null ? 0 : uiText.hashCode()) * 31, 31, this.b), 31), 31);
        }

        @Override // defpackage.lt3
        public final boolean isVisible() {
            return true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Recommendations(emptyMessage=");
            sb.append(this.a);
            sb.append(", isExpanded=");
            sb.append(this.b);
            sb.append(", expansionIconRotationZ=");
            sb.append(this.c);
            sb.append(", pagerPages=");
            sb.append(this.d);
            sb.append(", selectedPagerIndex=");
            return zk1.a(this.e, ")", sb);
        }
    }

    boolean isVisible();
}
