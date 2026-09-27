package com.yandex.div.internal.parser;

import android.net.Uri;
import com.yandex.div.evaluable.types.Url;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$ANY_TO_URI$1 extends o0 implements ds.l<Object, Uri> {
    public static final ParsingConvertersKt$ANY_TO_URI$1 INSTANCE = new ParsingConvertersKt$ANY_TO_URI$1();

    public ParsingConvertersKt$ANY_TO_URI$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.l
    @oy.l
    public final Uri invoke(@oy.l Object obj) {
        if (obj instanceof String) {
            return Uri.parse((String) obj);
        }
        if (obj instanceof Url) {
            return Uri.parse(((Url) obj).m3359unboximpl());
        }
        throw new ClassCastException("Received value of wrong type");
    }
}
