package h0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f87571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d<T> f87572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<Void> f87573c = e.w();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f87574d;

        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            e<Void> eVar = this.f87573c;
            if (eVar != null) {
                eVar.addListener(runnable, executor);
            }
        }

        public void b() {
            this.f87571a = null;
            this.f87572b = null;
            this.f87573c.q(null);
        }

        public boolean c(T t10) {
            this.f87574d = true;
            d<T> dVar = this.f87572b;
            boolean z10 = dVar != null && dVar.b(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f87574d = true;
            d<T> dVar = this.f87572b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f87571a = null;
            this.f87572b = null;
            this.f87573c = null;
        }

        public boolean f(@NonNull Throwable th2) {
            this.f87574d = true;
            d<T> dVar = this.f87572b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            e<Void> eVar;
            d<T> dVar = this.f87572b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f87571a));
            }
            if (this.f87574d || (eVar = this.f87573c) == null) {
                return;
            }
            eVar.q(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: h0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0865c<T> {
        @Nullable
        Object attachCompleter(@NonNull a<T> aVar) throws Exception;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d<T> implements t1<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<a<T>> f87575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h0.a<T> f87576c = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends h0.a<T> {
            public a() {
            }

            @Override // h0.a
            public String m() {
                a<T> aVar = d.this.f87575b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f87571a + C4235d4.j.f61462e;
            }
        }

        public d(a<T> aVar) {
            this.f87575b = new WeakReference<>(aVar);
        }

        public boolean a(boolean z10) {
            return this.f87576c.cancel(z10);
        }

        @Override // nj.t1
        public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f87576c.addListener(runnable, executor);
        }

        public boolean b(T t10) {
            return this.f87576c.q(t10);
        }

        public boolean c(Throwable th2) {
            return this.f87576c.s(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f87575b.get();
            boolean zCancel = this.f87576c.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f87576c.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f87576c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f87576c.isDone();
        }

        public String toString() {
            return this.f87576c.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f87576c.get(j10, timeUnit);
        }
    }

    @NonNull
    public static <T> t1<T> a(@NonNull InterfaceC0865c<T> interfaceC0865c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f87572b = dVar;
        aVar.f87571a = interfaceC0865c.getClass();
        try {
            Object objAttachCompleter = interfaceC0865c.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return dVar;
            }
            aVar.f87571a = objAttachCompleter;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
