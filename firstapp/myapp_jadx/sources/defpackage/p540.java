package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import com.sportybet.feature.remixbet.presentation.RemixBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$startRemixBetActivity$1", f = "RealBetHistoryFragment.kt", l = {679}, m = "invokeSuspend", v = 2)
public final class p540 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o540 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ RemixBetRequest e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p540(o540 o540Var, boolean z, Context context, RemixBetRequest remixBetRequest, v1b<? super p540> v1bVar) {
        super(2, v1bVar);
        this.b = o540Var;
        this.c = z;
        this.d = context;
        this.e = remixBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p540(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p540) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        o540 o540Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            hc40 hc40Var = o540Var.z;
            if (hc40Var == null) {
                Intrinsics.n("rebetRemixCombineAnTestHelper");
                throw null;
            }
            uqm uqmVar = o540Var.y;
            if (uqmVar == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            String userId = uqmVar.getUserId();
            if (userId == null) {
                userId = "";
            }
            this.a = 1;
            obj = hc40Var.c.isRebetRemixCombineVariant(userId, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        boolean z = this.c && !((Boolean) obj).booleanValue();
        ee<Intent> eeVar = o540Var.K;
        int i2 = RemixBetActivity.d;
        Context context = this.d;
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) RemixBetActivity.class);
        intent.putExtra("extra_remix_bet_request", new eal().j(this.e));
        intent.putExtra("extra_selections_exist", z);
        eeVar.b(intent);
        return Unit.a;
    }
}
