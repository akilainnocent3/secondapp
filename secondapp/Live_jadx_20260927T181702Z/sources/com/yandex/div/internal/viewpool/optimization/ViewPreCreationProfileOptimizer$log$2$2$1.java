package com.yandex.div.internal.viewpool.optimization;

import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewPreCreationProfileOptimizer$log$2$2$1 extends o0 implements l<PerformanceDependentSession.Detailed.ViewObtainment, CharSequence> {
    public static final ViewPreCreationProfileOptimizer$log$2$2$1 INSTANCE = new ViewPreCreationProfileOptimizer$log$2$2$1();

    public ViewPreCreationProfileOptimizer$log$2$2$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final CharSequence invoke(@oy.l PerformanceDependentSession.Detailed.ViewObtainment viewObtainment) {
        return viewObtainment.isObtainedWithBlock() ? "1" : "0";
    }
}
