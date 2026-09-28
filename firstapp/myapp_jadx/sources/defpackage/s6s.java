package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s6s implements h26 {
    public final int b;

    public s6s(int i) {
        this.b = i;
    }

    @Override // defpackage.h26
    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l26 l26Var = (l26) it.next();
            km20.a("The camera info doesn't contain internal implementation.", l26Var instanceof m26);
            if (l26Var.f() == this.b) {
                arrayList.add(l26Var);
            }
        }
        return arrayList;
    }
}
