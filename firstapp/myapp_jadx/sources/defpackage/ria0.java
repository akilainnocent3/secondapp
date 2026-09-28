package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.SocialShareViewModel$onMoreShareAction$1", f = "SocialShareViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class ria0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ via0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ria0(via0 via0Var, long j, v1b<? super ria0> v1bVar) {
        super(2, v1bVar);
        this.b = via0Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ria0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ria0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            long j = this.c;
            via0 via0Var = this.b;
            via0Var.z1(10, j);
            gym.a(via0Var.c, new u190(2, new Integer(10)));
            ku90<dha0> ku90Var = via0Var.i;
            x190 x190Var = via0Var.w;
            String str = x190Var != null ? x190Var.a : null;
            if (str == null) {
                str = "";
            }
            Uri uri = x190Var != null ? x190Var.f : null;
            e190 e190VarX1 = via0Var.x1();
            x190 x190Var2 = via0Var.w;
            dha0.c cVar = new dha0.c(str, uri, e190VarX1, (x190Var2 == null || !x190Var2.j) ? null : x190Var2.i, x190Var2 != null ? x190Var2.m : null, x190Var2 != null ? x190Var2.n : null);
            this.a = 1;
            if (ku90Var.a.emit(cVar, this) == y5bVar) {
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
