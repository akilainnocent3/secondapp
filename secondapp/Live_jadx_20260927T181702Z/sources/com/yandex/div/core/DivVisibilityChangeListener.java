package com.yandex.div.core;

import android.view.View;
import com.yandex.div.core.annotations.PublicApi;
import java.util.Map;
import mq.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivVisibilityChangeListener {
    public static final DivVisibilityChangeListener STUB = new DivVisibilityChangeListener() { // from class: com.yandex.div.core.q
        @Override // com.yandex.div.core.DivVisibilityChangeListener
        public final void onViewsVisibilityChanged(Map map) {
            s.a(map);
        }
    };

    void onViewsVisibilityChanged(Map<View, e0> map);
}
