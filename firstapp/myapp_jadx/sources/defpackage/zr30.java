package defpackage;

import com.sportybet.plugin.realsports.data.RTicket;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel$getTicketDetail$2", f = "RSportTicketDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zr30 extends tje0 implements Function2<lk50<? extends jqf0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ds30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr30(ds30 ds30Var, v1b<? super zr30> v1bVar) {
        super(2, v1bVar);
        this.b = ds30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zr30 zr30Var = new zr30(this.b, v1bVar);
        zr30Var.a = obj;
        return zr30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends jqf0> lk50Var, v1b<? super Unit> v1bVar) {
        return ((zr30) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<jqf0> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ds30 ds30Var = this.b;
        ds30Var.w.m(lk50Var);
        if (ds30Var.E && (lk50Var instanceof lk50.c)) {
            RTicket rTicket = ds30Var.D;
            if (rTicket == null) {
                return Unit.a;
            }
            if (rTicket.isAllSelectionSettled()) {
                ds30Var.i.f(rTicket.winningStatus);
            }
        }
        return Unit.a;
    }
}
