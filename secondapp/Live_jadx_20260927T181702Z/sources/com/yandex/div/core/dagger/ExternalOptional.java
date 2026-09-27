package com.yandex.div.core.dagger;

import cs.o;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import qq.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ExternalOptional<T> {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final a0<T> optional;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(a0.f122553b.a());
        }

        @l
        @o
        public final <T> ExternalOptional<T> of(@l T t10) {
            return new ExternalOptional<>(a0.f122553b.c(t10));
        }

        @l
        @o
        public final <T> ExternalOptional<T> ofNullable(@m T t10) {
            return t10 != null ? of(t10) : empty();
        }

        @l
        @o
        public final <T> ExternalOptional<T> wrap(@l a0<? extends T> a0Var) {
            return new ExternalOptional<>(a0Var);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cr.a
    public ExternalOptional(@l a0<? extends T> a0Var) {
        this.optional = a0Var;
    }

    @l
    @o
    public static final <T> ExternalOptional<T> empty() {
        return Companion.empty();
    }

    @l
    @o
    public static final <T> ExternalOptional<T> of(@l T t10) {
        return Companion.of(t10);
    }

    @l
    @o
    public static final <T> ExternalOptional<T> ofNullable(@m T t10) {
        return Companion.ofNullable(t10);
    }

    @l
    @o
    public static final <T> ExternalOptional<T> wrap(@l a0<? extends T> a0Var) {
        return Companion.wrap(a0Var);
    }

    @l
    public final a0<T> getOptional() {
        return this.optional;
    }
}
