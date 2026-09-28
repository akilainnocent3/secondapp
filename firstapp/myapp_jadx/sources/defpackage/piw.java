package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$applyMultiMakerSettings$1", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class piw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tjw a;
    public final /* synthetic */ shw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piw(tjw tjwVar, shw shwVar, v1b<? super piw> v1bVar) {
        super(2, v1bVar);
        this.a = tjwVar;
        this.b = shwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new piw(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((piw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tjw tjwVar = this.a;
        List list = (List) bm50.i((lk50) tjwVar.F.getValue());
        if (list == null) {
            return Unit.a;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String id = ((mfb0) it.next()).getId();
                shw shwVar = this.b;
                if (Intrinsics.g(id, shwVar.a)) {
                    wwd0 wwd0Var = tjwVar.V;
                    String str = shwVar.a;
                    wwd0Var.getClass();
                    wwd0Var.k(null, str);
                    wwd0 wwd0Var2 = tjwVar.G;
                    lk50.c cVar = new lk50.c(shwVar.d);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, cVar);
                    tjwVar.X.setValue(shwVar.e);
                    wwd0 wwd0Var3 = tjwVar.H;
                    lk50.c cVar2 = new lk50.c(shwVar.b);
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, cVar2);
                    tjwVar.Y.setValue(shwVar.c);
                    wwd0 wwd0Var4 = tjwVar.Z;
                    xvf0 xvf0Var = shwVar.f;
                    wwd0Var4.getClass();
                    wwd0Var4.k(null, xvf0Var);
                    return Unit.a;
                }
            }
        }
        return Unit.a;
    }
}
