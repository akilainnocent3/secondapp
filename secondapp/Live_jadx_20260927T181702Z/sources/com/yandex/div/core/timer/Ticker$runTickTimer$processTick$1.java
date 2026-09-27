package com.yandex.div.core.timer;

import dr.w2;
import ds.a;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Ticker$runTickTimer$processTick$1 extends o0 implements a<w2> {
    final /* synthetic */ long $duration;
    final /* synthetic */ l1.g $ticksLeft;
    final /* synthetic */ Ticker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ticker$runTickTimer$processTick$1(l1.g gVar, Ticker ticker, long j10) {
        super(0);
        this.$ticksLeft = gVar;
        this.this$0 = ticker;
        this.$duration = j10;
    }

    @Override // ds.a
    public /* bridge */ /* synthetic */ w2 invoke() {
        invoke2();
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$ticksLeft.f102748b > 0) {
            this.this$0.onTick.invoke(Long.valueOf(this.$duration));
        }
        this.this$0.onEnd.invoke(Long.valueOf(this.$duration));
        this.this$0.cleanTicker();
        this.this$0.resetTickerState();
        this.this$0.state = Ticker.State.STOPPED;
    }
}
