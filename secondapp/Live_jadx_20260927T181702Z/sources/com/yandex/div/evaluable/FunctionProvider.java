package com.yandex.div.evaluable;

import cs.g;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface FunctionProvider {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @g
    public static final FunctionProvider STUB = new FunctionProvider() { // from class: com.yandex.div.evaluable.FunctionProvider$Companion$STUB$1
        @Override // com.yandex.div.evaluable.FunctionProvider
        @l
        public Function get(@l String name, @l List<? extends EvaluableType> args) {
            m0.p(name, "name");
            m0.p(args, "args");
            return Function.STUB;
        }

        @Override // com.yandex.div.evaluable.FunctionProvider
        @l
        public Function getMethod(@l String name, @l List<? extends EvaluableType> args) {
            m0.p(name, "name");
            m0.p(args, "args");
            return Function.STUB;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @l
    Function get(@l String str, @l List<? extends EvaluableType> list);

    @l
    Function getMethod(@l String str, @l List<? extends EvaluableType> list);
}
