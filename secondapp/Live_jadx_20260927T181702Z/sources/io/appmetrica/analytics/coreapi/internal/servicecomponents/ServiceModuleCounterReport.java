package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import java.util.Arrays;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ServiceModuleCounterReport {

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f95262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f95263d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f95264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f95265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f95266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f95267d;

        @l
        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f95264a, this.f95265b, this.f95266c, this.f95267d);
        }

        @l
        public final Builder withName(@m String str) {
            this.f95264a = str;
            return this;
        }

        @l
        public final Builder withType(int i10) {
            this.f95267d = i10;
            return this;
        }

        @l
        public final Builder withValue(@m String str) {
            this.f95265b = str;
            return this;
        }

        @l
        public final Builder withValueBytes(@m byte[] bArr) {
            this.f95266c = bArr;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(@m String str, @m String str2, @m byte[] bArr, int i10) {
        this.f95260a = str;
        this.f95261b = str2;
        this.f95262c = bArr;
        this.f95263d = i10;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serviceModuleCounterReport.f95260a;
        }
        if ((i11 & 2) != 0) {
            str2 = serviceModuleCounterReport.f95261b;
        }
        if ((i11 & 4) != 0) {
            bArr = serviceModuleCounterReport.f95262c;
        }
        if ((i11 & 8) != 0) {
            i10 = serviceModuleCounterReport.f95263d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i10);
    }

    @m
    public final String component1() {
        return this.f95260a;
    }

    @m
    public final String component2() {
        return this.f95261b;
    }

    @m
    public final byte[] component3() {
        return this.f95262c;
    }

    public final int component4() {
        return this.f95263d;
    }

    @l
    public final ServiceModuleCounterReport copy(@m String str, @m String str2, @m byte[] bArr, int i10) {
        return new ServiceModuleCounterReport(str, str2, bArr, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f95263d == serviceModuleCounterReport.f95263d && m0.g(this.f95260a, serviceModuleCounterReport.f95260a) && m0.g(this.f95261b, serviceModuleCounterReport.f95261b) && Arrays.equals(this.f95262c, serviceModuleCounterReport.f95262c);
    }

    @m
    public final String getName() {
        return this.f95260a;
    }

    public final int getType() {
        return this.f95263d;
    }

    @m
    public final String getValue() {
        return this.f95261b;
    }

    @m
    public final byte[] getValueBytes() {
        return this.f95262c;
    }

    public int hashCode() {
        int i10 = this.f95263d * 31;
        String str = this.f95260a;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f95261b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f95262c;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @l
    public String toString() {
        return "ServiceModuleCounterReport(name=" + this.f95260a + ", value=" + this.f95261b + ", valueBytes=" + Arrays.toString(this.f95262c) + ", type=" + this.f95263d + ')';
    }
}
