package androidx.activity;

import dr.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k.y0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Executor f6075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.a<w2> f6076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Object f6077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.a0("lock")
    public int f6078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k.a0("lock")
    public boolean f6079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k.a0("lock")
    public boolean f6080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @k.a0("lock")
    public final List<ds.a<w2>> f6081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public final Runnable f6082h;

    public g0(@oy.l Executor executor, @oy.l ds.a<w2> reportFullyDrawn) {
        kotlin.jvm.internal.m0.p(executor, "executor");
        kotlin.jvm.internal.m0.p(reportFullyDrawn, "reportFullyDrawn");
        this.f6075a = executor;
        this.f6076b = reportFullyDrawn;
        this.f6077c = new Object();
        this.f6081g = new ArrayList();
        this.f6082h = new Runnable() { // from class: androidx.activity.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.i(this.f6073b);
            }
        };
    }

    public static final void i(g0 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        synchronized (this$0.f6077c) {
            try {
                this$0.f6079e = false;
                if (this$0.f6078d == 0 && !this$0.f6080f) {
                    this$0.f6076b.invoke();
                    this$0.d();
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@oy.l ds.a<w2> callback) {
        boolean z10;
        kotlin.jvm.internal.m0.p(callback, "callback");
        synchronized (this.f6077c) {
            if (this.f6080f) {
                z10 = true;
            } else {
                this.f6081g.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void c() {
        synchronized (this.f6077c) {
            try {
                if (!this.f6080f) {
                    this.f6078d++;
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final void d() {
        synchronized (this.f6077c) {
            try {
                this.f6080f = true;
                Iterator<T> it = this.f6081g.iterator();
                while (it.hasNext()) {
                    ((ds.a) it.next()).invoke();
                }
                this.f6081g.clear();
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f6077c) {
            z10 = this.f6080f;
        }
        return z10;
    }

    public final void f() {
        if (this.f6079e || this.f6078d != 0) {
            return;
        }
        this.f6079e = true;
        this.f6075a.execute(this.f6082h);
    }

    public final void g(@oy.l ds.a<w2> callback) {
        kotlin.jvm.internal.m0.p(callback, "callback");
        synchronized (this.f6077c) {
            this.f6081g.remove(callback);
            w2 w2Var = w2.f79517a;
        }
    }

    public final void h() {
        int i10;
        synchronized (this.f6077c) {
            try {
                if (!this.f6080f && (i10 = this.f6078d) > 0) {
                    this.f6078d = i10 - 1;
                    f();
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
