package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Laj90;", "Lj8i0;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class aj90 extends j8i0 {
    public final jrm a;
    public final lrm b;
    public final mi90 c;
    public final ui90 d;
    public final psm e;
    public final rdd0 f;
    public final y8j i;
    public final r5b v;
    public boolean w;
    public final uwd0<tm90> y;
    public final r5b z;

    public aj90(jrm jrmVar, lrm lrmVar, mi90 mi90Var, ui90 ui90Var, psm psmVar, rdd0 rdd0Var, y8j y8jVar) {
        jrmVar.getClass();
        lrmVar.getClass();
        ui90Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        y8jVar.getClass();
        this.a = jrmVar;
        this.b = lrmVar;
        this.c = mi90Var;
        this.d = ui90Var;
        this.e = psmVar;
        this.f = rdd0Var;
        this.i = y8jVar;
        this.v = i2i.c(mi90Var.f, null, 3);
        v340 v340VarA = ui90Var.a();
        SimShareData simShareData = SimShareData.INSTANCE;
        jv5 jv5VarA = hzh.a(new k760(simShareData.getAutoBetTimesSubject(), null));
        et7 et7VarD = o8i0.d(this);
        Integer numValueOf = Integer.valueOf(simShareData.getAutoBetTimes());
        kwd0 kwd0Var = q490.a.a;
        this.z = i2i.c(e1i.e(jv5VarA, et7VarD, kwd0Var, numValueOf), null, 3);
        v340 v340VarE = e1i.e(uzh.b(new zi90(jrmVar.E0())), o8i0.d(this), kwd0Var, null);
        et7 et7VarD2 = o8i0.d(this);
        v340VarA.getClass();
        mi90 mi90Var2 = this.c;
        mi90Var2.getClass();
        mi90Var2.d = v340VarE;
        kzh.d(new g1i(new f1i(v340VarA), new ni90(mi90Var2, null)), et7VarD2);
        kzh.d(new g1i(mi90Var2.y, new oi90(mi90Var2, null)), et7VarD2);
        kzh.d(r1i.a(mi90Var2.g, mi90Var2.a.d(), new f1i(v340VarE), new pi90(mi90Var2, null)), et7VarD2);
        kvk kvkVar = mi90Var2.c;
        v340 v340Var = kvkVar.e;
        vxk vxkVar = mi90Var2.b;
        kzh.d(new n1i(v340Var, vxkVar.f, new qi90(mi90Var2, null)), et7VarD2);
        wwd0 wwd0Var = mi90Var2.e;
        wwd0 wwd0Var2 = mi90Var2.t;
        wwd0 wwd0Var3 = mi90Var2.u;
        wwd0 wwd0Var4 = mi90Var2.i;
        wwd0 wwd0Var5 = mi90Var2.j;
        wwd0 wwd0Var6 = mi90Var2.s;
        wwd0 wwd0Var7 = mi90Var2.n;
        wwd0 wwd0Var8 = mi90Var2.h;
        ri90 ri90Var = new ri90(1, mi90Var2, mi90.class, "dispatchCommand", "dispatchCommand(Lcom/sportybet/android/instantwin/presentation/gift/model/GiftHandlerCommand;)V", 0);
        vxkVar.g = wwd0Var;
        vxkVar.h = wwd0Var3;
        vxkVar.i = ri90Var;
        vxkVar.j = true;
        kzh.d(new g1i(new wxk(new lyh[]{wwd0Var, wwd0Var2, wwd0Var3, wwd0Var4, wwd0Var5, wwd0Var6, wwd0Var7, wwd0Var8}), new xxk(vxkVar, null)), et7VarD2);
        wwd0 wwd0Var9 = mi90Var2.o;
        wwd0 wwd0Var10 = mi90Var2.p;
        wwd0 wwd0Var11 = mi90Var2.v;
        wwd0 wwd0Var12 = mi90Var2.r;
        kvkVar.f = new si90(1, mi90Var2, mi90.class, "dispatchCommand", "dispatchCommand(Lcom/sportybet/android/instantwin/presentation/gift/model/GiftHandlerCommand;)V", 0);
        kvkVar.g = true;
        kzh.d(r1i.b(wwd0Var7, wwd0Var9, wwd0Var10, wwd0Var, new jvk(null, kvkVar)), et7VarD2);
        kzh.d(new ivk(new lyh[]{kvkVar.b, kvkVar.c, wwd0Var11, wwd0Var8, wwd0Var12}, kvkVar), et7VarD2);
        kzh.d(new g1i(mi90Var2.z, new ti90(mi90Var2, null)), et7VarD2);
        y1();
    }

    public final void x1(SelectedGiftData selectedGiftData, String str, String str2) {
        String giftId;
        str.getClass();
        str2.getClass();
        y1();
        this.f.a(li90.a.a, k00.d);
        y8j.a(this.i, AnalyticsEvent.SIM_BETSLIP_GIFT_BTN);
        mi90 mi90Var = this.c;
        lrm lrmVar = this.b;
        if (selectedGiftData == null || (giftId = selectedGiftData.getGiftId()) == null) {
            mi90Var.b(new wi90.b(str, str2, lrmVar.o(), lrmVar.M()));
        } else {
            mi90Var.b(new wi90.c(giftId, selectedGiftData.getGiftValue(), Boolean.valueOf(selectedGiftData.getAddToStake()), str, str2, lrmVar.o(), lrmVar.M()));
        }
    }

    public final void y1() {
        Object value;
        Object value2;
        Object value3;
        OrderBetType orderBetType;
        lrm lrmVar = this.b;
        boolean zO = lrmVar.o();
        boolean zM = lrmVar.M();
        jrm jrmVar = this.a;
        cwk cwkVar = new cwk(jrmVar.s0(true), jrmVar.Z0(), jrmVar.H1(true), jrmVar.C0(), jrmVar.M0(), jrmVar.n1());
        mi90 mi90Var = this.c;
        wwd0 wwd0Var = mi90Var.k;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(zO)));
        wwd0 wwd0Var2 = mi90Var.l;
        do {
            value2 = wwd0Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!wwd0Var2.g(value2, Boolean.valueOf(zM)));
        wwd0 wwd0Var3 = mi90Var.m;
        do {
            value3 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value3, cwkVar));
        v340 v340Var = mi90Var.d;
        if (v340Var == null || (orderBetType = (OrderBetType) v340Var.a.getValue()) == null) {
            return;
        }
        mi90Var.e((lk50) mi90Var.a.d().a.getValue(), orderBetType, ((Boolean) mi90Var.g.getValue()).booleanValue(), zO, zM, cwkVar, false);
    }
}
