package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4203b8<T> {
    T a(@oy.l String str);

    void a(T t10);

    void a(@oy.l String str, T t10);

    /* JADX INFO: renamed from: com.ironsource.b8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nISDemandOnlyListenerHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ISDemandOnlyListenerHolder.kt\ncom/ironsource/mediationsdk/demandOnly/ISDemandOnlyListenerHolder$Interstitial\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,74:1\n32#2,2:75\n*S KotlinDebug\n*F\n+ 1 ISDemandOnlyListenerHolder.kt\ncom/ironsource/mediationsdk/demandOnly/ISDemandOnlyListenerHolder$Interstitial\n*L\n28#1:75,2\n*E\n"})
    public static final class a implements InterfaceC4203b8<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private C4185a8 f61078a = new C4185a8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final Map<String, C4185a8> f61079b = new HashMap();

        @Override // com.ironsource.InterfaceC4203b8
        @oy.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@oy.l String instanceId) {
            kotlin.jvm.internal.m0.p(instanceId, "instanceId");
            C4185a8 c4185a8 = this.f61079b.get(instanceId);
            return c4185a8 != null ? c4185a8 : this.f61078a;
        }

        @Override // com.ironsource.InterfaceC4203b8
        public void a(@oy.l ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.m0.p(listener, "listener");
            this.f61078a.a(listener);
            Iterator<String> it = this.f61079b.keySet().iterator();
            while (it.hasNext()) {
                C4185a8 c4185a8 = this.f61079b.get(it.next());
                if (c4185a8 != null) {
                    c4185a8.a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC4203b8
        public void a(@oy.l String instanceId, @oy.l ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.m0.p(instanceId, "instanceId");
            kotlin.jvm.internal.m0.p(listener, "listener");
            if (this.f61079b.containsKey(instanceId)) {
                C4185a8 c4185a8 = this.f61079b.get(instanceId);
                if (c4185a8 != null) {
                    c4185a8.a(listener);
                    return;
                }
                return;
            }
            this.f61079b.put(instanceId, new C4185a8(listener));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nISDemandOnlyListenerHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ISDemandOnlyListenerHolder.kt\ncom/ironsource/mediationsdk/demandOnly/ISDemandOnlyListenerHolder$RewardedVideo\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,74:1\n32#2,2:75\n*S KotlinDebug\n*F\n+ 1 ISDemandOnlyListenerHolder.kt\ncom/ironsource/mediationsdk/demandOnly/ISDemandOnlyListenerHolder$RewardedVideo\n*L\n56#1:75,2\n*E\n"})
    public static final class b implements InterfaceC4203b8<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private C4239d8 f61080a = new C4239d8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final Map<String, C4239d8> f61081b = new HashMap();

        @Override // com.ironsource.InterfaceC4203b8
        @oy.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@oy.l String instanceId) {
            kotlin.jvm.internal.m0.p(instanceId, "instanceId");
            C4239d8 c4239d8 = this.f61081b.get(instanceId);
            return c4239d8 != null ? c4239d8 : this.f61080a;
        }

        @Override // com.ironsource.InterfaceC4203b8
        public void a(@oy.l ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.m0.p(listener, "listener");
            this.f61080a.a(listener);
            Iterator<String> it = this.f61081b.keySet().iterator();
            while (it.hasNext()) {
                C4239d8 c4239d8 = this.f61081b.get(it.next());
                if (c4239d8 != null) {
                    c4239d8.a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC4203b8
        public void a(@oy.l String instanceId, @oy.l ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.m0.p(instanceId, "instanceId");
            kotlin.jvm.internal.m0.p(listener, "listener");
            if (this.f61081b.containsKey(instanceId)) {
                C4239d8 c4239d8 = this.f61081b.get(instanceId);
                if (c4239d8 != null) {
                    c4239d8.a(listener);
                    return;
                }
                return;
            }
            this.f61081b.put(instanceId, new C4239d8(listener));
        }
    }
}
