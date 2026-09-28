package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.round((1.0f + (((asr) obj2) == asr.a ? -1.0f : 1.0f)) * (((Integer) obj).intValue() / 2.0f)));
    }
}
