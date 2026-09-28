package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class yil extends ixa {
    public ixa[] v0 = new ixa[4];
    public int w0 = 0;

    public final void W(ixa ixaVar) {
        if (ixaVar == this || ixaVar == null) {
            return;
        }
        int i = this.w0 + 1;
        ixa[] ixaVarArr = this.v0;
        if (i > ixaVarArr.length) {
            ixaVarArr = (ixa[]) Arrays.copyOf(ixaVarArr, ixaVarArr.length * 2);
            this.v0 = ixaVarArr;
        }
        int i2 = this.w0;
        ixaVarArr[i2] = ixaVar;
        this.w0 = i2 + 1;
    }

    public final void X(int i, v6j0 v6j0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.w0; i2++) {
            ixa ixaVar = this.v0[i2];
            ArrayList<ixa> arrayList2 = v6j0Var.a;
            if (!arrayList2.contains(ixaVar)) {
                arrayList2.add(ixaVar);
            }
        }
        for (int i3 = 0; i3 < this.w0; i3++) {
            d9l.a(this.v0[i3], i, arrayList, v6j0Var);
        }
    }

    public final void Y() {
        this.w0 = 0;
        Arrays.fill(this.v0, (Object) null);
    }

    @Override // defpackage.ixa
    public void h(ixa ixaVar, HashMap<ixa, ixa> map) {
        super.h(ixaVar, map);
        yil yilVar = (yil) ixaVar;
        this.w0 = 0;
        int i = yilVar.w0;
        for (int i2 = 0; i2 < i; i2++) {
            W(map.get(yilVar.v0[i2]));
        }
    }

    public void Z() {
    }
}
