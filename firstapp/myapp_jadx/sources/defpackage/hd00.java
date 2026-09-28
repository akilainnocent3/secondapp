package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sportybet.feature.payment.impl.deposit.presentation.model.PendingRequestParam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhd00;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hd00 extends j8i0 {
    public final f7k a;
    public final PendingRequestParam b;
    public final wwd0 c;
    public final v340 d;
    public final ku90<a> e;
    public final t340 f;
    public final ku90<cd00> i;
    public final t340 v;
    public jvd0 w;

    public hd00(vu60 vu60Var, f7k f7kVar, rdd0 rdd0Var) {
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = f7kVar;
        PendingRequestParam pendingRequestParam = (PendingRequestParam) vu60Var.b("ARGS_PENDING_REQUEST");
        this.b = pendingRequestParam;
        wwd0 wwd0VarA = xwd0.a(new bd00(0));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        ku90<a> ku90Var = new ku90<>();
        this.e = ku90Var;
        this.f = e1i.a(ku90Var);
        ku90<cd00> ku90Var2 = new ku90<>();
        this.i = ku90Var2;
        this.v = e1i.a(ku90Var2);
        Object objB = vu60Var.b("pending_request_view_event_sent");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.g(objB, bool)) {
            return;
        }
        vu60Var.e(bool, "pending_request_view_event_sent");
        rdd0Var.a(new ynd(pendingRequestParam != null ? pendingRequestParam.a : null, pendingRequestParam != null ? pendingRequestParam.b : null, pendingRequestParam != null ? pendingRequestParam.c : null, pendingRequestParam != null ? pendingRequestParam.d : null), k00.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(x1b x1bVar) throws Throwable {
        fd00 fd00Var;
        wwd0 wwd0Var;
        Object value;
        bd00 bd00Var;
        if (x1bVar instanceof fd00) {
            fd00Var = (fd00) x1bVar;
            int i = fd00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fd00Var.c = i - Integer.MIN_VALUE;
            } else {
                fd00Var = new fd00(this, x1bVar);
            }
        } else {
            fd00Var = new fd00(this, x1bVar);
        }
        Object objA = fd00Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fd00Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            fd00Var.c = 1;
            objA = b.a(this.e, fd00Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        do {
            wwd0Var = this.c;
            value = wwd0Var.getValue();
            bd00Var = (bd00) value;
            m3y.a.getClass();
        } while (!wwd0Var.g(value, bd00.a(bd00Var, zBooleanValue ? m3y.b : m3y.c, null, 2)));
        return Unit.a;
    }
}
