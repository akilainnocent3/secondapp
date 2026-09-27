package com.yandex.div.internal.template;

import cs.g;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Field<T> {

    @l
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_NULL = 0;
    public static final int TYPE_PLACEHOLDER = 1;
    public static final int TYPE_REFERENCE = 3;
    public static final int TYPE_VALUE = 2;

    @g
    public final boolean overridable;

    @g
    public final int type;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final <T> Field<T> nullField(boolean z10) {
            Field<T> field = z10 ? Placeholder.INSTANCE : Null.INSTANCE;
            m0.n(field, "null cannot be cast to non-null type com.yandex.div.internal.template.Field<T of com.yandex.div.internal.template.Field.Companion.nullField>");
            return field;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Null extends Field<Object> {

        @l
        public static final Null INSTANCE = new Null();

        /* JADX WARN: Multi-variable type inference failed */
        private Null() {
            super(0, 0 == true ? 1 : 0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Placeholder extends Field<Object> {

        @l
        public static final Placeholder INSTANCE = new Placeholder();

        private Placeholder() {
            super(1, 1 == true ? 1 : 0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Reference<T> extends Field<T> {

        @l
        @g
        public final String reference;

        public Reference(boolean z10, @l String str) {
            super(3, z10, null);
            this.reference = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Value<T> extends Field<T> {

        @g
        public final T value;

        public Value(boolean z10, T t10) {
            super(2, z10, null);
            this.value = t10;
        }
    }

    public /* synthetic */ Field(int i10, boolean z10, x xVar) {
        this(i10, z10);
    }

    private Field(int i10, boolean z10) {
        this.type = i10;
        this.overridable = z10;
    }
}
