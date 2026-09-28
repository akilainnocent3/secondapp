package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tcf0 {

    public static final class a extends tcf0 {
        public final ResourceUiText a;
        public final ResourceUiText b;

        public a(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
            this.a = resourceUiText;
            this.b = resourceUiText2;
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
            return "AppendLinkText(title=" + this.a + ", linkText=" + this.b + ")";
        }
    }

    public static final class b extends tcf0 {
        public final ResourceUiText a;

        public b(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oe90.a(this.a, "NormalText(title=", ")");
        }
    }
}
