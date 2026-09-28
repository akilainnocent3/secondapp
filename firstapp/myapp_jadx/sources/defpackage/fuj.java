package defpackage;

import androidx.recyclerview.widget.r;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfuj;", "Lj8i0;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fuj extends j8i0 implements xjj {
    public boolean A;
    public final ssw<String> C;
    public final ssw D;
    public slr E;
    public ema a;
    public final ssw<String> b = new ssw<>();
    public final ssw<String> c = new ssw<>();
    public ssw<CampaignTopicResponse> d = new ssw<>();
    public final ssw<bbs.a> e = new ssw<>();
    public final ssw<String> f = new ssw<>();
    public final ssw<String> i = new ssw<>();
    public final LinkedHashMap v = new LinkedHashMap();
    public final ssw<HashMap<Long, String>> w = new ssw<>();
    public final LinkedHashMap y = new LinkedHashMap();
    public final ssw<HashMap<Long, String>> z = new ssw<>();
    public final ttr B = hwr.a(a1s.a, new b());

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements Function0<xrm> {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xrm] */
        @Override // kotlin.jvm.functions.Function0
        public final xrm invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            xjj xjjVar = fuj.this;
            if (xjjVar instanceof rrp) {
                qn70VarJ = ((rrp) xjjVar).j();
                dq7VarA = jq40.a(xrm.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(xrm.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.viewmodels.GamesCampaignSocketViewModel$subscribeToGamesCampaign$topic$2$1$1", f = "GamesCampaignSocketViewModel.kt", l = {r.d.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ CampaignTopicResponse c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CampaignTopicResponse campaignTopicResponse, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = campaignTopicResponse;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fuj.this.new c(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                xrm xrmVar = (xrm) fuj.this.B.getValue();
                this.a = 1;
                if (xrmVar.e(this.c, System.currentTimeMillis(), this) == y5bVar) {
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

    public fuj() {
        ssw<String> sswVar = new ssw<>();
        this.C = sswVar;
        this.D = sswVar;
    }

    public final void B1(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            return;
        }
        m3i m3iVarJ = msj.a.f(n3g0.a("campaign", str2, "", str, ""), A1()).j(wm70.c);
        final uj6 uj6Var = new uj6(this, 1);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: usj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                uj6Var.invoke(obj);
            }
        }).f(va0.a());
        final wsj wsjVar = new wsj(this, 0);
        slr slrVar = new slr(new pya() { // from class: xsj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                wsjVar.invoke(obj);
            }
        }, new zsj(), taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void C1(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            return;
        }
        b3i b3iVarF = new u2i(msj.a.f(n3g0.a("rain", str3, str, str2, ""), A1()).j(wm70.c), new gtj(new ftj(this, 0), 0)).f(va0.a());
        htj htjVar = new htj(new lqa(this, 1));
        new o5f(1);
        slr slrVar = new slr(htjVar, new wa1(), taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void D1(String str, String str2) {
        if (SportyGamesManager.getInstance().getUser() == null) {
            return;
        }
        m3i m3iVarJ = msj.a.f(n3g0.a("rain_status", "", "", str, str2), A1()).j(wm70.c);
        final buj bujVar = new buj(this, 0);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: cuj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                bujVar.invoke(obj);
            }
        }).f(va0.a());
        final duj dujVar = new duj(this, 0);
        slr slrVar = new slr(new pya() { // from class: euj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                dujVar.invoke(obj);
            }
        }, new psj(), taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void E1(String str, String str2, String str3) {
        str2.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            return;
        }
        m3i m3iVarJ = msj.a.f(n3g0.c("tournament_info", str2, str3, str, 0L), A1()).j(wm70.c);
        final e4f e4fVar = new e4f(this, 1);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: qsj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                e4fVar.invoke(obj);
            }
        }).f(va0.a());
        final qj6 qj6Var = new qj6(this, 1);
        pya pyaVar = new pya() { // from class: rsj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                qj6Var.invoke(obj);
            }
        };
        final ssj ssjVar = new ssj(this);
        slr slrVar = new slr(pyaVar, new pya() { // from class: tsj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                ssjVar.invoke(obj);
            }
        }, taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void F1(String str, String str2, Long l) {
        str.getClass();
        if (SportyGamesManager.getInstance().getUser() == null) {
            return;
        }
        m3i m3iVarJ = msj.a.f(n3g0.c("rank_data", str, str2, "", l.longValue()), A1()).j(wm70.c);
        final ga1 ga1Var = new ga1(1, this, l);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: atj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                ga1Var.invoke(obj);
            }
        }).f(va0.a());
        final btj btjVar = new btj(this, l);
        pya pyaVar = new pya() { // from class: ctj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                btjVar.invoke(obj);
            }
        };
        final sk6 sk6Var = new sk6(1, this, l);
        slr slrVar = new slr(pyaVar, new pya() { // from class: dtj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                sk6Var.invoke(obj);
            }
        }, taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void x1() {
        ema emaVar;
        msj msjVar = msj.a;
        if (msjVar.d() && this.A) {
            this.e.j(bbs.a.a);
            return;
        }
        ema emaVar2 = this.a;
        if (emaVar2 != null) {
            emaVar2.d();
        }
        slr slrVar = this.E;
        if (slrVar != null) {
            gee0.a(slrVar);
        }
        ema emaVar3 = this.a;
        if (emaVar3 == null || emaVar3.b) {
            this.a = new ema();
        }
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null || SportyGamesManager.getInstance().getUser() == null) {
            return;
        }
        ua.naiksoftware.stomp.a aVar = msj.j;
        aVar.e = 15000;
        aVar.d = 15000;
        r2i<bbs> r2iVarI = msj.i.i(qt1.b);
        int i = 0;
        final nsj nsjVar = new nsj(this, i);
        u2i u2iVar = new u2i(r2iVarI, new pya() { // from class: vsj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                nsjVar.invoke(obj);
            }
        });
        final etj etjVar = new etj(this, 0);
        pya pyaVar = new pya() { // from class: mtj
            @Override // defpackage.pya
            public final void accept(Object obj) {
                etjVar.invoke(obj);
            }
        };
        new xtj(0);
        slr slrVar2 = new slr(pyaVar, new auj(), new vq4());
        u2iVar.h(slrVar2);
        this.E = slrVar2;
        ArrayList arrayListA1 = A1();
        if (!msjVar.d() || !this.A) {
            HashMap map = new HashMap();
            int size = arrayListA1.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListA1.get(i2);
                i2++;
                e1e0 e1e0Var = (e1e0) obj;
                map.put(e1e0Var.a, e1e0Var.b);
            }
            msj msjVar2 = msj.a;
            String country = SportyGamesManager.getInstance().getCountry();
            if (country == null) {
                country = "";
            }
            fmy fmyVar = new fmy(tug.a("wss://www.sportybet.com/ws/", country, "/games/games-campaign/v1/campaign"), map, new OkHttpClient());
            msj.k = fmyVar;
            ucy<String> ucyVarF = fmyVar.f();
            lsj lsjVar = new lsj();
            ucyVarF.getClass();
            idy idyVar = new idy(new tdy(ucyVarF, lsjVar), new wh6(new krj()));
            final u71 u71Var = new u71(1);
            cdy cdyVar = new cdy(idyVar, new pya() { // from class: lrj
                @Override // defpackage.pya
                public final void accept(Object obj2) {
                    u71Var.invoke(obj2);
                }
            });
            final mrj mrjVar = new mrj(0);
            idy idyVar2 = new idy(cdyVar, new nm20() { // from class: nrj
                @Override // defpackage.nm20
                public final boolean test(Object obj2) {
                    obj2.getClass();
                    return ((Boolean) mrjVar.invoke(obj2)).booleanValue();
                }
            });
            final orj orjVar = new orj();
            pya pyaVar2 = new pya() { // from class: prj
                @Override // defpackage.pya
                public final void accept(Object obj2) {
                    orjVar.invoke(obj2);
                }
            };
            new hsj(0);
            isj isjVar = new isj();
            taj.d dVar = taj.c;
            rlr rlrVar = new rlr(pyaVar2, isjVar, dVar);
            idyVar2.a(rlrVar);
            msj.h = rlrVar;
            x2 x2Var = msj.k;
            if (x2Var == null) {
                Intrinsics.n("connectionProvider");
                throw null;
            }
            l830<bbs> l830Var = x2Var.a;
            ksj ksjVar = new ksj(new jsj(arrayListA1, i));
            taj.j jVar = taj.e;
            l830Var.getClass();
            rlr rlrVar2 = new rlr(ksjVar, jVar, dVar);
            l830Var.a(rlrVar2);
            msj.g = rlrVar2;
        }
        slr slrVar3 = this.E;
        if (slrVar3 == null || (emaVar = this.a) == null) {
            return;
        }
        emaVar.b(slrVar3);
    }

    public final void y1() {
        this.d = new ssw<>();
        if (this.A) {
            msj msjVar = msj.a;
            msjVar.a();
            if (msjVar.d()) {
                msjVar.a();
            }
            z1();
        }
    }

    public final void z1() {
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.dispose();
        }
        slr slrVar = this.E;
        if (slrVar != null) {
            gee0.a(slrVar);
        }
    }

    public static ArrayList A1() {
        xnh0 user;
        ArrayList arrayList = new ArrayList();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null) {
            return arrayList;
        }
        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
        arrayList.add(new e1e0("cookie", "accessToken=".concat((sportyGamesManager2 == null || (user = sportyGamesManager2.getUser()) == null) ? "" : user.a)));
        String country = sportyGamesManager.getCountry();
        if (country == null) {
            country = "";
        }
        arrayList.add(new e1e0("country-code", country));
        String property = System.getProperty("http.agent");
        arrayList.add(new e1e0("user-agent", avg.a(sportyGamesManager.getVersionCode(), property != null ? property.concat("-") : "")));
        arrayList.add(new e1e0("x-platform", u3w.a));
        String deviceId = sportyGamesManager.getDeviceId();
        arrayList.add(new e1e0(LGxrN.lnFowOiXhL, deviceId != null ? deviceId : ""));
        return arrayList;
    }
}
