package com.sportybet.android.instantwin.presentation.legendsrace;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfo;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoBetOdds;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoBetOddsBetBuilder;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoBetOddsCommon;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoEvent;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import defpackage.a4h;
import defpackage.amc0;
import defpackage.blc0;
import defpackage.bmc0;
import defpackage.clc0;
import defpackage.cmc0;
import defpackage.et7;
import defpackage.flc0;
import defpackage.g1i;
import defpackage.glc0;
import defpackage.h1f;
import defpackage.hbl;
import defpackage.hlc0;
import defpackage.ilc0;
import defpackage.itf0;
import defpackage.j7v;
import defpackage.j8i0;
import defpackage.jh2;
import defpackage.jlc0;
import defpackage.jz4;
import defpackage.kgc0;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l48;
import defpackage.m2g;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.oxc;
import defpackage.p1z;
import defpackage.p7v;
import defpackage.p9j;
import defpackage.r1i;
import defpackage.slc0;
import defpackage.spj;
import defpackage.uhc;
import defpackage.ulc0;
import defpackage.uwd0;
import defpackage.v9c0;
import defpackage.vch0;
import defpackage.vkc0;
import defpackage.vlc0;
import defpackage.vu60;
import defpackage.w9c0;
import defpackage.wkc0;
import defpackage.wlc0;
import defpackage.wwd0;
import defpackage.xkc0;
import defpackage.xlc0;
import defpackage.xwd0;
import defpackage.y5f;
import defpackage.ylc0;
import defpackage.zlc0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/legendsrace/c;", "Lj8i0;", "", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final w9c0 a;
    public final ilc0 b;
    public final h1f c;
    public final jh2 d;
    public final SportyLegendsSettlementInput e;
    public long f;
    public final wwd0 i;
    public final ku90<b> v;
    public final uwd0<y5f> w;
    public final wwd0 y;

    public final void x1() {
        SportyLegendsSettlementInput sportyLegendsSettlementInput;
        SportyLegendsSettlementRoundInfo sportyLegendsSettlementRoundInfo;
        SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEvent;
        Object value;
        Object value2;
        Object value3;
        ilc0 ilc0Var = this.b;
        wwd0 wwd0Var = ilc0Var.e;
        if (((hlc0) wwd0Var.getValue()).c || (sportyLegendsSettlementInput = ilc0Var.h) == null || (sportyLegendsSettlementRoundInfo = sportyLegendsSettlementInput.a) == null || (sportyLegendsSettlementRoundInfoEvent = sportyLegendsSettlementRoundInfo.d) == null) {
            return;
        }
        clc0 clc0VarA = kgc0.a(sportyLegendsSettlementRoundInfoEvent, vlc0.d);
        wwd0 wwd0Var2 = ilc0Var.c;
        do {
            value = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value, clc0VarA));
        wwd0 wwd0Var3 = ilc0Var.g;
        do {
            value2 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value2, wlc0.i));
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, hlc0.a((hlc0) value3, null, null, 3)));
    }

    public final void y1(a aVar) {
        glc0 glc0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        aVar.getClass();
        itf0.a aVar2 = itf0.a;
        aVar2.q("SportyLegendsSettlementViewModel");
        aVar2.a(aVar.toString(), new Object[0]);
        if (aVar.equals(a.b.a)) {
            z1();
            return;
        }
        boolean z = aVar instanceof a.d;
        ilc0 ilc0Var = this.b;
        if (z) {
            ulc0 ulc0Var = ((a.d) aVar).a;
            ulc0Var.getClass();
            wwd0 wwd0Var = ilc0Var.g;
            if (((hlc0) ilc0Var.e.getValue()).c) {
                return;
            }
            if (ulc0Var instanceof hbl) {
                do {
                    value8 = wwd0Var.getValue();
                } while (!wwd0Var.g(value8, wlc0.f));
                return;
            }
            if (ulc0Var instanceof p9j) {
                do {
                    value7 = wwd0Var.getValue();
                } while (!wwd0Var.g(value7, wlc0.i));
                return;
            }
            if (ulc0Var instanceof p1z) {
                do {
                    value6 = wwd0Var.getValue();
                } while (!wwd0Var.g(value6, wlc0.d));
                return;
            } else {
                if (ulc0Var instanceof spj) {
                    int iOrdinal = ((spj) ulc0Var).c.ordinal();
                    if (iOrdinal == 0) {
                        do {
                            value4 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value4, wlc0.d));
                        return;
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return;
                        }
                        do {
                            value5 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value5, wlc0.e));
                        return;
                    }
                }
                return;
            }
        }
        if (aVar instanceof a.c) {
            ulc0 ulc0Var2 = ((a.c) aVar).a;
            ulc0Var2.getClass();
            wwd0 wwd0Var2 = ilc0Var.c;
            if (!((hlc0) ilc0Var.e.getValue()).c && ulc0Var2.getResult() == j7v.a) {
                p7v p7vVarB = ulc0Var2.b();
                int i = p7vVarB == null ? -1 : ilc0.a.a[p7vVarB.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        int i2 = ((clc0) wwd0Var2.getValue()).c;
                        do {
                            value2 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value2, clc0.a((clc0) value2, i2 + 1, 0, 123)));
                        return;
                    } else {
                        if (i != 2) {
                            uhc.a();
                            return;
                        }
                        int i3 = ((clc0) wwd0Var2.getValue()).f;
                        do {
                            value3 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value3, clc0.a((clc0) value3, 0, i3 + 1, 95)));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (aVar instanceof a.e) {
            z1();
            return;
        }
        if (aVar.equals(a.g.a)) {
            wwd0 wwd0Var3 = ilc0Var.e;
            int iOrdinal2 = ((hlc0) wwd0Var3.getValue()).b.ordinal();
            if (iOrdinal2 == 0) {
                glc0Var = glc0.UNMUTED;
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                glc0Var = glc0.MUTED;
            }
            glc0 glc0Var2 = glc0Var;
            do {
                value = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value, hlc0.a((hlc0) value, null, glc0Var2, 5)));
            return;
        }
        boolean zEquals = aVar.equals(a.f.a);
        w9c0 w9c0Var = this.a;
        if (zEquals) {
            z1();
            w9c0Var.c(v9c0.q.a);
        } else {
            if (aVar instanceof a.C0290a) {
                this.c.e(((a.C0290a) aVar).a);
                return;
            }
            if (aVar.equals(xlc0.a)) {
                this.f = System.currentTimeMillis();
            } else if (aVar.equals(ylc0.a)) {
                w9c0Var.c(new v9c0.c(System.currentTimeMillis() - this.f, "PLAYER"));
            } else {
                uhc.a();
            }
        }
    }

    public final void z1() {
        Object value;
        wwd0 wwd0Var = this.y;
        if (wwd0Var.getValue() == vlc0.d) {
            return;
        }
        x1();
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, vlc0.d));
        SportyLegendsSettlementInput sportyLegendsSettlementInput = this.e;
        if (sportyLegendsSettlementInput != null) {
            this.c.d(blc0.a(sportyLegendsSettlementInput));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v15, types: [m2g] */
    public c(vu60 vu60Var, w9c0 w9c0Var, ilc0 ilc0Var, h1f h1fVar, jh2 jh2Var) {
        Object value;
        SportyLegendsSettlementRoundInfo sportyLegendsSettlementRoundInfo;
        SportyLegendsSettlementInput sportyLegendsSettlementInput;
        wwd0 wwd0Var;
        Object value2;
        hlc0 hlc0Var;
        ?? arrayList;
        vkc0 wkc0Var;
        vu60Var.getClass();
        h1fVar.getClass();
        jh2Var.getClass();
        this.a = w9c0Var;
        this.b = ilc0Var;
        this.c = h1fVar;
        this.d = jh2Var;
        SportyLegendsSettlementInput sportyLegendsSettlementInput2 = (SportyLegendsSettlementInput) vu60Var.b("ARG_INPUT");
        this.e = sportyLegendsSettlementInput2;
        vlc0.a.getClass();
        vlc0 vlc0Var = vlc0.b;
        this.i = xwd0.a(new zlc0(vlc0Var, slc0.f));
        this.v = new ku90<>();
        this.w = h1fVar.c();
        vlc0 vlc0Var2 = (vlc0) vu60Var.b(LGxrN.yIBqwsZIAapRWRX);
        wwd0 wwd0VarA = xwd0.a(vlc0Var2 != null ? vlc0Var2 : vlc0Var);
        this.y = wwd0VarA;
        h1fVar.a(o8i0.d(this));
        kzh.d(new g1i(h1fVar.b(), new amc0(2, this, c.class, "handleDoubleOrNothingUiEvent", "handleDoubleOrNothingUiEvent(Lcom/sportybet/android/instantwin/presentation/doubleornothing/DoubleOrNothingUiEvent;)V", 4)), o8i0.d(this));
        kzh.d(new g1i(new n1i(ilc0Var.f, wwd0VarA, new bmc0(vu60Var, null)), new cmc0(this, null)), o8i0.d(this));
        if (sportyLegendsSettlementInput2 != null) {
            et7 et7VarD = o8i0.d(this);
            ilc0 ilc0Var2 = this.b;
            wwd0 wwd0Var2 = ilc0Var2.e;
            wwd0 wwd0Var3 = ilc0Var2.d;
            ilc0Var2.h = sportyLegendsSettlementInput2;
            wwd0 wwd0Var4 = ilc0Var2.c;
            do {
                value = wwd0Var4.getValue();
                sportyLegendsSettlementRoundInfo = sportyLegendsSettlementInput2.a;
            } while (!wwd0Var4.g(value, kgc0.a(sportyLegendsSettlementRoundInfo.d, vlc0.c)));
            loop1: while (true) {
                Object value3 = wwd0Var3.getValue();
                List<SportyLegendsSettlementRoundInfoBetOdds> list = sportyLegendsSettlementRoundInfo.e;
                ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                for (SportyLegendsSettlementRoundInfoBetOdds sportyLegendsSettlementRoundInfoBetOdds : list) {
                    sportyLegendsSettlementRoundInfoBetOdds.getClass();
                    if (!(sportyLegendsSettlementRoundInfoBetOdds instanceof SportyLegendsSettlementRoundInfoBetOddsCommon)) {
                        sportyLegendsSettlementInput = sportyLegendsSettlementInput2;
                        wwd0Var = wwd0VarA;
                        if (!(sportyLegendsSettlementRoundInfoBetOdds instanceof SportyLegendsSettlementRoundInfoBetOddsBetBuilder)) {
                            uhc.a();
                            break loop1;
                        }
                        SportyLegendsSettlementRoundInfoBetOddsBetBuilder sportyLegendsSettlementRoundInfoBetOddsBetBuilder = (SportyLegendsSettlementRoundInfoBetOddsBetBuilder) sportyLegendsSettlementRoundInfoBetOdds;
                        UiText uiText = sportyLegendsSettlementRoundInfoBetOddsBetBuilder.b;
                        StringUiText stringUiText = vch0.a;
                        ConcatUiText concatUiTextH = jz4.a(new ResourceUiText(R.string.page_instant_virtual__bet_builder), " @").h(vch0.d(sportyLegendsSettlementRoundInfoBetOddsBetBuilder.c));
                        List<SportyLegendsSettlementRoundInfoBetOddsBetBuilder.Selection> list2 = sportyLegendsSettlementRoundInfoBetOddsBetBuilder.d;
                        ArrayList arrayList3 = new ArrayList(l48.r(list2, 10));
                        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                            SportyLegendsSettlementRoundInfoBetOddsBetBuilder.Selection selection = (SportyLegendsSettlementRoundInfoBetOddsBetBuilder.Selection) it.next();
                            arrayList3.add(new wkc0.a(selection.b, selection.a));
                        }
                        wkc0Var = new wkc0(uiText, concatUiTextH, arrayList3);
                    } else {
                        SportyLegendsSettlementRoundInfoBetOddsCommon sportyLegendsSettlementRoundInfoBetOddsCommon = (SportyLegendsSettlementRoundInfoBetOddsCommon) sportyLegendsSettlementRoundInfoBetOdds;
                        UiText uiText2 = sportyLegendsSettlementRoundInfoBetOddsCommon.b;
                        sportyLegendsSettlementInput = sportyLegendsSettlementInput2;
                        String str = sportyLegendsSettlementRoundInfoBetOddsCommon.d;
                        wwd0Var = wwd0VarA;
                        String strA = oxc.a(sportyLegendsSettlementRoundInfoBetOddsCommon.e, " @", sportyLegendsSettlementRoundInfoBetOddsCommon.c);
                        StringUiText stringUiText2 = vch0.a;
                        wkc0Var = new xkc0(uiText2, str, new StringUiText(strA));
                    }
                    arrayList2.add(wkc0Var);
                    sportyLegendsSettlementInput2 = sportyLegendsSettlementInput;
                    wwd0VarA = wwd0Var;
                }
                sportyLegendsSettlementInput = sportyLegendsSettlementInput2;
                wwd0Var = wwd0VarA;
                if (wwd0Var3.g(value3, a4h.b(arrayList2))) {
                    do {
                        value2 = wwd0Var2.getValue();
                        hlc0Var = (hlc0) value2;
                        String str2 = sportyLegendsSettlementRoundInfo.d.e;
                        ArrayList arrayList4 = new ArrayList();
                        int i = 0;
                        List listF0 = StringsKt.f0(str2, new char[]{'H'});
                        if (listF0.size() != 2) {
                            itf0.a aVar = itf0.a;
                            aVar.q("SLMatchTrackerStateHandlerImpl");
                            aVar.a("Invalid result sequence: ".concat(str2), new Object[0]);
                            arrayList = m2g.a;
                        } else {
                            ArrayList arrayListB = ilc0Var2.b((String) listF0.get(0), true);
                            ArrayList arrayListB2 = ilc0Var2.b((String) listF0.get(1), false);
                            arrayList4.add(p1z.b);
                            arrayList4.addAll(arrayListB);
                            arrayList4.add(hbl.b);
                            arrayList4.addAll(arrayListB2);
                            arrayList4.add(p9j.b);
                            arrayList = new ArrayList(l48.r(arrayList4, 10));
                            int size = arrayList4.size();
                            while (i < size) {
                                Object obj = arrayList4.get(i);
                                i++;
                                ulc0 ulc0Var = (ulc0) obj;
                                arrayList.add(new flc0(ulc0Var, ((ulc0Var instanceof p1z) || (ulc0Var instanceof p9j) || (ulc0Var instanceof hbl)) ? flc0.a.a : flc0.a.b));
                            }
                        }
                    } while (!wwd0Var2.g(value2, hlc0.a(hlc0Var, a4h.b(arrayList), null, 6)));
                    kzh.d(r1i.b(wwd0Var4, wwd0Var3, wwd0Var2, ilc0Var2.g, new jlc0(ilc0Var2, null)), et7VarD);
                    break;
                }
                sportyLegendsSettlementInput2 = sportyLegendsSettlementInput;
                wwd0VarA = wwd0Var;
            }
            if (wwd0Var.getValue() == vlc0.d) {
                x1();
                if (sportyLegendsSettlementInput != null) {
                    h1fVar.d(blc0.a(sportyLegendsSettlementInput));
                }
            }
        }
    }
}
