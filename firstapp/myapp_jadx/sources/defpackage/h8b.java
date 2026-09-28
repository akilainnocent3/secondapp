package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.SocketPushManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class h8b implements psm, tah0 {
    public final ga a;
    public final b4k b;
    public final wsm c;
    public final ysm d;
    public final ka30 e;
    public final oge0 f;
    public final j1b g;
    public u4c h;
    public final mpe0 i;

    @c0d(c = "com.sportybet.android.country.CountryManagerImpl$init$1", f = "CountryManagerImpl.kt", l = {85, 86}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public SocketPushManager a;
        public String b;
        public int c;
        public int d;
        public final /* synthetic */ w7b e;
        public final /* synthetic */ h8b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, w7b w7bVar, h8b h8bVar) {
            super(2, v1bVar);
            this.e = w7bVar;
            this.f = h8bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.e, this.f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            SocketPushManager socketPushManager;
            int i;
            Object objB;
            SocketPushManager socketPushManager2;
            int i2;
            String str;
            y5b y5bVar = y5b.a;
            int i3 = this.d;
            h8b h8bVar = this.f;
            if (i3 == 0) {
                uj50.b(obj);
                socketPushManager = SocketPushManager.getInstance();
                i = this.e.e;
                ka30 ka30Var = h8bVar.e;
                this.a = socketPushManager;
                this.c = i;
                this.d = 1;
                objB = ka30Var.b(this);
                if (objB != y5bVar) {
                }
                return y5bVar;
            }
            if (i3 == 1) {
                i = this.c;
                SocketPushManager socketPushManager3 = this.a;
                uj50.b(obj);
                objB = obj;
                socketPushManager = socketPushManager3;
            } else {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.c;
                str = this.b;
                socketPushManager2 = this.a;
                uj50.b(obj);
            }
            socketPushManager2.init(i2, str, ((ysm.a) obj).a);
            return Unit.a;
            String str2 = (String) objB;
            ysm ysmVar = h8bVar.d;
            this.a = socketPushManager;
            this.b = str2;
            this.c = i;
            this.d = 2;
            Object objD = ysmVar.d(this);
            if (objD != y5bVar) {
                SocketPushManager socketPushManager4 = socketPushManager;
                obj = objD;
                socketPushManager2 = socketPushManager4;
                i2 = i;
                str = str2;
                socketPushManager2.init(i2, str, ((ysm.a) obj).a);
                return Unit.a;
            }
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.country.CountryManagerImpl$init$2", f = "CountryManagerImpl.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ h8b b;
        public final /* synthetic */ w7b c;

        public static final class a<T> implements myh {
            public final /* synthetic */ h8b a;

            public a(h8b h8bVar) {
                this.a = h8bVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.h = (u4c) obj;
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, w7b w7bVar, h8b h8bVar) {
            super(2, v1bVar);
            this.b = h8bVar;
            this.c = w7bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.c, this.b);
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
                h8b h8bVar = this.b;
                b4k b4kVar = h8bVar.b;
                String str = this.c.c;
                str.getClass();
                wo5 wo5Var = b4kVar.a.get();
                wo5Var.getClass();
                lyh lyhVarB = uzh.b(bm50.f(bm50.m(wo5.b(wo5Var, "currency_symbols", null, 6), new a4k(str, 0))));
                a aVar = new a(h8bVar);
                this.a = 1;
                if (lyhVarB.collect(aVar, this) == y5bVar) {
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

    public h8b(@Dispatcher(sportyDispatcher = SportyDispatchers.Default) pfd pfdVar, ga gaVar, b4k b4kVar, wsm wsmVar, ysm ysmVar, ka30 ka30Var, oge0 oge0Var) {
        wsmVar.getClass();
        ysmVar.getClass();
        this.a = gaVar;
        this.b = b4kVar;
        this.c = wsmVar;
        this.d = ysmVar;
        this.e = ka30Var;
        this.f = oge0Var;
        this.g = w5b.a(pfdVar.plus(lfe0.a()).plus(new i8b(this)));
        this.i = hwr.b(new e8b(this, 0));
    }

    @Override // defpackage.psm
    public final CMSLanguage A() {
        CMSLanguage cMSLanguageF = e().f();
        cMSLanguageF.getClass();
        return cMSLanguageF;
    }

    @Override // defpackage.psm
    public final String B() {
        return StringsKt.t0(b()).toString();
    }

    @Override // defpackage.psm
    public final List C(ArrayList arrayList) {
        List listB = e().b(arrayList);
        listB.getClass();
        return listB;
    }

    @Override // defpackage.psm
    public final Locale D() {
        Locale localeL = e().l();
        localeL.getClass();
        return localeL;
    }

    @Override // defpackage.psm
    public final boolean E() {
        return S() || G() || o() || a0() || O();
    }

    @Override // defpackage.psm
    public final boolean F() {
        return CountryCodeName.MEXICO == getCountryCode();
    }

    @Override // defpackage.psm
    public final boolean G() {
        return getCountryCode() == CountryCodeName.ZAMBIA;
    }

    @Override // defpackage.psm
    public final boolean H() {
        return e().x();
    }

    @Override // defpackage.psm
    public final String I(String str) {
        str.getClass();
        return oxc.a(f(), " ", str);
    }

    @Override // defpackage.psm
    public final int J() {
        return e().i();
    }

    @Override // defpackage.psm
    public final int L() {
        return a8b.c().d();
    }

    @Override // defpackage.psm
    public final String M() {
        String str = e().d;
        str.getClass();
        return str;
    }

    @Override // defpackage.psm
    public final String N(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return I(bjb0.L(bigDecimal, Locale.US));
    }

    @Override // defpackage.psm
    public final boolean O() {
        return getCountryCode() == CountryCodeName.SOUTH_AFRICA;
    }

    @Override // defpackage.psm
    public final String P() {
        String str = e().d;
        str.getClass();
        return new Regex("\\+").replace(str, "");
    }

    @Override // defpackage.psm
    public final String Q() {
        String code = getCountryCode().getCode();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase = code.toUpperCase(locale);
        upperCase.getClass();
        return upperCase;
    }

    @Override // defpackage.psm
    public final boolean R() {
        return O() || v() || z() || F();
    }

    @Override // defpackage.psm
    public final boolean S() {
        return getCountryCode() == CountryCodeName.KENYA;
    }

    @Override // defpackage.psm
    public final Object T(String str, psm.a aVar) {
        ga gaVar = this.a;
        return gaVar.i.a(gaVar, ga.s[7]).g(aVar, str);
    }

    @Override // defpackage.psm
    public final char U() {
        return e().i;
    }

    @Override // defpackage.psm
    public final boolean V() {
        return e().v();
    }

    @Override // defpackage.psm
    public final boolean W() {
        return getCountryCode() == CountryCodeName.BRAZIL;
    }

    @Override // defpackage.psm
    public final int X() {
        return e().j();
    }

    @Override // defpackage.psm
    public final String Y() {
        String str = e().f;
        str.getClass();
        return str;
    }

    @Override // defpackage.psm
    public final int Z() {
        return e().m();
    }

    @Override // defpackage.psm
    public final void a() {
        w7b w7bVarE = e();
        a aVar = new a(null, w7bVarE, this);
        j1b j1bVar = this.g;
        ej5.c(j1bVar, null, null, aVar, 3);
        ej5.c(j1bVar, null, null, new b(null, w7bVarE, this), 3);
    }

    @Override // defpackage.psm
    public final boolean a0() {
        return getCountryCode() == CountryCodeName.UGANDA;
    }

    @Override // defpackage.psm
    public final String b() {
        String str = e().c;
        str.getClass();
        return str;
    }

    @Override // defpackage.psm
    public final boolean b0() {
        return e().B();
    }

    @Override // defpackage.psm
    public final String c() {
        String str = e().b;
        str.getClass();
        return str;
    }

    @Override // defpackage.psm
    public final int c0() {
        return e().e();
    }

    @Override // defpackage.tah0
    public final UiText d() {
        return e().k();
    }

    public final w7b e() {
        return (w7b) this.i.getValue();
    }

    @Override // defpackage.psm
    public final String f() {
        u4c u4cVar = this.h;
        if (u4cVar != null) {
            String str = u4cVar.b;
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return B();
    }

    @Override // defpackage.psm
    public final int g() {
        return e().n();
    }

    @Override // defpackage.psm
    public final CountryCodeName getCountryCode() {
        CountryCodeName countryCodeName = e().a;
        countryCodeName.getClass();
        return countryCodeName;
    }

    @Override // defpackage.psm
    public final String getName() {
        String str = e().b;
        str.getClass();
        return str;
    }

    @Override // defpackage.psm
    public final Object h(CountryCodeName countryCodeName, q57 q57Var) {
        ga gaVar = this.a;
        return gaVar.h.a(gaVar, ga.s[6]).g(q57Var, countryCodeName.getCode());
    }

    @Override // defpackage.psm
    public final boolean i(Context context) {
        if (context == null || W() || F()) {
            return false;
        }
        return this.f.a(getCountryCode()).size() > 1;
    }

    @Override // defpackage.psm
    public final boolean j() {
        return e().t();
    }

    @Override // defpackage.psm
    public final String k() {
        String str = e().g;
        str.getClass();
        return str;
    }

    @Override // defpackage.psm
    public final int l() {
        return e().h;
    }

    @Override // defpackage.psm
    public final boolean m() {
        return e().u();
    }

    @Override // defpackage.psm
    public final boolean n() {
        return getCountryCode() == CountryCodeName.NIGERIA;
    }

    @Override // defpackage.psm
    public final boolean o() {
        return getCountryCode() == CountryCodeName.TANZANIA;
    }

    @Override // defpackage.psm
    public final boolean p() {
        w7b w7bVarE = e();
        w7bVarE.getClass();
        return w7bVarE instanceof rhu;
    }

    @Override // defpackage.psm
    public final Integer q() {
        if (F()) {
            return Integer.valueOf(R.drawable.flag_mx_bordered);
        }
        return null;
    }

    @Override // defpackage.psm
    public final boolean r() {
        return e().D();
    }

    @Override // defpackage.psm
    public final boolean s() {
        return x() || n() || S() || o() || a0() || G();
    }

    @Override // defpackage.psm
    public final int t() {
        if (W() || F()) {
            return R.drawable.tab_games_selector_br_mx;
        }
        return O() ? R.drawable.tab_games_selector_za : R.drawable.tab_games_selector;
    }

    @Override // defpackage.psm
    public final boolean u() {
        return e().A();
    }

    @Override // defpackage.psm
    public final boolean v() {
        return getCountryCode() == CountryCodeName.CAMEROON;
    }

    @Override // defpackage.psm
    public final CountryCodeName w() {
        CountryCodeName countryCodeName = e().a;
        if (e().D() && countryCodeName != CountryCodeName.BRAZIL) {
            return CountryCodeName.INTERNATIONAL;
        }
        countryCodeName.getClass();
        return countryCodeName;
    }

    @Override // defpackage.psm
    public final boolean x() {
        return getCountryCode() == CountryCodeName.GHANA;
    }

    @Override // defpackage.psm
    public final boolean y(String str) {
        str.getClass();
        CountryCodeName countryCode = getCountryCode();
        countryCode.getClass();
        str.getClass();
        if (j8b.a[countryCode.ordinal()] != 1) {
            return a8b.c().C(str);
        }
        try {
            Long.parseLong(str);
            return str.length() == 9;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.psm
    public final boolean z() {
        return getCountryCode() == CountryCodeName.MOZAMBIQUE;
    }
}
