package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$getMissionEnabled$1", f = "ShowMissionViewModel.kt", l = {236}, m = "invokeSuspend", v = 2)
public final class na90 extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sa90 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ sa90 a;
        public final /* synthetic */ myh<Boolean> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(sa90 sa90Var, myh<? super Boolean> myhVar) {
            this.a = sa90Var;
            this.b = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean z = false;
            if (qq1.a(this.a.c, BOConfigParam.MissionProgressEnabledAddToBetslip, false) && zBooleanValue) {
                z = true;
            }
            return this.b.emit(Boolean.valueOf(z), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na90(v1b v1bVar, sa90 sa90Var) {
        super(2, v1bVar);
        this.c = sa90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        na90 na90Var = new na90(v1bVar, this.c);
        na90Var.b = obj;
        return na90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((na90) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sa90 sa90Var = this.c;
            or60 or60Var = new or60(new oa90(null, sa90Var));
            a aVar = new a(sa90Var, myhVar);
            this.b = null;
            this.a = 1;
            if (or60Var.collect(aVar, this) == y5bVar) {
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
