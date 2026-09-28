package defpackage;

import android.animation.ObjectAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$hideFruitCutFall$3$1", f = "FruitHuntFragment.kt", l = {1652}, m = "invokeSuspend", v = 1)
public final class b7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7j(u6j u6jVar, v1b<? super b7j> v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b7j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        final u6j u6jVar = this.b;
        r750.d(u6jVar.t0(), new Function0() { // from class: a7j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                u6j u6jVar2 = u6jVar;
                ObjectAnimator objectAnimator = u6jVar2.N0;
                if (objectAnimator != null) {
                    objectAnimator.start();
                }
                ObjectAnimator objectAnimator2 = u6jVar2.O0;
                if (objectAnimator2 != null) {
                    objectAnimator2.start();
                }
                djh djhVar = u6jVar2.b;
                if (djhVar != null) {
                    e6i0.b(djhVar.w.d, 0.1f);
                }
                djh djhVar2 = u6jVar2.b;
                if (djhVar2 != null) {
                    e6i0.b(djhVar2.w.e, 0.1f);
                }
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
