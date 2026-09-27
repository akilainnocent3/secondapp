package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import ds.l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DictFunctionsKt$throwException$signature$1 extends o0 implements l<Object, CharSequence> {
    public static final DictFunctionsKt$throwException$signature$1 INSTANCE = new DictFunctionsKt$throwException$signature$1();

    public DictFunctionsKt$throwException$signature$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.l
    @oy.l
    public final CharSequence invoke(@oy.l Object it) {
        m0.p(it, "it");
        return EvaluableExceptionKt.toMessageFormat(it);
    }
}
