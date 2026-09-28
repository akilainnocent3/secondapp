package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$popUpFlies$1", f = "FruitHuntFragment.kt", l = {1765}, m = "invokeSuspend", v = 1)
public final class v7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7j(u6j u6jVar, v1b<? super v7j> v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v7j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        u6j u6jVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (u6jVar.U0 < 15) {
                this.a = 1;
                if (hkd.b(100L, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        AppCompatImageView appCompatImageViewI1 = u6jVar.i1(0, false);
        if (appCompatImageViewI1 != null) {
            r750.d(u6jVar.t0(), new l5a(1, appCompatImageViewI1, u6jVar));
        }
        u6jVar.U0++;
        ej5.c(o8i0.d(u6jVar.t0()), null, null, new v7j(u6jVar, null), 3);
        return Unit.a;
    }
}
