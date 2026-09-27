package com.yandex.div.core.timer;

import ds.a;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Ticker$timer$2 extends o0 implements a<FixedRateScheduler> {
    public static final Ticker$timer$2 INSTANCE = new Ticker$timer$2();

    public Ticker$timer$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final FixedRateScheduler invoke() {
        return new FixedRateScheduler();
    }
}
