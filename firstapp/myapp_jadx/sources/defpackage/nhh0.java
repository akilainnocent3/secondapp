package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class nhh0 {
    public final jrm a;
    public final vhh0 b;

    public nhh0(jrm jrmVar, vhh0 vhh0Var) {
        jrmVar.getClass();
        this.a = jrmVar;
        this.b = vhh0Var;
    }

    public static mhh0 a(nhh0 nhh0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayListU = nhh0Var.a.U();
        arrayListU.getClass();
        ArrayList arrayList = new ArrayList(l48.r(arrayListU, 10));
        int size = arrayListU.size();
        boolean z4 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            arrayList.add(nhh0Var.b.b((Selection) obj));
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                dih0 dih0Var = (dih0) obj2;
                if (dih0Var != null) {
                    if (dih0Var.d.contains(phh0.a)) {
                        z = true;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        if (!arrayList.isEmpty()) {
            int size3 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    z2 = false;
                    break;
                }
                Object obj3 = arrayList.get(i3);
                i3++;
                dih0 dih0Var2 = (dih0) obj3;
                if (dih0Var2 != null) {
                    if (dih0Var2.d.contains(phh0.b)) {
                        z2 = true;
                        break;
                    }
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && !arrayList.isEmpty()) {
            int size4 = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size4) {
                    z3 = false;
                    break;
                }
                Object obj4 = arrayList.get(i4);
                i4++;
                dih0 dih0Var3 = (dih0) obj4;
                if (dih0Var3 != null) {
                    if (dih0Var3.e.contains(phh0.a)) {
                        z3 = true;
                        break;
                    }
                }
            }
        } else {
            z3 = false;
            break;
        }
        if (z2 && !arrayList.isEmpty()) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj5 = arrayList.get(i5);
                i5++;
                dih0 dih0Var4 = (dih0) obj5;
                if (dih0Var4 != null) {
                    if (dih0Var4.e.contains(phh0.b)) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return new mhh0(z, z2, z3, z4);
    }
}
