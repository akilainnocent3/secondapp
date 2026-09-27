package u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f137446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final Executor f137447d = new Executor() { // from class: u.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h().d(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Executor f137448e = new Executor() { // from class: u.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public e f137449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final e f137450b;

    public c() {
        d dVar = new d();
        this.f137450b = dVar;
        this.f137449a = dVar;
    }

    @NonNull
    public static Executor g() {
        return f137448e;
    }

    @NonNull
    public static c h() {
        if (f137446c != null) {
            return f137446c;
        }
        synchronized (c.class) {
            try {
                if (f137446c == null) {
                    f137446c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f137446c;
    }

    @NonNull
    public static Executor i() {
        return f137447d;
    }

    @Override // u.e
    public void a(@NonNull Runnable runnable) {
        this.f137449a.a(runnable);
    }

    @Override // u.e
    public boolean c() {
        return this.f137449a.c();
    }

    @Override // u.e
    public void d(@NonNull Runnable runnable) {
        this.f137449a.d(runnable);
    }

    public void j(@Nullable e eVar) {
        if (eVar == null) {
            eVar = this.f137450b;
        }
        this.f137449a = eVar;
    }
}
