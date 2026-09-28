package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kaz implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iX;
        mzo mzoVar = (mzo) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                iX = mzoVar.x(num.intValue());
                break;
            default:
                iX = mzoVar.x(num.intValue());
                break;
        }
        return Integer.valueOf(iX);
    }
}
