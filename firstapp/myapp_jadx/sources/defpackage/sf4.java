package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {168}, m = "invokeSuspend")
public final class sf4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tf4<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf4(tf4<Object> tf4Var, v1b<? super sf4> v1bVar) {
        super(2, v1bVar);
        this.c = tf4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sf4 sf4Var = new sf4(this.c, v1bVar);
        sf4Var.b = obj;
        return sf4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sf4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        tf4<Object> tf4Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            zjs zjsVar = new zjs(tf4Var.a, ((v5b) this.b).getCoroutineContext());
            Function2<yjs<Object>, v1b<? super Unit>, Object> function2 = tf4Var.b;
            this.a = 1;
            if (function2.invoke(zjsVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(OdQr.LgfyHFajpJ);
                return null;
            }
            uj50.b(obj);
        }
        tf4Var.d.invoke();
        return Unit.a;
    }
}
