package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationbethistory.component.SimulationBetHistoryScreenKt$SimulationBetHistoryScreen$1$1", f = "SimulationBetHistoryScreen.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class fm90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a390<rm90> b;
    public final /* synthetic */ zzr c;

    public static final class a<T> implements myh {
        public final /* synthetic */ zzr a;

        public a(zzr zzrVar) {
            this.a = zzrVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (Intrinsics.g((rm90) obj, rm90.a.a)) {
                uv60 uv60Var = zzr.x;
                return this.a.k(0, 0, v1bVar);
            }
            uhc.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fm90(a390<? extends rm90> a390Var, zzr zzrVar, v1b<? super fm90> v1bVar) {
        super(2, v1bVar);
        this.b = a390Var;
        this.c = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fm90(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((fm90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.c);
            this.a = 1;
            if (this.b.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
