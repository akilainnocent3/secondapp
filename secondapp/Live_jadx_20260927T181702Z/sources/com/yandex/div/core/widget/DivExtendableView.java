package com.yandex.div.core.widget;

import com.yandex.div.core.annotations.PublicApi;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivExtendableView {
    @m
    DivViewDelegate getDelegate();

    void setDelegate(@m DivViewDelegate divViewDelegate);
}
