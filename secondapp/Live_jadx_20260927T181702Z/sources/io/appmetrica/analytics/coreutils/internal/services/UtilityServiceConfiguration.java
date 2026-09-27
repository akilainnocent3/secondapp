package io.appmetrica.analytics.coreutils.internal.services;

import f0.p;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class UtilityServiceConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f95346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f95347b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = utilityServiceConfiguration.f95346a;
        }
        if ((i10 & 2) != 0) {
            j11 = utilityServiceConfiguration.f95347b;
        }
        return utilityServiceConfiguration.copy(j10, j11);
    }

    public final long component1() {
        return this.f95346a;
    }

    public final long component2() {
        return this.f95347b;
    }

    @l
    public final UtilityServiceConfiguration copy(long j10, long j11) {
        return new UtilityServiceConfiguration(j10, j11);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f95346a == utilityServiceConfiguration.f95346a && this.f95347b == utilityServiceConfiguration.f95347b;
    }

    public final long getInitialConfigTime() {
        return this.f95346a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f95347b;
    }

    public int hashCode() {
        return p.a(this.f95347b) + (p.a(this.f95346a) * 31);
    }

    @l
    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f95346a + ", lastUpdateConfigTime=" + this.f95347b + ')';
    }

    public UtilityServiceConfiguration(long j10, long j11) {
        this.f95346a = j10;
        this.f95347b = j11;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j10, long j11, int i10, x xVar) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11);
    }
}
