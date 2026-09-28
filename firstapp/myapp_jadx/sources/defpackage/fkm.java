package defpackage;

import com.sportybet.android.auth.GetUserAccessTokenUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfkm;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fkm extends j8i0 {
    public final uy0 a;
    public final GetUserAccessTokenUseCase b;
    public final uqm c;
    public final mgb0 d;
    public final ekm e;
    public final t4c f;
    public final wwd0 i;
    public final wwd0 v;
    public final ku90<ckm> w;
    public final ku90 y;

    @c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$1", f = "HorseRacingViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fkm.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<ckm> ku90Var = fkm.this.w;
                ckm.c cVar = ckm.c.a;
                this.a = 1;
                if (ku90Var.a.emit(cVar, this) == y5bVar) {
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

    public fkm(uy0 uy0Var, GetUserAccessTokenUseCase getUserAccessTokenUseCase, uqm uqmVar, mgb0 mgb0Var, ekm ekmVar, t4c t4cVar) {
        uy0Var.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        this.a = uy0Var;
        this.b = getUserAccessTokenUseCase;
        this.c = uqmVar;
        this.d = mgb0Var;
        this.e = ekmVar;
        this.f = t4cVar;
        wwd0 wwd0VarA = xwd0.a(new dkm(true, false, null, 0.0f, false, 0, 1022));
        this.i = wwd0VarA;
        this.v = wwd0VarA;
        ku90<ckm> ku90Var = new ku90<>();
        this.w = ku90Var;
        this.y = ku90Var;
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
