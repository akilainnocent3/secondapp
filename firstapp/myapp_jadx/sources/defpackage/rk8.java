package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rk8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fme fmeVar = ((zk8) obj2).w;
                fmeVar.getClass();
                fmeVar.C.setText((String) obj);
                break;
            default:
                ((Function1) obj2).invoke(new zxq.f(((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.a;
    }
}
