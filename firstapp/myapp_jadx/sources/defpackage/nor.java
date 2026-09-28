package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nor {

    public static final class a extends nor {
        public static final a a = new a();
        public static final ResourceUiText b = new ResourceUiText(R.string.register_signup_br__cpf);
        public static final ResourceUiText c = new ResourceUiText(R.string.register_signup_br__cpf_info_dialog);
        public static final boolean d = true;
        public static final boolean e = true;
        public static final boolean f = true;
        public static final int g = 18;

        static {
            CountryCodeName.Companion companion = CountryCodeName.INSTANCE;
        }

        @Override // defpackage.nor
        public final ResourceUiText b() {
            return c;
        }

        @Override // defpackage.nor
        public final ResourceUiText c() {
            return b;
        }

        @Override // defpackage.nor
        public final int d() {
            return g;
        }

        @Override // defpackage.nor
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.nor
        public final boolean f() {
            return f;
        }

        @Override // defpackage.nor
        public final boolean g() {
            return false;
        }

        @Override // defpackage.nor
        public final boolean h() {
            return e;
        }

        public final int hashCode() {
            return -1669907823;
        }

        @Override // defpackage.nor
        public final boolean i() {
            return d;
        }

        public final String toString() {
            return "Brazil";
        }
    }

    public static final class b {
        public final ResourceUiText a;
        public final ResourceUiText b;
        public final ResourceUiText c;

        public b(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3) {
            this.a = resourceUiText;
            this.b = resourceUiText2;
            this.c = resourceUiText3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + wh8.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "FullNameLabels(topLabelFirstName=" + this.a + ", topLabelLastName=" + this.b + ", tip=" + this.c + ")";
        }
    }

    public static final class c extends nor {
        public static final c a = new c();
        public static final b b = new b(new ResourceUiText(R.string.kyc_collect__placeholder_first_name), new ResourceUiText(R.string.kyc_collect__placeholder_last_name), new ResourceUiText(R.string.kyc_collect__first_name_last_name_tip));
        public static final ResourceUiText c = new ResourceUiText(R.string.register_login_mx__curp);
        public static final ResourceUiText d = new ResourceUiText(R.string.register_login_mx__kyc_field_r0023_description);
        public static final boolean e = true;
        public static final boolean f = true;
        public static final int g = 18;

        static {
            CountryCodeName.Companion companion = CountryCodeName.INSTANCE;
        }

        @Override // defpackage.nor
        public final b a() {
            return b;
        }

        @Override // defpackage.nor
        public final ResourceUiText b() {
            return d;
        }

        @Override // defpackage.nor
        public final ResourceUiText c() {
            return c;
        }

        @Override // defpackage.nor
        public final int d() {
            return g;
        }

        @Override // defpackage.nor
        public final boolean e() {
            return f;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.nor
        public final boolean f() {
            return false;
        }

        @Override // defpackage.nor
        public final boolean g() {
            return e;
        }

        @Override // defpackage.nor
        public final boolean h() {
            return false;
        }

        public final int hashCode() {
            return -1366324262;
        }

        @Override // defpackage.nor
        public final boolean i() {
            return false;
        }

        public final String toString() {
            return "Mexico";
        }
    }

    public b a() {
        return null;
    }

    public abstract ResourceUiText b();

    public abstract ResourceUiText c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();
}
