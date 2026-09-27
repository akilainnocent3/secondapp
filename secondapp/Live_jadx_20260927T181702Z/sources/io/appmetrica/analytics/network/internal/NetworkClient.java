package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f98870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f98871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f98872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f98873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f98874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f98875f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f98876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f98877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f98878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f98879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f98880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f98881f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f98876a, this.f98877b, this.f98878c, this.f98879d, this.f98880e, this.f98881f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i10) {
            this.f98876a = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z10) {
            this.f98880e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i10) {
            this.f98881f = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i10) {
            this.f98877b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f98878c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z10) {
            this.f98879d = Boolean.valueOf(z10);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i10) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.f98870a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.f98874e;
    }

    public int getMaxResponseSize() {
        return this.f98875f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.f98871b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f98872c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.f98873d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f98870a + ", readTimeout=" + this.f98871b + ", sslSocketFactory=" + this.f98872c + ", useCaches=" + this.f98873d + ", instanceFollowRedirects=" + this.f98874e + ", maxResponseSize=" + this.f98875f + b.f85383j;
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f98870a = num;
        this.f98871b = num2;
        this.f98872c = sSLSocketFactory;
        this.f98873d = bool;
        this.f98874e = bool2;
        this.f98875f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
