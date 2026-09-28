package defpackage;

import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.kyc.phonemigration.MigratePhoneBody;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.platform.features.kyc.domain.phonemigrate.PhoneMigrateEvent;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldk;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dk extends j8i0 {
    public final v340 A;
    public String B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final ku90<m480.h> G;
    public final ku90 H;
    public final ku90<BindNewPhoneResult> I;
    public final ku90 J;
    public final lyz a;
    public final psm b;
    public final com.sporty.android.platform.features.newotp.util.a c;
    public final rdd0 d;
    public PhoneMigrateParams e;
    public bag f;
    public final LinkedHashMap i;
    public final ku90<com.sporty.android.common.uievent.a> v;
    public final ku90 w;
    public final ku90<PhoneMigrateEvent> y;
    public final t340 z;

    @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$1", f = "AddNewMobileNumberViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dk.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                lyh lyhVarA = dk.this.a.a(new pu0.a(0));
                this.a = 1;
                if (bm50.p(lyhVarA, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.CAMEROON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$handleVerifyNameMatchError$1", f = "AddNewMobileNumberViewModel.kt", l = {322}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dk.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            dk dkVar = dk.this;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sporty.android.common.uievent.a> ku90Var = dkVar.v;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__name_mismatch_error);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__mobile_name_mismatch_tip_vphone_vname, ay0.S(new Object[]{oxc.a(dkVar.b.M(), " ", vtu.a(dkVar.e.getKycFailedUserPhone())), dkVar.A.a.getValue()}));
                this.a = 1;
                obj = com.sporty.android.common.uievent.b.g(ku90Var, resourceUiText, resourceUiText2, null, null, null, null, this, 508);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((CustomAlertDialogCallbackType) obj) instanceof CustomAlertDialogCallbackType.Positive) {
                dkVar.y.a(PhoneMigrateEvent.Dismiss.a);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$handleVerifyNameMatchError$2", f = "AddNewMobileNumberViewModel.kt", l = {342}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dk.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            dk dkVar = dk.this;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sporty.android.common.uievent.a> ku90Var = dkVar.v;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__unable_to_add_number);
                ConcatUiText concatUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_payment__unable_to_add_mobile_number_with_provider_tip), new ResourceUiText(R.string.app_common__blank_space), new ResourceUiText(R.string.common_functions__customer_service), new StringUiText(".")});
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__customer_service);
                this.a = 1;
                obj = com.sporty.android.common.uievent.b.g(ku90Var, resourceUiText, concatUiText, resourceUiText2, null, null, null, this, 500);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            CustomAlertDialogCallbackType customAlertDialogCallbackType = (CustomAlertDialogCallbackType) obj;
            if (Intrinsics.g(customAlertDialogCallbackType, CustomAlertDialogCallbackType.HyperlinkInMessage.a)) {
                com.sporty.android.common.uievent.b.c(dkVar.v, snb0.HELP);
            } else if (customAlertDialogCallbackType instanceof CustomAlertDialogCallbackType.Positive) {
                dkVar.y.a(PhoneMigrateEvent.Dismiss.a);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$handleVerifyNameMatchError$3", f = "AddNewMobileNumberViewModel.kt", l = {362}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ us00 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(us00 us00Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = us00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dk.this.new e(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            dk dkVar = dk.this;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sporty.android.common.uievent.a> ku90Var = dkVar.v;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__deposit_balance_transfer_failed);
                String str = ((us00.d) this.c).a;
                UiText stringUiText2 = str != null ? new StringUiText(str) : vch0.b;
                this.a = 1;
                obj = com.sporty.android.common.uievent.b.g(ku90Var, resourceUiText, stringUiText2, null, null, null, null, this, 508);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((CustomAlertDialogCallbackType) obj) instanceof CustomAlertDialogCallbackType.Positive) {
                dkVar.y.a(PhoneMigrateEvent.DepositTransferSuccess.a);
            }
            return Unit.a;
        }
    }

    public static final class f implements lyh<String> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$special$$inlined$map$1", f = "AddNewMobileNumberViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$special$$inlined$map$1$2", f = "AddNewMobileNumberViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    AccountInfo accountInfo = (AccountInfo) obj;
                    String strA = oxc.a(accountInfo.getFirstName(), " ", accountInfo.getLastName());
                    aVar.b = 1;
                    if (this.a.emit(strA, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public f(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public dk(lyz lyzVar, psm psmVar, com.sporty.android.platform.features.newotp.util.a aVar, rdd0 rdd0Var) {
        lyzVar.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.a = lyzVar;
        this.b = psmVar;
        this.c = aVar;
        this.d = rdd0Var;
        this.e = new PhoneMigrateParams(false, false, false, false, null, null, null, null, 255, null);
        this.i = new LinkedHashMap();
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = ku90Var;
        ku90<PhoneMigrateEvent> ku90Var2 = new ku90<>();
        this.y = ku90Var2;
        this.z = e1i.a(ku90Var2);
        this.A = e1i.e(new f(bm50.f(lyzVar.a(pu0.b.a))), o8i0.d(this), q490.a.a, "--");
        wwd0 wwd0VarA = xwd0.a(new bk.a(""));
        this.C = wwd0VarA;
        this.D = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(tzs.a.a);
        this.E = wwd0VarA2;
        this.F = wwd0VarA2;
        ku90<m480.h> ku90Var3 = new ku90<>();
        this.G = ku90Var3;
        this.H = ku90Var3;
        ku90<BindNewPhoneResult> ku90Var4 = new ku90<>();
        this.I = ku90Var4;
        this.J = ku90Var4;
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void A1(us00 us00Var) {
        if ((us00Var instanceof us00.c) || (us00Var instanceof us00.b)) {
            ej5.c(o8i0.d(this), null, null, new c(null), 3);
            return;
        }
        if (us00Var instanceof us00.a) {
            ej5.c(o8i0.d(this), null, null, new d(null), 3);
            return;
        }
        if (us00Var instanceof us00.d) {
            ej5.c(o8i0.d(this), null, null, new e(us00Var, null), 3);
            return;
        }
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__unable_to_add_number);
        String strA = us00Var.a();
        com.sporty.android.common.uievent.b.e(this.v, resourceUiText, null, strA != null ? new StringUiText(strA) : vch0.b, null, null, null, null, 506);
        Unit unit = Unit.a;
    }

    public final void x1(PhoneMigrateParams phoneMigrateParams) {
        if (phoneMigrateParams == null) {
            return;
        }
        String passwordVerifyToken = phoneMigrateParams.getPasswordVerifyToken();
        LinkedHashMap linkedHashMap = this.i;
        this.y.a(new PhoneMigrateEvent.MigratePhone(new MigratePhoneBody((String) linkedHashMap.get("main_account_token"), (String) linkedHashMap.get("name_matched_verify_token"), passwordVerifyToken, (String) linkedHashMap.get("sub_account_token"))));
    }

    public final void y1(PhoneMigrateParams phoneMigrateParams) {
        this.y.a(new PhoneMigrateEvent.LaunchSubsidiaryOTP(z1(phoneMigrateParams.getKycFailedUserPhone(), this.b.P(), phoneMigrateParams.getPasswordVerifyToken(), false)));
    }

    public final OtpModule z1(String str, String str2, String str3, boolean z) {
        this.c.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new OtpModule(new OtpData.PhoneMigration(str, str2, j6c.MigratePhone, str3, z, OTPResult.NoResult.a), new OtpViewModelClasses(as00.class, ls00.class, ts00.class, hs00.class, qs00.class, xr00.class));
    }
}
