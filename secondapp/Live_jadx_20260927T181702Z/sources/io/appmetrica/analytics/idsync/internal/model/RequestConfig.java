package io.appmetrica.analytics.idsync.internal.model;

import f0.p;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Preconditions f95532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f95533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f95534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f95535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f95536g;

    public RequestConfig(@l String str, @l String str2, @l Preconditions preconditions, @l Map<String, ? extends List<String>> map, long j10, long j11, @l List<Integer> list) {
        this.f95530a = str;
        this.f95531b = str2;
        this.f95532c = preconditions;
        this.f95533d = map;
        this.f95534e = j10;
        this.f95535f = j11;
        this.f95536g = list;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(RequestConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) obj;
        return this.f95534e == requestConfig.f95534e && this.f95535f == requestConfig.f95535f && m0.g(this.f95530a, requestConfig.f95530a) && m0.g(this.f95531b, requestConfig.f95531b) && m0.g(this.f95532c, requestConfig.f95532c) && m0.g(this.f95533d, requestConfig.f95533d) && m0.g(this.f95536g, requestConfig.f95536g);
    }

    @l
    public final Map<String, List<String>> getHeaders() {
        return this.f95533d;
    }

    @l
    public final Preconditions getPreconditions() {
        return this.f95532c;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f95535f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f95534e;
    }

    @l
    public final String getType() {
        return this.f95530a;
    }

    @l
    public final String getUrl() {
        return this.f95531b;
    }

    @l
    public final List<Integer> getValidResponseCodes() {
        return this.f95536g;
    }

    public int hashCode() {
        return this.f95536g.hashCode() + ((this.f95533d.hashCode() + ((this.f95532c.hashCode() + ((this.f95531b.hashCode() + ((this.f95530a.hashCode() + ((p.a(this.f95535f) + (p.a(this.f95534e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @l
    public String toString() {
        return "RequestConfig(type='" + this.f95530a + "', url='" + this.f95531b + "', preconditions=" + this.f95532c + ", headers=" + this.f95533d + ", resendIntervalForValidResponse=" + this.f95534e + ", resendIntervalForInvalidResponse=" + this.f95535f + ", validResponseCodes=" + this.f95536g + ')';
    }
}
