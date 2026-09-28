package defpackage;

import android.util.Range;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public interface y300 extends y200 {

    public static final class a implements y300 {
        public final CountryCodeName a;

        /* JADX INFO: renamed from: y300$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1320a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CountryCodeName.values().length];
                try {
                    iArr[CountryCodeName.GHANA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CountryCodeName.NIGERIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final String b() {
            return "bank";
        }

        @Override // defpackage.y200
        public final String d() {
            int i = C1320a.a[this.a.ordinal()];
            if (i == 1) {
                return "buyGiftWithdrawPage";
            }
            if (i != 2) {
                return null;
            }
            return "onlineWithdrawPageBottom";
        }

        public final int e() throws Exception {
            int[] iArr = C1320a.a;
            CountryCodeName countryCodeName = this.a;
            int i = iArr[countryCodeName.ordinal()];
            if (i == 1) {
                c100 c100Var = c100.e;
                return 140;
            }
            if (i == 2) {
                c100 c100Var2 = c100.e;
                return 21;
            }
            if (i != 3) {
                throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethodWithdraw.Bank"));
            }
            c100 c100Var3 = c100.e;
            return 26003;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        @Override // defpackage.y200
        public final boolean f() {
            return true;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = C1320a.a;
            CountryCodeName countryCodeName = this.a;
            int i = iArr[countryCodeName.ordinal()];
            if (i == 1) {
                return "13";
            }
            if (i == 2 || i == 3) {
                return "6";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodWithdraw.Bank"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.common_payment_providers__bank);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "bank";
        }

        @Override // defpackage.y300
        public final Integer k() {
            return 2;
        }

        @Override // defpackage.y200
        public final boolean l() {
            return kotlin.collections.a.c(CountryCodeName.GHANA).contains(this.a);
        }

        @Override // defpackage.y200
        public final String m() {
            if (C1320a.a[this.a.ordinal()] == 1) {
                return "bank_withdraw";
            }
            return null;
        }

        public final int n() {
            int i = C1320a.a[this.a.ordinal()];
            if (i != 1) {
                return (i == 2 || i != 3) ? 10 : 13;
            }
            return 16;
        }

        public final boolean o() {
            return kotlin.collections.b.k(CountryCodeName.GHANA, CountryCodeName.SOUTH_AFRICA).contains(this.a);
        }

        public final boolean p() {
            return kotlin.collections.a.c(CountryCodeName.GHANA).contains(this.a);
        }

        public final boolean q() {
            return kotlin.collections.b.k(CountryCodeName.GHANA, CountryCodeName.NIGERIA, CountryCodeName.SOUTH_AFRICA).contains(this.a);
        }

        public final String toString() {
            return l4j0.a("Bank(countryCode=", this.a, ")");
        }
    }

    public static final class b implements y300 {
        public final CountryCodeName a;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CountryCodeName.values().length];
                try {
                    iArr[CountryCodeName.GHANA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CountryCodeName.TANZANIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CountryCodeName.ZAMBIA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CountryCodeName.KENYA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public b(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final String b() {
            return "mobilemoney";
        }

        @Override // defpackage.y200
        public final String d() {
            int i = a.a[this.a.ordinal()];
            if (i == 1 || i == 4) {
                return "buyGiftWithdrawPage";
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        @Override // defpackage.y200
        public final boolean f() {
            return true;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            int i = iArr[countryCodeName.ordinal()];
            if (i == 1) {
                return "10";
            }
            if (i == 2) {
                return "17";
            }
            if (i == 3) {
                return "14";
            }
            if (i == 4) {
                return "3";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodWithdraw.Momo"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.common_payment_providers__mobile_money);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "mobilemoney";
        }

        @Override // defpackage.y300
        public final Integer k() {
            return 4;
        }

        @Override // defpackage.y200
        public final boolean l() {
            return false;
        }

        @Override // defpackage.y200
        public final String m() {
            return null;
        }

        public final x300 n() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            int i = iArr[countryCodeName.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return x300.a;
                }
                if (i != 3 && i != 4) {
                    throw new Exception(l4j0.a("`phoneChannelSource` undefine for ", countryCodeName, " in PayMethodWithdraw.Momo"));
                }
            }
            return x300.b;
        }

        public final boolean o() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            int i = iArr[countryCodeName.ordinal()];
            if (i == 1 || i == 2) {
                return false;
            }
            if (i == 3) {
                return true;
            }
            if (i == 4) {
                return false;
            }
            throw new Exception(l4j0.a("`isDefaultChannelNeeded` undefine for ", countryCodeName, " in PayMethodWithdraw.Momo"));
        }

        public final String toString() {
            return l4j0.a("Momo(countryCode=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements y300 {
        public static final /* synthetic */ int b = 0;
        public final CountryCodeName a;

        /* JADX INFO: loaded from: classes6.dex */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CountryCodeName.values().length];
                try {
                    iArr[CountryCodeName.NIGERIA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public c(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        public static Range n() {
            return new Range(BigDecimal.valueOf(50L), BigDecimal.valueOf(100000L));
        }

        @Override // defpackage.y200
        public final String b() {
            return "offline";
        }

        @Override // defpackage.y200
        public final String d() {
            if (a.a[this.a.ordinal()] == 1) {
                return "buyGiftWithdrawPage";
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        @Override // defpackage.y200
        public final boolean f() {
            return false;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            if (iArr[countryCodeName.ordinal()] == 1) {
                return "12";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodWithdraw.Partner"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.common_functions__partner);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y300
        public final Integer k() {
            return null;
        }

        @Override // defpackage.y200
        public final boolean l() {
            return false;
        }

        @Override // defpackage.y200
        public final String m() {
            return null;
        }

        public final String toString() {
            return l4j0.a("Partner(countryCode=", this.a, ")");
        }

        @Override // defpackage.y200
        public final String j() {
            return LxHElgWAiSeM.KtsrVoczjnc;
        }
    }

    public static final class d implements y300 {
        public static final /* synthetic */ int b = 0;
        public final CountryCodeName a;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CountryCodeName.values().length];
                try {
                    iArr[CountryCodeName.NIGERIA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public d(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final String b() {
            return "transfer";
        }

        @Override // defpackage.y200
        public final String d() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        @Override // defpackage.y200
        public final boolean f() {
            return false;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            if (iArr[countryCodeName.ordinal()] == 1) {
                return "-1";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodWithdraw.Transfer"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_withdraw__transfer_to_friend);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "transfer";
        }

        @Override // defpackage.y300
        public final Integer k() {
            return null;
        }

        @Override // defpackage.y200
        public final boolean l() {
            return false;
        }

        @Override // defpackage.y200
        public final String m() {
            return null;
        }

        public final String toString() {
            return l4j0.a("Transfer(countryCode=", this.a, ")");
        }
    }

    @Override // defpackage.y200
    default boolean a() {
        return false;
    }

    Integer k();
}
