package defpackage;

import android.os.Parcelable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.international.data.model.INTRegisterResendResponse;
import com.sportybet.android.account.international.data.model.RegistrationStatusCode;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import com.sportybet.android.account.international.data.model.UserPreferenceRequest;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llqr;", "Lavw;", "Ljqr;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lqr extends avw<jqr> {
    public final gb50 A;
    public final vu60 B;
    public final vce0 C;
    public final rdd0 D;
    public final psm E;
    public final mpe0 F;
    public boolean G;
    public jvd0 H;
    public jvd0 I;
    public final azm e;
    public final le50 f;
    public final jsp i;
    public final b6k v;
    public final n0g w;
    public final dt00 y;
    public final zck z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RegistrationStatusCode.values().length];
            try {
                iArr[RegistrationStatusCode.UNREGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegistrationStatusCode.EMAIL_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegistrationStatusCode.PENDING_EMAIL_VERIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RegistrationStatusCode.PENDING_PHONE_VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RegistrationStatusCode.PENDING_FACIAL_RECOGNITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RegistrationStatusCode.EMAIL_REGISTERED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RegistrationStatusCode.CPF_REGISTERED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RegistrationStatusCode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailViewModel$handleBizCodeError$5", f = "LatamSignUpEmailViewModel.kt", l = {481}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ b6k.a.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b6k.a.b bVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return lqr.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = lqr.this.c;
                rb90 rb90Var = new rb90(this.c.a);
                this.a = 1;
                if (b390Var.emit(rb90Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a(lTGEJfVytU.ofy);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailViewModel$onEmailChanged$2", f = "LatamSignUpEmailViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ijf0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ijf0 ijf0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = ijf0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return lqr.this.new c(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            lqr lqrVar = lqr.this;
            wwd0 wwd0Var = lqrVar.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                n0g n0gVar = lqrVar.w;
                String str = this.c.a.b;
                this.a = 1;
                objB = n0gVar.b(str, this);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objB = obj;
            }
            UiText uiText = (UiText) objB;
            if (uiText != null) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, jqr.a((jqr) value2, null, null, uiText, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, false, false, 16777207)));
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, false, false, 12582911)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailViewModel$onKycDocChanged$2", f = "LatamSignUpEmailViewModel.kt", l = {209}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ijf0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ijf0 ijf0Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = ijf0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return lqr.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object value;
            lqr lqrVar = lqr.this;
            wwd0 wwd0Var = lqrVar.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                isp ispVar = (isp) lqrVar.F.getValue();
                String str = this.c.a.b;
                Long l = ((jqr) wwd0Var.getValue()).n;
                this.a = 1;
                objA = ispVar.a(str, true, l, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = obj;
            }
            UiText uiText = (UiText) objA;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, uiText, false, false, false, false, false, false, false, false, 12550143)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqr(azm azmVar, le50 le50Var, jsp jspVar, b6k b6kVar, n0g n0gVar, dt00 dt00Var, zck zckVar, gb50 gb50Var, vu60 vu60Var, vce0 vce0Var, rdd0 rdd0Var, psm psmVar) {
        super(new jqr(new dwz(63), 16777151));
        azmVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        psmVar.getClass();
        this.e = azmVar;
        this.f = le50Var;
        this.i = jspVar;
        this.v = b6kVar;
        this.w = n0gVar;
        this.y = dt00Var;
        this.z = zckVar;
        this.A = gb50Var;
        this.B = vu60Var;
        this.C = vce0Var;
        this.D = rdd0Var;
        this.E = psmVar;
        this.F = hwr.b(new kqr(this, 0));
        rdd0Var.a(new ts40.f0(psmVar.getCountryCode().getCode()), k00.c);
    }

    public final nor A1() {
        return this.E.W() ? nor.a.a : nor.c.a;
    }

    public final void B1(UiText uiText, Integer num) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        this.v.getClass();
        b6k.a aVarA = b6k.a(uiText, num);
        boolean z = aVarA instanceof b6k.a.c;
        wwd0 wwd0Var = this.a;
        if (z) {
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, jqr.a((jqr) value4, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, ((b6k.a.c) aVarA).a, false, false, false, false, false, false, false, false, 16744447)));
            return;
        }
        if (aVarA instanceof b6k.a.C0111a) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, jqr.a((jqr) value3, null, null, ((b6k.a.C0111a) aVarA).a, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, false, false, 16777207)));
            return;
        }
        if (aVarA instanceof b6k.a.d) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, jqr.a((jqr) value2, null, null, null, null, ((b6k.a.d) aVarA).a, null, null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, false, false, 16777183)));
        } else if (aVarA instanceof b6k.a.e) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, ((b6k.a.e) aVarA).a, null, 0, null, null, null, false, false, false, false, false, false, false, false, 16776191)));
        } else if (aVarA instanceof b6k.a.b) {
            ej5.c(o8i0.d(this), null, null, new b((b6k.a.b) aVarA, null), 3);
        } else {
            uhc.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object C1(x1b x1bVar) {
        mqr mqrVar;
        if (x1bVar instanceof mqr) {
            mqrVar = (mqr) x1bVar;
            int i = mqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqrVar.c = i - Integer.MIN_VALUE;
            } else {
                mqrVar = new mqr(this, x1bVar);
            }
        } else {
            mqrVar = new mqr(this, x1bVar);
        }
        Object objA = mqrVar.a;
        Object obj = y5b.a;
        int i2 = mqrVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            v340 v340Var = this.b;
            String str = ((jqr) v340Var.a.getValue()).c.a.b;
            String str2 = ((jqr) v340Var.a.getValue()).o.a.b;
            String str3 = ((jqr) v340Var.a.getValue()).e.a.b;
            mqrVar.c = 1;
            zck zckVar = this.z;
            objA = s0i.a(new sl50(bm50.b(zckVar.a.e(str, str2, zckVar.b.a(str3)), vch0.b)), mqrVar);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        lk50 lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            RegistrationStatusResponse registrationStatusResponse = (RegistrationStatusResponse) ((lk50.c) lk50Var).a;
            mqrVar.c = 2;
            Object objE1 = E1(registrationStatusResponse, mqrVar);
            return objE1 == obj ? obj : objE1;
        }
        if (lk50Var instanceof lk50.a) {
            lk50.a aVar = (lk50.a) lk50Var;
            Throwable th = aVar.a;
            SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
            B1(aVar.b, sprThrowable != null ? new Integer(sprThrowable.getD()) : null);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object D1(x1b x1bVar) {
        nqr nqrVar;
        if (x1bVar instanceof nqr) {
            nqrVar = (nqr) x1bVar;
            int i = nqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqrVar.c = i - Integer.MIN_VALUE;
            } else {
                nqrVar = new nqr(this, x1bVar);
            }
        } else {
            nqrVar = new nqr(this, x1bVar);
        }
        nqr nqrVar2 = nqrVar;
        Object objB = nqrVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = nqrVar2.c;
        wwd0 wwd0Var = this.a;
        if (i2 == 0) {
            uj50.b(objB);
            String strP = A1().g() ? this.E.P() : null;
            String str = A1().g() ? ((jqr) wwd0Var.getValue()).j.a.b : null;
            String str2 = ((jqr) wwd0Var.getValue()).c.a.b;
            String str3 = ((jqr) wwd0Var.getValue()).e.a.b;
            xnu xnuVar = new xnu();
            Long l = ((jqr) wwd0Var.getValue()).n;
            l.getClass();
            Date date = new Date(l.longValue());
            Locale locale = Locale.US;
            locale.getClass();
            xnuVar.put("R0002", bwf0.l(date, "yyyy-MM-dd", locale, 0, 0));
            if (A1().a() != null) {
                xnuVar.put("R0001", new htp(((jqr) wwd0Var.getValue()).h.a.b, ((jqr) wwd0Var.getValue()).i.a.b));
            }
            Unit unit = Unit.a;
            xnu xnuVarC = xnuVar.c();
            xnu xnuVar2 = new xnu();
            if (!((jqr) wwd0Var.getValue()).v) {
                xnuVar2.put(UserPreferenceRequest.Key.MARKETING_PROMOTIONS.getKeyName(), String.valueOf(((jqr) wwd0Var.getValue()).v));
            }
            xnu xnuVarC2 = xnuVar2.c();
            nqrVar2.c = 1;
            objB = vce0.b(this.C, str2, str3, strP, str, xnuVarC, xnuVarC2, null, nqrVar2, 64);
            if (objB != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objB);
                return objB;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objB);
        vce0.a aVar = (vce0.a) objB;
        if (aVar instanceof vce0.a.b) {
            vqr.e eVar = new vqr.e(((jqr) wwd0Var.getValue()).c.a.b, ((vce0.a.b) aVar).a.getToken(), null);
            nqrVar2.c = 2;
            Object objEmit = this.c.emit(eVar, nqrVar2);
            return objEmit == y5bVar ? y5bVar : objEmit;
        }
        if (!(aVar instanceof vce0.a.C1208a)) {
            uhc.a();
            return null;
        }
        vce0.a.C1208a c1208a = (vce0.a.C1208a) aVar;
        Throwable th = c1208a.a;
        SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
        B1(c1208a.b, sprThrowable != null ? new Integer(sprThrowable.getD()) : null);
        return Unit.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object E1(RegistrationStatusResponse registrationStatusResponse, x1b x1bVar) {
        Object value;
        Object value2;
        int i = a.a[registrationStatusResponse.getStatusCode().ordinal()];
        b390 b390Var = this.c;
        wwd0 wwd0Var = this.a;
        switch (i) {
            case 1:
                ts40.n nVar = ts40.n.a;
                k00[] k00VarArr = {k00.a};
                rdd0 rdd0Var = this.D;
                rdd0Var.a(nVar, k00VarArr);
                rdd0Var.a(ts40.m.a, k00.b);
                return F1(registrationStatusResponse, x1bVar);
            case 2:
                return F1(registrationStatusResponse, x1bVar);
            case 3:
                return J1(x1bVar);
            case 4:
            case 5:
                String phone = registrationStatusResponse.getPhone();
                String phoneCountryCode = registrationStatusResponse.getPhoneCountryCode();
                String str = ((jqr) wwd0Var.getValue()).c.a.b;
                String str2 = ((jqr) wwd0Var.getValue()).o.a.b;
                if (phone == null) {
                    phone = "";
                }
                if (phoneCountryCode == null) {
                    phoneCountryCode = "";
                }
                return b390Var.emit(new vqr.d(str, str2, phone, phoneCountryCode), x1bVar);
            case 6:
                do {
                    value = wwd0Var.getValue();
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, new ResourceUiText(R.string.register_login_int__error_create_account_11612_11614_12001), null, null, null, null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, false, false, 16777207)));
                return Unit.a;
            case 7:
                do {
                    value2 = wwd0Var.getValue();
                    StringUiText stringUiText2 = vch0.a;
                } while (!wwd0Var.g(value2, jqr.a((jqr) value2, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, new ResourceUiText(R.string.register_login_int__cpf_is_not_valid_or_already_used_error_message), false, false, false, false, false, false, false, false, 16744447)));
                return Unit.a;
            case 8:
                StringUiText stringUiText3 = vch0.a;
                return b390Var.emit(new rb90(new ResourceUiText(R.string.common_feedback__sorry_something_went_wrong)), x1bVar);
            default:
                uhc.a();
                return null;
        }
    }

    public final Object F1(RegistrationStatusResponse registrationStatusResponse, x1b x1bVar) {
        wwd0 wwd0Var = this.a;
        String str = ((jqr) wwd0Var.getValue()).c.a.b;
        String str2 = ((jqr) wwd0Var.getValue()).o.a.b;
        String str3 = ((jqr) wwd0Var.getValue()).e.a.b;
        String fullName = registrationStatusResponse.getFullName();
        Long dateOfBirth = registrationStatusResponse.getDateOfBirth();
        String strO = dateOfBirth != null ? bwf0.o((6 & 4) != 0 ? 0 : 1, dateOfBirth.longValue(), false) : null;
        String str4 = strO == null ? "" : strO;
        String zipcode = registrationStatusResponse.getZipcode();
        String str5 = zipcode == null ? "" : zipcode;
        String street = registrationStatusResponse.getStreet();
        String str6 = street == null ? "" : street;
        String city = registrationStatusResponse.getCity();
        String str7 = city == null ? "" : city;
        String state = registrationStatusResponse.getState();
        return this.c.emit(new vqr.c(str, str2, str3, fullName, str4, str5, str6, str7, state == null ? "" : state), x1bVar);
    }

    public final void G1(ijf0 ijf0Var) {
        lqr lqrVar = this;
        String str = ijf0Var.a.b;
        lqrVar.w.getClass();
        str.getClass();
        if (StringsKt.M(str, " ", false)) {
            return;
        }
        while (true) {
            wwd0 wwd0Var = lqrVar.a;
            Object value = wwd0Var.getValue();
            if (wwd0Var.g(value, jqr.a((jqr) value, null, ijf0Var, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, true, false, 12582899))) {
                break;
            } else {
                lqrVar = this;
            }
        }
        jvd0 jvd0Var = this.H;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.H = ej5.c(o8i0.d(this), null, null, new c(ijf0Var, null), 3);
    }

    public final void H1(ijf0 ijf0Var) {
        wwd0 wwd0Var;
        Object value;
        String upperCase;
        isp ispVar = (isp) this.F.getValue();
        nk0 nk0Var = ijf0Var.a;
        if (ispVar.b(nk0Var.b)) {
            do {
                wwd0Var = this.a;
                value = wwd0Var.getValue();
                upperCase = nk0Var.b.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, null, null, 0, null, ijf0.b(ijf0Var, upperCase, 0L, 6), null, false, false, false, false, false, false, true, false, 12533759)));
            jvd0 jvd0Var = this.I;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.I = ej5.c(o8i0.d(this), null, null, new d(ijf0Var, null), 3);
        }
    }

    public final void I1(ijf0 ijf0Var) {
        wwd0 wwd0Var;
        Object value;
        String str;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            str = ijf0Var.a.b;
            this.f.getClass();
        } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, ijf0Var, null, le50.a(str), null, null, null, null, null, 0, null, null, null, false, false, false, false, false, false, false, false, 16777103)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object J1(x1b x1bVar) {
        tqr tqrVar;
        UiText resourceUiText;
        if (x1bVar instanceof tqr) {
            tqrVar = (tqr) x1bVar;
            int i = tqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqrVar.c = i - Integer.MIN_VALUE;
            } else {
                tqrVar = new tqr(this, x1bVar);
            }
        } else {
            tqrVar = new tqr(this, x1bVar);
        }
        Object objA = tqrVar.a;
        y5b y5bVar = y5b.a;
        int i2 = tqrVar.c;
        wwd0 wwd0Var = this.a;
        if (i2 == 0) {
            uj50.b(objA);
            final String str = ((jqr) wwd0Var.getValue()).c.a.b;
            et7 et7VarD = o8i0.d(this);
            tqrVar.c = 1;
            final gb50 gb50Var = this.A;
            objA = s0i.a(new yzh(new eb50(ozh.c(gb50Var.a.a(j6c.INT_REGISTER, new CaptchaData.Email(str), et7VarD, new Function1() { // from class: db50
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                    captchaHeader.getClass();
                    return gb50Var.b.a(str, captchaHeader);
                }
            }), gb50Var.c)), new fb50(3, null)), tqrVar);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objA);
                return objA;
            }
            if (i2 == 3) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        lk50 lk50Var = (lk50) objA;
        boolean z = lk50Var instanceof lk50.c;
        b390 b390Var = this.c;
        if (z) {
            vqr.e eVar = new vqr.e(((jqr) wwd0Var.getValue()).c.a.b, ((INTRegisterResendResponse) ((lk50.c) lk50Var).a).getData().getToken(), ((jqr) wwd0Var.getValue()).o.a.b);
            tqrVar.c = 2;
            Object objEmit = b390Var.emit(eVar, tqrVar);
            if (objEmit != y5bVar) {
                return objEmit;
            }
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                if (lk50Var instanceof lk50.b) {
                    return Unit.a;
                }
                uhc.a();
                return null;
            }
            String message = ((lk50.a) lk50Var).a.getMessage();
            if (message != null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new StringUiText(message);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again);
            }
            rb90 rb90Var = new rb90(resourceUiText);
            tqrVar.c = 3;
            Object objEmit2 = b390Var.emit(rb90Var, tqrVar);
            if (objEmit2 != y5bVar) {
                return objEmit2;
            }
        }
        return y5bVar;
    }

    public final xor z1() {
        RegistrationStatusResponse registrationStatusResponse;
        String str;
        int i = xor.d;
        vu60 vu60Var = this.B;
        vu60Var.getClass();
        if (!vu60Var.a(AnalyticsParam.EVENT_STATUS)) {
            registrationStatusResponse = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(RegistrationStatusResponse.class) && !Serializable.class.isAssignableFrom(RegistrationStatusResponse.class)) {
                zkh.a(RegistrationStatusResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            registrationStatusResponse = (RegistrationStatusResponse) vu60Var.b(AnalyticsParam.EVENT_STATUS);
        }
        String str2 = "";
        if (vu60Var.a("email")) {
            str = (String) vu60Var.b("email");
            if (str == null) {
                hb5.a("Argument \"email\" is marked as non-null but was passed a null value");
                return null;
            }
        } else {
            str = "";
        }
        if (!vu60Var.a("password") || (str2 = (String) vu60Var.b("password")) != null) {
            return new xor(registrationStatusResponse, str, str2);
        }
        hb5.a("Argument \"password\" is marked as non-null but was passed a null value");
        return null;
    }
}
