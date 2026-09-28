package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.SgRushChatComponentFragment$resetCounter$1", f = "SgRushChatComponentFragment.kt", l = {229}, m = "invokeSuspend", v = 1)
public final class op80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public np80 a;
    public Context b;
    public int c;
    public final /* synthetic */ np80 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op80(np80 np80Var, long j, v1b<? super op80> v1bVar) {
        super(2, v1bVar);
        this.d = np80Var;
        this.e = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new op80(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((op80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        np80 np80Var;
        Context context;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            np80 np80Var2 = this.d;
            Context context2 = np80Var2.getContext();
            if (context2 != null) {
                this.a = np80Var2;
                this.b = context2;
                this.c = 1;
                if (hkd.b(this.e, this) == y5bVar) {
                    return y5bVar;
                }
                np80Var = np80Var2;
                context = context2;
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = this.b;
        np80Var = this.a;
        uj50.b(obj);
        qp80 qp80Var = (qp80) np80Var.b;
        if (qp80Var != null) {
            qp80Var.v.setText("1.00X");
        }
        qp80 qp80Var2 = (qp80) np80Var.b;
        if (qp80Var2 != null) {
            qp80Var2.v.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff));
        }
        qp80 qp80Var3 = (qp80) np80Var.b;
        if (qp80Var3 != null) {
            qp80Var3.v.setTextColor(context.getColor(R.color.white));
        }
        return Unit.a;
    }
}
