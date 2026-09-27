package io.appmetrica.analytics.coreapi.internal.data;

import dr.i1;
import dr.j1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface Parser<IN, OUT> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        @m
        public static <IN, OUT> OUT parseOrNull(@l Parser<? super IN, ? extends OUT> parser, IN in2) {
            OUT out;
            try {
                i1.a aVar = i1.f79460c;
                out = (OUT) i1.b(parser.parse(in2));
            } catch (Throwable th2) {
                i1.a aVar2 = i1.f79460c;
                out = (OUT) i1.b(j1.a(th2));
            }
            if (i1.i(out)) {
                return null;
            }
            return out;
        }
    }

    @l
    OUT parse(IN in2);

    @m
    OUT parseOrNull(IN in2);
}
