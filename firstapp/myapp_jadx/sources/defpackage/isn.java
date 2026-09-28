package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class isn implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ isn(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            default:
                kme kmeVar = (kme) obj;
                kmeVar.getClass();
                return kme.a(kmeVar, null, null, false, false, false, false, false, false, null, 383);
        }
    }
}
