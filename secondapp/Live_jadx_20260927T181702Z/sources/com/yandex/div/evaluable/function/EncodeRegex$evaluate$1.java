package com.yandex.div.evaluable.function;

import cv.r;
import ds.l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class EncodeRegex$evaluate$1 extends o0 implements l<r, CharSequence> {
    public static final EncodeRegex$evaluate$1 INSTANCE = new EncodeRegex$evaluate$1();

    public EncodeRegex$evaluate$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final CharSequence invoke(@oy.l r it) {
        m0.p(it, "it");
        return '\\' + it.getValue();
    }
}
