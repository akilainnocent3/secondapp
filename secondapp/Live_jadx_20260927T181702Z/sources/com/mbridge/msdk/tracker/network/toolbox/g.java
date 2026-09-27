package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f70378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f70379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f70380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f70381e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f70380d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f70381e != null) {
            return new ByteArrayInputStream(this.f70381e);
        }
        return null;
    }

    public final int b() {
        return this.f70379c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f70378b);
    }

    public final int d() {
        return this.f70377a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f70377a = i10;
        this.f70378b = list;
        this.f70379c = i11;
        this.f70380d = inputStream;
        this.f70381e = null;
    }
}
