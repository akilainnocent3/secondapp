package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class bi30 {
    public final jrm a;

    public bi30(jrm jrmVar) {
        jrmVar.getClass();
        this.a = jrmVar;
    }

    public final ai30 a(uh30 uh30Var) {
        uh30Var.getClass();
        if (uh30Var instanceof uh30.a) {
            return ai30.a;
        }
        if (!(uh30Var instanceof uh30.c) && !(uh30Var instanceof uh30.b)) {
            uhc.a();
            return null;
        }
        ArrayList arrayListU = this.a.U();
        ArrayList arrayList = new ArrayList();
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        return g880.v(uh30Var.a(), arrayList) ? ai30.a : ai30.b;
    }
}
