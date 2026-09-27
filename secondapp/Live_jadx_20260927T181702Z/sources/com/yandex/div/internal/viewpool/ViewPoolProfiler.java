package com.yandex.div.internal.viewpool;

import android.os.Handler;
import android.os.Looper;
import cs.g;
import dr.w2;
import java.util.Map;
import k.d;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewPoolProfiler {

    @l
    private final Reporter reporter;

    @l
    private final ProfilingSession session = new ProfilingSession();

    @l
    private final FrameWatcher frameWatcher = new FrameWatcher();

    @l
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class FrameWatcher implements Runnable {
        private boolean watching;

        public FrameWatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler.this.onFrameReady$div_release();
            this.watching = false;
        }

        public final void watch(@l Handler handler) {
            if (this.watching) {
                return;
            }
            handler.post(this);
            this.watching = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Reporter {

        @l
        public static final Companion Companion = Companion.$$INSTANCE;

        @l
        @g
        public static final Reporter NO_OP = new Reporter() { // from class: com.yandex.div.internal.viewpool.ViewPoolProfiler$Reporter$Companion$NO_OP$1
            @Override // com.yandex.div.internal.viewpool.ViewPoolProfiler.Reporter
            public void reportEvent(@l String str, @l Map<String, ? extends Object> map) {
            }
        };

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void reportEvent(@l String str, @l Map<String, ? extends Object> map);
    }

    public ViewPoolProfiler(@l Reporter reporter) {
        this.reporter = reporter;
    }

    public final void onFrameReady$div_release() {
        synchronized (this.session) {
            try {
                if (this.session.hasLongEvents()) {
                    this.reporter.reportEvent("view pool profiling", this.session.flush());
                }
                this.session.clear();
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @d
    public final void onViewObtainedWithBlock$div_release(@l String str, long j10) {
        synchronized (this.session) {
            this.session.viewObtainedWithBlock(str, j10);
            this.frameWatcher.watch(this.handler);
            w2 w2Var = w2.f79517a;
        }
    }

    @d
    public final void onViewObtainedWithoutBlock$div_release(long j10) {
        synchronized (this.session) {
            this.session.viewObtainedWithoutBlock(j10);
            this.frameWatcher.watch(this.handler);
            w2 w2Var = w2.f79517a;
        }
    }

    @d
    public final void onViewRequested$div_release(long j10) {
        this.session.viewRequested(j10);
        this.frameWatcher.watch(this.handler);
    }
}
