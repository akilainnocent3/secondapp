package defpackage;

import com.sportybet.core.domain.model.a;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nuq extends saj implements Function1<buq, Unit> {
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(buq buqVar) {
        qcn qcnVar;
        Object value;
        buq buqVar2 = buqVar;
        buqVar2.getClass();
        tuq tuqVar = (tuq) this.receiver;
        bnh0 bnh0Var = tuqVar.d;
        if (buqVar2.equals(buq.e.a)) {
            tuqVar.x1();
        } else {
            osv osvVar = null;
            Object obj = null;
            osvVar = null;
            if (buqVar2 instanceof buq.f) {
                int i = ((buq.f) buqVar2).a;
                wwd0 wwd0Var = tuqVar.y;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, a4h.h(yi80.f((ucn) value, Integer.valueOf(i)))));
                kzh.d(ozh.c(new g1i(bm50.a(new or60(new ztq(tuqVar.b.a, i, null))), new uuq(tuqVar, i, null)), tuqVar.f), o8i0.d(tuqVar));
            } else if (buqVar2.equals(buq.d.a)) {
                tuqVar.y1(new nvp.e(bnh0Var.h("m/wv/loyalty/mission/terms-and-conditions"), vj5.a(new Pair("data_enable_default_action_bar", Boolean.FALSE))));
            } else if (buqVar2.equals(buq.c.a)) {
                tuqVar.y1(new nvp.d(wae.LOYALTY, a4h.a(new Pair("tab", "mission"))));
            } else if (buqVar2 instanceof buq.a) {
                int i2 = ((buq.a) buqVar2).a;
                Object value2 = tuqVar.i.getValue();
                lk50.c cVar = value2 instanceof lk50.c ? (lk50.c) value2 : null;
                if (cVar != null && (qcnVar = (qcn) cVar.a) != null) {
                    for (Object obj2 : qcnVar) {
                        if (((osv) obj2).a == i2) {
                            obj = obj2;
                            break;
                        }
                    }
                    osvVar = (osv) obj;
                }
                if (osvVar != null) {
                    ArrayList arrayList = osvVar.r;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        if (obj3 instanceof rtv.b) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        tuqVar.y1(new nvp.d(wae.ME_GIFTS));
                    } else {
                        int size2 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            ArrayList arrayList3 = ((rtv.b) obj4).d;
                            if (!arrayList3.isEmpty()) {
                                int size3 = arrayList3.size();
                                int i5 = 0;
                                while (i5 < size3) {
                                    Object obj5 = arrayList3.get(i5);
                                    i5++;
                                    if (((a) obj5).a == 162) {
                                        tuqVar.C.a(duq.a.a);
                                    }
                                }
                            }
                        }
                        tuqVar.y1(new nvp.d(wae.ME_GIFTS));
                    }
                } else {
                    tuqVar.y1(new nvp.d(wae.ME_GIFTS));
                }
            } else if (buqVar2 instanceof buq.b) {
                String str = ((buq.b) buqVar2).a;
                if (StringsKt.U(str)) {
                    str = null;
                }
                if (str != null) {
                    tuqVar.y1(new nvp.e(bnh0Var.h(str), null));
                }
            } else {
                if (!(buqVar2 instanceof buq.g)) {
                    uhc.a();
                    return null;
                }
                int i6 = ((buq.g) buqVar2).a;
                wwd0 wwd0Var2 = tuqVar.w;
                ucn ucnVar = (ucn) wwd0Var2.getValue();
                boolean zContains = ucnVar.contains(Integer.valueOf(i6));
                Integer numValueOf = Integer.valueOf(i6);
                wwd0Var2.k(null, a4h.h(zContains ? yi80.c(ucnVar, numValueOf) : yi80.f(ucnVar, numValueOf)));
            }
        }
        return Unit.a;
    }
}
