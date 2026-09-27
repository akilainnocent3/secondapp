package com.yandex.div.internal.parser;

import android.net.Uri;
import java.util.Collection;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingValidatorsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <R, T> ListValidator<T> cast(ListValidator<R> listValidator) {
        m0.n(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return listValidator;
    }

    public static final boolean doesMatch(@oy.l String str, @oy.l String str2) {
        return Pattern.matches(str2, str);
    }

    public static final boolean hasScheme(@oy.l Uri uri, @oy.l Collection<String> collection) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return collection.contains(scheme);
        }
        return false;
    }
}
