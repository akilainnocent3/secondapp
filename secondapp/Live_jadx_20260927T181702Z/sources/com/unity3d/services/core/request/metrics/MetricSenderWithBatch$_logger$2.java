package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.misc.Utilities;
import ds.a;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class MetricSenderWithBatch$_logger$2 extends o0 implements a<Logger> {
    public static final MetricSenderWithBatch$_logger$2 INSTANCE = new MetricSenderWithBatch$_logger$2();

    public MetricSenderWithBatch$_logger$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    public final Logger invoke() {
        return (Logger) Utilities.getService(Logger.class);
    }
}
