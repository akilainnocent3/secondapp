package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface mei {

    public static final class a implements mei {
        public final UiText a;
        public final String b;
        public final String c;

        public a(UiText uiText, String str, String str2) {
            uiText.getClass();
            this.a = uiText;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetBuilder(uiText=");
            sb.append(this.a);
            sb.append(", marketTitleText=");
            sb.append(this.b);
            sb.append(", outcomeDescriptionText=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class b implements mei {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Common(text=", this.a, ")");
        }
    }
}
