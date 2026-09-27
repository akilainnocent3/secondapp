package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class NativeCrash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f98849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f98851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f98852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f98853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f98854f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f98855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f98856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f98857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f98858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f98859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f98860f;

        public Builder(@l NativeCrashSource nativeCrashSource, @l String str, @l String str2, @l String str3, long j10, @l String str4) {
            this.f98855a = nativeCrashSource;
            this.f98856b = str;
            this.f98857c = str2;
            this.f98858d = str3;
            this.f98859e = j10;
            this.f98860f = str4;
        }

        @l
        public final NativeCrash build() {
            return new NativeCrash(this.f98855a, this.f98856b, this.f98857c, this.f98858d, this.f98859e, this.f98860f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, String str4, x xVar) {
        this(nativeCrashSource, str, str2, str3, j10, str4);
    }

    public final long getCreationTime() {
        return this.f98853e;
    }

    @l
    public final String getDumpFile() {
        return this.f98852d;
    }

    @l
    public final String getHandlerVersion() {
        return this.f98850b;
    }

    @l
    public final String getMetadata() {
        return this.f98854f;
    }

    @l
    public final NativeCrashSource getSource() {
        return this.f98849a;
    }

    @l
    public final String getUuid() {
        return this.f98851c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, String str4) {
        this.f98849a = nativeCrashSource;
        this.f98850b = str;
        this.f98851c = str2;
        this.f98852d = str3;
        this.f98853e = j10;
        this.f98854f = str4;
    }
}
