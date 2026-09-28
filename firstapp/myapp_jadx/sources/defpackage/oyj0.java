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
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.WorldCupBetHistoryHandlerImpl$init$4", f = "WorldCupBetHistoryHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oyj0 extends tje0 implements Function2<Pair<? extends w9o<p5k0>, ? extends hug0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pyj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyj0(pyj0 pyj0Var, v1b<? super oyj0> v1bVar) {
        super(2, v1bVar);
        this.b = pyj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oyj0 oyj0Var = new oyj0(this.b, v1bVar);
        oyj0Var.a = obj;
        return oyj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends w9o<p5k0>, ? extends hug0> pair, v1b<? super Unit> v1bVar) {
        return ((oyj0) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0262  */
    /* JADX WARN: Code duplicated, block: B:74:0x0265  */
    /* JADX WARN: Code duplicated, block: B:76:0x026c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0270  */
    /* JADX WARN: Code duplicated, block: B:81:0x027c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0285  */
    /* JADX WARN: Code duplicated, block: B:86:0x0299  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        String str;
        String strV;
        int i;
        ResourceUiText resourceUiText3;
        int i2;
        String str2;
        int i3;
        ResourceUiText resourceUiText4;
        int i4;
        Integer num;
        String str3;
        cd3 cd3VarA;
        int iOrdinal;
        q5k0 q5k0Var;
        mbo kboVar;
        mbo mboVar;
        boolean z;
        q5k0 q5k0Var2;
        Object value;
        Object value2;
        Object value3;
        pyj0 pyj0Var = this.b;
        wwd0 wwd0Var = pyj0Var.m;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        w9o w9oVar = (w9o) pair.a;
        hug0 hug0Var = (hug0) pair.b;
        boolean z2 = w9oVar.a;
        m9o m9oVar = w9oVar.b;
        List list = w9oVar.h;
        if (z2) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, y9o.b.a));
        } else if (m9oVar != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new y9o.a(m9oVar)));
        } else if (list.isEmpty()) {
            x9o x9oVar = new x9o(n1a0.c, null, false, null, "https://s.sporty.net/cms/empty_view_no_data_complete_events_bec326ae75.webp", true, null);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new y9o.c(x9oVar)));
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            bwf0 bwf0Var = bwf0.a;
            String strX = bwf0Var.x(jCurrentTimeMillis);
            List listR0 = CollectionsKt.r0(list, new jyj0());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listR0) {
                String strX2 = bwf0Var.x(((p5k0) obj2).h);
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
                String str4 = (String) entry.getKey();
                List list3 = (List) entry.getValue();
                Collection collectionC = !Intrinsics.g(str4, strX) ? a.c(new i9o.d(str4)) : m2g.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    String str5 = ((p5k0) obj3).i;
                    Object objA2 = linkedHashMap2.get(str5);
                    if (objA2 == null) {
                        objA2 = r9i.a(str5, linkedHashMap2);
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
                    int i5 = 0;
                    List list6 = list4;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            b.q();
                            throw null;
                        }
                        p5k0 p5k0Var = (p5k0) next;
                        Iterator it4 = it3;
                        boolean z3 = p5k0Var.o;
                        String str6 = strX;
                        String str7 = p5k0Var.d;
                        List list7 = list6;
                        String str8 = p5k0Var.c;
                        Iterator it5 = it;
                        Iterator it6 = it2;
                        long j = p5k0Var.h;
                        wwd0 wwd0Var2 = wwd0Var;
                        List<q5k0> list8 = p5k0Var.q;
                        boolean z4 = p5k0Var.p;
                        if (i5 == 0) {
                            String strA = bwf0Var.a(j);
                            strV = bwf0Var.v(j);
                            str = strA;
                        } else {
                            str = null;
                            strV = null;
                        }
                        String strS = rqf0.s(z3, p5k0Var.f);
                        int iR = rqf0.r(z4);
                        ConcatUiText concatUiTextU = rqf0.u(pyj0Var.d.f());
                        String strP = rqf0.p(p5k0Var.e);
                        List<j6k0> list9 = p5k0Var.r;
                        ArrayList arrayList4 = new ArrayList(l48.r(list9, 10));
                        for (Iterator it7 = list9.iterator(); it7.hasNext(); it7 = it7) {
                            j6k0 j6k0Var = (j6k0) it7.next();
                            arrayList4.add(new Pair(j6k0Var.c.a, j6k0Var.e.a));
                        }
                        UiText uiTextK = rqf0.k(arrayList4);
                        boolean z5 = z3 && (q5k0Var2 = (q5k0) CollectionsKt.p0(list8)) != null && q5k0Var2.g;
                        String str9 = p5k0Var.a;
                        if (p5k0Var.o) {
                            boolean z6 = p5k0Var.p;
                            i = R.color.text_inverse_primary;
                            if (z6) {
                                Integer numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
                                ResourceUiText resourceUiText5 = new ResourceUiText(R.string.bet_history__won);
                                i3 = R.color.bg_brand_sub_primary_d_base;
                                resourceUiText4 = resourceUiText5;
                                i4 = R.color.text_inverse_primary;
                                num = numValueOf;
                                str3 = "ticket_cell_result_won_text";
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__lost);
                                i2 = R.color.border_secondary;
                                str2 = "ticket_cell_result_lost_text";
                            }
                            i9o.c.a aVar = new i9o.c.a(i3, i4, pyj0Var.b.a(str7), rqf0.d(list8.size(), str8), num, resourceUiText4, str3);
                            cd3.b.getClass();
                            cd3VarA = cd3.a.a(str8);
                            if (cd3VarA != null) {
                                iOrdinal = cd3VarA.ordinal();
                                if (iOrdinal != 3) {
                                    q5k0Var = (q5k0) CollectionsKt.firstOrNull(list8);
                                    if (q5k0Var == null) {
                                        mboVar = null;
                                    } else {
                                        kboVar = new kbo(rqf0.h(p5k0Var.m, q5k0Var.h.size()));
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
                            if (i5 == iJ) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList3.add(new i9o.c(str7, str9, str, strV, aVar, mboVar, strS, iR, concatUiTextU, strP, uiTextK, z, z4, z5));
                            it3 = it4;
                            i5 = i6;
                            strX = str6;
                            list6 = list7;
                            it = it5;
                            it2 = it6;
                            wwd0Var = wwd0Var2;
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__waiting_to_kick_off);
                            i2 = R.color.text_tertiary;
                            i = R.color.bg_secondary_d_black;
                            str2 = "ticket_cell_result_unsettled_text";
                        }
                        num = null;
                        i3 = i2;
                        resourceUiText4 = resourceUiText3;
                        i4 = i;
                        str3 = str2;
                        i9o.c.a aVar2 = new i9o.c.a(i3, i4, pyj0Var.b.a(str7), rqf0.d(list8.size(), str8), num, resourceUiText4, str3);
                        cd3.b.getClass();
                        cd3VarA = cd3.a.a(str8);
                        if (cd3VarA != null) {
                            iOrdinal = cd3VarA.ordinal();
                            if (iOrdinal != 3) {
                                q5k0Var = (q5k0) CollectionsKt.firstOrNull(list8);
                                if (q5k0Var == null) {
                                    mboVar = null;
                                } else {
                                    kboVar = new kbo(rqf0.h(p5k0Var.m, q5k0Var.h.size()));
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
                        if (i5 == iJ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList3.add(new i9o.c(str7, str9, str, strV, aVar2, mboVar, strS, iR, concatUiTextU, strP, uiTextK, z, z4, z5));
                        it3 = it4;
                        i5 = i6;
                        strX = str6;
                        list6 = list7;
                        it = it5;
                        it2 = it6;
                        wwd0Var = wwd0Var2;
                    }
                    p48.w(arrayList3, arrayList2);
                    hug0Var = hug0Var2;
                    list4 = list6;
                }
                p48.w(CollectionsKt.i0(arrayList2, collectionC), arrayList);
                hug0Var = hug0Var;
                list2 = list4;
            }
            wwd0 wwd0Var3 = wwd0Var;
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
            boolean z7 = w9oVar.f;
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
                if (!((p5k0) it8.next()).o) {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__kick_off);
                    break;
                }
            }
            x9o x9oVar2 = new x9o(qcnVarB, num2, z7, resourceUiText, null, true, resourceUiText2);
            while (true) {
                Object value4 = wwd0Var3.getValue();
                wwd0 wwd0Var4 = wwd0Var3;
                if (wwd0Var4.g(value4, new y9o.c(x9oVar2))) {
                    break;
                }
                wwd0Var3 = wwd0Var4;
            }
        }
        return Unit.a;
    }
}
