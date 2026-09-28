package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mbk implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                bvq bvqVar = (bvq) obj;
                bvqVar.getClass();
                return bvqVar.a;
            default:
                obj.getClass();
                return new t82(((Float) obj).floatValue());
        }
    }
}
