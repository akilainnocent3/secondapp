package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntranceFromButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkjq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kjq extends j8i0 {
    public final v340 A;
    public final ku90<lhq> B;
    public final v340 C;
    public final c7k a;
    public final psm b;
    public final uhq c;
    public final Map<atq, xsq> d;
    public final rdd0 e;
    public final odd f;
    public final h8r i;
    public final wwd0 v;
    public final wwd0 w;
    public jvd0 y;
    public final v340 z;

    public kjq(vu60 vu60Var, c7k c7kVar, psm psmVar, uhq uhqVar, i6u i6uVar, d150 d150Var, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        h8r h8rVar;
        vu60Var.getClass();
        psmVar.getClass();
        i6uVar.getClass();
        d150Var.getClass();
        rdd0Var.getClass();
        this.a = c7kVar;
        this.b = psmVar;
        this.c = uhqVar;
        this.d = d150Var;
        this.e = rdd0Var;
        this.f = oddVar;
        String str = (String) vu60Var.b("orderId");
        str = str == null ? "" : str;
        if (StringsKt.U(str)) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            h8rVar = (h8r) fnf.a(vu60Var, jq40.a(h8r.class), o2gVar);
        } else {
            h8rVar = new h8r(str, true);
        }
        this.i = h8rVar;
        wwd0 wwd0VarA = xwd0.a(chq.a.a);
        this.v = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(lk50.b.a);
        this.w = wwd0VarA2;
        ijq ijqVar = new ijq(wwd0VarA2);
        ygq ygqVar = new ygq(0);
        lyh lyhVarC = ozh.c(ijqVar, oddVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.z = e1i.e(lyhVarC, et7VarD, kwd0Var, ygqVar);
        this.A = e1i.e(ozh.c(i6uVar.k.d, oddVar), o8i0.d(this), kwd0Var, n1a0.c);
        this.B = new ku90<>();
        this.C = e1i.e(ozh.c(new n1i(wwd0VarA2, wwd0VarA, new jjq(3, null)), oddVar), o8i0.d(this), kwd0Var, new bjq(0));
    }

    public final void x1(xgq xgqVar) {
        piq piqVar;
        xgqVar.getClass();
        boolean zEquals = xgqVar.equals(xgq.g.a);
        h8r h8rVar = this.i;
        LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton = null;
        str = null;
        String str = null;
        if (zEquals) {
            jvd0 jvd0Var = this.y;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.w.setValue(lk50.b.a);
            this.y = kzh.d(ozh.c(new g1i(new wl50(this.a.a(h8rVar.a), new Function1() { // from class: ejq
                /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z;
                    boolean z2;
                    int i;
                    String strA;
                    boolean z3;
                    String strA2;
                    piq piqVar2;
                    f0q f0qVar = (f0q) obj;
                    f0qVar.getClass();
                    BigDecimal bigDecimalSubtract = f0qVar.e;
                    kjq kjqVar = this.a;
                    String strB = kjqVar.b.B();
                    Map<atq, xsq> map = kjqVar.d;
                    strB.getClass();
                    map.getClass();
                    qcn<v2q> qcnVar = f0qVar.m;
                    BigDecimal bigDecimal = f0qVar.f;
                    hlr hlrVar = f0qVar.h;
                    v2q v2qVar = (v2q) CollectionsKt.firstOrNull(qcnVar);
                    String str2 = f0qVar.b;
                    String str3 = v2qVar != null ? v2qVar.c : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    pxq pxqVar = f0qVar.d;
                    hlr hlrVar2 = f0qVar.h;
                    Date date = new Date(f0qVar.k);
                    Locale locale = Locale.US;
                    locale.getClass();
                    String str4 = str2;
                    String strL = bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0);
                    String strA3 = ukd0.a(2, bigDecimalSubtract, true, true);
                    if (f0qVar.l) {
                        if (qcnVar == null || !qcnVar.isEmpty()) {
                            Iterator<v2q> it = qcnVar.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (it.next().k != hlr.WIN) {
                                        z = false;
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    int iOrdinal = hlrVar.ordinal();
                    if (iOrdinal == 0) {
                        z2 = true;
                        i = 2;
                        strA = "--";
                    } else {
                        if (iOrdinal != 1) {
                            i = 2;
                            if (iOrdinal == 2) {
                                z2 = true;
                            } else if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    uhc.a();
                                    return null;
                                }
                                z2 = true;
                                i = 2;
                                strA = "--";
                            } else {
                                if (bigDecimal != null) {
                                    bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimal);
                                    bigDecimalSubtract.getClass();
                                    rkd0.a aVar = rkd0.Companion;
                                }
                                z2 = true;
                                i = 2;
                                strA = ukd0.a(2, bigDecimalSubtract, true, true);
                            }
                        } else {
                            z2 = true;
                            i = 2;
                        }
                        strA = ukd0.a(i, f0qVar.g, z2, z2);
                    }
                    int iOrdinal2 = hlrVar.ordinal();
                    if (iOrdinal2 == 0) {
                        z3 = false;
                    } else if (iOrdinal2 == z2 || iOrdinal2 == i || iOrdinal2 == 3) {
                        z3 = true;
                    } else {
                        if (iOrdinal2 != 4) {
                            uhc.a();
                            return null;
                        }
                        z3 = false;
                    }
                    boolean z4 = (v2qVar == null || !v2qVar.t || StringsKt.U(v2qVar.c)) ? false : true;
                    ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                    for (Iterator<v2q> it2 = qcnVar.iterator(); it2.hasNext(); it2 = it2) {
                        v2q next = it2.next();
                        String str5 = strA;
                        xsq xsqVar = map.get(next.g);
                        if (xsqVar == null) {
                            piqVar2 = new piq(0);
                        } else {
                            isq isqVarC = xsqVar.c(next.s, next.r, next.n, next.o, next.p, next.q);
                            String str6 = next.d;
                            String str7 = next.b;
                            String str8 = next.f;
                            Date date2 = new Date(next.l);
                            Locale locale2 = Locale.US;
                            locale2.getClass();
                            piqVar2 = new piq(str6, str7, str8, bwf0.l(date2, "dd-MM-yyyy HH:mm", locale2, 2, 0), next.k, ukd0.a(2, next.i, true, true), isqVarC.a, isqVarC.b);
                        }
                        arrayList.add(piqVar2);
                        str4 = str4;
                        strA = str5;
                        z = z;
                        map = map;
                    }
                    String str9 = strA;
                    boolean z5 = z;
                    String str10 = str4;
                    uf00 uf00VarF = a4h.f(arrayList);
                    if (bigDecimal != null) {
                        rkd0 rkd0Var = new rkd0(bigDecimal);
                        rkd0.Companion.getClass();
                        if (bigDecimal.compareTo(rkd0.b) <= 0) {
                            rkd0Var = null;
                        }
                        BigDecimal bigDecimal2 = rkd0Var != null ? rkd0Var.a : null;
                        if (bigDecimal2 != null) {
                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(-1L);
                            bigDecimalValueOf.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(bigDecimal2);
                            bigDecimalMultiply.getClass();
                            strA2 = ukd0.a(2, bigDecimalMultiply, true, true);
                        } else {
                            strA2 = "-0.00";
                        }
                    } else {
                        strA2 = "-0.00";
                    }
                    return new ygq(str10, str3, pxqVar, hlrVar2, strL, strB, strA3, str9, z3, strA2, z5, z4, uf00VarF);
                }
            }), new hjq(this, null)), this.f), o8i0.d(this));
            return;
        }
        boolean zEquals2 = xgqVar.equals(xgq.a.a);
        ku90<lhq> ku90Var = this.B;
        if (zEquals2) {
            ku90Var.a(new lhq.a(new nvp.f(3, (uf00) null)));
            return;
        }
        if (xgqVar.equals(xgq.j.a)) {
            ku90Var.a(new lhq.a(new nvp.d(wae.CONTACT_US)));
            return;
        }
        if (xgqVar instanceof xgq.k) {
            ku90Var.a(new lhq.a(new nvp.d(wae.TRANS_SEARCH, a4h.a(new Pair(AnalyticsParam.EVENT_PARAM_ID, ((xgq.k) xgqVar).a)))));
            return;
        }
        if (xgqVar.equals(xgq.c.a)) {
            String str2 = h8rVar.a;
            uhq uhqVar = this.c;
            uhqVar.getClass();
            str2.getClass();
            kzh.d(new g1i(bm50.a(new fjq(uhqVar.b.c(new shq(uhqVar, str2, null)))), new gjq(this, str2, null)), o8i0.d(this));
            return;
        }
        boolean zEquals3 = xgqVar.equals(xgq.b.a);
        wwd0 wwd0Var = this.v;
        if (zEquals3) {
            wwd0Var.setValue(chq.a.a);
            return;
        }
        if (xgqVar.equals(xgq.h.a)) {
            wwd0Var.setValue(c5q.b.a);
            return;
        }
        if (xgqVar.equals(xgq.d.a)) {
            StringUiText stringUiText = vch0.a;
            ku90Var.a(new lhq.a(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__draw_id_copied_toast_message), true)));
            return;
        }
        if (xgqVar instanceof xgq.i) {
            wwd0Var.setValue(chq.b.a);
            return;
        }
        boolean zEquals4 = xgqVar.equals(xgq.e.a);
        v340 v340Var = this.z;
        if (zEquals4) {
            djr.a(this.e, cjr.n.a);
            ygq ygqVar = (ygq) v340Var.a.getValue();
            String strA = oxc.a(ygqVar.f, " ", ygqVar.h);
            String str3 = h8rVar.a;
            qcn<piq> qcnVar = ygqVar.m;
            if (qcnVar.size() != 1) {
                qcnVar = null;
            }
            if (qcnVar != null && (piqVar = (piq) CollectionsKt.firstOrNull(qcnVar)) != null) {
                str = piqVar.a;
            }
            ku90Var.a(new lhq.a(new nvp.c(new lcr(strA, str3, str))));
            return;
        }
        if (!xgqVar.equals(xgq.f.a)) {
            uhc.a();
            return;
        }
        ygq ygqVar2 = (ygq) v340Var.a.getValue();
        Iterable iterable = (Iterable) this.A.a.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (Intrinsics.g(((dsq) it.next()).a, ygqVar2.b)) {
                    String str4 = ygqVar2.b;
                    LNPlaceBetEntrance lNPlaceBetEntrance = LNPlaceBetEntrance.TICKET_DETAIL;
                    int iOrdinal = ygqVar2.d.ordinal();
                    if (iOrdinal == 1) {
                        lNPlaceBetEntranceFromButton = LNPlaceBetEntranceFromButton.RE_BET_WIN;
                    } else if (iOrdinal == 2) {
                        lNPlaceBetEntranceFromButton = LNPlaceBetEntranceFromButton.RE_BET_LOST;
                    } else if (iOrdinal == 3) {
                        lNPlaceBetEntranceFromButton = LNPlaceBetEntranceFromButton.RE_BET_VOID;
                    }
                    ku90Var.a(new lhq.a(new nvp.c(new q8r(str4, lNPlaceBetEntrance, null, lNPlaceBetEntranceFromButton, null, h8rVar.a, 52))));
                    return;
                }
            }
        }
        StringUiText stringUiText2 = vch0.a;
        ku90Var.a(new lhq.a(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__draw_is_currently_unavailable), false)));
    }
}
