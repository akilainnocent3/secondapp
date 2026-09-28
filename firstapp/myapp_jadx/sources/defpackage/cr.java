package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                nr nrVar = (nr) obj;
                nrVar.getClass();
                return nrVar.c;
            case 1:
                return Integer.valueOf(-((Integer) obj).intValue());
            default:
                irn irnVar = (irn) obj;
                irnVar.getClass();
                return irnVar.c;
        }
    }
}
