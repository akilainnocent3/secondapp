package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivRequestExecutor {

    @oy.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @oy.l
    @cs.g
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Callback {
        void onFail();

        void onSuccess();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Header {

        @oy.l
        private final String name;

        @oy.l
        private final String value;

        public Header(@oy.l String str, @oy.l String str2) {
            this.name = str;
            this.value = str2;
        }

        @oy.l
        public final String getName() {
            return this.name;
        }

        @oy.l
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Request {

        @oy.l
        private final String body;

        @oy.m
        private final List<Header> headers;

        @oy.l
        private final String method;

        @oy.l
        private final Uri url;

        public Request(@oy.l Uri uri, @oy.l String str, @oy.m List<Header> list, @oy.l String str2) {
            this.url = uri;
            this.method = str;
            this.headers = list;
            this.body = str2;
        }

        @oy.l
        public final String getBody() {
            return this.body;
        }

        @oy.m
        public final List<Header> getHeaders() {
            return this.headers;
        }

        @oy.l
        public final String getMethod() {
            return this.method;
        }

        @oy.l
        public final Uri getUrl() {
            return this.url;
        }
    }

    @oy.l
    LoadReference execute(@oy.l Request request, @oy.m Callback callback);
}
