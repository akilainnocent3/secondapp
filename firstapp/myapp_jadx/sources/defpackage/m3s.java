package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.leaguestats.LeagueStatsBottomSheetScreenIdealKt$LeagueStatsBottomSheetScreenIdeal$1$1", f = "LeagueStatsBottomSheetScreenIdeal.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class m3s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zp70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3s(zp70 zp70Var, v1b<? super m3s> v1bVar) {
        super(2, v1bVar);
        this.b = zp70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m3s(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m3s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            zp70 zp70Var = this.b;
            if (ts7.b(zp70Var, 0 - ((u5a0) zp70Var.a).D(), this) == y5bVar) {
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
