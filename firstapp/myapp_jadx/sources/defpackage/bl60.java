package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$stopRushBgSound$1", f = "SGSoundPool.kt", l = {292}, m = "invokeSuspend", v = 1)
public final class bl60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public rk60 a;
    public rk60 b;
    public int c;
    public final /* synthetic */ rk60 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl60(rk60 rk60Var, String str, v1b<? super bl60> v1bVar) {
        super(2, v1bVar);
        this.d = rk60Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bl60(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bl60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rk60 rk60Var;
        rk60 rk60Var2;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            rk60 rk60Var3 = this.d;
            rk60.a aVar = rk60Var3.c.get(this.e);
            if (aVar != null) {
                String str = rk60Var3.b;
                this.a = rk60Var3;
                this.b = rk60Var3;
                this.c = 1;
                Object objB = rk60Var3.b(aVar, str, this);
                if (objB == y5bVar) {
                    return y5bVar;
                }
                rk60Var = rk60Var3;
                obj = objB;
                rk60Var2 = rk60Var;
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rk60Var = this.b;
        rk60Var2 = this.a;
        uj50.b(obj);
        File file = (File) obj;
        String path = file != null ? file.getPath() : null;
        if (path == null) {
            path = "";
        }
        rk60Var.j = path;
        String str2 = rk60Var2.j;
        if (!new File(str2 != null ? str2 : "").exists()) {
            return Unit.a;
        }
        return Unit.a;
    }
}
