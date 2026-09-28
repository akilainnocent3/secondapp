package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface i7l {

    public static final class a implements i7l {
        public final ResourceUiText a;
        public final h7l b;

        public a(ResourceUiText resourceUiText, h7l h7lVar) {
            h7lVar.getClass();
            this.a = resourceUiText;
            this.b = h7lVar;
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
            return "HasButton(text=" + this.a + ", action=" + this.b + ")";
        }
    }

    public static final class b implements i7l {
        public static final b a = new b();
    }
}
