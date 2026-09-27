package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ResponseDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f98952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f98953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f98954d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f98954d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f98951a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.f98952b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.f98953c;
    }

    public boolean isValidResponse() {
        return this.f98954d.isResponseValid(this.f98951a);
    }

    public void setResponseCode(int i10) {
        this.f98951a = i10;
    }

    public void setResponseData(@Nullable byte[] bArr) {
        this.f98952b = bArr;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map) {
        this.f98953c = map;
    }
}
