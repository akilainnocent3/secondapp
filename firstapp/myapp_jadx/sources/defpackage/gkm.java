package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$onBetHistoryClick$1", f = "HorseRacingViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class gkm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fkm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkm(fkm fkmVar, v1b<? super gkm> v1bVar) {
        super(2, v1bVar);
        this.b = fkmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gkm(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gkm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strA;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fkm fkmVar = this.b;
            AssetsInfo assetsInfoC = fkmVar.a.c();
            if (assetsInfoC != null) {
                t4c t4cVar = fkmVar.f;
                long j = assetsInfoC.balance;
                psm psmVar = t4cVar.a;
                strA = oxc.a(psmVar.f(), " ", bjb0.U(j, psmVar.D()));
            } else {
                strA = null;
            }
            wwd0 wwd0Var = fkmVar.i;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ekm.a(fkmVar.e, false, false, true, strA, 19)));
            String str = String.format("window.horseRacing.toggleHistory('{\"showHistory\":%s}');", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
            ku90<ckm> ku90Var = fkmVar.w;
            ckm.d dVar = new ckm.d(str, null);
            this.a = 1;
            if (ku90Var.a.emit(dVar, this) == y5bVar) {
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
