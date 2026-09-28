package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xc8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xc8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zc8 zc8Var = (zc8) obj2;
                wc8 wc8Var = zc8Var.A;
                if (wc8Var != null) {
                    zc8Var.z1(wc8Var);
                }
                break;
            default:
                ((isw) obj2).A(((Float) obj).floatValue());
                break;
        }
        return Unit.a;
    }
}
