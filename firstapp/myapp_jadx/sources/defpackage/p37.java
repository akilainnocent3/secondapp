package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$cancelChallenge$1", f = "ChallengeViewModel.kt", l = {356}, m = "invokeSuspend", v = 2)
public final class p37 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o37 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p37(o37 o37Var, long j, v1b<? super p37> v1bVar) {
        super(2, v1bVar);
        this.b = o37Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p37(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p37) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        y5b y5bVar = y5b.a;
        int i = this.a;
        o37 o37Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            mx6 mx6Var = ((r17) o37Var.y.getValue()).c;
            if (!(mx6Var instanceof mx6.a)) {
                mx6Var = null;
            }
            mx6.a aVar = (mx6.a) mx6Var;
            if (aVar == null) {
                return Unit.a;
            }
            wwd0 wwd0Var = o37Var.y;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, r17.a((r17) value, null, null, new mx6.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, uxs.LOADING), null, 11)));
            mb6 mb6Var = o37Var.c;
            this.a = 1;
            objA = mb6Var.a.a(this.c, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = obj;
        }
        lk50 lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            wwd0 wwd0Var2 = o37Var.y;
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, r17.a((r17) value3, null, null, mx6.c.a, null, 11)));
            o37Var.y1(new xz6.e(R.string.page_loyalty__challenge_toast_cancel_success, null));
            ej5.c(o8i0.d(o37Var), null, null, new r37(o37Var, null, null), 3);
        } else if (lk50Var instanceof lk50.a) {
            SprThrowable sprThrowableH = bm50.h(lk50Var);
            UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
            wwd0 wwd0Var3 = o37Var.y;
            do {
                value2 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value2, r17.a((r17) value2, null, new vz6.a(uiTextB, false), mx6.c.a, null, 9)));
        }
        return Unit.a;
    }
}
