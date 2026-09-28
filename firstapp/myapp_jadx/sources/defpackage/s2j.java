package defpackage;

import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$observeApiResponses$2", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class s2j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ n2j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2j(n2j n2jVar, v1b<? super s2j> v1bVar) {
        super(2, v1bVar);
        this.a = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s2j(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s2j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final n2j n2jVar = this.a;
        n2jVar.N.f(n2jVar.getViewLifecycleOwner(), new n2j.c(new Function1() { // from class: o1j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Boolean bool = (Boolean) obj2;
                if (bool == null) {
                    return Unit.a;
                }
                boolean zBooleanValue = bool.booleanValue();
                n2j n2jVar2 = n2jVar;
                if (!zBooleanValue) {
                    n2jVar2.R0();
                    return Unit.a;
                }
                if (!n2jVar2.M) {
                    return Unit.a;
                }
                n2jVar2.M = false;
                e activity = n2jVar2.getActivity();
                if (activity != null && !activity.isDestroyed()) {
                    xbg xbgVar = n2jVar2.L;
                    if (xbgVar != null) {
                        xbgVar.dismiss();
                    }
                    r4j r4jVar = r4j.e;
                    xbg xbgVar2 = r4jVar.a;
                    if (xbgVar2 != null) {
                        xbgVar2.dismiss();
                    }
                    r4jVar.a = null;
                    djh djhVar = n2jVar2.b;
                    if (djhVar != null) {
                        djhVar.w.B.setVisibility(0);
                    }
                }
                ibs viewLifecycleOwner = n2jVar2.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new g3j(n2jVar2, null), 3);
                return Unit.a;
            }
        }));
        return Unit.a;
    }
}
