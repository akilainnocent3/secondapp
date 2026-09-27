package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    @l
    public File invoke(@l File parent, @l String child) {
        m0.p(parent, "parent");
        m0.p(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    @l
    public File invoke(@l String pathname) {
        m0.p(pathname, "pathname");
        return new File(pathname);
    }
}
