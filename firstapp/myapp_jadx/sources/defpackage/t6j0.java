package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t6j0 extends ixa {
    public ArrayList<ixa> v0 = new ArrayList<>();

    @Override // defpackage.ixa
    public void E() {
        this.v0.clear();
        super.E();
    }

    @Override // defpackage.ixa
    public final void H(dr5 dr5Var) {
        super.H(dr5Var);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            this.v0.get(i).H(dr5Var);
        }
    }

    public final void W(ixa ixaVar) {
        this.v0.add(ixaVar);
        ixa ixaVar2 = ixaVar.W;
        if (ixaVar2 != null) {
            ((t6j0) ixaVar2).v0.remove(ixaVar);
            ixaVar.E();
        }
        ixaVar.W = this;
    }

    public void X() {
        ArrayList<ixa> arrayList = this.v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ixa ixaVar = this.v0.get(i);
            if (ixaVar instanceof t6j0) {
                ((t6j0) ixaVar).X();
            }
        }
    }
}
