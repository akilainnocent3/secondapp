package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vk4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vk4(Object obj, int i) {
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
                yn4Var.z = true;
                yn4Var.u = null;
                yn4Var.v = null;
                il4 il4VarD = yn4Var.d();
                yn4Var.A = il4VarD;
                return il4VarD;
            default:
                ((Function1) obj).invoke(b.a.g.a);
                return Unit.a;
        }
    }
}
