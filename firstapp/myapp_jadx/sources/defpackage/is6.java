package defpackage;

import com.sporty.android.core.model.MyLog;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.presentation.viewmodel.CashoutSuccessSingleViewModel$load$1", f = "CashoutSuccessSingleViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class is6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public wwd0 b;
    public int c;
    public final /* synthetic */ ks6 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is6(ks6 ks6Var, String str, v1b<? super is6> v1bVar) {
        super(2, v1bVar);
        this.d = ks6Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new is6(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((is6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[Catch: Exception -> 0x0012, CancellationException -> 0x006e, TryCatch #1 {CancellationException -> 0x006e, blocks: (B:6:0x000e, B:18:0x003b, B:20:0x0043, B:21:0x0046, B:13:0x0021, B:14:0x002b), top: B:36:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[Catch: Exception -> 0x0012, CancellationException -> 0x006e, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x006e, blocks: (B:6:0x000e, B:18:0x003b, B:20:0x0043, B:21:0x0046, B:13:0x0021, B:14:0x002b), top: B:36:0x0006 }] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        zl6 cVar;
        List list;
        y5b y5bVar = y5b.a;
        int i = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                ks6 ks6Var = this.d;
                wwd0 wwd0Var3 = ks6Var.d;
                try {
                    fr6 fr6Var = ks6Var.a;
                    String str = this.e;
                    this.a = wwd0Var3;
                    this.b = wwd0Var3;
                    this.c = 1;
                    try {
                        obj = ej5.d(fr6Var.f, new er6(fr6Var, str, null), this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                        wwd0Var2 = wwd0Var3;
                        list = (List) obj;
                        if (list.isEmpty()) {
                            cVar = zl6.a.a;
                        } else {
                            cVar = new zl6.c(list);
                        }
                    } catch (Exception e) {
                        e = e;
                        wwd0Var = wwd0Var3;
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_CASHOUT);
                        aVar.f(e, "Failed to load single bet cashout recommendations", new Object[0]);
                        wwd0Var2 = wwd0Var;
                        cVar = zl6.a.a;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var2 = this.b;
                wwd0Var = this.a;
                try {
                    uj50.b(obj);
                    list = (List) obj;
                    if (list.isEmpty()) {
                        cVar = zl6.a.a;
                    } else {
                        cVar = new zl6.c(list);
                    }
                } catch (Exception e3) {
                    e = e3;
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT);
                    aVar2.f(e, "Failed to load single bet cashout recommendations", new Object[0]);
                    wwd0Var2 = wwd0Var;
                    cVar = zl6.a.a;
                }
            }
            wwd0Var2.setValue(cVar);
            return Unit.a;
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
