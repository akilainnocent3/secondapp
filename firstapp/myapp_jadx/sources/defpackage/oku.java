package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Loku;", "Lihb0;", "Li8;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oku extends ihb0 implements i8 {
    public final k650 A;
    public final odd B;
    public final lyz C;
    public final psm D;
    public final c0n E;
    public final jmr F;
    public final x890 G;
    public final mjf H;
    public final lfb0 I;
    public final qi7 J;
    public final grm K;
    public final bd40 L;
    public final ae40 M;
    public final dzg0 N;
    public final ich O;
    public final oge0 P;
    public final hek Q;
    public final sfy R;
    public final rdd0 S;
    public final JsonSerializeService T;
    public final uti U;
    public final oak0 V;
    public final a3k0 W;
    public final yqm X;
    public final v5b Y;
    public boolean Z;
    public final wwd0 a0;
    public final r5b b0;
    public final vu90<Boolean> c0;
    public final fe6 d;
    public final vu90 d0;
    public final u2u e;
    public jvd0 e0;
    public final jgk f;
    public final vu90<ub90> f0;
    public final vu90<Boolean> g0;
    public final vu90 h0;
    public final m2l i;
    public jvd0 i0;
    public final vu90<vak0> j0;
    public final vu90 k0;
    public final vu90<js40> l0;
    public final vu90 m0;
    public final wwd0 n0;
    public final v340 o0;
    public final wwd0 p0;
    public final v340 q0;
    public final r5b r0;
    public final uqm v;
    public final mgb0 w;
    public final lq1 y;
    public final rie0 z;

    @c0d(c = "com.sportybet.android.home.MainViewModel$checkZARegisterStatus$1", f = "MainViewModel.kt", l = {442, 451, 456, 457, 486, 487, 492, 524, 581, 608, 635}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public boolean a;
        public boolean b;
        public oku c;
        public String d;
        public Object e;
        public String f;
        public String i;
        public int v;
        public int w;
        public int y;
        public int z;

        /* JADX INFO: renamed from: oku$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.home.MainViewModel$checkZARegisterStatus$1$1$regSuccessSheetVariant$1", f = "MainViewModel.kt", l = {497}, m = "invokeSuspend", v = 2)
        public static final class C0945a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends js40>>, Object> {
            public int a;
            public final /* synthetic */ oku b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0945a(v1b v1bVar, oku okuVar) {
                super(2, v1bVar);
                this.b = okuVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0945a(v1bVar, this.b);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends js40>> v1bVar) {
                return ((C0945a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                sl50 sl50Var = new sl50(this.b.X.j(z76.n));
                this.a = 1;
                Object objA = s0i.a(sl50Var, this);
                return objA == y5bVar ? y5bVar : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.B = str;
            this.C = str2;
            this.D = str3;
            this.E = str4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return oku.this.new a(this.B, this.C, this.D, this.E, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:106:0x03f1  */
        /* JADX WARN: Code duplicated, block: B:110:0x0424  */
        /* JADX WARN: Code duplicated, block: B:113:0x042d  */
        /* JADX WARN: Code duplicated, block: B:115:0x0432  */
        /* JADX WARN: Code duplicated, block: B:117:0x0438  */
        /* JADX WARN: Code duplicated, block: B:120:0x043e  */
        /* JADX WARN: Code duplicated, block: B:122:0x0456  */
        /* JADX WARN: Code duplicated, block: B:123:0x0458  */
        /* JADX WARN: Code duplicated, block: B:125:0x0462  */
        /* JADX WARN: Code duplicated, block: B:127:0x048c  */
        /* JADX WARN: Code duplicated, block: B:130:0x0491  */
        /* JADX WARN: Code duplicated, block: B:23:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:26:0x010c A[PHI: r2 r7
          0x010c: PHI (r2v9 boolean) = (r2v7 boolean), (r2v11 boolean) binds: [B:24:0x0108, B:16:0x00ca] A[DONT_GENERATE, DONT_INLINE]
          0x010c: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v11 java.lang.Object) binds: [B:24:0x0108, B:16:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x011c  */
        /* JADX WARN: Code duplicated, block: B:31:0x013e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0166  */
        /* JADX WARN: Code duplicated, block: B:38:0x016f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0173  */
        /* JADX WARN: Code duplicated, block: B:42:0x0177  */
        /* JADX WARN: Code duplicated, block: B:44:0x017c  */
        /* JADX WARN: Code duplicated, block: B:47:0x019c  */
        /* JADX WARN: Code duplicated, block: B:50:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:52:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:55:0x0217  */
        /* JADX WARN: Code duplicated, block: B:58:0x0220  */
        /* JADX WARN: Code duplicated, block: B:60:0x0272  */
        /* JADX WARN: Code duplicated, block: B:63:0x0292  */
        /* JADX WARN: Code duplicated, block: B:66:0x029b  */
        /* JADX WARN: Code duplicated, block: B:68:0x02ed  */
        /* JADX WARN: Code duplicated, block: B:71:0x030b  */
        /* JADX WARN: Code duplicated, block: B:73:0x0311  */
        /* JADX WARN: Code duplicated, block: B:75:0x0321  */
        /* JADX WARN: Code duplicated, block: B:78:0x0328  */
        /* JADX WARN: Code duplicated, block: B:79:0x032c  */
        /* JADX WARN: Code duplicated, block: B:82:0x0338  */
        /* JADX WARN: Code duplicated, block: B:83:0x033c  */
        /* JADX WARN: Code duplicated, block: B:85:0x0375  */
        /* JADX WARN: Code duplicated, block: B:87:0x0385  */
        /* JADX WARN: Code duplicated, block: B:88:0x0387  */
        /* JADX WARN: Code duplicated, block: B:91:0x038e  */
        /* JADX WARN: Code duplicated, block: B:93:0x039f  */
        /* JADX WARN: Code duplicated, block: B:96:0x03a8  */
        /* JADX WARN: Code duplicated, block: B:98:0x03ab  */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x03e6, code lost:
        
            if (r11 == r1) goto L109;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 1220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oku.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oku(fe6 fe6Var, u2u u2uVar, jgk jgkVar, m2l m2lVar, alk alkVar, uqm uqmVar, mgb0 mgb0Var, lq1 lq1Var, rie0 rie0Var, k650 k650Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, lyz lyzVar, psm psmVar, c0n c0nVar, jmr jmrVar, x890 x890Var, ww2 ww2Var, mjf mjfVar, l580 l580Var, lfb0 lfb0Var, qi7 qi7Var, grm grmVar, bd40 bd40Var, ae40 ae40Var, dzg0 dzg0Var, ich ichVar, oge0 oge0Var, hek hekVar, sfy sfyVar, rdd0 rdd0Var, JsonSerializeService jsonSerializeService, uti utiVar, oak0 oak0Var, a3k0 a3k0Var, yqm yqmVar, @ApplicationScope v5b v5bVar) {
        super(0);
        fe6Var.getClass();
        jgkVar.getClass();
        m2lVar.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        lq1Var.getClass();
        rie0Var.getClass();
        k650Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        c0nVar.getClass();
        jmrVar.getClass();
        ww2Var.getClass();
        mjfVar.getClass();
        l580Var.getClass();
        lfb0Var.getClass();
        qi7Var.getClass();
        grmVar.getClass();
        bd40Var.getClass();
        ichVar.getClass();
        sfyVar.getClass();
        rdd0Var.getClass();
        jsonSerializeService.getClass();
        oak0Var.getClass();
        a3k0Var.getClass();
        yqmVar.getClass();
        v5bVar.getClass();
        this.d = fe6Var;
        this.e = u2uVar;
        this.f = jgkVar;
        this.i = m2lVar;
        this.v = uqmVar;
        this.w = mgb0Var;
        this.y = lq1Var;
        this.z = rie0Var;
        this.A = k650Var;
        this.B = oddVar;
        this.C = lyzVar;
        this.D = psmVar;
        this.E = c0nVar;
        this.F = jmrVar;
        this.G = x890Var;
        this.H = mjfVar;
        this.I = lfb0Var;
        this.J = qi7Var;
        this.K = grmVar;
        this.L = bd40Var;
        this.M = ae40Var;
        this.N = dzg0Var;
        this.O = ichVar;
        this.P = oge0Var;
        this.Q = hekVar;
        this.R = sfyVar;
        this.S = rdd0Var;
        this.T = jsonSerializeService;
        this.U = utiVar;
        this.V = oak0Var;
        this.W = a3k0Var;
        this.X = yqmVar;
        this.Y = v5bVar;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.a0 = wwd0VarA;
        m2l m2lVar2 = jgkVar.c;
        m2lVar2.getClass();
        n1i n1iVar = new n1i(new n1i(m2lVar2.a.getBooleanByFlow("notification_center_any_unread", false), (zed.d0) m2lVar2.getStringByFlow("key_loyalty_unread", ""), new ggk(jgkVar, null)), wwd0VarA, new glu(3, null));
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.b0 = i2i.c(e1i.e(n1iVar, et7VarD, kwd0Var, bool), null, 3);
        vu90<Boolean> vu90Var = new vu90<>();
        this.c0 = vu90Var;
        this.d0 = vu90Var;
        this.f0 = new vu90<>();
        vu90<Boolean> vu90Var2 = new vu90<>();
        this.g0 = vu90Var2;
        this.h0 = vu90Var2;
        vu90<vak0> vu90Var3 = new vu90<>();
        this.j0 = vu90Var3;
        this.k0 = vu90Var3;
        vu90<js40> vu90Var4 = new vu90<>();
        this.l0 = vu90Var4;
        this.m0 = vu90Var4;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.valueOf(uqmVar.getAccount() != null));
        this.n0 = wwd0VarA2;
        this.o0 = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(Float.valueOf(0.0f));
        this.p0 = wwd0VarA3;
        this.q0 = e1i.b(wwd0VarA3);
        this.r0 = i2i.c(e1i.e(l580Var.a(), o8i0.d(this), kwd0Var, null), null, 3);
        or60 or60Var = new or60(new xkk(alkVar, null));
        pfd pfdVar = fse.a;
        kzh.d(ozh.c(or60Var, odd.b), o8i0.d(this));
        uqmVar.addAccountChangeListener(this);
        kzh.d(r0i.f(new hlu(wwd0VarA2), new ilu(null, this)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new nku(null, this), 3);
    }

    public final void A1() {
        if (this.D.O()) {
            uqm uqmVar = this.v;
            if (uqmVar.isLogin() && this.V.a.get()) {
                String str = uqmVar.getAccount().name;
                str.getClass();
                String strConcat = "ZA_SHOW_SUCCESS_REG_".concat(str);
                String strConcat2 = "ZA_SHOW_FIRST_KYC_CHECK_FAILED_".concat(str);
                String strConcat3 = "ZA_SHOW_NEED_PASSPORT_VERIFICATION_".concat(str);
                String strConcat4 = "ZA_SHOW_FAILED_PASSPORT_VERIFICATION_".concat(str);
                jvd0 jvd0Var = this.i0;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                this.i0 = ej5.c(o8i0.d(this), null, null, new a(strConcat, strConcat2, strConcat3, strConcat4, null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        if (r9 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B1(defpackage.x1b r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oku.B1(x1b):java.lang.Object");
    }

    public final void C1() {
        Object next;
        CountryCodeName countryCode = this.D.getCountryCode();
        oge0 oge0Var = this.P;
        oge0Var.getClass();
        countryCode.getClass();
        Iterator<T> it = oge0Var.b().a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((ub90) next).getCountryCode(), countryCode.getCode()));
        ub90 ub90Var = (ub90) next;
        if (ub90Var != null) {
            this.f0.j(ub90Var);
        }
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.n0;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(account != null)));
        if (account != null) {
            z1();
        }
        ej5.c(o8i0.d(this), null, null, new xku(null, this), 3);
        Float fValueOf = Float.valueOf(0.0f);
        wwd0 wwd0Var2 = this.p0;
        wwd0Var2.getClass();
        wwd0Var2.k(null, fValueOf);
    }

    @Override // defpackage.ihb0, defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.v.removeAccountChangeListener(this);
    }

    public final void z1() {
        if (this.v.isLogin()) {
            et7 et7VarD = o8i0.d(this);
            jgk jgkVar = this.f;
            jgkVar.getClass();
            ej5.c(et7VarD, jgkVar.d, null, new egk(jgkVar, null), 2);
        }
    }
}
