package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v6j0 {
    public static int f;
    public ArrayList<ixa> a;
    public int b;
    public int c;
    public ArrayList<a> d;
    public int e;

    public static class a {
    }

    public final void a(ArrayList<v6j0> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                v6j0 v6j0Var = arrayList.get(i);
                if (this.e == v6j0Var.b) {
                    c(this.c, v6j0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ofs ofsVar, int i) {
        int iN;
        int iN2;
        ArrayList<ixa> arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        jxa jxaVar = (jxa) arrayList.get(0).W;
        ofsVar.t();
        jxaVar.c(ofsVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).c(ofsVar, false);
        }
        if (i == 0 && jxaVar.E0 > 0) {
            dw6.a(jxaVar, ofsVar, arrayList, 0);
        }
        if (i == 1 && jxaVar.F0 > 0) {
            dw6.a(jxaVar, ofsVar, arrayList, 1);
        }
        try {
            ofsVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ixa ixaVar = arrayList.get(i3);
            a aVar = new a();
            new WeakReference(ixaVar);
            ofs.n(ixaVar.K);
            ofs.n(ixaVar.L);
            ofs.n(ixaVar.M);
            ofs.n(ixaVar.N);
            ofs.n(ixaVar.O);
            this.d.add(aVar);
        }
        if (i == 0) {
            iN = ofs.n(jxaVar.K);
            iN2 = ofs.n(jxaVar.M);
            ofsVar.t();
        } else {
            iN = ofs.n(jxaVar.L);
            iN2 = ofs.n(jxaVar.N);
            ofsVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, v6j0 v6j0Var) {
        int i2 = v6j0Var.b;
        ArrayList<ixa> arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ixa ixaVar = arrayList.get(i3);
            i3++;
            ixa ixaVar2 = ixaVar;
            ArrayList<ixa> arrayList2 = v6j0Var.a;
            if (!arrayList2.contains(ixaVar2)) {
                arrayList2.add(ixaVar2);
            }
            if (i == 0) {
                ixaVar2.t0 = i2;
            } else {
                ixaVar2.u0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" [");
        String strA = zk1.a(this.b, "] <", sb);
        ArrayList<ixa> arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ixa ixaVar = arrayList.get(i2);
            i2++;
            StringBuilder sbB = mq0.b(strA, " ");
            sbB.append(ixaVar.l0);
            strA = sbB.toString();
        }
        return strA.concat(" >");
    }
}
