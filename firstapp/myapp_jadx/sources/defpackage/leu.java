package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class leu implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                sdu sduVar = (sdu) obj;
                sduVar.getClass();
                return sduVar.f;
            default:
                return Boolean.valueOf(Character.isDigit(((Character) obj).charValue()));
        }
    }
}
