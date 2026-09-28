package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.presentation.WorldCupPassViewModel$onBuyPassClicked$1", f = "WorldCupPassViewModel.kt", l = {205}, m = "invokeSuspend", v = 2)
public final class a4k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y3k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4k0(y3k0 y3k0Var, v1b<? super a4k0> v1bVar) {
        super(2, v1bVar);
        this.b = y3k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a4k0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a4k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        Object value4;
        y5b y5bVar = y5b.a;
        int i = this.a;
        y3k0 y3k0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            r3k0 r3k0Var = ((w3k0) y3k0Var.i.getValue()).b;
            if (r3k0Var == null) {
                return Unit.a;
            }
            long jC = r3k0Var.c();
            wwd0 wwd0Var = y3k0Var.i;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, w3k0.a((w3k0) value, null, null, null, null, true, false, null, false, 239)));
            b3k0 b3k0Var = y3k0Var.a;
            this.a = 1;
            objA = b3k0Var.a(jC, this);
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
        wwd0 wwd0Var2 = y3k0Var.i;
        wwd0 wwd0Var3 = y3k0Var.i;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, w3k0.a((w3k0) value2, null, null, null, null, false, false, null, false, 239)));
        if (lk50Var instanceof lk50.c) {
            ga30 ga30Var = (ga30) ((lk50.c) lk50Var).a;
            if (Intrinsics.g(ga30Var, ga30.b.a)) {
                ej5.c(o8i0.d(y3k0Var), null, null, new z3k0(y3k0Var, null), 3);
            } else {
                if (!Intrinsics.g(ga30Var, ga30.a.a)) {
                    uhc.a();
                    return null;
                }
                do {
                    value4 = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value4, w3k0.a((w3k0) value4, null, null, null, null, false, true, null, false, 223)));
                if (!y3k0Var.B) {
                    y3k0Var.A1(s2k0.f.a);
                    y3k0Var.B = true;
                }
            }
        } else if (lk50Var instanceof lk50.a) {
            SprThrowable sprThrowableH = bm50.h(lk50Var);
            UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
            do {
                value3 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value3, w3k0.a((w3k0) value3, null, null, null, null, false, false, uiTextB, false, 191)));
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
