package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cvz implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (Character.isLowerCase(str.charAt(i2))) {
                        z = true;
                        break;
                    }
                }
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
