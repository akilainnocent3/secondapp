package defpackage;

import com.appsflyer.oaid.BuildConfig;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface a300 extends y200 {

    public static class a implements a300 {
        public final CountryCodeName a;

        /* JADX INFO: renamed from: a300$a$a, reason: collision with other inner class name */
        public static final class C0004a extends a {
            public final CountryCodeName b;

            /* JADX INFO: renamed from: a300$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0005a {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004a(CountryCodeName countryCodeName) {
                super(countryCodeName);
                countryCodeName.getClass();
                this.b = countryCodeName;
            }

            @Override // a300.a, defpackage.y200
            public final String b() {
                return "bank-transfer";
            }

            @Override // a300.a, defpackage.y200
            public final String d() {
                return null;
            }

            public final int e() throws Exception {
                int[] iArr = C0005a.a;
                CountryCodeName countryCodeName = this.b;
                if (iArr[countryCodeName.ordinal()] != 1) {
                    throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethodDeposit.BankTransfer.OneTimeAccount"));
                }
                c100 c100Var = c100.e;
                return 25;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0004a) && this.b == ((C0004a) obj).b;
            }

            @Override // a300.a, defpackage.y200
            public final boolean f() {
                return true;
            }

            @Override // a300.a, defpackage.y200
            public final String g() throws Exception {
                int[] iArr = C0005a.a;
                CountryCodeName countryCodeName = this.b;
                if (iArr[countryCodeName.ordinal()] == 1) {
                    return "14";
                }
                throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.BankTransfer.OneTimeAccount"));
            }

            @Override // a300.a, defpackage.y200
            public final ResourceUiText h() {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.page_payment__one_time_account__NG);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            @Override // a300.a, defpackage.y200
            public final String i() {
                return "one_time_account_tab";
            }

            @Override // a300.a, defpackage.y200
            public final String j() {
                return "bank-transfer";
            }

            @Override // a300.a, defpackage.y200
            public final /* bridge */ /* synthetic */ String m() {
                return null;
            }

            public final String toString() {
                return l4j0.a("OneTimeAccount(countryCode=", this.b, ")");
            }
        }

        public static final class b extends a {
            public final CountryCodeName b;

            /* JADX INFO: renamed from: a300$a$b$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0006a {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CountryCodeName countryCodeName) {
                super(countryCodeName);
                countryCodeName.getClass();
                this.b = countryCodeName;
            }

            @Override // a300.a, defpackage.y200
            public final String b() {
                return "sporty-bank";
            }

            @Override // a300.a, defpackage.y200
            public final String d() {
                return null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            @Override // a300.a, defpackage.y200
            public final boolean f() {
                return true;
            }

            @Override // a300.a, defpackage.y200
            public final String g() throws Exception {
                int[] iArr = C0006a.a;
                CountryCodeName countryCodeName = this.b;
                if (iArr[countryCodeName.ordinal()] == 1) {
                    return "-1";
                }
                throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.BankTransfer.SportyBank"));
            }

            @Override // a300.a, defpackage.y200
            public final ResourceUiText h() {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.page_payment__sporty_bank_dedicated_account__NG);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            @Override // a300.a, defpackage.y200
            public final String i() {
                return "dedicated_account_tab";
            }

            @Override // a300.a, defpackage.y200
            public final String j() {
                return "sporty-bank";
            }

            @Override // a300.a, defpackage.y200
            public final /* bridge */ /* synthetic */ String m() {
                return null;
            }

            public final String toString() {
                return l4j0.a("SportyBank(countryCode=", this.b, ")");
            }
        }

        public a(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public boolean a() {
            return false;
        }

        @Override // defpackage.y200
        public String b() {
            return "bank-transfer";
        }

        @Override // defpackage.a300
        public boolean c() {
            return false;
        }

        @Override // defpackage.y200
        public String d() {
            return null;
        }

        @Override // defpackage.y200
        public boolean f() {
            return false;
        }

        @Override // defpackage.y200
        public String g() {
            return "-1";
        }

        @Override // defpackage.y200
        public ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__bank_transfer);
        }

        @Override // defpackage.y200
        public String i() {
            return "bank_transfer_tab";
        }

        @Override // defpackage.y200
        public String j() {
            return "bank-transfer";
        }

        @Override // defpackage.y200
        public boolean l() {
            return false;
        }

        @Override // defpackage.y200
        public /* bridge */ /* synthetic */ String m() {
            return null;
        }
    }

    public static final class b implements a300 {
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
                    iArr[CountryCodeName.NIGERIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public b(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final boolean a() {
            return kotlin.collections.a.c(CountryCodeName.NIGERIA).contains(this.a);
        }

        @Override // defpackage.y200
        public final String b() {
            return "card";
        }

        @Override // defpackage.a300
        public final boolean c() {
            return false;
        }

        @Override // defpackage.y200
        public final String d() {
            return null;
        }

        public final int e() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            int i = iArr[countryCodeName.ordinal()];
            if (i == 1) {
                c100 c100Var = c100.e;
                return 120;
            }
            if (i != 2) {
                throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethodDeposit.Card"));
            }
            c100 c100Var2 = c100.e;
            return 20;
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
                return "12";
            }
            if (i == 2) {
                return "4";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.Card"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__card);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "card";
        }

        @Override // defpackage.y200
        public final boolean l() {
            return kotlin.collections.a.c(CountryCodeName.GHANA).contains(this.a);
        }

        @Override // defpackage.y200
        public final String m() {
            return "card_deposit";
        }

        public final String toString() {
            return l4j0.a("Card(countryCode=", this.a, ")");
        }
    }

    public static final class c {

        public static final /* synthetic */ class a {
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
                    iArr[CountryCodeName.KENYA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CountryCodeName.TANZANIA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CountryCodeName.ZAMBIA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        public static List a(CountryCodeName countryCodeName) {
            int i = a.a[countryCodeName.ordinal()];
            if (i == 1) {
                return kotlin.collections.b.k(new f(countryCodeName), new i(countryCodeName), new b(countryCodeName));
            }
            if (i != 2) {
                return (i == 3 || i == 4 || i == 5) ? kotlin.collections.b.k(new f(countryCodeName), new i(countryCodeName)) : m2g.a;
            }
            return kotlin.collections.b.k(new b(countryCodeName), new e.a(countryCodeName), new e.b(countryCodeName), new e.c(countryCodeName), new a(countryCodeName), new d(countryCodeName), new h(countryCodeName), new g(countryCodeName));
        }
    }

    public static final class d implements a300 {
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
        public final boolean a() {
            return false;
        }

        @Override // defpackage.y200
        public final String b() {
            return "kuda";
        }

        @Override // defpackage.a300
        public final boolean c() {
            return false;
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
            return true;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            if (iArr[countryCodeName.ordinal()] == 1) {
                return "33";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.DedicatedDirectBankKuda"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__kuda__NG);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "kuda";
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
            return l4j0.a("DirectBankDedicatedKuda(countryCode=", this.a, ")");
        }
    }

    public interface e extends a300 {

        public static final class a implements e {
            public final CountryCodeName a;

            /* JADX INFO: renamed from: a300$e$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0007a {
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

            public a(CountryCodeName countryCodeName) {
                countryCodeName.getClass();
                this.a = countryCodeName;
            }

            @Override // defpackage.y200
            public final boolean a() {
                return true;
            }

            @Override // defpackage.y200
            public final String b() {
                return "opay";
            }

            @Override // defpackage.a300
            public final boolean c() {
                return false;
            }

            @Override // defpackage.y200
            public final String d() {
                return null;
            }

            @Override // a300.e
            public final int e() throws Exception {
                int[] iArr = C0007a.a;
                CountryCodeName countryCodeName = this.a;
                if (iArr[countryCodeName.ordinal()] != 1) {
                    throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethodDeposit.EWallet.OPay"));
                }
                c100 c100Var = c100.e;
                return 1203;
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
                int[] iArr = C0007a.a;
                CountryCodeName countryCodeName = this.a;
                if (iArr[countryCodeName.ordinal()] == 1) {
                    return "31";
                }
                throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.EWallet.OPay"));
            }

            @Override // defpackage.y200
            public final ResourceUiText h() {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.common_payment_providers__opay);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // defpackage.y200
            public final String j() {
                return "opay";
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
                return l4j0.a("OPay(countryCode=", this.a, ")");
            }
        }

        public static final class b implements e {
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

            public b(CountryCodeName countryCodeName) {
                countryCodeName.getClass();
                this.a = countryCodeName;
            }

            @Override // defpackage.y200
            public final boolean a() {
                return true;
            }

            @Override // defpackage.y200
            public final String b() {
                return "palmpay";
            }

            @Override // defpackage.a300
            public final boolean c() {
                return false;
            }

            @Override // defpackage.y200
            public final String d() {
                return null;
            }

            @Override // a300.e
            public final int e() throws Exception {
                int[] iArr = a.a;
                CountryCodeName countryCodeName = this.a;
                if (iArr[countryCodeName.ordinal()] != 1) {
                    throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethodDeposit.EWallet.PalmPay"));
                }
                c100 c100Var = c100.e;
                return 51;
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
                if (iArr[countryCodeName.ordinal()] == 1) {
                    return "32";
                }
                throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.EWallet.PalmPay"));
            }

            @Override // defpackage.y200
            public final ResourceUiText h() {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.common_payment_providers__palmpay__NG);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // defpackage.y200
            public final String j() {
                return "palmpay";
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
                return l4j0.a("PalmPay(countryCode=", this.a, ")");
            }
        }

        public static final class c implements e {
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

            public c(CountryCodeName countryCodeName) {
                countryCodeName.getClass();
                this.a = countryCodeName;
            }

            @Override // defpackage.y200
            public final boolean a() {
                return true;
            }

            @Override // defpackage.y200
            public final String b() {
                return "tenn";
            }

            @Override // defpackage.a300
            public final boolean c() {
                return false;
            }

            @Override // defpackage.y200
            public final String d() {
                return null;
            }

            @Override // a300.e
            public final int e() throws Exception {
                int[] iArr = a.a;
                CountryCodeName countryCodeName = this.a;
                if (iArr[countryCodeName.ordinal()] != 1) {
                    throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethod.Deposit.EWallet.TENN"));
                }
                c100 c100Var = c100.e;
                return 1204;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            @Override // defpackage.y200
            public final boolean f() {
                return true;
            }

            @Override // defpackage.y200
            public final String g() throws Exception {
                int[] iArr = a.a;
                CountryCodeName countryCodeName = this.a;
                if (iArr[countryCodeName.ordinal()] == 1) {
                    return BuildConfig.VERSION_CODE;
                }
                throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethod.Deposit.EWallet.TENN"));
            }

            @Override // defpackage.y200
            public final ResourceUiText h() {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.common_payment_providers__tenn__NG);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // defpackage.y200
            public final String j() {
                return "tenn";
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
                return l4j0.a("TENN(countryCode=", this.a, ")");
            }
        }

        int e();
    }

    public static final class f implements a300 {
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

        public f(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final boolean a() {
            return true;
        }

        @Override // defpackage.y200
        public final String b() {
            return "mobilemoney";
        }

        @Override // defpackage.a300
        public final boolean c() {
            return true;
        }

        @Override // defpackage.y200
        public final String d() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
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
                return "9";
            }
            if (i == 2) {
                return "18";
            }
            if (i == 3) {
                return CashoutMetricsPayload.Metric.KeyValueMap.INACTIVE_OUTCOME;
            }
            if (i == 4) {
                return "1";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.Momo"));
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
                    throw new Exception(l4j0.a("`phoneChannelSource` undefine for ", countryCodeName, " in PayMethodDeposit.Momo"));
                }
            }
            return x300.b;
        }

        public final String toString() {
            return l4j0.a("Momo(countryCode=", this.a, ")");
        }
    }

    public static final class g implements a300 {
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

        public g(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final boolean a() {
            return false;
        }

        @Override // defpackage.y200
        public final String b() {
            return "other-banks";
        }

        @Override // defpackage.a300
        public final boolean c() {
            return false;
        }

        @Override // defpackage.y200
        public final String d() {
            return null;
        }

        public final int e() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            if (iArr[countryCodeName.ordinal()] != 1) {
                throw new Exception(l4j0.a("`payChId` undefine for ", countryCodeName, " in PayMethodDeposit.OtherBanks"));
            }
            c100 c100Var = c100.e;
            return 21;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        @Override // defpackage.y200
        public final boolean f() {
            return true;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            if (iArr[countryCodeName.ordinal()] == 1) {
                return "5";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.OtherBanks"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__other_banks);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "other-banks";
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
            return l4j0.a("OtherBanks(countryCode=", this.a, ")");
        }
    }

    public static final class h implements a300 {
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

        public h(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final boolean a() {
            return false;
        }

        @Override // defpackage.y200
        public final String b() {
            return "others";
        }

        @Override // defpackage.a300
        public final boolean c() {
            return false;
        }

        @Override // defpackage.y200
        public final String d() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        @Override // defpackage.y200
        public final boolean f() {
            return true;
        }

        @Override // defpackage.y200
        public final String g() throws Exception {
            int[] iArr = a.a;
            CountryCodeName countryCodeName = this.a;
            if (iArr[countryCodeName.ordinal()] == 1) {
                return "34";
            }
            throw new Exception(l4j0.a("`methodId` undefine for ", countryCodeName, " in PayMethodDeposit.Others"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__others);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "others";
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
            return l4j0.a("Others(countryCode=", this.a, ")");
        }
    }

    public static final class i implements a300 {
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

        public i(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        @Override // defpackage.y200
        public final boolean a() {
            return false;
        }

        @Override // defpackage.y200
        public final String b() {
            return "paybill";
        }

        @Override // defpackage.a300
        public final boolean c() {
            return false;
        }

        @Override // defpackage.y200
        public final String d() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
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
                return "11";
            }
            if (i == 2) {
                return "19";
            }
            if (i == 3) {
                return "16";
            }
            if (i == 4) {
                return "2";
            }
            throw new Exception(l4j0.a("`boAlertContentMethodId` undefine for ", countryCodeName, " in PayMethodDeposit.Paybill"));
        }

        @Override // defpackage.y200
        public final ResourceUiText h() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__paybill);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.y200
        public final String j() {
            return "paybill";
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
            return l4j0.a("Paybill(countryCode=", this.a, ")");
        }
    }

    boolean c();
}
