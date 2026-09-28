package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$loadSpineFilesSuspend$spineData$1", f = "SportyCarFragment.kt", l = {336}, m = "invokeSuspend", v = 1)
public final class dmb0 extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
    public int a;
    public final /* synthetic */ ylb0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmb0(ylb0 ylb0Var, Context context, String str, String str2, String str3, v1b<? super dmb0> v1bVar) {
        super(2, v1bVar);
        this.b = ylb0Var;
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dmb0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
        return ((dmb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        fq5 fq5VarV0 = this.b.V0();
        String strC = op5.c(op5.a, this.d, this.e);
        this.a = 1;
        Object objY1 = fq5VarV0.y1(this.c, strC, this.f, this);
        return objY1 == y5bVar ? y5bVar : objY1;
    }
}
