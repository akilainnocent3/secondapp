package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jbl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jbl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((mmd) obj).getClass();
                wd0<gly, jj0> wd0Var = ((ibl) obj2).a;
                int iB = ycv.b(Float.intBitsToFloat((int) (wd0Var.d().a >> 32)));
                return new iwo((((long) ycv.b(Float.intBitsToFloat((int) (wd0Var.d().a & 4294967295L)))) & 4294967295L) | (((long) iB) << 32));
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new mak0.h(ijf0Var));
                return Unit.a;
        }
    }
}
