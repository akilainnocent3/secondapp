package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bbw implements Function1 {
    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        qaw qawVar = (qaw) obj;
        qawVar.getClass();
        if (qawVar.c <= 0) {
            z = false;
        } else {
            Double d = qawVar.e;
            if ((d != null ? d.doubleValue() : 0.0d) > 0.0d) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
