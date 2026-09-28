package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class yj50 implements yym {
    public bnj a;

    @Override // defpackage.yym
    public final bnj a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[PHI: r14
      0x0072: PHI (r14v14 java.lang.Double) = (r14v0 java.lang.Double), (r14v3 java.lang.Double) binds: [B:34:0x0070, B:47:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.yym
    public final void b(String str, Double d, ArrayList arrayList) {
        Object obj;
        Object obj2;
        double dDoubleValue;
        Object obj3;
        Object obj4;
        Object obj5;
        bnj uw20Var;
        Object obj6;
        Object obj7;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i2);
                i2++;
            }
        } while (((sye) obj).c != cs50.MAJOR_WIN);
        boolean z = obj != null;
        if (str != null || z) {
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                int size2 = arrayList.size();
                int i3 = 0;
                do {
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = arrayList.get(i3);
                        i3++;
                    }
                } while (((sye) obj2).c != cs50.MAJOR_WIN);
                sye syeVar = (sye) obj2;
                d = syeVar != null ? Double.valueOf(syeVar.b) : null;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
            }
            double d2 = dDoubleValue;
            int size3 = arrayList.size();
            int i4 = 0;
            do {
                if (i4 >= size3) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = arrayList.get(i4);
                    i4++;
                }
            } while (((sye) obj3).c != cs50.MAJOR_WIN);
            sye syeVar2 = (sye) obj3;
            String str2 = syeVar2 != null ? syeVar2.d : "";
            int size4 = arrayList.size();
            int i5 = 0;
            do {
                if (i5 >= size4) {
                    obj4 = null;
                    break;
                } else {
                    obj4 = arrayList.get(i5);
                    i5++;
                }
            } while (((sye) obj4).c != cs50.MINOR_WIN);
            sye syeVar3 = (sye) obj4;
            Double dValueOf = syeVar3 != null ? Double.valueOf(syeVar3.b) : null;
            int size5 = arrayList.size();
            do {
                if (i >= size5) {
                    obj5 = null;
                    break;
                } else {
                    obj5 = arrayList.get(i);
                    i++;
                }
            } while (((sye) obj5).c != cs50.GOLDEN_RAIN);
            sye syeVar4 = (sye) obj5;
            uw20Var = new uw20(d2, str2, z, str, dValueOf, syeVar4 != null ? Double.valueOf(syeVar4.b) : null);
        } else {
            int size6 = arrayList.size();
            int i6 = 0;
            do {
                if (i6 >= size6) {
                    obj6 = null;
                    break;
                } else {
                    obj6 = arrayList.get(i6);
                    i6++;
                }
            } while (((sye) obj6).c != cs50.MINOR_WIN);
            sye syeVar5 = (sye) obj6;
            Double dValueOf2 = syeVar5 != null ? Double.valueOf(syeVar5.b) : null;
            int size7 = arrayList.size();
            do {
                if (i >= size7) {
                    obj7 = null;
                    break;
                } else {
                    obj7 = arrayList.get(i);
                    i++;
                }
            } while (((sye) obj7).c != cs50.GOLDEN_RAIN);
            sye syeVar6 = (sye) obj7;
            uw20Var = new tw20(dValueOf2, syeVar6 != null ? Double.valueOf(syeVar6.b) : null);
        }
        this.a = uw20Var;
    }
}
