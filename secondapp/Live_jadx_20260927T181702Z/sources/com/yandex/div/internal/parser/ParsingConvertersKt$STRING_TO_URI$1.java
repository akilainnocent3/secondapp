package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$STRING_TO_URI$1 extends o0 implements ds.l<String, Uri> {
    public static final ParsingConvertersKt$STRING_TO_URI$1 INSTANCE = new ParsingConvertersKt$STRING_TO_URI$1();

    public ParsingConvertersKt$STRING_TO_URI$1() {
        super(1);
    }

    @Override // ds.l
    public final Uri invoke(@oy.l String str) {
        return Uri.parse(str);
    }
}
