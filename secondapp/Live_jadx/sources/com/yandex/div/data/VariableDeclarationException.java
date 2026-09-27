package com.yandex.div.data;

import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VariableDeclarationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public VariableDeclarationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VariableDeclarationException(String str, Throwable th2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }

    public VariableDeclarationException(@m String str, @m Throwable th2) {
        super(str, th2);
    }
}
