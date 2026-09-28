package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wk4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yn4 yn4Var = ((zk4) obj).a;
                yn4Var.z = false;
                il4 il4VarD = yn4Var.d();
                yn4Var.A = il4VarD;
                return il4VarD;
            default:
                ((m410) obj).J0();
                return Unit.a;
        }
    }
}
