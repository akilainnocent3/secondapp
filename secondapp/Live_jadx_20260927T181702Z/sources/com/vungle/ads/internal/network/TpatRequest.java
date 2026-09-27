package com.vungle.ads.internal.network;

import com.vungle.ads.internal.util.LogEntry;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TpatRequest {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int PRIORITY_MAX_RETRY_COUNT = 3;
    private static final int REGULAR_MAX_RETRY_COUNT = 5;

    @m
    private final String body;

    @m
    private final Map<String, String> headers;

    @m
    private final LogEntry logEntry;

    @l
    private final HttpMethod method;

    @m
    private final Boolean priorityRetry;
    private final int priorityRetryCount;
    private final boolean regularRetry;
    private final int regularRetryCount;

    @m
    private final String tpatKey;

    @l
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        @m
        private String body;

        @m
        private Map<String, String> headers;

        @m
        private LogEntry logEntry;

        @l
        private HttpMethod method;

        @m
        private Boolean priorityRetry;
        private int priorityRetryCount;
        private boolean regularRetry;
        private int regularRetryCount;

        @m
        private String tpatKey;

        @l
        private final String url;

        public Builder(@l String url) {
            m0.p(url, "url");
            this.url = url;
            this.method = HttpMethod.GET;
            this.priorityRetryCount = 3;
            this.regularRetry = true;
            this.regularRetryCount = 5;
        }

        @l
        public final Builder body(@m String str) {
            this.body = str;
            return this;
        }

        @l
        public final TpatRequest build() {
            return new TpatRequest(this.url, this.method, this.headers, this.body, this.priorityRetry, this.priorityRetryCount, this.regularRetry, this.regularRetryCount, this.tpatKey, this.logEntry, null);
        }

        @l
        public final Builder get() {
            this.method = HttpMethod.GET;
            return this;
        }

        @l
        public final String getUrl() {
            return this.url;
        }

        @l
        public final Builder headers(@m Map<String, String> map) {
            this.headers = map;
            return this;
        }

        @l
        public final Builder method(@l HttpMethod method) {
            m0.p(method, "method");
            this.method = method;
            return this;
        }

        @l
        public final Builder post() {
            this.method = HttpMethod.POST;
            return this;
        }

        @l
        public final Builder priorityRetry(boolean z10) {
            this.priorityRetry = Boolean.valueOf(z10);
            return this;
        }

        @l
        public final Builder priorityRetryCount(int i10) {
            this.priorityRetryCount = i10;
            return this;
        }

        @l
        public final Builder regularRetry(boolean z10) {
            this.regularRetry = z10;
            return this;
        }

        @l
        public final Builder regularRetryCount(int i10) {
            this.regularRetryCount = i10;
            return this;
        }

        @l
        public final Builder tpatKey(@m String str) {
            this.tpatKey = str;
            return this;
        }

        @l
        public final Builder withLogEntry(@m LogEntry logEntry) {
            this.logEntry = logEntry;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TpatRequest(String str, HttpMethod httpMethod, Map map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, LogEntry logEntry, x xVar) {
        this(str, httpMethod, map, str2, bool, i10, z10, i11, str3, logEntry);
    }

    @m
    public final String getBody() {
        return this.body;
    }

    @m
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @m
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    @l
    public final HttpMethod getMethod() {
        return this.method;
    }

    @m
    public final Boolean getPriorityRetry() {
        return this.priorityRetry;
    }

    public final int getPriorityRetryCount() {
        return this.priorityRetryCount;
    }

    public final boolean getRegularRetry() {
        return this.regularRetry;
    }

    public final int getRegularRetryCount() {
        return this.regularRetryCount;
    }

    @m
    public final String getTpatKey() {
        return this.tpatKey;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    private TpatRequest(String str, HttpMethod httpMethod, Map<String, String> map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, LogEntry logEntry) {
        this.url = str;
        this.method = httpMethod;
        this.headers = map;
        this.body = str2;
        this.priorityRetry = bool;
        this.priorityRetryCount = i10;
        this.regularRetry = z10;
        this.regularRetryCount = i11;
        this.tpatKey = str3;
        this.logEntry = logEntry;
    }
}
