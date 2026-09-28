package defpackage;

import androidx.work.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", l = {98}, m = "invokeSuspend")
public final class bxa extends tje0 implements Function2<v5b, v1b<? super d.a>, Object> {
    public int a;
    public final /* synthetic */ ConstraintTrackingWorker b;
    public final /* synthetic */ d c;
    public final /* synthetic */ ouj0 d;
    public final /* synthetic */ owj0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxa(ConstraintTrackingWorker constraintTrackingWorker, d dVar, ouj0 ouj0Var, owj0 owj0Var, v1b<? super bxa> v1bVar) {
        super(2, v1bVar);
        this.b = constraintTrackingWorker;
        this.c = dVar;
        this.d = ouj0Var;
        this.e = owj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bxa(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super d.a> v1bVar) {
        return ((bxa) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objD = this.b.d(this.c, this.d, this.e, this);
            return objD == y5bVar ? y5bVar : objD;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
