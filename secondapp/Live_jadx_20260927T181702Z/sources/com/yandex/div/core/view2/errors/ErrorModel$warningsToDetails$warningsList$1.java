package com.yandex.div.core.view2.errors;

import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorModel$warningsToDetails$warningsList$1 extends o0 implements l<Throwable, CharSequence> {
    public static final ErrorModel$warningsToDetails$warningsList$1 INSTANCE = new ErrorModel$warningsToDetails$warningsList$1();

    public ErrorModel$warningsToDetails$warningsList$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final CharSequence invoke(@oy.l Throwable th2) {
        return " - " + ErrorVisualMonitorKt.getFullStackMessage(th2);
    }
}
