package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface oz20 {

    public static final class a implements oz20 {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return oe90.a(this.a, "ShowToast(message=", ")");
        }
    }

    public static final class b implements oz20 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1062501838;
        }

        public final String toString() {
            return "ToDobVerification";
        }
    }

    public static final class c implements oz20 {
        public final EmailChangeFlowArgs a;

        public c(EmailChangeFlowArgs emailChangeFlowArgs) {
            this.a = emailChangeFlowArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToEmailChangeFlow(emailChangeArgs=" + this.a + ")";
        }
    }
}
