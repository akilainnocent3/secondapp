package defpackage;

import com.google.protobuf.RuntimeVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.framework.CompleteResultKt$asCompleteResults$2", f = "CompleteResult.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 1)
public final class wm8 extends tje0 implements Function2<myh<? super an8<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wm8 wm8Var = new wm8(2, v1bVar);
        wm8Var.b = obj;
        return wm8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super an8<Object>> myhVar, v1b<? super Unit> v1bVar) {
        return ((wm8) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            an8.c cVar = an8.c.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(cVar, this) == y5bVar) {
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
