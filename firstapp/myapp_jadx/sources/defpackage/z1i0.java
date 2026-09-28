package defpackage;

import com.sporty.android.core.model.config.VersionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.viewmodel.VersionCheckViewModel$onDownload$1", f = "VersionCheckViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class z1i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y1i0 b;
    public final /* synthetic */ VersionData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1i0(y1i0 y1i0Var, VersionData versionData, v1b<? super z1i0> v1bVar) {
        super(2, v1bVar);
        this.b = y1i0Var;
        this.c = versionData;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z1i0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z1i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fhb0 fhb0Var = this.b.a;
            this.a = 1;
            Object objD = ej5.d(fhb0Var.g, new ygb0(fhb0Var, this.c, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
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
