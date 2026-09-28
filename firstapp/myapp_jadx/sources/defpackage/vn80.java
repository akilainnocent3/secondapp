package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.crashInitiated.view.SgCrashInitiatedChatComponentFragment$resetCounter$1", f = "SgCrashInitiatedChatComponentFragment.kt", l = {195}, m = "invokeSuspend", v = 1)
public final class vn80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public tn80 a;
    public Context b;
    public int c;
    public final /* synthetic */ tn80 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn80(tn80 tn80Var, long j, v1b<? super vn80> v1bVar) {
        super(2, v1bVar);
        this.d = tn80Var;
        this.e = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vn80(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vn80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tn80 tn80Var;
        Context context;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            tn80 tn80Var2 = this.d;
            Context context2 = tn80Var2.getContext();
            if (context2 != null) {
                this.a = tn80Var2;
                this.b = context2;
                this.c = 1;
                if (hkd.b(this.e, this) == y5bVar) {
                    return y5bVar;
                }
                tn80Var = tn80Var2;
                context = context2;
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = this.b;
        tn80Var = this.a;
        uj50.b(obj);
        wn80 wn80Var = (wn80) tn80Var.b;
        if (wn80Var != null) {
            wn80Var.d.setText("1.00X");
        }
        wn80 wn80Var2 = (wn80) tn80Var.b;
        if (wn80Var2 != null) {
            wn80Var2.d.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff));
        }
        wn80 wn80Var3 = (wn80) tn80Var.b;
        if (wn80Var3 != null) {
            wn80Var3.d.setTextColor(context.getColor(R.color.white));
        }
        return Unit.a;
    }
}
