package com.yandex.div.core;

import com.yandex.div.core.images.LoadReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivRequestExecutor$Companion$STUB$1 implements DivRequestExecutor {
    @Override // com.yandex.div.core.DivRequestExecutor
    @oy.l
    public LoadReference execute(@oy.l DivRequestExecutor.Request request, @oy.m DivRequestExecutor.Callback callback) {
        return new LoadReference() { // from class: com.yandex.div.core.k
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                DivRequestExecutor$Companion$STUB$1.execute$lambda$0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0() {
    }
}
