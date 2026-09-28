package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uge0 {
    public final ArrayList a;

    public uge0(vge0... vge0VarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Collections.addAll(arrayList, vge0VarArr);
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(vge0 vge0Var) {
        this.a.add(vge0Var);
    }

    public final List<vge0> c(List<vge0> list) {
        o8e0 o8e0Var;
        o8e0 o8e0Var2;
        o8e0 o8e0Var3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        b(arrayList2, size2, new int[size2], 0);
        vge0[] vge0VarArr = new vge0[list.size()];
        int size3 = arrayList2.size();
        int i = 0;
        while (i < size3) {
            Object obj = arrayList2.get(i);
            i++;
            int[] iArr = (int[]) obj;
            boolean z = true;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (iArr[i2] < list.size()) {
                    vge0 vge0Var = (vge0) arrayList.get(i2);
                    vge0 vge0Var2 = list.get(iArr[i2]);
                    vge0Var.getClass();
                    vge0Var2.getClass();
                    z &= vge0Var2.b.a <= vge0Var.b.a && vge0Var2.a == vge0Var.a && ((o8e0Var = vge0Var.c) == (o8e0Var2 = o8e0.DEFAULT) || (o8e0Var3 = vge0Var2.c) == o8e0Var2 || o8e0Var3 == o8e0Var);
                    if (!z) {
                        break;
                    }
                    vge0VarArr[iArr[i2]] = (vge0) arrayList.get(i2);
                }
            }
            if (z) {
                return Arrays.asList(vge0VarArr);
            }
        }
        return null;
    }

    public uge0() {
        this.a = new ArrayList();
    }
}
