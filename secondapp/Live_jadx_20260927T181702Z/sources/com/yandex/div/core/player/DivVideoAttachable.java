package com.yandex.div.core.player;

import mq.dq;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivVideoAttachable {
    void attach(@l DivPlayer divPlayer);

    void detach();

    @m
    DivPlayer getAttachedPlayer();

    void setScale(@l dq dqVar);

    void setVisibleOnScreen(boolean z10);
}
