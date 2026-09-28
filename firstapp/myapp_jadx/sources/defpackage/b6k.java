package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b6k {

    public static abstract class a {

        /* JADX INFO: renamed from: b6k$a$a, reason: collision with other inner class name */
        public static final class C0111a extends a {
            public final ResourceUiText a;

            public C0111a(ResourceUiText resourceUiText) {
                this.a = resourceUiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0111a) && Intrinsics.g(this.a, ((C0111a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oe90.a(this.a, "Email(msg=", ")");
            }
        }

        public static final class b extends a {
            public final UiText a;

            public b(UiText uiText) {
                this.a = uiText;
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
                return xh8.a(this.a, "Generic(msg=", ")");
            }
        }

        public static final class c extends a {
            public final UiText a;

            public c(UiText uiText) {
                this.a = uiText;
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
                return xh8.a(this.a, "KycDoc(msg=", ")");
            }
        }

        public static final class d extends a {
            public final ResourceUiText a;

            public d(ResourceUiText resourceUiText) {
                this.a = resourceUiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oe90.a(this.a, "Password(msg=", ")");
            }
        }

        public static final class e extends a {
            public final ResourceUiText a;

            public e(ResourceUiText resourceUiText) {
                this.a = resourceUiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oe90.a(this.a, "Phone(msg=", ")");
            }
        }
    }

    public static a a(UiText uiText, Integer num) {
        if (num != null && num.intValue() == 19000) {
            StringUiText stringUiText = vch0.a;
            return new a.C0111a(new ResourceUiText(R.string.register_login_int__error_register_19002));
        }
        if (num != null && num.intValue() == 10110) {
            StringUiText stringUiText2 = vch0.a;
            return new a.d(new ResourceUiText(R.string.register_login_int__error_create_account_10110));
        }
        if ((num != null && num.intValue() == 11612) || ((num != null && num.intValue() == 12001) || (num != null && num.intValue() == 11614))) {
            StringUiText stringUiText3 = vch0.a;
            return new a.C0111a(new ResourceUiText(R.string.register_login_int__error_create_account_11612_11614_12001));
        }
        if (num != null && num.intValue() == 12003) {
            StringUiText stringUiText4 = vch0.a;
            return new a.C0111a(new ResourceUiText(R.string.register_login_int__error_create_account_12003));
        }
        if (num != null && num.intValue() == 12005) {
            StringUiText stringUiText5 = vch0.a;
            return new a.C0111a(new ResourceUiText(R.string.register_login_int__error_create_account_12005));
        }
        if (num != null && num.intValue() == 15101) {
            if (uiText == null) {
                StringUiText stringUiText6 = vch0.a;
                uiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again);
            }
            return new a.c(uiText);
        }
        if (num != null && num.intValue() == 15100) {
            StringUiText stringUiText7 = vch0.a;
            return new a.c(new ResourceUiText(R.string.register_login_int__cpf_is_not_valid_or_already_used_error_message));
        }
        if (num != null && num.intValue() == 11637) {
            StringUiText stringUiText8 = vch0.a;
            return new a.c(new ResourceUiText(R.string.pc_home__your_account_is_currently_locked_due_to_self_exclusion));
        }
        if ((num != null && num.intValue() == 11000) || ((num != null && num.intValue() == 11001) || ((num != null && num.intValue() == 11002) || (num != null && num.intValue() == 11608)))) {
            StringUiText stringUiText9 = vch0.a;
            return new a.e(new ResourceUiText(R.string.common_feedback__please_enter_a_valid_mobile_number));
        }
        if ((num != null && num.intValue() == 11611) || (num != null && num.intValue() == 11600)) {
            StringUiText stringUiText10 = vch0.a;
            return new a.e(new ResourceUiText(R.string.app_common__the_mobile_number_is_already_registered));
        }
        if (uiText == null) {
            StringUiText stringUiText11 = vch0.a;
            uiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again);
        }
        return new a.b(uiText);
    }
}
