package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftdialog.LNGiftDialogViewModel$handleAction$2", f = "LNGiftDialogViewModel.kt", l = {134}, m = "invokeSuspend", v = 2)
public final class fdq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jdq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdq(jdq jdqVar, v1b<? super fdq> v1bVar) {
        super(2, v1bVar);
        this.b = jdqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fdq(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fdq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        jdq jdqVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            hdq hdqVar = jdqVar.d;
            this.a = 1;
            obj = s0i.c(hdqVar, this);
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
        ocq ocqVar = (ocq) obj;
        if (ocqVar == null) {
            return Unit.a;
        }
        wwd0 wwd0Var = jdqVar.f;
        vdq vdqVar = jdqVar.a;
        BigDecimal bigDecimalB = ((Boolean) wwd0Var.getValue()).booleanValue() ? ocqVar.e : ukd0.b(((ijf0) jdqVar.e.getValue()).a.b);
        vdqVar.c(bigDecimalB);
        vdqVar.d.k(null, Boolean.TRUE);
        if (bigDecimalB.compareTo(jdqVar.c) > 0) {
            String strA = ukd0.a(2, bigDecimalB, false, false);
            vdqVar.getClass();
            vdqVar.h.a(strA);
        }
        dcr.a(jdqVar.b, new nvp.f(3, (uf00) null));
        return Unit.a;
    }
}
