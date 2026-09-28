package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, 311}, m = "invokeSuspend")
public final class fyj0 extends tje0 implements Function2<v5b, v1b<? super d.a>, Object> {
    public int a;
    public final /* synthetic */ ayj0 b;
    public final /* synthetic */ d c;
    public final /* synthetic */ hvj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyj0(ayj0 ayj0Var, d dVar, hvj0 hvj0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ayj0Var;
        this.c = dVar;
        this.d = hvj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fyj0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super d.a> v1bVar) {
        return ((fyj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        ayj0 ayj0Var = this.b;
        owj0 owj0Var = ayj0Var.a;
        Object obj2 = y5b.a;
        int i = this.a;
        d dVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            Context context = ayj0Var.b;
            vvj0 vvj0Var = ayj0Var.d;
            this.a = 1;
            String str = fvj0.a;
            if (!owj0Var.q || Build.VERSION.SDK_INT >= 31) {
                objD = Unit.a;
            } else {
                vvj0.a aVar = vvj0Var.d;
                aVar.getClass();
                objD = ej5.d(gf8.a(aVar), new evj0(dVar, owj0Var, this.d, context, null), this);
                if (objD != obj2) {
                    objD = Unit.a;
                }
            }
            if (objD != obj2) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        String str2 = gyj0.a;
        jgt.e().a(str2, "Starting work for " + owj0Var.c);
        nv5.d dVarB = dVar.b();
        this.a = 2;
        Object objA = gyj0.a(dVarB, dVar, this);
        return objA == obj2 ? obj2 : objA;
    }
}
