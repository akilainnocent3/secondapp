package defpackage;

import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class hoh {
    public final n730<yz> a;
    public Integer b = null;

    public hoh(n730 n730Var) {
        this.a = n730Var;
    }

    public static boolean a(ArrayList arrayList, k5 k5Var) {
        String str = k5Var.a;
        String str2 = k5Var.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k5 k5Var2 = (k5) obj;
            if (k5Var2.a.equals(str) && k5Var2.b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ArrayList arrayList) throws j5 {
        n730<yz> n730Var = this.a;
        if (n730Var.get() == null) {
            throw new j5("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                if (arrayList2.isEmpty()) {
                    if (n730Var.get() == null) {
                        throw new j5("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    ArrayList arrayListA = n730Var.get().a();
                    int size2 = arrayListA.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayListA.get(i2);
                        i2++;
                        n730Var.get().d(((yz.a) obj).b);
                    }
                    return;
                }
                if (n730Var.get() == null) {
                    throw new j5("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList arrayListA2 = n730Var.get().a();
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                for (int size3 = arrayListA2.size(); i3 < size3; size3 = size3) {
                    Object obj2 = arrayListA2.get(i3);
                    i3++;
                    yz.a aVar = (yz.a) obj2;
                    String[] strArr = k5.g;
                    String str = aVar.d;
                    arrayList3.add(new k5(aVar.b, String.valueOf(aVar.c), str != null ? str : "", new Date(aVar.m), aVar.e, aVar.j));
                }
                ArrayList arrayList4 = new ArrayList();
                int size4 = arrayList3.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    k5 k5Var = (k5) obj3;
                    if (!a(arrayList2, k5Var)) {
                        arrayList4.add(k5Var.a());
                    }
                }
                int size5 = arrayList4.size();
                int i5 = 0;
                while (i5 < size5) {
                    Object obj4 = arrayList4.get(i5);
                    i5++;
                    n730Var.get().d(((yz.a) obj4).b);
                }
                ArrayList arrayList5 = new ArrayList();
                int size6 = arrayList2.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    k5 k5Var2 = (k5) obj5;
                    if (!a(arrayList3, k5Var2)) {
                        arrayList5.add(k5Var2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(n730Var.get().a());
                Integer numValueOf = this.b;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(n730Var.get().g());
                    this.b = numValueOf;
                }
                int iIntValue = numValueOf.intValue();
                int size7 = arrayList5.size();
                int i7 = 0;
                while (i7 < size7) {
                    Object obj6 = arrayList5.get(i7);
                    i7++;
                    k5 k5Var3 = (k5) obj6;
                    while (arrayDeque.size() >= iIntValue) {
                        n730Var.get().d(((yz.a) arrayDeque.pollFirst()).b);
                    }
                    yz.a aVarA = k5Var3.a();
                    n730Var.get().b(aVarA);
                    arrayDeque.offer(aVarA);
                }
                return;
            }
            Object obj7 = arrayList.get(i);
            i++;
            Map map = (Map) obj7;
            String[] strArr2 = k5.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = k5.g;
            for (int i8 = 0; i8 < 5; i8++) {
                String str2 = strArr3[i8];
                if (!map.containsKey(str2)) {
                    arrayList6.add(str2);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new j5(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new k5((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", k5.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new j5("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new j5("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}
