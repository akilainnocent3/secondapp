package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.BasketballBetHistoryHandlerImpl$init$4", f = "BasketballBetHistoryHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ad2 extends tje0 implements Function2<Pair<? extends w9o<eon>, ? extends hug0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bd2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad2(bd2 bd2Var, v1b<? super ad2> v1bVar) {
        super(2, v1bVar);
        this.b = bd2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ad2 ad2Var = new ad2(this.b, v1bVar);
        ad2Var.a = obj;
        return ad2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends w9o<eon>, ? extends hug0> pair, v1b<? super Unit> v1bVar) {
        return ((ad2) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0258  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        Object value;
        String str;
        String strV;
        Integer num;
        String str2;
        ResourceUiText resourceUiText3;
        int i;
        int i2;
        mbo kboVar;
        mbo mboVar;
        Object value2;
        Object value3;
        Object value4;
        bd2 bd2Var = this.b;
        wwd0 wwd0Var = bd2Var.l;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        w9o w9oVar = (w9o) pair.a;
        hug0 hug0Var = (hug0) pair.b;
        boolean z = w9oVar.a;
        m9o m9oVar = w9oVar.b;
        List list = w9oVar.h;
        if (z) {
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, y9o.b.a));
        } else if (m9oVar != null) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new y9o.a(m9oVar)));
        } else if (list.isEmpty()) {
            x9o x9oVar = new x9o(n1a0.c, null, false, null, "https://s.sporty.net/cms/img_ib_empty_bet_history_767982add2.png", true, null);
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new y9o.c(x9oVar)));
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            bwf0 bwf0Var = bwf0.a;
            String strX = bwf0Var.x(jCurrentTimeMillis);
            List listR0 = CollectionsKt.r0(list, new vc2());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listR0) {
                String strX2 = bwf0Var.x(((eon) obj2).h);
                Object objA = linkedHashMap.get(strX2);
                if (objA == null) {
                    objA = r9i.a(strX2, linkedHashMap);
                }
                ((List) objA).add(obj2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            List list2 = list;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                List list3 = (List) entry.getValue();
                Collection collectionC = !Intrinsics.g(str3, strX) ? a.c(new i9o.d(str3)) : m2g.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    String str4 = ((eon) obj3).i;
                    Object objA2 = linkedHashMap2.get(str4);
                    if (objA2 == null) {
                        objA2 = r9i.a(str4, linkedHashMap2);
                    }
                    ((List) objA2).add(obj3);
                }
                Collection collectionValues = linkedHashMap2.values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                List list4 = list2;
                while (it2.hasNext()) {
                    List list5 = (List) it2.next();
                    int iJ = b.j(list5);
                    hug0 hug0Var2 = hug0Var;
                    ArrayList arrayList3 = new ArrayList(l48.r(list5, 10));
                    Iterator it3 = list5.iterator();
                    int i3 = 0;
                    List list6 = list4;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw null;
                        }
                        eon eonVar = (eon) next;
                        Iterator it4 = it3;
                        boolean z2 = eonVar.p;
                        String str5 = eonVar.d;
                        String str6 = strX;
                        List<fon> list7 = eonVar.q;
                        String str7 = eonVar.c;
                        List list8 = list6;
                        boolean z3 = eonVar.o;
                        Iterator it5 = it;
                        Iterator it6 = it2;
                        long j = eonVar.h;
                        if (i3 == 0) {
                            String strA = bwf0Var.a(j);
                            strV = bwf0Var.v(j);
                            str = strA;
                        } else {
                            str = null;
                            strV = null;
                        }
                        String strS = rqf0.s(z3, eonVar.f);
                        int iR = rqf0.r(z2);
                        ConcatUiText concatUiTextU = rqf0.u(bd2Var.c.f());
                        String strP = rqf0.p(eonVar.e);
                        List<uon> list9 = eonVar.r;
                        bwf0 bwf0Var2 = bwf0Var;
                        ArrayList arrayList4 = new ArrayList(l48.r(list9, 10));
                        for (Iterator it7 = list9.iterator(); it7.hasNext(); it7 = it7) {
                            uon uonVar = (uon) it7.next();
                            arrayList4.add(new Pair(uonVar.c.a, uonVar.e.a));
                        }
                        UiText uiTextK = rqf0.k(arrayList4);
                        String str8 = eonVar.a;
                        if (!z3) {
                            num = null;
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__waiting_to_start_game);
                            i = R.color.text_tertiary;
                            i2 = R.color.bg_secondary_d_black;
                            str2 = "ticket_cell_result_unsettled_text";
                        } else if (eonVar.p) {
                            Integer numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
                            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.bet_history__won);
                            i = R.color.bg_brand_sub_primary_d_base;
                            num = numValueOf;
                            resourceUiText3 = resourceUiText4;
                            i2 = R.color.text_inverse_primary;
                            str2 = "ticket_cell_result_won_text";
                        } else {
                            num = null;
                            str2 = "ticket_cell_result_lost_text";
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__lost);
                            i = R.color.border_secondary;
                            i2 = R.color.text_inverse_primary;
                        }
                        i9o.c.a aVar = new i9o.c.a(i, i2, bd2Var.b.a(str5), rqf0.d(r6.size(), str7), num, resourceUiText3, str2);
                        cd3.b.getClass();
                        cd3 cd3VarA = cd3.a.a(str7);
                        if (cd3VarA != null) {
                            int iOrdinal = cd3VarA.ordinal();
                            if (iOrdinal == 3) {
                                fon fonVar = (fon) CollectionsKt.firstOrNull(list7);
                                if (fonVar == null) {
                                    mboVar = null;
                                } else {
                                    kboVar = new kbo(rqf0.h(eonVar.m, fonVar.h.size()));
                                    mboVar = kboVar;
                                }
                            } else if (iOrdinal != 4) {
                                mboVar = null;
                            } else {
                                kboVar = new lbo(rqf0.l(hug0Var2));
                                mboVar = kboVar;
                            }
                        } else {
                            mboVar = null;
                        }
                        arrayList3.add(new i9o.c(str5, str8, str, strV, aVar, mboVar, strS, iR, concatUiTextU, strP, uiTextK, i3 == iJ, z2, false));
                        it3 = it4;
                        i3 = i4;
                        bwf0Var = bwf0Var2;
                        strX = str6;
                        list6 = list8;
                        it = it5;
                        it2 = it6;
                    }
                    p48.w(arrayList3, arrayList2);
                    hug0Var = hug0Var2;
                    list4 = list6;
                }
                p48.w(CollectionsKt.i0(arrayList2, collectionC), arrayList);
                hug0Var = hug0Var;
                list2 = list4;
            }
            List list10 = list2;
            ngs ngsVarB = a.b();
            ngsVarB.addAll(arrayList);
            if (w9oVar.d) {
                ngsVarB.add(i9o.b.a);
            } else {
                m9o m9oVar2 = w9oVar.e;
                if (m9oVar2 != null) {
                    ngsVarB.add(new i9o.a(m9oVar2));
                }
            }
            qcn qcnVarB = a4h.b(a.a(ngsVarB));
            Integer num2 = w9oVar.c ? new Integer(5) : null;
            boolean z4 = w9oVar.f;
            if (w9oVar.g != null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
            } else {
                resourceUiText = null;
            }
            if (list10.isEmpty()) {
                resourceUiText2 = null;
                break;
            }
            Iterator it8 = list10.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    resourceUiText2 = null;
                    break;
                }
                if (!((eon) it8.next()).o) {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__start_game);
                    break;
                }
            }
            x9o x9oVar2 = new x9o(qcnVarB, num2, z4, resourceUiText, null, true, resourceUiText2);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new y9o.c(x9oVar2)));
        }
        return Unit.a;
    }
}
