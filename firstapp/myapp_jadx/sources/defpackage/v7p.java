package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {91}, m = "invokeSuspend")
public final class v7p extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ x7p b;
    public final /* synthetic */ zn20.a<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7p(x7p x7pVar, zn20.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = x7pVar;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v7p(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((v7p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objC;
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
        if (zn20Var == null || (objC = zn20Var.c(this.c)) == null) {
            return -1L;
        }
        return objC;
    }
}
