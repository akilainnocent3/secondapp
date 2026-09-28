package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {157}, m = "invokeSuspend")
public final class u7p extends tje0 implements Function2<v5b, v1b<? super Map<zn20.a<?>, ? extends Object>>, Object> {
    public int a;
    public final /* synthetic */ x7p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7p(x7p x7pVar, v1b<? super u7p> v1bVar) {
        super(2, v1bVar);
        this.b = x7pVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u7p(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Map<zn20.a<?>, ? extends Object>> v1bVar) {
        return ((u7p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh<zn20> lyhVarK = this.b.c.k();
            this.a = 1;
            obj = s0i.c(lyhVarK, this);
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
        zn20 zn20Var = (zn20) obj;
        if (zn20Var != null) {
            return zn20Var.a();
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }
}
