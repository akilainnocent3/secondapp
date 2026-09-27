package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4221c8<T> {

    /* JADX INFO: renamed from: com.ironsource.c8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<ListenerType> implements InterfaceC4221c8<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private ListenerType f61193a;

        /* JADX INFO: renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0574a extends AbstractRunnableC4335ie {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f61194b;

            public C0574a(Runnable runnable) {
                this.f61194b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC4335ie
            public void a() {
                this.f61194b.run();
            }
        }

        @oy.m
        public final ListenerType a() {
            return this.f61193a;
        }

        public final void b(@oy.m ListenerType listenertype) {
            this.f61193a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        public final void a(@oy.l Runnable runnable, boolean z10) {
            kotlin.jvm.internal.m0.p(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0574a(runnable), 0L, 2, null);
            }
        }

        public final void a(@oy.l String instanceId, @oy.l String message) {
            kotlin.jvm.internal.m0.p(instanceId, "instanceId");
            kotlin.jvm.internal.m0.p(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.InterfaceC4221c8
        public void a(ListenerType listenertype) {
            this.f61193a = listenertype;
        }
    }

    void a(T t10);
}
