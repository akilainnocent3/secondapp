package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
public final class m1e0 extends tje0 implements gaj<o340<Object>, Boolean, v1b<Object>, Object> {
    public int a;
    public /* synthetic */ o340 b;

    @Override // defpackage.gaj
    public final Object invoke(o340<Object> o340Var, Boolean bool, v1b<Object> v1bVar) {
        bool.getClass();
        m1e0 m1e0Var = new m1e0(3, v1bVar);
        m1e0Var.b = o340Var;
        return m1e0Var.invokeSuspend(Unit.a);
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
        o340 o340Var = this.b;
        this.a = 1;
        Object objC = o340Var.c(this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
