package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import defpackage.x01;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d<T> {
    public static final c h = new c();
    public final androidx.recyclerview.widget.b a;
    public final androidx.recyclerview.widget.c<T> b;
    public List<T> e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List<T> f = Collections.EMPTY_LIST;
    public final c c = h;

    public class a implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Runnable d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0070a extends n.b {
            public C0070a() {
            }

            @Override // androidx.recyclerview.widget.n.b
            public final boolean areContentsTheSame(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.a.get(i);
                Object obj2 = aVar.b.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.b.areContentsTheSame((T) obj, (T) obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                x01.a();
                return false;
            }

            @Override // androidx.recyclerview.widget.n.b
            public final boolean areItemsTheSame(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.a.get(i);
                Object obj2 = aVar.b.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.b.b.areItemsTheSame((T) obj, (T) obj2);
            }

            @Override // androidx.recyclerview.widget.n.b
            public final Object getChangePayload(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.a.get(i);
                Object obj2 = aVar.b.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.b.getChangePayload((T) obj, (T) obj2);
                }
                x01.a();
                return null;
            }

            @Override // androidx.recyclerview.widget.n.b
            public final int getNewListSize() {
                return a.this.b.size();
            }

            @Override // androidx.recyclerview.widget.n.b
            public final int getOldListSize() {
                return a.this.a.size();
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ n.d a;

            public b(n.d dVar) {
                this.a = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.g == aVar.c) {
                    List<T> list = aVar.b;
                    Runnable runnable = aVar.d;
                    List<T> list2 = dVar.f;
                    dVar.e = list;
                    dVar.f = Collections.unmodifiableList(list);
                    this.a.b(dVar.a);
                    dVar.a(list2, runnable);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.a = list;
            this.b = list2;
            this.c = i;
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.c.execute(new b(n.a(new C0070a(), true)));
        }
    }

    public interface b<T> {
        void a();
    }

    public static class c implements Executor {
        public final Handler a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public d(androidx.recyclerview.widget.b bVar, androidx.recyclerview.widget.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final void a(List<T> list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List<T> list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f;
        androidx.recyclerview.widget.b bVar = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            bVar.onRemoved(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.a.execute(new a(list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        bVar.onInserted(0, list.size());
        a(list3, runnable);
    }
}
