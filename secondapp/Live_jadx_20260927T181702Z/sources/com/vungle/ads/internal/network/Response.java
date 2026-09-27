package com.vungle.ads.internal.network;

import jw.a0;
import jw.n0;
import jw.o0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Response<T> {

    @l
    public static final Companion Companion = new Companion(null);

    @m
    private final T body;

    @m
    private final o0 errorBody;

    @l
    private final n0 rawResponse;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final <T> Response<T> error(@m o0 o0Var, @l n0 rawResponse) {
            m0.p(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            x xVar = null;
            return new Response<>(rawResponse, xVar, o0Var, xVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l
        public final <T> Response<T> success(@m T t10, @l n0 rawResponse) {
            m0.p(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new Response<>(rawResponse, t10, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Response(n0 n0Var, Object obj, o0 o0Var, x xVar) {
        this(n0Var, obj, o0Var);
    }

    @m
    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.L();
    }

    @m
    public final o0 errorBody() {
        return this.errorBody;
    }

    @l
    public final a0 headers() {
        return this.rawResponse.e0();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    @l
    public final String message() {
        return this.rawResponse.g0();
    }

    @l
    public final n0 raw() {
        return this.rawResponse;
    }

    @l
    public String toString() {
        return this.rawResponse.toString();
    }

    private Response(n0 n0Var, T t10, o0 o0Var) {
        this.rawResponse = n0Var;
        this.body = t10;
        this.errorBody = o0Var;
    }
}
