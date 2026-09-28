package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class bu70 implements xt70 {
    public static final zn20.a<String> b = new zn20.a<>("search_history");
    public final Context a;

    public bu70(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xt70
    public final Object a(String str, x1b x1bVar) {
        zt70 zt70Var;
        if (x1bVar instanceof zt70) {
            zt70Var = (zt70) x1bVar;
            int i = zt70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zt70Var.c = i - Integer.MIN_VALUE;
            } else {
                zt70Var = new zt70(this, x1bVar);
            }
        } else {
            zt70Var = new zt70(this, x1bVar);
        }
        Object obj = zt70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = zt70Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = cu70.b.a(this.a, cu70.a[0]);
            au70 au70Var = new au70(str, null);
            zt70Var.c = 1;
            if (do20.a(sqcVarA, au70Var, zt70Var) == y5bVar) {
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

    @Override // defpackage.xt70
    public final yt70 b() {
        return new yt70(cu70.b.a(this.a, cu70.a[0]).k());
    }
}
