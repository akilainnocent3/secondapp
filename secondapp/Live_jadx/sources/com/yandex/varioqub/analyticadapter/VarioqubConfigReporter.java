package com.yandex.varioqub.analyticadapter;

import com.yandex.varioqub.analyticadapter.data.ConfigData;
import java.util.Set;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface VarioqubConfigReporter {
    void reportConfigChanged(@l ConfigData configData);

    void setExperiments(@l String str);

    void setTriggeredTestIds(@l Set<Long> set);
}
