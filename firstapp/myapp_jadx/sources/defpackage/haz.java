package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class haz implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iR;
        mzo mzoVar = (mzo) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                iR = mzoVar.R(num.intValue());
                break;
            default:
                iR = mzoVar.b0(num.intValue());
                break;
        }
        return Integer.valueOf(iR);
    }
}
