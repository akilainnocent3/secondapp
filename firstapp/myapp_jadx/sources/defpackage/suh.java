package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$calculateFlexProbabilitiesAsync$2", f = "FlexCalculateUtils.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class suh extends tje0 implements Function2<v5b, v1b<? super Map<String, ? extends String>>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suh(ArrayList arrayList, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.c = arrayList;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new suh(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Map<String, ? extends String>> v1bVar) {
        return ((suh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            ArrayList arrayList = this.c;
            if (arrayList.size() <= 1) {
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                return o2gVar;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                arrayList2.add(new Double(Double.parseDouble((String) obj2)));
            }
            zuh zuhVar = zuh.a;
            this.a = size;
            this.b = 1;
            obj = zuhVar.a(arrayList2, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            i = size;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            uj50.b(obj);
        }
        Map map = (Map) obj;
        double d = Double.parseDouble(this.d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i <= 17) {
            double dS0 = CollectionsKt.s0(map.values());
            for (int i4 = 2; i4 < i; i4++) {
                Double d2 = (Double) map.get(new Integer(i4));
                double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                linkedHashMap.put(String.valueOf(i4), String.valueOf(d / dS0));
                dS0 -= dDoubleValue;
            }
        } else {
            Integer num = o4p.r.get(new Integer(i));
            int iIntValue = num != null ? num.intValue() : 0;
            int i5 = i + 1;
            Double[] dArr = new Double[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                dArr[i6] = new Double(0.0d);
            }
            if (iIntValue <= i) {
                int i7 = i;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    Double d3 = (Double) map.get(new Integer(i7));
                    dDoubleValue2 += d3 != null ? d3.doubleValue() : 0.0d;
                    dArr[i7] = new Double(dDoubleValue2);
                    if (i7 == iIntValue) {
                        break;
                    }
                    i7--;
                }
            }
            while (iIntValue < i) {
                linkedHashMap.put(String.valueOf(iIntValue), String.valueOf(d / dArr[iIntValue].doubleValue()));
                iIntValue++;
            }
        }
        if (i >= 3) {
            Double d4 = (Double) map.get(new Integer(i - 1));
            double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
            Double d5 = (Double) map.get(new Integer(i));
            linkedHashMap.put("ONE_CUT", String.valueOf(d / (dDoubleValue3 + (d5 != null ? d5.doubleValue() : 0.0d))));
        }
        return linkedHashMap;
    }
}
