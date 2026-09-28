package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
public final class lpc extends tje0 implements Function2<ain<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<kpc<Object>> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lpc(List<? extends kpc<Object>> list, v1b<? super lpc> v1bVar) {
        super(2, v1bVar);
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lpc lpcVar = new lpc(this.c, v1bVar);
        lpcVar.b = obj;
        return lpcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ain<Object> ainVar, v1b<? super Unit> v1bVar) {
        return ((lpc) create(ainVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ain ainVar = (ain) this.b;
            this.a = 1;
            if (opc.a.a(this.c, ainVar, this) == y5bVar) {
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
