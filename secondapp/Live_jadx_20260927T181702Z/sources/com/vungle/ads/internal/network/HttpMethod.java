package com.vungle.ads.internal.network;

import kotlin.jvm.internal.x;
import oy.l;
import zv.b0;
import zv.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@b0
public enum HttpMethod {
    GET,
    POST;


    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final j<HttpMethod> serializer() {
            return HttpMethod$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
