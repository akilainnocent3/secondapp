package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f39121a = c.f39140a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a implements hi {
        IGNORED("cache_ignored"),
        START("cache_start"),
        FINISH_SUCCESS("cache_finish_success"),
        FINISH_FAILURE("cache_finish_failure"),
        GET_RESPONSE_PARSING_ERROR("cache_get_response_parsing_error"),
        BID_RESPONSE_PARSING_ERROR("cache_bid_response_parsing_error"),
        ASSET_DOWNLOAD_ERROR("cache_asset_download_error"),
        REQUEST_ERROR("cache_request_error"),
        SERVER_ERROR("cache_server_error");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39132m = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39133b;

        a(String str) {
            this.f39133b = str;
        }

        public static sr.a b() {
            return f39132m;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39133b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b implements hi {
        SUCCESS("click_success"),
        FAILURE("click_failure"),
        INVALID_URL_ERROR("click_invalid_url_error");


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39138g = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39139b;

        b(String str) {
            this.f39139b = str;
        }

        public static sr.a b() {
            return f39138g;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39139b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d implements hi {
        SUBCLASSING_ERROR("consent_subclassing_error"),
        DECODING_ERROR("consent_decoding_error"),
        CREATION_ERROR("consent_creation_error"),
        PERSISTED_DATA_READING_ERROR("consent_persisted_data_reading_error"),
        PERSISTENCE_ERROR("consent_persistence_error");


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39149i = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39150b;

        d(String str) {
            this.f39150b = str;
        }

        public static sr.a b() {
            return f39149i;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39150b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum e implements hi {
        IMPRESSION_TRACKER_FAILURE("imptracker_failure");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39153e = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39154b;

        e(String str) {
            this.f39154b = str;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39154b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum f implements hi {
        USER_AGENT_UPDATE_ERROR("user_agent_update_error"),
        PREFETCH_REQUEST_ERROR("prefetch_request_error"),
        CONFIG_REQUEST_ERROR("config_request_error"),
        INSTALL_REQUEST_ERROR("install_request_error"),
        IMPRESSION_RECORDED("impression_recorded"),
        UNSUPPORTED_OS_VERSION("unsupported_os_version"),
        TOO_MANY_EVENTS("too_many_events");


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39163k = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39164b;

        f(String str) {
            this.f39164b = str;
        }

        public static sr.a b() {
            return f39163k;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39164b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum g implements hi {
        SUCCESS("navigation_success"),
        FAILURE("navigation_failure");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39168f = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39169b;

        g(String str) {
            this.f39169b = str;
        }

        public static sr.a b() {
            return f39168f;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39169b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum h implements hi {
        REQUEST_JSON_SERIALIZATION_ERROR("request_json_serialization_error"),
        RESPONSE_JSON_SERIALIZATION_ERROR("response_json_serialization_error"),
        RESPONSE_DATA_WRITE_ERROR("response_data_write_error"),
        DISPATCHER_EXCEPTION("network_failure_dispatcher_exception");


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39175h = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39176b;

        h(String str) {
            this.f39176b = str;
        }

        public static sr.a b() {
            return f39175h;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39176b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum i implements hi {
        START("show_start"),
        FINISH_SUCCESS("show_finish_success"),
        FINISH_FAILURE("show_finish_failure"),
        UNAVAILABLE_ASSET_ERROR("show_unavailable_asset_error"),
        TIMEOUT_EVENT("show_timeout_error"),
        HTML_MISSING_MUSTACHE_ERROR("show_html_missing_mustache_error"),
        WEBVIEW_SSL_ERROR("show_webview_ssl_error"),
        WEBVIEW_ERROR("show_webview_error"),
        WEBVIEW_CRASH("show_webview_crash"),
        UNEXPECTED_DISMISS_ERROR("show_unexpected_dismiss_error"),
        REQUEST_ERROR("show_request_error"),
        CLOSE_BEFORE_TEMPLATE_SHOW_ERROR("show_close_before_template_show_error"),
        DISMISS_MISSING("dismiss_missing");


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39191q = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39192b;

        i(String str) {
            this.f39192b = str;
        }

        public static sr.a b() {
            return f39191q;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39192b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum j implements hi {
        FINISH_SUCCESS("video_finish_success"),
        FINISH_FAILURE("video_finish_failure");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39196f = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39197b;

        j(String str) {
            this.f39197b = str;
        }

        public static sr.a b() {
            return f39196f;
        }

        @Override // com.chartboost.sdk.impl.hi
        public String getValue() {
            return this.f39197b;
        }
    }

    String getValue();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f39140a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final dr.i0 f39141b = dr.k0.b(a.f39142b);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends kotlin.jvm.internal.o0 implements ds.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f39142b = new a();

            public a() {
                super(0);
            }

            @Override // ds.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return fr.p.j(new Object[][]{a.b().toArray(new a[0]), i.b().toArray(new i[0]), b.b().toArray(new b[0]), d.b().toArray(new d[0]), g.b().toArray(new g[0]), h.b().toArray(new h[0]), j.b().toArray(new j[0]), f.b().toArray(new f[0])});
            }
        }

        public final List a(List values) {
            kotlin.jvm.internal.m0.p(values, "values");
            List listA = a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (values.contains(((hi) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final List a() {
            return (List) f39141b.getValue();
        }
    }
}
