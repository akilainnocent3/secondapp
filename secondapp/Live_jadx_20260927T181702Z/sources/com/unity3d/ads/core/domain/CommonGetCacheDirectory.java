package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    @l
    public File invoke(@l File cacheDirectoryBase, @l String cacheDirectoryPath) {
        m0.p(cacheDirectoryBase, "cacheDirectoryBase");
        m0.p(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
