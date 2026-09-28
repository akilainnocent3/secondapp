package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {621}, m = "invokeSuspend")
public final class wpz extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zpz c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ xi0<Float> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpz(zpz zpzVar, int i, float f, xi0<Float> xi0Var, v1b<? super wpz> v1bVar) {
        super(2, v1bVar);
        this.c = zpzVar;
        this.d = i;
        this.e = f;
        this.f = xi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wpz wpzVar = new wpz(this.c, this.d, this.e, this.f, v1bVar);
        wpzVar.b = obj;
        return wpzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
        return ((wpz) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2 = y5b.a;
        int i2 = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            tp70 tp70Var = (tp70) this.b;
            zpz zpzVar = this.c;
            final rpz rpzVar = new rpz(tp70Var, zpzVar);
            this.a = 1;
            npz npzVar = eqz.a;
            int i3 = this.d;
            ((u5a0) zpzVar.s).k(zpzVar.j(new Integer(i3).intValue()));
            Unit unit = Unit.a;
            boolean z = i3 > zpzVar.e;
            int iB = (rpzVar.b() - zpzVar.e) + 1;
            if (((z && i3 > rpzVar.b()) || (!z && i3 < zpzVar.e)) && Math.abs(i3 - zpzVar.e) >= 3) {
                if (z) {
                    i = i3 - iB;
                    int i4 = zpzVar.e;
                    if (i < i4) {
                        i = i4;
                    }
                } else {
                    int i5 = iB + i3;
                    i = zpzVar.e;
                    if (i5 <= i) {
                        i = i5;
                    }
                }
                rpzVar.c(i, 0);
            }
            float fD = rpzVar.d(i3) + this.e;
            final aq40 aq40Var = new aq40();
            Object objC = sje0.c(0.0f, fD, 0.0f, this.f, new Function2() { // from class: dqz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    float fFloatValue = ((Float) obj3).floatValue();
                    ((Float) obj4).getClass();
                    aq40 aq40Var2 = aq40Var;
                    aq40Var2.a += rpzVar.a.e(fFloatValue - aq40Var2.a);
                    return Unit.a;
                }
            }, this, 4);
            if (objC != obj2) {
                objC = Unit.a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
