package defpackage;

import android.app.Activity;
import androidx.window.layout.SidecarCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ci90 implements w7j0 {
    public static volatile ci90 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final n3h a;
    public final CopyOnWriteArrayList<b> b = new CopyOnWriteArrayList<>();

    public final class a {
        public a() {
        }
    }

    public static final class b {
        public final Activity a;
        public final d8j0 b;
        public b9j0 c;

        public b(Activity activity, liv livVar, d8j0 d8j0Var) {
            this.a = activity;
            this.b = d8j0Var;
        }
    }

    public ci90(SidecarCompat sidecarCompat) {
        this.a = sidecarCompat;
        if (sidecarCompat == null) {
            return;
        }
        sidecarCompat.e(new a());
    }

    @Override // defpackage.w7j0
    public final void a(Activity activity, liv livVar, d8j0 d8j0Var) {
        b9j0 b9j0Var;
        b next;
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            n3h n3hVar = this.a;
            if (n3hVar == null) {
                d8j0Var.accept(new b9j0(m2g.a));
                reentrantLock.unlock();
                return;
            }
            CopyOnWriteArrayList<b> copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator<b> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            b bVar = new b(activity, livVar, d8j0Var);
            copyOnWriteArrayList.add(bVar);
            if (z) {
                Iterator<b> it2 = copyOnWriteArrayList.iterator();
                do {
                    b9j0Var = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!activity.equals(next.a));
                b bVar2 = next;
                if (bVar2 != null) {
                    b9j0Var = bVar2.c;
                }
                if (b9j0Var != null) {
                    bVar.c = b9j0Var;
                    bVar.b.accept(b9j0Var);
                }
            } else {
                n3hVar.a(activity);
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.w7j0
    public final void b(qya<b9j0> qyaVar) {
        qyaVar.getClass();
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (b bVar : this.b) {
                    if (bVar.b == qyaVar) {
                        arrayList.add(bVar);
                    }
                }
                this.b.removeAll(arrayList);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Activity activity = ((b) obj).a;
                    CopyOnWriteArrayList<b> copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<b> it = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().a.equals(activity)) {
                                }
                            }
                        }
                    }
                    n3h n3hVar = this.a;
                    if (n3hVar != null) {
                        n3hVar.b(activity);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
