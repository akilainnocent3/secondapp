package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ufv implements Function1<Float, gly> {
    public static final ufv a = new ufv();

    @Override // kotlin.jvm.functions.Function1
    public final gly invoke(Float f) {
        return new gly((((long) Float.floatToRawIntBits(f.floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }
}
