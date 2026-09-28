package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d2 implements tcy<List<k26>> {
    public List<k26> c;
    public final Object a = new Object();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public Throwable d = null;
    public boolean e = false;

    public static class a {
        public final Executor a;
        public final tcy.a<? super List<k26>> b;

        public a(Executor executor, tcy.a<? super List<k26>> aVar) {
            this.a = executor;
            this.b = aVar;
        }
    }

    public d2(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(new k26(b.l(str), null));
        }
        this.c = arrayList;
    }

    @Override // defpackage.tcy
    public final void b(tcy.a<? super List<k26>> aVar) {
        a aVar2;
        Iterator it = this.b.iterator();
        do {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (a) it.next();
        } while (!aVar2.b.equals(aVar));
        if (aVar2 != null) {
            this.b.remove(aVar2);
        }
        synchronized (this.a) {
            try {
                if (this.e && this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.e = false;
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tcy
    public final void c(Executor executor, tcy.a<? super List<k26>> aVar) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        this.b.add(new a(executor, aVar));
        synchronized (this.a) {
            try {
                if (!this.e && !this.b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.e = true;
                    d();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.c);
                th = this.d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new c2(th, new a(executor, aVar), listUnmodifiableList));
    }

    public abstract void d();

    public abstract void e();

    public final void f(ArrayList arrayList, r36 r36Var) {
        List<k26> list;
        boolean z;
        List listUnmodifiableList;
        Throwable th;
        synchronized (this.a) {
            try {
                if (r36Var != null) {
                    z = this.d == null || !this.c.isEmpty();
                    this.d = r36Var;
                    list = Collections.EMPTY_LIST;
                    this.c = list;
                } else {
                    arrayList.getClass();
                    boolean z2 = (this.d == null && this.c.equals(arrayList)) ? false : true;
                    this.d = null;
                    this.c = arrayList;
                    boolean z3 = z2;
                    list = arrayList;
                    z = z3;
                }
                listUnmodifiableList = Collections.unmodifiableList(list);
                th = this.d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(this.b.size());
            sb.append(" observers. Error: ");
            sb.append(th != null);
            Log.d("CameraPresenceSrc", sb.toString());
            for (a aVar : this.b) {
                aVar.a.execute(new c2(th, aVar, listUnmodifiableList));
            }
        }
    }
}
