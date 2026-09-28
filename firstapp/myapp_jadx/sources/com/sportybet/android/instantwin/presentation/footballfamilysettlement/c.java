package com.sportybet.android.instantwin.presentation.footballfamilysettlement;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import com.sportybet.android.instantwin.router.footballfamilysettlement.FootballFamilySettlementInput;
import defpackage.agi;
import defpackage.bre0;
import defpackage.cgi;
import defpackage.cmo;
import defpackage.d150;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.et7;
import defpackage.fqo;
import defpackage.g1i;
import defpackage.ggh0;
import defpackage.gzh;
import defpackage.h6f0;
import defpackage.hci;
import defpackage.hio;
import defpackage.i0i;
import defpackage.iug0;
import defpackage.j8i0;
import defpackage.jh2;
import defpackage.jvd0;
import defpackage.kci;
import defpackage.kqo;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l48;
import defpackage.lyh;
import defpackage.m2g;
import defpackage.m730;
import defpackage.mwd0;
import defpackage.nbi;
import defpackage.o8i0;
import defpackage.qhi;
import defpackage.r1i;
import defpackage.rfi;
import defpackage.t3g;
import defpackage.tfi;
import defpackage.tuw;
import defpackage.ufi;
import defpackage.uuw;
import defpackage.v340;
import defpackage.vch0;
import defpackage.vfi;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.xfi;
import defpackage.xwd0;
import defpackage.yfi;
import defpackage.zfi;
import defpackage.zta0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.e;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/footballfamilysettlement/c;", "Lj8i0;", "Lhio;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 implements hio {
    public final wwd0 A;
    public jvd0 B;
    public final tuw C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final kci I;
    public final ku90<b> J;
    public final v340 K;
    public final cmo a;
    public final jh2 b;
    public final hio c;
    public final iug0 d;
    public final bre0 e;
    public final FootballFamilySettlementInput f;
    public final wwd0 i;
    public final lyh<zta0> v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    public c(vu60 vu60Var, cmo cmoVar, qhi qhiVar, kqo kqoVar, d150 d150Var, jh2 jh2Var, hio hioVar, iug0 iug0Var, bre0 bre0Var) {
        kci kciVar;
        vu60Var.getClass();
        d150Var.getClass();
        jh2Var.getClass();
        hioVar.getClass();
        this.a = cmoVar;
        this.b = jh2Var;
        this.c = hioVar;
        this.d = iug0Var;
        this.e = bre0Var;
        FootballFamilySettlementInput footballFamilySettlementInput = (FootballFamilySettlementInput) vu60Var.b("ARG_INPUT");
        this.f = footballFamilySettlementInput;
        wwd0 wwd0VarA = xwd0.a(null);
        this.i = wwd0VarA;
        lyh<zta0> gzhVar = (footballFamilySettlementInput == null || !footballFamilySettlementInput.c) ? new gzh(zta0.a.C1422a.a) : new yfi(qhiVar.a(z1()));
        this.v = gzhVar;
        wwd0 wwd0VarA2 = xwd0.a(hci.a);
        this.w = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(t3g.a);
        this.y = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.z = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(m2g.a);
        this.A = wwd0VarA5;
        this.C = uuw.a();
        wwd0 wwd0VarA6 = xwd0.a("MY_EVENTS_TAB_ID");
        this.D = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(null);
        this.E = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(Boolean.FALSE);
        this.F = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(Integer.valueOf(R.drawable.ic_one_bet_cut));
        this.G = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(null);
        this.H = wwd0VarA10;
        m730 m730Var = (m730) d150Var.get(z1());
        kci ggh0Var = (m730Var == null || (kciVar = (kci) m730Var.get()) == null) ? new ggh0() : kciVar;
        this.I = ggh0Var;
        this.J = new ku90<>();
        this.K = e1i.e(r1i.b(kqoVar.d, wwd0VarA, ggh0Var.b(), wwd0VarA10, new cgi(5, this, c.class, "createUiState", "createUiState(Lcom/sportybet/android/instantwin/presentation/compose/toolbar/InstantWinTopAppBarState$UserStatus;Lcom/sportybet/android/instantwin/presentation/footballfamilysettlement/model/FootballFamilySettlementContentStage;Lcom/sportybet/android/instantwin/presentation/footballfamilysettlement/model/state/content/FootballFamilySettlementContentState;Lcom/sportybet/android/instantwin/presentation/winningdialog/model/InstantWinWinningDialogUiState;)Lcom/sportybet/android/instantwin/presentation/footballfamilysettlement/model/state/FootballFamilySettlementUiState;", 4)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new rfi(y1(fqo.c.b.a, null), null, null));
        kqoVar.a(o8i0.d(this), true);
        et7 et7VarD = o8i0.d(this);
        String str = footballFamilySettlementInput != null ? footballFamilySettlementInput.b : null;
        ggh0Var.f(et7VarD, str == null ? "" : str, footballFamilySettlementInput != null && footballFamilySettlementInput.c, wwd0VarA, wwd0VarA2, wwd0VarA3, wwd0VarA4, wwd0VarA5, wwd0VarA6, wwd0VarA7, wwd0VarA8, wwd0VarA9);
        kzh.d(new g1i(new zfi(gzhVar, this), new tfi(null, this)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new ufi(null, this), 3);
        kzh.d(new g1i(new agi(new i0i(new xfi(wwd0VarA)), this), new vfi(null, this)), o8i0.d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair x1(long j, long j2, long j3, List list) {
        ArrayList arrayListH0 = CollectionsKt.H0(CollectionsKt.q0(CollectionsKt.t0(kotlin.collections.a.d(f.m(new e(j, j2), j3)), list.size())), list);
        ArrayList arrayList = new ArrayList();
        int size = arrayListH0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListH0.get(i2);
            i2++;
            Pair pair = (Pair) obj;
            if (((h6f0) pair.b).a.a() && ((h6f0) pair.b).b > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(Long.valueOf(((Number) ((Pair) obj2).a).longValue()));
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayListH0.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayListH0.get(i4);
            i4++;
            Pair pair2 = (Pair) obj3;
            if (!((h6f0) pair2.b).a.a() && ((h6f0) pair2.b).b > 0) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, 10));
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj4 = arrayList3.get(i);
            i++;
            arrayList4.add(Long.valueOf(((Number) ((Pair) obj4).a).longValue()));
        }
        return new Pair(arrayList2, arrayList4);
    }

    @Override // defpackage.hio
    public final void X(String str) {
        str.getClass();
        this.c.X(str);
    }

    @Override // defpackage.hio
    public final void r1() {
        this.c.r1();
    }

    @Override // defpackage.hio
    public final lyh<InstantWinPromotionDialogInput> v1() {
        return this.c.v1();
    }

    public final fqo y1(fqo.c cVar, nbi nbiVar) {
        ResourceUiText resourceUiText;
        String strZ1 = z1();
        cmo cmoVar = this.a;
        fqo.a.b bVar = new fqo.a.b(cmoVar.b(strZ1));
        Integer numC = cmoVar.c(z1());
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        if (!(nbiVar instanceof nbi.b)) {
            cVar = null;
        }
        return new fqo(R.color.bg_brand_main_primary, bVar, resourceUiText, cVar);
    }

    public final String z1() {
        FootballFamilySettlementInput footballFamilySettlementInput = this.f;
        String str = footballFamilySettlementInput != null ? footballFamilySettlementInput.a : null;
        return str == null ? "" : str;
    }
}
