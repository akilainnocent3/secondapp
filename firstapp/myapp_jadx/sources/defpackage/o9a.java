package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o9a implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                boolean z = false;
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isUpperCase(str.charAt(i))) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
