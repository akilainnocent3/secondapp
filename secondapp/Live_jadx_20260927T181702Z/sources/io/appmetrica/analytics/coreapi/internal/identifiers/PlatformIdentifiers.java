package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class PlatformIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f95239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f95240b;

    public PlatformIdentifiers(@l SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @l AppSetIdProvider appSetIdProvider) {
        this.f95239a = simpleAdvertisingIdGetter;
        this.f95240b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f95239a;
        }
        if ((i10 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f95240b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    @l
    public final SimpleAdvertisingIdGetter component1() {
        return this.f95239a;
    }

    @l
    public final AppSetIdProvider component2() {
        return this.f95240b;
    }

    @l
    public final PlatformIdentifiers copy(@l SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @l AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return m0.g(this.f95239a, platformIdentifiers.f95239a) && m0.g(this.f95240b, platformIdentifiers.f95240b);
    }

    @l
    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f95239a;
    }

    @l
    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f95240b;
    }

    public int hashCode() {
        return this.f95240b.hashCode() + (this.f95239a.hashCode() * 31);
    }

    @l
    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f95239a + ", appSetIdProvider=" + this.f95240b + ')';
    }
}
