package com.yandex.div.core;

import com.yandex.div.core.annotations.PublicApi;
import k.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivViewConfig {
    public static final DivViewConfig DEFAULT = new DivViewConfig() { // from class: com.yandex.div.core.n
        @Override // com.yandex.div.core.DivViewConfig
        public /* synthetic */ int getLogCardScrollSignificantThreshold() {
            return o.a(this);
        }

        @Override // com.yandex.div.core.DivViewConfig
        public final boolean isContextMenuEnabled() {
            return o.b();
        }
    };

    @q0
    int getLogCardScrollSignificantThreshold();

    boolean isContextMenuEnabled();
}
