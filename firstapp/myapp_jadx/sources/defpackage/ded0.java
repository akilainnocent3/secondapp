package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ded0 implements zdd0 {
    public final Context a;

    public ded0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zdd0
    public final Object a(boolean z, x1b x1bVar) {
        bed0 bed0Var;
        if (x1bVar instanceof bed0) {
            bed0Var = (bed0) x1bVar;
            int i = bed0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bed0Var.c = i - Integer.MIN_VALUE;
            } else {
                bed0Var = new bed0(this, x1bVar);
            }
        } else {
            bed0Var = new bed0(this, x1bVar);
        }
        Object obj = bed0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bed0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = eed0.b.a(this.a, eed0.a[0]);
            ced0 ced0Var = new ced0(z, null);
            bed0Var.c = 1;
            if (do20.a(sqcVarA, ced0Var, bed0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.zdd0
    public final aed0 b() {
        return new aed0(eed0.b.a(this.a, eed0.a[0]).k());
    }
}
