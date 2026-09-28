package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zwe {
    public final ResourceUiText a;
    public final UiText b;
    public final ResourceUiText c;
    public final UiText d;

    public static final class a extends zwe {
        public static final a e;

        static {
            StringUiText stringUiText = vch0.a;
            e = new a(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later), new ResourceUiText(R.string.common_functions__ok), null, 9);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1327639595;
        }

        public final String toString() {
            return "GeneralError";
        }
    }

    public static final class b extends zwe {
        public final UiText e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UiText uiText) {
            super(uiText, new ResourceUiText(R.string.common_functions__retry), new ResourceUiText(R.string.common_functions__customer_service), 1);
            uiText.getClass();
            StringUiText stringUiText = vch0.a;
            this.e = uiText;
        }

        @Override // defpackage.zwe
        public final UiText a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.e, ((b) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return xh8.a(this.e, "NameMismatched(message=", ")");
        }
    }

    public static final class c extends zwe {
        public final UiText e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UiText uiText) {
            super(uiText, new ResourceUiText(R.string.common_functions__ok), new ResourceUiText(R.string.common_functions__customer_service), 1);
            uiText.getClass();
            StringUiText stringUiText = vch0.a;
            this.e = uiText;
        }

        @Override // defpackage.zwe
        public final UiText a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.e, ((c) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return xh8.a(this.e, "RateLimitExceeded(message=", ")");
        }
    }

    public static final class d extends zwe {
        public final UiText e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UiText uiText) {
            super(uiText, new ResourceUiText(R.string.common_functions__retry), null, 9);
            uiText.getClass();
            StringUiText stringUiText = vch0.a;
            this.e = uiText;
        }

        @Override // defpackage.zwe
        public final UiText a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.e, ((d) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return xh8.a(this.e, "Retry(message=", ")");
        }
    }

    public static final class e extends zwe {
        public final UiText e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UiText uiText) {
            super(uiText, new ResourceUiText(R.string.common_functions__ok), null, 9);
            uiText.getClass();
            StringUiText stringUiText = vch0.a;
            this.e = uiText;
        }

        @Override // defpackage.zwe
        public final UiText a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.e, ((e) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return xh8.a(this.e, "VerifyMeAPINoFunction(message=", ")");
        }
    }

    public zwe(UiText uiText, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, int i) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_feedback__verification_failed);
        resourceUiText2 = (i & 8) != 0 ? null : resourceUiText2;
        this.a = resourceUiText3;
        this.b = uiText;
        this.c = resourceUiText;
        this.d = resourceUiText2;
    }

    public UiText a() {
        return this.b;
    }
}
