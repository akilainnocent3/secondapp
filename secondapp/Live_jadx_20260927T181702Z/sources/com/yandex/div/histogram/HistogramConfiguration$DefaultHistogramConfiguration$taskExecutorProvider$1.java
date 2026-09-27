package com.yandex.div.histogram;

import kotlin.jvm.internal.i0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 extends i0 implements ds.a<DefaultTaskExecutor> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1() {
        super(0, DefaultTaskExecutor.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final DefaultTaskExecutor invoke() {
        return new DefaultTaskExecutor();
    }
}
