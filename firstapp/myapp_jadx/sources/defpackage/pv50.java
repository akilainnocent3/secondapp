package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", f = "RoomDatabase.android.kt", l = {2044}, m = "invokeSuspend")
public final class pv50 extends tje0 implements Function1<v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ lv50 b;
    public final /* synthetic */ Function1<v1b<Object>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv50(v1b v1bVar, lv50 lv50Var, Function1 function1) {
        super(1, v1bVar);
        this.b = lv50Var;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new pv50(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<Object> v1bVar) {
        return ((pv50) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        lv50 lv50Var = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                lv50Var.c();
                Function1<v1b<Object>, Object> function1 = this.c;
                this.a = 1;
                obj = function1.invoke(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            lv50Var.v();
            lv50Var.r();
            return obj;
        } catch (Throwable th) {
            lv50Var.r();
            throw th;
        }
    }
}
