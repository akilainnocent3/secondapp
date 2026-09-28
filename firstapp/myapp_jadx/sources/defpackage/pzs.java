package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$loadingFlow$5", f = "LoadingTask.kt", l = {53, 55}, m = "invokeSuspend", v = 1)
public final class pzs extends tje0 implements gaj<myh<? super Float>, Throwable, v1b<? super Unit>, Object> {
    public Iterator a;
    public int b;
    public int c;
    public /* synthetic */ Throwable d;
    public final /* synthetic */ dq40<Map<kzs<?>, xxs<?>>> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzs(dq40<Map<kzs<?>, xxs<?>>> dq40Var, v1b<? super pzs> v1bVar) {
        super(3, v1bVar);
        this.e = dq40Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Float> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        pzs pzsVar = new pzs(this.e, v1bVar);
        pzsVar.d = th;
        return pzsVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator<Map.Entry<kzs<?>, xxs<?>>> it;
        Object objInvoke;
        Throwable th = this.d;
        y5b y5bVar = y5b.a;
        int i2 = this.c;
        if (i2 == 0) {
            uj50.b(obj);
            Map<kzs<?>, xxs<?>> map = this.e.a;
            if (map != null) {
                i = 0;
                it = map.entrySet().iterator();
            }
            return Unit.a;
        }
        if (i2 != 1 && i2 != 2) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.b;
        it = this.a;
        uj50.b(obj);
        while (it.hasNext()) {
            Map.Entry<kzs<?>, xxs<?>> next = it.next();
            kzs<?> key = next.getKey();
            xxs<?> value = next.getValue();
            if (value != null) {
                if (th == null) {
                    this.d = th;
                    this.a = it;
                    this.b = i;
                    this.c = 1;
                    key.getClass();
                    Object obj2 = value.b;
                    if (obj2 == null || (objInvoke = key.c.invoke(obj2, this)) != y5b.a) {
                        objInvoke = Unit.a;
                    }
                    if (objInvoke == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    Function1<v1b<? super Unit>, Object> function1 = key.d;
                    this.d = th;
                    this.a = it;
                    this.b = i;
                    this.c = 2;
                    if (function1.invoke(this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
        }
        return Unit.a;
    }
}
