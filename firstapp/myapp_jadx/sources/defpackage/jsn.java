package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jsn implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
    }
}
