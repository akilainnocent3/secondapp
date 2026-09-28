package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.instantwin.newtork.model.response.Feature;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lwdo;", "Lj8i0;", "Ljpk;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wdo extends j8i0 implements jpk {
    public final wwd0 A;
    public final v340 B;
    public final m2l a;
    public final lq1 b;
    public final k4p c;
    public final d4p d;
    public final eko e;
    public final ihy f;
    public final jpk i;
    public final InstantWinInput v;
    public final wwd0 w;
    public final wwd0 y;
    public final v340 z;

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$isIvOneCutReleased$1", f = "InstantWinConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return wdo.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BOConfigParamDto bOConfigParamDto = new BOConfigParamDto(BOConfigAppId.COMMON, BOConfigNamespace.CONFIG, "android_iv_onecut_released", null, 8, null);
            wdo wdoVar = wdo.this;
            kzh.d(new yzh(new g1i(new wl50(wdoVar.b.c(kotlin.collections.a.c(bOConfigParamDto)), new ndo(bOConfigParamDto)), new odo(wdoVar, null)), new pdo(3, null)), o8i0.d(wdoVar));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$uiState$1", f = "InstantWinConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<kcz, rfb0, v1b<? super emo>, Object> {
        public /* synthetic */ kcz a;
        public /* synthetic */ rfb0 b;

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(kcz kczVar, rfb0 rfb0Var, v1b<? super emo> v1bVar) {
            b bVar = wdo.this.new b(v1bVar);
            bVar.a = kczVar;
            bVar.b = rfb0Var;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kcz kczVar = this.a;
            rfb0 rfb0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if ((kczVar instanceof kcz.a) || (rfb0Var instanceof rfb0.a)) {
                return emo.a.a;
            }
            if (!(kczVar instanceof kcz.c) || !(rfb0Var instanceof rfb0.c)) {
                return emo.c.a;
            }
            wdo wdoVar = wdo.this;
            ihy ihyVar = wdoVar.f;
            Sports sports = ((rfb0.c) rfb0Var).a;
            Feature feature = sports.getFeature();
            ihyVar.O0(feature != null ? feature.getOddsFilter() : null);
            wdoVar.i.R0(sports.getGift());
            return new emo.b(((kcz.c) kczVar).a, sports);
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$uiState$2", f = "InstantWinConfigViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super emo>, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return wdo.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super emo> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wdo wdoVar = wdo.this;
                k4p k4pVar = wdoVar.c;
                InstantWinInput instantWinInput = wdoVar.v;
                String str = instantWinInput != null ? instantWinInput.a : null;
                if (str == null) {
                    str = "";
                }
                zdo zdoVar = new zdo(wdoVar);
                this.a = 1;
                if (k4pVar.a(str, zdoVar, this) == y5bVar) {
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

    public wdo(vu60 vu60Var, m2l m2lVar, lq1 lq1Var, k4p k4pVar, d4p d4pVar, eko ekoVar, ihy ihyVar, jpk jpkVar) {
        vu60Var.getClass();
        m2lVar.getClass();
        lq1Var.getClass();
        k4pVar.getClass();
        ekoVar.getClass();
        ihyVar.getClass();
        jpkVar.getClass();
        this.a = m2lVar;
        this.b = lq1Var;
        this.c = k4pVar;
        this.d = d4pVar;
        this.e = ekoVar;
        this.f = ihyVar;
        this.i = jpkVar;
        this.v = (InstantWinInput) vu60Var.b("ARG_INPUT");
        wwd0 wwd0VarA = xwd0.a(kcz.a.a);
        this.w = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(rfb0.a.a);
        this.y = wwd0VarA2;
        this.z = e1i.e(new xzh(new n1i(wwd0VarA, wwd0VarA2, new b(null)), new c(null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), emo.a.a);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.A = wwd0VarA3;
        this.B = e1i.e(new xzh(wwd0VarA3, new a(null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), bool);
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        this.i.E(str);
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return this.i.G0(str);
    }

    @Override // defpackage.jpk
    public final void H0() {
        this.i.H0();
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        this.i.I(str, str2, str3);
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.i.R0(z);
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        this.i.T0(str);
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.i.a0();
    }

    @Override // defpackage.jpk
    public final void b0() {
        this.i.b0();
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        this.i.j1(arrayList);
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.i.p1();
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        return this.i.t0(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        this.i.t1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(String str, x1b x1bVar) {
        tdo tdoVar;
        Object objG;
        if (x1bVar instanceof tdo) {
            tdoVar = (tdo) x1bVar;
            int i = tdoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdoVar.c = i - Integer.MIN_VALUE;
            } else {
                tdoVar = new tdo(this, x1bVar);
            }
        } else {
            tdoVar = new tdo(this, x1bVar);
        }
        Object obj = tdoVar.a;
        y5b y5bVar = y5b.a;
        int i2 = tdoVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            tdoVar.c = 1;
            objG = this.e.G(str, true, tdoVar);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objG = ((zi50) obj).a;
        }
        Throwable thA = zi50.a(objG);
        wwd0 wwd0Var = this.y;
        if (thA != null) {
            wwd0Var.setValue(rfb0.b.a);
            return Unit.a;
        }
        rfb0.c cVar = new rfb0.c((Sports) objG);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        return Unit.a;
    }
}
