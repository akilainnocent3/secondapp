package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$storeLastMultiMakerSettings$1", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rjw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tjw a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjw(tjw tjwVar, String str, v1b<? super rjw> v1bVar) {
        super(2, v1bVar);
        this.a = tjwVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rjw(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rjw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tjw tjwVar = this.a;
        Iterator it = ((Iterable) tjwVar.c0.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((shw) next).a.equals(this.b));
        shw shwVar = (shw) next;
        if (shwVar != null) {
            wwd0 wwd0Var = tjwVar.d0;
            wwd0Var.getClass();
            wwd0Var.k(null, shwVar);
        }
        return Unit.a;
    }
}
