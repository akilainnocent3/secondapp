package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fpp {
    public static final hep.a a = hep.a.a("k");

    public static ArrayList a(hep hepVar, xmt xmtVar, float f, cvh0 cvh0Var, boolean z) {
        hep hepVar2;
        xmt xmtVar2;
        float f2;
        cvh0 cvh0Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (hepVar.J() == hep.b.f) {
            xmtVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        hepVar.f();
        while (hepVar.o()) {
            if (hepVar.V(a) != 0) {
                hepVar.Z();
            } else if (hepVar.J() == hep.b.a) {
                hepVar.d();
                if (hepVar.J() == hep.b.i) {
                    hep hepVar3 = hepVar;
                    xmt xmtVar3 = xmtVar;
                    float f3 = f;
                    cvh0 cvh0Var3 = cvh0Var;
                    boolean z3 = z;
                    cpp cppVarB = epp.b(hepVar3, xmtVar3, f3, cvh0Var3, false, z3);
                    hepVar2 = hepVar3;
                    xmtVar2 = xmtVar3;
                    f2 = f3;
                    cvh0Var2 = cvh0Var3;
                    z2 = z3;
                    arrayList.add(cppVarB);
                } else {
                    hepVar2 = hepVar;
                    xmtVar2 = xmtVar;
                    f2 = f;
                    cvh0Var2 = cvh0Var;
                    z2 = z;
                    while (hepVar2.o()) {
                        arrayList.add(epp.b(hepVar2, xmtVar2, f2, cvh0Var2, true, z2));
                    }
                }
                hepVar2.g();
                hepVar = hepVar2;
                xmtVar = xmtVar2;
                f = f2;
                cvh0Var = cvh0Var2;
                z = z2;
            } else {
                hep hepVar4 = hepVar;
                arrayList.add(epp.b(hepVar4, xmtVar, f, cvh0Var, false, z));
                hepVar = hepVar4;
            }
        }
        hepVar.l();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            cpp cppVar = (cpp) arrayList.get(i2);
            i2++;
            cpp cppVar2 = (cpp) arrayList.get(i2);
            cppVar.h = Float.valueOf(cppVar2.g);
            if (cppVar.c == 0 && (t = cppVar2.b) != 0) {
                cppVar.c = t;
                if (cppVar instanceof lxz) {
                    ((lxz) cppVar).d();
                }
            }
        }
        cpp cppVar3 = (cpp) arrayList.get(i);
        if ((cppVar3.b == 0 || cppVar3.c == 0) && arrayList.size() > 1) {
            arrayList.remove(cppVar3);
        }
    }
}
