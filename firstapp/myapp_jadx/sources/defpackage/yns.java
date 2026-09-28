package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.lgg.LiveGiftGrabInfoViewModel$tryGetInstructions$2", f = "LiveGiftGrabInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yns extends tje0 implements Function2<lk50<? extends uf00<? extends kkk>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zns b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yns(zns znsVar, v1b<? super yns> v1bVar) {
        super(2, v1bVar);
        this.b = znsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yns ynsVar = new yns(this.b, v1bVar);
        ynsVar.a = obj;
        return ynsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends uf00<? extends kkk>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((yns) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wkk cVar;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        zns znsVar = this.b;
        if (z) {
            cVar = wkk.b.a;
        } else if (lk50Var instanceof lk50.c) {
            cVar = new wkk.c((uf00) ((lk50.c) lk50Var).a);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            znsVar.d.a(((lk50.a) lk50Var).b);
            cVar = wkk.a.a;
        }
        ohp<Object>[] ohpVarArr = zns.f;
        znsVar.c.b(znsVar, zns.f[0], cVar);
        return Unit.a;
    }
}
