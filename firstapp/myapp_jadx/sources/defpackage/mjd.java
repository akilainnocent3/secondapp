package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class mjd {
    public static void a(List<ijd> list) {
        Iterator<ijd> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void b(List<ijd> list) throws ijd.a {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).d();
                i++;
            } catch (ijd.a e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static nv5.d c(final List list, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(obj.d(((ijd) it.next()).c()));
        }
        final nv5.d dVarA = nv5.a(new hbj(new vhs(new ArrayList(arrayList), false, nqe.a()), scheduledExecutorService, 5000L));
        return nv5.a(new nv5.c() { // from class: kjd
            @Override // nv5.c
            public final Object a(nv5.a aVar) {
                nv5.d dVar = dVarA;
                jjd jjdVar = new jjd(dVar, 0);
                Executor executor2 = executor;
                aVar.a(jjdVar, executor2);
                dVar.k(new obj.b(dVar, new ljd(aVar)), executor2);
                return "surfaceList[" + list + "]";
            }
        });
    }
}
