package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class og1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f153484d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile og1 f153485e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey1 f153486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f153487b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153488c;

    public og1(ey1 ey1Var) {
        this.f153486a = ey1Var;
    }

    public final Executor a() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f153484d) {
            try {
                if (this.f153487b.size() < 4) {
                    executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f153486a);
                    this.f153487b.add(executorNewSingleThreadExecutor);
                } else {
                    ArrayList arrayList = this.f153487b;
                    int i10 = this.f153488c;
                    this.f153488c = i10 + 1;
                    executorNewSingleThreadExecutor = (Executor) arrayList.get(i10);
                    if (this.f153488c == 4) {
                        this.f153488c = 0;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorNewSingleThreadExecutor;
    }
}
