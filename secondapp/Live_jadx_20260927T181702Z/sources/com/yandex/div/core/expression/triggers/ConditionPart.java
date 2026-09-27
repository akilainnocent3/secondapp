package com.yandex.div.core.expression.triggers;

import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ConditionPart {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @l
        public final List<ConditionPart> parse(@l String str) {
            return new Result(str).parse();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class RawString implements ConditionPart {

        @l
        private final String value;

        public RawString(@l String str) {
            this.value = str;
        }

        public static /* synthetic */ RawString copy$default(RawString rawString, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = rawString.value;
            }
            return rawString.copy(str);
        }

        @l
        public final String component1() {
            return this.value;
        }

        @l
        public final RawString copy(@l String str) {
            return new RawString(str);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RawString) && m0.g(this.value, ((RawString) obj).value);
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @l
        public String toString() {
            return "RawString(value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Variable implements ConditionPart {

        @l
        private final String name;

        public Variable(@l String str) {
            this.name = str;
        }

        public static /* synthetic */ Variable copy$default(Variable variable, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = variable.name;
            }
            return variable.copy(str);
        }

        @l
        public final String component1() {
            return this.name;
        }

        @l
        public final Variable copy(@l String str) {
            return new Variable(str);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Variable) && m0.g(this.name, ((Variable) obj).name);
        }

        @l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @l
        public String toString() {
            return "Variable(name=" + this.name + ')';
        }
    }
}
