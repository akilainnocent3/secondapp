package com.yandex.div.core.expression.triggers;

import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TriggerExecutor$changeTrigger$1 extends o0 implements l<Boolean, w2> {
    final /* synthetic */ TriggerExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerExecutor$changeTrigger$1(TriggerExecutor triggerExecutor) {
        super(1);
        this.this$0 = triggerExecutor;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w2.f79517a;
    }

    public final void invoke(boolean z10) {
        this.this$0.tryTriggerActions();
    }
}
