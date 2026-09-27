package com.yandex.div.core.state;

import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PathFormatException extends Exception {
    public PathFormatException(@l String str, @m Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ PathFormatException(String str, Throwable th2, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
