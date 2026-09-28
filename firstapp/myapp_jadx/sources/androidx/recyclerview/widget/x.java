package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.d0;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<T, VH extends RecyclerView.d0> extends RecyclerView.f<VH> {
    public final d<T> a;

    public x(n.e<T> eVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        a aVar = new a();
        b bVar = new b(this);
        synchronized (c.a.a) {
            try {
                executorServiceNewFixedThreadPool = c.a.b;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    c.a.b = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d<T> dVar = new d<>(bVar, new c(executorServiceNewFixedThreadPool, eVar));
        this.a = dVar;
        dVar.d.add(aVar);
    }

    public final T getItem(int i) {
        return this.a.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getItemCount() {
        return this.a.f.size();
    }

    public void i(List<T> list) {
        this.a.b(list, null);
    }

    public void j(List<T> list, Runnable runnable) {
        this.a.b(list, runnable);
    }

    public class a implements d.b<T> {
        @Override // androidx.recyclerview.widget.d.b
        public final void a() {
        }
    }
}
