package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C4352je;
import com.ironsource.C4485r4;
import com.ironsource.V9;
import cs.k;
import dr.i0;
import dr.k0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nIronSourceThreadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IronSourceThreadManager.kt\ncom/ironsource/environment/thread/IronSourceThreadManager\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,150:1\n32#2,2:151\n32#2,2:153\n32#2,2:155\n*S KotlinDebug\n*F\n+ 1 IronSourceThreadManager.kt\ncom/ironsource/environment/thread/IronSourceThreadManager\n*L\n73#1:151,2\n80#1:153,2\n87#1:155,2\n*E\n"})
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f61710a;

    @l
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private static final i0 f61711b = k0.b(g.f61724a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private static final i0 f61712c = k0.b(c.f61720a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    private static final i0 f61713d = k0.b(f.f61723a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    private static final i0 f61714e = k0.b(d.f61721a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    private static final i0 f61715f = k0.b(a.f61718a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    private static final i0 f61716g = k0.b(e.f61722a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    private static final i0 f61717h = k0.b(b.f61719a);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements ds.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f61718a = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("adapterBackground");
            v10.start();
            v10.a();
            return v10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o0 implements ds.a<C4352je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61719a = new b();

        public b() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4352je invoke() {
            return new C4352je(0, null, null, 7, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends o0 implements ds.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f61720a = new c();

        public c() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            V9 v10 = new V9("IronSourceInitiatorHandler");
            v10.start();
            v10.a();
            return new Handler(v10.getLooper());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends o0 implements ds.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f61721a = new d();

        public d() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("mediationBackground");
            v10.start();
            v10.a();
            return v10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends o0 implements ds.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f61722a = new e();

        public e() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("publisher-callbacks");
            v10.start();
            v10.a();
            return v10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends o0 implements ds.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f61723a = new f();

        public f() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("managersThread");
            v10.start();
            v10.a();
            return v10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends o0 implements ds.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f61724a = new g();

        public g() {
            super(0);
        }

        @Override // ds.a
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private IronSourceThreadManager() {
    }

    private final V9 a() {
        return (V9) f61715f.getValue();
    }

    private final V9 d() {
        return (V9) f61716g.getValue();
    }

    private final Handler e() {
        return (Handler) f61711b.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z10, boolean z11, @l List<? extends Runnable> tasks) {
        m0.p(tasks, "tasks");
        if (!z10) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z11) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.b
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            C4485r4.d().a(e10);
        }
    }

    @l
    public final Handler getInitHandler() {
        return (Handler) f61712c.getValue();
    }

    @l
    public final V9 getSharedManagersThread() {
        return (V9) f61713d.getValue();
    }

    @l
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f61710a;
    }

    @k
    public final void postAdapterBackgroundTask(@l Runnable action) {
        m0.p(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    @k
    public final void postMediationBackgroundTask(@l Runnable action) {
        m0.p(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    @k
    public final void postOnUiThreadTask(@l Runnable action) {
        m0.p(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    @k
    public final void postPublisherCallback(@l Runnable action) {
        m0.p(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@l Runnable action) {
        m0.p(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            a().b(action);
        }
    }

    public final void removeMediationBackgroundTask(@l Runnable action) {
        m0.p(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            c().b(action);
        }
    }

    public final void removeUiThreadTask(@l Runnable action) {
        m0.p(action, "action");
        e().removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f61710a = z10;
    }

    private final boolean a(Runnable runnable) {
        return f61710a && b().getQueue().contains(runnable);
    }

    private final C4352je b() {
        return (C4352je) f61717h.getValue();
    }

    private final V9 c() {
        return (V9) f61714e.getValue();
    }

    @k
    public final void postAdapterBackgroundTask(@l Runnable action, long j10) {
        m0.p(action, "action");
        if (f61710a) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            a().a(action, j10);
        }
    }

    @k
    public final void postMediationBackgroundTask(@l Runnable action, long j10) {
        m0.p(action, "action");
        if (f61710a) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            c().a(action, j10);
        }
    }

    @k
    public final void postOnUiThreadTask(@l Runnable action, long j10) {
        m0.p(action, "action");
        e().postDelayed(action, j10);
    }

    @k
    public final void postPublisherCallback(@l Runnable action, long j10) {
        m0.p(action, "action");
        d().a(action, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        m0.p(it, "$it");
        m0.p(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        m0.p(latch, "$latch");
        latch.countDown();
    }
}
