package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.game.activity.SportyGameRouterActivity;
import com.sportybet.android.portal.FeaturedView;
import com.sportybet.android.router.Sender;
import com.sportygames.commons.SportyGamesManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kob0 implements hzm, i8, lfy<idt> {
    public final ArrayList A;
    public final mpe0 B;
    public final azm a;
    public final Application b;
    public final uqm c;
    public final arm d;
    public final psm e;
    public final num f;
    public final erb i;
    public final str<kym> v;
    public final l580 w;
    public final pr10 y;
    public final wsm z;

    @c0d(c = "com.sportybet.android.game.agent.SportyGameAgentImpl$renewUserAccessToken$1", f = "SportyGameAgentImpl.kt", l = {226}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: kob0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.game.agent.SportyGameAgentImpl$renewUserAccessToken$1$1", f = "SportyGameAgentImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0773a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
            public final /* synthetic */ kob0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0773a(kob0 kob0Var, v1b<? super C0773a> v1bVar) {
                super(2, v1bVar);
                this.a = kob0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0773a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
                return ((C0773a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return this.a.c.refreshAccessToken();
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return kob0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            kob0 kob0Var = kob0.this;
            if (i == 0) {
                uj50.b(obj);
                pfd pfdVar = fse.a;
                odd oddVar = odd.b;
                C0773a c0773a = new C0773a(kob0Var, null);
                this.a = 1;
                if (ej5.d(oddVar, c0773a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            kob0Var.onAccountChange(null);
            return Unit.a;
        }
    }

    public kob0(azm azmVar, Application application, uqm uqmVar, arm armVar, psm psmVar, num numVar, erb erbVar, str<kym> strVar, l580 l580Var, pr10 pr10Var, wsm wsmVar) {
        azmVar.getClass();
        uqmVar.getClass();
        armVar.getClass();
        psmVar.getClass();
        numVar.getClass();
        erbVar.getClass();
        strVar.getClass();
        l580Var.getClass();
        pr10Var.getClass();
        wsmVar.getClass();
        this.a = azmVar;
        this.b = application;
        this.c = uqmVar;
        this.d = armVar;
        this.e = psmVar;
        this.f = numVar;
        this.i = erbVar;
        this.v = strVar;
        this.w = l580Var;
        this.y = pr10Var;
        this.z = wsmVar;
        this.A = new ArrayList();
        this.B = hwr.b(new lhb(1));
    }

    @Override // defpackage.hzm
    public final void a(Bundle bundle) {
        Object obj;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        if (bundle != null) {
            bundle.keySet();
            obj = bundle;
        } else {
            obj = "N/A";
        }
        aVar.a(wga.a(obj, "launchGameLobby(), payload: "), new Object[0]);
        this.A.clear();
        uqm uqmVar = this.c;
        uqmVar.removeAccountChangeListener(this);
        num numVar = this.f;
        numVar.b().k(this);
        uqmVar.addAccountChangeListener(this);
        numVar.b().g(this);
        SportyGamesManager.getInstance().start(this.b, bundle, this);
    }

    @Override // defpackage.ba5
    public final void addAccountUpdatedListener(bb bbVar) {
        bbVar.getClass();
        this.A.add(bbVar);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("addAccountUpdatedListener(), listener: " + bbVar, new Object[0]);
    }

    @Override // defpackage.ba5
    public final String c() {
        String strC = this.e.c();
        itf0.a aVar = itf0.a;
        aVar.a(yv0.a(aVar, MyLog.TAG_SPORTY_GAME, "getCountryName(): ", strC), new Object[0]);
        return strC;
    }

    @Override // defpackage.ba5
    public final String d() {
        String strD = this.d.d();
        itf0.a aVar = itf0.a;
        aVar.a(yv0.a(aVar, MyLog.TAG_SPORTY_GAME, "operID(): ", strD), new Object[0]);
        return strD;
    }

    @Override // defpackage.ba5
    public final int e() {
        int iE = this.d.e();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("countryContactUsPhoneResId(): " + iE, new Object[0]);
        return iE;
    }

    @Override // defpackage.ba5
    public final i1z f() {
        return this.v.get().f();
    }

    @Override // defpackage.ba5
    public final String g() {
        String strG = this.d.g();
        itf0.a aVar = itf0.a;
        aVar.a(yv0.a(aVar, MyLog.TAG_SPORTY_GAME, "countryCurrency(): ", strG), new Object[0]);
        return strG;
    }

    @Override // defpackage.ba5
    public final String getCountryCode() {
        String code = this.d.getCountryCode().getCode();
        itf0.a aVar = itf0.a;
        aVar.a(yv0.a(aVar, MyLog.TAG_SPORTY_GAME, "getCountryCode(): ", code), new Object[0]);
        return code;
    }

    @Override // defpackage.ba5
    public final String getLanguageCode() {
        String languageCode = this.d.getLanguageCode();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("getLanguageCode(): ".concat(languageCode), new Object[0]);
        return languageCode;
    }

    @Override // defpackage.ba5
    public final void h(xae xaeVar, Bundle bundle) {
        xaeVar.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("routeTo(), Destination: " + xaeVar + ", payload: " + bundle, new Object[0]);
        int iOrdinal = xaeVar.ordinal();
        Application application = this.b;
        azm azmVar = this.a;
        switch (iOrdinal) {
            case 0:
                Intent intent = new Intent(application, (Class<?>) SportyGameRouterActivity.class);
                intent.setAction("destination_login");
                intent.addFlags(268435456);
                application.startActivity(intent);
                break;
            case 1:
                Intent intent2 = new Intent(application, (Class<?>) SportyGameRouterActivity.class);
                intent2.setAction("destination_register");
                intent2.addFlags(268435456);
                if (bundle != null) {
                    intent2.putExtras(bundle);
                }
                application.startActivity(intent2);
                break;
            case 2:
                dag dagVar = dag.BALANCE_ICON;
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("EXTRA_ENTRANCE", dagVar);
                bundle2.putBoolean("EXTRA_FROM_GAME", true);
                azmVar.j(wae.DEPOSIT, null, bundle2);
                break;
            case 3:
                String string = bundle != null ? bundle.getString("KEY_TICKET_ID", null) : null;
                if (string == null || StringsKt.U(string)) {
                    azmVar.d(wae.ME_TRANSACTIONS);
                } else {
                    wae waeVar = wae.TRANS_SEARCH;
                    Pair<String, String>[] pairArr = {new Pair(AnalyticsParam.EVENT_PARAM_ID, string)};
                    fag fagVar = fag.PAYSLIP_GAME_SHORTCUT;
                    Bundle bundle3 = new Bundle();
                    bundle3.putSerializable("EXTRA_ENTRANCE", fagVar);
                    azmVar.k(waeVar, pairArr, bundle3);
                }
                break;
            case 4:
                azmVar.d(wae.WITHDRAW);
                break;
            case 5:
                String string2 = bundle != null ? bundle.getString("KEY_LIMIT_TYPE") : null;
                if (string2 == null) {
                    string2 = "";
                }
                azmVar.k(wae.REACHED_LIMITS, new Pair[]{new Pair("reached_limits_key", string2)}, null);
                break;
            case 6:
                azmVar.d(wae.ME);
                break;
            case 7:
            case 8:
            default:
                aVar.q(MyLog.TAG_SPORTY_GAME);
                aVar.n("routeTo(), unsupported destination: " + xaeVar, new Object[0]);
                break;
            case 9:
                azmVar.d(wae.LIVE_GAME);
                break;
            case 10:
                azmVar.d(wae.SPORTY_INSTANT_WIN);
                break;
            case 11:
                azmVar.d(wae.BINGO);
                break;
            case 12:
                azmVar.k(wae.SPORTY_WEB_GAME, new Pair[0], bundle);
                break;
            case 13:
                azmVar.d(wae.INSTANT_WIN_THIRD_PARTY_SCHEDULED_VIRTUALS);
                break;
            case 14:
                azmVar.d(wae.INSTANT_WIN_THIRD_PARTY_GOLDEN_VIRTUALS);
                break;
            case 15:
                azmVar.k(wae.CONTACT_US, new Pair[]{new Pair("SportyDeskEntry", "sporty games")}, null);
                break;
            case 16:
                this.i.a(application);
                break;
        }
    }

    @Override // defpackage.ba5
    public final zag i() {
        zag zagVar = this.d.a() ? zag.a : zag.b;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("getEnvironment(): " + zagVar, new Object[0]);
        return zagVar;
    }

    @Override // defpackage.ba5
    public final boolean isSideLoading(Context context) {
        context.getClass();
        return this.i.isSideLoading(context);
    }

    @Override // defpackage.ba5
    public final void j() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        ArrayList arrayList = this.A;
        aVar.a(hce0.a(arrayList.size(), "exit(), total listeners: "), new Object[0]);
        arrayList.clear();
        this.c.removeAccountChangeListener(this);
        this.f.b().k(this);
    }

    @Override // defpackage.ba5
    public final xnh0 k() {
        xnh0 xnh0Var;
        uqm uqmVar = this.c;
        String lastAccessToken = uqmVar.getLastAccessToken();
        if (lastAccessToken != null) {
            String userId = uqmVar.getUserId();
            if (userId == null) {
                userId = "";
            }
            xnh0Var = new xnh0(lastAccessToken, userId);
        } else {
            xnh0Var = null;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("getUser(): " + xnh0Var, new Object[0]);
        return xnh0Var;
    }

    @Override // defpackage.ba5
    public final lob0 l() {
        return new lob0(this.w.a());
    }

    @Override // defpackage.ba5
    public final void logEvent(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        f00 f00Var = vgb0.a;
        vgb0.b(str, bundle);
        Unit unit = Unit.a;
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, MyLog.TAG_SPORTY_GAME, "logEvent(), eventName: ", str, ", extra: ");
        sbA.append(bundle);
        aVar.a(sbA.toString(), new Object[0]);
    }

    @Override // defpackage.ba5
    public final void logNonFatalException(Throwable th, Map<String, String> map) {
        th.getClass();
        map.getClass();
        this.z.f(th, map);
    }

    @Override // defpackage.ba5
    public final void m() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("renewUserAccessToken()", new Object[0]);
        ej5.c((v5b) this.B.getValue(), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ba5
    public final Object n(x1b x1bVar) {
        job0 job0Var;
        if (x1bVar instanceof job0) {
            job0Var = (job0) x1bVar;
            int i = job0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                job0Var.c = i - Integer.MIN_VALUE;
            } else {
                job0Var = new job0(this, x1bVar);
            }
        } else {
            job0Var = new job0(this, x1bVar);
        }
        Object objG = job0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = job0Var.c;
        Object obj = null;
        try {
            if (i2 == 0) {
                uj50.b(objG);
                xnh0 xnh0VarK = k();
                if (xnh0VarK == null) {
                    return new lth.a("Not logged in.");
                }
                if (StringsKt.U(xnh0VarK.b)) {
                    return new lth.a("User-id is empty.");
                }
                pr10 pr10Var = this.y;
                job0Var.c = 1;
                objG = pr10Var.G(job0Var);
                if (objG == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objG);
            }
            BaseResponse baseResponse = (BaseResponse) objG;
            if (!baseResponse.isSuccessful()) {
                String str = baseResponse.message;
                if (str == null) {
                    str = "Generic error.";
                }
                return new lth.a(str);
            }
            mth.a aVar = mth.b;
            int state = ((DepositHistoryStatusData) baseResponse.data).getState();
            aVar.getClass();
            for (Object obj2 : mth.e) {
                if (((mth) obj2).a == state) {
                    obj = obj2;
                    break;
                }
            }
            mth mthVar = (mth) obj;
            return mthVar != null ? new lth.b(mthVar) : new lth.a("State neither 90, 91 or 92.");
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            return new lth.a(message != null ? message : "Generic error.");
        }
    }

    @Override // defpackage.ba5
    public final void o(String str) {
        azm.c(this.a, str, null, Sender.APP_LINK_FROM_GAME_LOBBY, 2);
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        List listA0 = CollectionsKt.A0(this.A);
        xnh0 xnh0VarK = k();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("onAccountChange(), user: " + xnh0VarK + ", total listeners: " + listA0.size(), new Object[0]);
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            ((bb) it.next()).Q(xnh0VarK);
        }
    }

    @Override // defpackage.ba5
    public final FeaturedView p(juj jujVar, Context context, ibs ibsVar) {
        return jujVar.I0(context, ibsVar);
    }

    @Override // defpackage.ba5
    public final void removeAccountUpdatedListener(bb bbVar) {
        bbVar.getClass();
        boolean zRemove = this.A.remove(bbVar);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_GAME);
        aVar.a("removeAccountUpdatedListener(), listener: " + bbVar + ", removed: " + zRemove, new Object[0]);
    }

    @Override // defpackage.lfy
    public final void u1(idt idtVar) {
        idt idtVar2 = idtVar;
        if (idtVar2 == null || !(idtVar2 instanceof jdt)) {
            return;
        }
        int iOrdinal = ((jdt) idtVar2).a.ordinal();
        ArrayList arrayList = this.A;
        if (iOrdinal == 0) {
            List listA0 = CollectionsKt.A0(arrayList);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SPORTY_GAME);
            aVar.a(hce0.a(listA0.size(), "onCloseLoginDialogByBackKey(), total listeners: "), new Object[0]);
            Iterator it = listA0.iterator();
            while (it.hasNext()) {
                ((bb) it.next()).f0(m8.b);
            }
            return;
        }
        if (iOrdinal != 1) {
            uhc.a();
            return;
        }
        List listA1 = CollectionsKt.A0(arrayList);
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_SPORTY_GAME);
        aVar2.a(hce0.a(listA1.size(), "onCloseLoginDialogByCloseIcon(), total listeners: "), new Object[0]);
        Iterator it2 = listA1.iterator();
        while (it2.hasNext()) {
            ((bb) it2.next()).f0(m8.a);
        }
    }
}
