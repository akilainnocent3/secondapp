package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class aue implements uyt {

    public static final class a extends aue {
        public final UiText a;
        public final StringUiText b;
        public final boolean c;

        public a(StringUiText stringUiText, StringUiText stringUiText2, boolean z) {
            stringUiText.getClass();
            this.a = stringUiText;
            this.b = stringUiText2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DobVerificationRequired(dobGiftAmount=");
            sb.append(this.a);
            sb.append(", birthdayGiftAmount=");
            sb.append(this.b);
            sb.append(", showNew=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class b extends aue {
        public final StringUiText a;
        public final ResourceUiText b;
        public final boolean c;

        public b(StringUiText stringUiText, ResourceUiText resourceUiText, boolean z) {
            this.a = stringUiText;
            this.b = resourceUiText;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + wh8.a(this.a.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftLocked(amount=");
            sb.append(this.a);
            sb.append(", tierName=");
            sb.append(this.b);
            sb.append(", showNew=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class c extends aue {
        public final StringUiText a;
        public final boolean b;

        public c(StringUiText stringUiText, boolean z) {
            this.a = stringUiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "GiftReady(amount=" + this.a + ", showNew=" + this.b + ")";
        }
    }

    public static final class d extends aue {
        public final ResourceUiText a;
        public final boolean b;

        public d(ResourceUiText resourceUiText, boolean z) {
            this.a = resourceUiText;
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
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GiftUnqualified(minTier=" + this.a + ", showNew=" + this.b + ")";
        }
    }
}
