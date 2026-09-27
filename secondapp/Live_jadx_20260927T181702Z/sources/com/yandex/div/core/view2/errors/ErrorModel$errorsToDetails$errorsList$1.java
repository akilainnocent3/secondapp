package com.yandex.div.core.view2.errors;

import com.yandex.div.json.ParsingException;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorModel$errorsToDetails$errorsList$1 extends o0 implements l<Throwable, CharSequence> {
    public static final ErrorModel$errorsToDetails$errorsList$1 INSTANCE = new ErrorModel$errorsToDetails$errorsList$1();

    public ErrorModel$errorsToDetails$errorsList$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final CharSequence invoke(@oy.l Throwable th2) {
        if (!(th2 instanceof ParsingException)) {
            return " - " + ErrorVisualMonitorKt.getFullStackMessage(th2);
        }
        return " - " + ((ParsingException) th2).getReason() + ": " + ErrorVisualMonitorKt.getFullStackMessage(th2);
    }
}
