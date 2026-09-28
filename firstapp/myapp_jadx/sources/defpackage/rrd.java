package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$initQuickInputIfNeeded$1$2", f = "DepositBaseViewModel.kt", l = {358}, m = "invokeSuspend", v = 2)
public final class rrd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wrd b;

    public static final class a<T> implements myh {
        public final /* synthetic */ wrd a;

        public a(wrd wrdVar) {
            this.a = wrdVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            String str = (String) obj;
            int length = str.length();
            ijf0 ijf0Var = new ijf0(str, vlf0.a(length, length), 4);
            wrd wrdVar = this.a;
            ((x5a0) wrdVar.f).setValue(ijf0Var);
            jvd0 jvd0Var = wrdVar.S;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            wrdVar.S = ej5.c(o8i0.d(wrdVar), null, null, new vrd(str, wrdVar, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrd(wrd wrdVar, v1b<? super rrd> v1bVar) {
        super(2, v1bVar);
        this.b = wrdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rrd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rrd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wrd wrdVar = this.b;
            hg30 hg30Var = wrdVar.V;
            if (hg30Var != null) {
                wwd0 wwd0Var = hg30Var.d;
                a aVar = new a(wrdVar);
                this.a = 1;
                wwd0Var.collect(new f1i.a(aVar), this);
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
