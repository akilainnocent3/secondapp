package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bvz implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        int length = str.length();
        boolean z = false;
        if (8 <= length && length < 65) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
