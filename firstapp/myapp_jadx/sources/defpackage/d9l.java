package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d9l {
    public static v6j0 a(ixa ixaVar, int i, ArrayList<v6j0> arrayList, v6j0 v6j0Var) {
        int i2;
        int i3 = i == 0 ? ixaVar.t0 : ixaVar.u0;
        if (i3 != -1 && (v6j0Var == null || i3 != v6j0Var.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                v6j0 v6j0Var2 = arrayList.get(i4);
                if (v6j0Var2.b == i3) {
                    if (v6j0Var != null) {
                        v6j0Var.c(i, v6j0Var2);
                        arrayList.remove(v6j0Var);
                    }
                    v6j0Var = v6j0Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return v6j0Var;
        }
        if (v6j0Var == null) {
            if (ixaVar instanceof yil) {
                yil yilVar = (yil) ixaVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= yilVar.w0) {
                        i2 = -1;
                        break;
                    }
                    ixa ixaVar2 = yilVar.v0[i5];
                    if ((i == 0 && (i2 = ixaVar2.t0) != -1) || (i == 1 && (i2 = ixaVar2.u0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        v6j0 v6j0Var3 = arrayList.get(i6);
                        if (v6j0Var3.b == i2) {
                            v6j0Var = v6j0Var3;
                            break;
                        }
                    }
                }
            }
            if (v6j0Var == null) {
                v6j0Var = new v6j0();
                v6j0Var.a = new ArrayList<>();
                v6j0Var.d = null;
                v6j0Var.e = -1;
                int i7 = v6j0.f;
                v6j0.f = i7 + 1;
                v6j0Var.b = i7;
                v6j0Var.c = i;
            }
            arrayList.add(v6j0Var);
        }
        ArrayList<ixa> arrayList2 = v6j0Var.a;
        if (arrayList2.contains(ixaVar)) {
            return v6j0Var;
        }
        arrayList2.add(ixaVar);
        if (ixaVar instanceof qal) {
            qal qalVar = (qal) ixaVar;
            qalVar.y0.c(qalVar.z0 == 0 ? 1 : 0, v6j0Var, arrayList);
        }
        int i8 = v6j0Var.b;
        if (i == 0) {
            ixaVar.t0 = i8;
            ixaVar.K.c(i, v6j0Var, arrayList);
            ixaVar.M.c(i, v6j0Var, arrayList);
        } else {
            ixaVar.u0 = i8;
            ixaVar.L.c(i, v6j0Var, arrayList);
            ixaVar.O.c(i, v6j0Var, arrayList);
            ixaVar.N.c(i, v6j0Var, arrayList);
        }
        ixaVar.R.c(i, v6j0Var, arrayList);
        return v6j0Var;
    }

    public static boolean b(ixa.a aVar, ixa.a aVar2, ixa.a aVar3, ixa.a aVar4) {
        ixa.a aVar5 = ixa.a.d;
        ixa.a aVar6 = ixa.a.b;
        ixa.a aVar7 = ixa.a.a;
        return (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6));
    }
}
