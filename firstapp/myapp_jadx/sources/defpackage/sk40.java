package defpackage;

import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class sk40 extends qlr implements Function0<Unit> {
    public final /* synthetic */ rk40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk40(rk40 rk40Var) {
        super(0);
        this.a = rk40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        rk40 rk40Var = this.a;
        rk40Var.g = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            rk40Var.b();
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            Trace.endSection();
        }
    }
}
