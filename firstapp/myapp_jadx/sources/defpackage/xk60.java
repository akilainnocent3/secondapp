package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$playCoeffSound$1$1", f = "SGSoundPool.kt", l = {177}, m = "invokeSuspend", v = 1)
public final class xk60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public rk60 a;
    public int b;
    public final /* synthetic */ rk60 c;
    public final /* synthetic */ rk60.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk60(rk60 rk60Var, rk60.a aVar, v1b<? super xk60> v1bVar) {
        super(2, v1bVar);
        this.c = rk60Var;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xk60(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xk60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rk60 rk60Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            rk60 rk60Var2 = this.c;
            String str = rk60Var2.b;
            this.a = rk60Var2;
            this.b = 1;
            Object objB = rk60Var2.b(this.d, str, this);
            if (objB == y5bVar) {
                return y5bVar;
            }
            obj = objB;
            rk60Var = rk60Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rk60Var = this.a;
            uj50.b(obj);
        }
        File file = (File) obj;
        String path = file != null ? file.getPath() : null;
        if (path == null) {
            path = "";
        }
        rk60Var.d(path);
        return Unit.a;
    }
}
