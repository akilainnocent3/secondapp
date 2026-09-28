package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$downloadSpineSingleData$1", f = "SportyCarFragment.kt", l = {1962}, m = "invokeSuspend", v = 1)
public final class bmb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ylb0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ytw<File> f;
    public final /* synthetic */ ytw<File> i;
    public final /* synthetic */ ytw<File> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmb0(ylb0 ylb0Var, String str, String str2, String str3, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ylb0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ytwVar;
        this.i = ytwVar2;
        this.v = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bmb0(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bmb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (this.b.v3(this.c, this.d, this.e, this.f, this.i, this.v, true, this) == y5bVar) {
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
