package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface tjq {

    public static final class a implements tjq {
        public final ResourceUiText a;
        public final int b;
        public final ojq c;

        public a(ResourceUiText resourceUiText, int i, ojq ojqVar) {
            ojqVar.getClass();
            this.a = resourceUiText;
            this.b = i;
            this.c = ojqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        @Override // defpackage.tjq
        public final ojq getFilter() {
            return this.c;
        }

        @Override // defpackage.tjq
        public final UiText getText() {
            return this.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "IconTextItem(text=" + this.a + ", iconRes=" + this.b + ", filter=" + this.c + ")";
        }
    }

    public static final class b implements tjq {
        public final UiText a;
        public final ojq b;

        public b(UiText uiText, ojq ojqVar) {
            uiText.getClass();
            ojqVar.getClass();
            this.a = uiText;
            this.b = ojqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        @Override // defpackage.tjq
        public final ojq getFilter() {
            return this.b;
        }

        @Override // defpackage.tjq
        public final UiText getText() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TextItem(text=" + this.a + ", filter=" + this.b + ")";
        }
    }

    ojq getFilter();

    UiText getText();
}
