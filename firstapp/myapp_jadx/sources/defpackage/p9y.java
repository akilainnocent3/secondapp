package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p9y implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                x8y x8yVar = (x8y) obj;
                x8yVar.getClass();
                return x8yVar.h;
            default:
                return Boolean.valueOf(((Integer) obj).intValue() % 2 == 0);
        }
    }
}
