package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$initData$3", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jh90 extends tje0 implements Function2<lk50<? extends zg90.a>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zg90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh90(zg90 zg90Var, v1b<? super jh90> v1bVar) {
        super(2, v1bVar);
        this.b = zg90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jh90 jh90Var = new jh90(this.b, v1bVar);
        jh90Var.a = obj;
        return jh90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends zg90.a> lk50Var, v1b<? super Unit> v1bVar) {
        return ((jh90) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        zg90 zg90Var = this.b;
        if (z) {
            zg90.a aVar = (zg90.a) ((lk50.c) lk50Var).a;
            if (!aVar.b.isEmpty()) {
                wwd0 wwd0Var = zg90Var.f;
                zg90.b.a aVar2 = new zg90.b.a(aVar.b.get(0).a);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar2);
            }
        }
        zg90Var.i.setValue(lk50Var);
        return Unit.a;
    }
}
