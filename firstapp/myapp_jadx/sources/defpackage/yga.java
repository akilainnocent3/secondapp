package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class yga extends Exception {
    public final ccy<Object> a;
    public final etw b;
    public final lsw c;
    public final int d;

    public yga(ccy ccyVar, etw etwVar, lsw lswVar, int i, Exception exc) {
        super(exc);
        this.a = ccyVar;
        this.b = etwVar;
        this.c = lswVar;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listC;
        StringBuilder sb = new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |");
        vc80 vc80VarA = zc80.a(new xga(this, null));
        if (vc80VarA.hasNext()) {
            Object next = vc80VarA.next();
            if (vc80VarA.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (vc80VarA.hasNext()) {
                    arrayList.add(vc80VarA.next());
                }
                listC = arrayList;
            } else {
                listC = a.c(next);
            }
        } else {
            listC = m2g.a;
        }
        sb.append(CollectionsKt.a0(CollectionsKt.u0(10, listC), "\n", null, null, null, 62));
        sb.append("\n            ");
        return qae0.d(sb.toString());
    }
}
