package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
public final class ouz extends tje0 implements Function1<v1b<? super Object>, Object> {
    public final /* synthetic */ luz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1<hq60, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ouz(luz luzVar, String str, Function1<? super hq60, Object> function1, v1b<? super ouz> v1bVar) {
        super(1, v1bVar);
        this.a = luzVar;
        this.b = str;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ouz(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Object> v1bVar) {
        return ((ouz) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hq60 hq60VarH1 = this.a.b.H1(this.b);
        try {
            Object objInvoke = this.c.invoke(hq60VarH1);
            vc1.a(hq60VarH1, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }
}
