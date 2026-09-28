package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dnv implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        return new gly((((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue) << 32));
    }
}
