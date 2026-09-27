package com.unity3d.services.core.network.domain;

import ds.l;
import java.io.File;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends i0 implements l<File, Boolean> {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // ds.l
    @oy.l
    public final Boolean invoke(@oy.l File p10) {
        m0.p(p10, "p0");
        return Boolean.valueOf(p10.isFile());
    }
}
