package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class msn implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        boolean z = false;
        if ('0' <= cCharValue && cCharValue < ':') {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
