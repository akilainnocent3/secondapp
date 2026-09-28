package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cdj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                boolean z = false;
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isDigit(str.charAt(i))) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
            default:
                vur vurVar = (vur) obj;
                vurVar.getClass();
                return new s7l(qvr.a(vurVar.a()));
        }
    }
}
