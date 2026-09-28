package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oxd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oxd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yxd yxdVarJ0 = ((rxd) obj).J0();
                ech0.g gVar = ech0.g.a;
                gVar.getClass();
                yxdVarJ0.r0.a(gVar);
                return Unit.a;
            case 1:
                return Float.valueOf(((fmt) obj).g());
            default:
                return Boolean.valueOf(((hns) obj).q);
        }
    }
}
