package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f98890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f98892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f98893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f98894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f98895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f98896g;

    public Response(@Nullable Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public int getCode() {
        return this.f98891b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f98893d;
    }

    @Nullable
    public Throwable getException() {
        return this.f98895f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f98894e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f98892c;
    }

    @Nullable
    public String getUrl() {
        return this.f98896g;
    }

    public boolean isCompleted() {
        return this.f98890a;
    }

    public String toString() {
        return "Response{completed=" + this.f98890a + ", code=" + this.f98891b + ", responseDataLength=" + this.f98892c.length + ", errorDataLength=" + this.f98893d.length + ", headers=" + this.f98894e + ", exception=" + this.f98895f + ", url=" + this.f98896g + b.f85383j;
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2) {
        this(z10, i10, bArr, bArr2, map, th2, null);
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2, @Nullable String str) {
        Map mapA;
        this.f98890a = z10;
        this.f98891b = i10;
        this.f98892c = bArr;
        this.f98893d = bArr2;
        if (map == null) {
            mapA = Collections.EMPTY_MAP;
        } else {
            mapA = e.a(map);
        }
        this.f98894e = mapA;
        this.f98895f = th2;
        this.f98896g = str;
    }
}
