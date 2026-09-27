package io.appmetrica.analytics.networktasks.internal;

import cs.o;
import dr.w2;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import k.d;
import k.h1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f98934b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkCore f98935a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f98934b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            m0.S("instance");
            return null;
        }

        @o
        @d
        public final void init(@l IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f98934b == null) {
                synchronized (NetworkServiceLocator.class) {
                    try {
                        if (NetworkServiceLocator.f98934b == null) {
                            NetworkServiceLocator.f98934b = new NetworkServiceLocator(iExecutionPolicy);
                        }
                        w2 w2Var = w2.f79517a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        private Companion() {
        }

        @h1
        @o
        public final void init(@l NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f98934b = networkServiceLocator;
        }
    }

    @h1
    @d
    public NetworkServiceLocator(@l IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f98935a = networkCore;
    }

    @l
    @o
    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    @o
    @d
    public static final void init(@l IExecutionPolicy iExecutionPolicy) {
        Companion.init(iExecutionPolicy);
    }

    @l
    public final NetworkCore getNetworkCore() {
        return this.f98935a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f98935a.stopTasks();
    }

    @h1
    @o
    public static final void init(@l NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }
}
