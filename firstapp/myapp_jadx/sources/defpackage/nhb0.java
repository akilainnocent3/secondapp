package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sporty.android.core.data.repository.SportyBetAPICacheRepositoryImpl$get$2", f = "SportyBetAPICacheRepositoryImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class nhb0 extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ ohb0<Object> b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhb0(ohb0 ohb0Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ohb0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nhb0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((nhb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ohb0<Object> ohb0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            jhb0 jhb0Var = ohb0Var.a;
            this.a = 1;
            obj = jhb0Var.a(this.c, this);
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
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        return ohb0Var.b.fromJson(str, TypeToken.getParameterized(wjk.class, new Type[0]).getType());
    }
}
