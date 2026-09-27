package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f98884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f98885d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f98886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f98887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f98888c = new byte[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f98889d = new HashMap();

        public Builder(@NonNull String str) {
            this.f98886a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, @Nullable String str2) {
            this.f98889d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f98886a, this.f98887b, this.f98888c, this.f98889d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f98888c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f98887b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i10) {
        this(str, str2, bArr, map);
    }

    @NonNull
    public byte[] getBody() {
        return this.f98884c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f98885d;
    }

    @NonNull
    public String getMethod() {
        return this.f98883b;
    }

    @NonNull
    public String getUrl() {
        return this.f98882a;
    }

    public String toString() {
        return "Request{url=" + this.f98882a + ", method='" + this.f98883b + "', bodyLength=" + this.f98884c.length + ", headers=" + this.f98885d + b.f85383j;
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f98882a = str;
        this.f98883b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f98884c = bArr;
        this.f98885d = e.a(map);
    }
}
