package ma;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public abstract class d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f107157f = r.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra.a f107158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f107159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f107160c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<ka.a<T>> f107161d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f107162e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f107163b;

        public a(final List val$listenersList) {
            this.f107163b = val$listenersList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f107163b.iterator();
            while (it.hasNext()) {
                ((ka.a) it.next()).a(d.this.f107162e);
            }
        }
    }

    public d(@NonNull Context context, @NonNull ra.a taskExecutor) {
        this.f107159b = context.getApplicationContext();
        this.f107158a = taskExecutor;
    }

    public void a(ka.a<T> listener) {
        synchronized (this.f107160c) {
            try {
                if (this.f107161d.add(listener)) {
                    if (this.f107161d.size() == 1) {
                        this.f107162e = b();
                        r.c().a(f107157f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f107162e), new Throwable[0]);
                        e();
                    }
                    listener.a(this.f107162e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract T b();

    public void c(ka.a<T> listener) {
        synchronized (this.f107160c) {
            try {
                if (this.f107161d.remove(listener) && this.f107161d.isEmpty()) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(T newState) {
        synchronized (this.f107160c) {
            try {
                T t10 = this.f107162e;
                if (t10 != newState && (t10 == null || !t10.equals(newState))) {
                    this.f107162e = newState;
                    this.f107158a.b().execute(new a(new ArrayList(this.f107161d)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
