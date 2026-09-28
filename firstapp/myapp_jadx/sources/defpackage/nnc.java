package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nnc implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new gly((((long) Float.floatToRawIntBits(((Float) obj).floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            default:
                idr idrVar = (idr) obj;
                idrVar.getClass();
                return idrVar.getClass().getName();
        }
    }
}
