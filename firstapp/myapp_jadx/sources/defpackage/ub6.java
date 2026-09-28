package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ub6 extends qlr implements Function0<Unit> {
    public final /* synthetic */ svj0 a;
    public final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub6(svj0 svj0Var, UUID uuid) {
        super(0);
        this.a = svj0Var;
        this.b = uuid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        svj0 svj0Var = this.a;
        WorkDatabase workDatabase = svj0Var.c;
        workDatabase.getClass();
        workDatabase.u(new hv50(new tb6(0, svj0Var, this.b)));
        xm70.b(svj0Var.b, svj0Var.c, svj0Var.e);
        return Unit.a;
    }
}
