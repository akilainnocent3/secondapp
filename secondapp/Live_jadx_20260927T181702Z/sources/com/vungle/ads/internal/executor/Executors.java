package com.vungle.ads.internal.executor;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Executors {
    @l
    VungleThreadPoolExecutor getApiExecutor();

    @l
    VungleThreadPoolExecutor getBackgroundExecutor();

    @l
    VungleThreadPoolExecutor getDownloaderExecutor();

    @l
    VungleThreadPoolExecutor getIoExecutor();

    @l
    VungleThreadPoolExecutor getJobExecutor();

    @l
    VungleThreadPoolExecutor getLoggerExecutor();

    @l
    VungleThreadPoolExecutor getOffloadExecutor();

    @l
    VungleThreadPoolExecutor getUaExecutor();
}
