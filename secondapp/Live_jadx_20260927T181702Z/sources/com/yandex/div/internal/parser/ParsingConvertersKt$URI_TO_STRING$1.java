package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$URI_TO_STRING$1 extends o0 implements ds.l<Uri, String> {
    public static final ParsingConvertersKt$URI_TO_STRING$1 INSTANCE = new ParsingConvertersKt$URI_TO_STRING$1();

    public ParsingConvertersKt$URI_TO_STRING$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final String invoke(@oy.l Uri uri) {
        return uri.toString();
    }
}
