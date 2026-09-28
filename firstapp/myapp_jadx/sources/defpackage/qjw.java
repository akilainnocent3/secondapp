package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$resetToInitTimeRange$1", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qjw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tjw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.a = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qjw(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qjw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.Z;
        xvf0 xvf0VarA = xvf0.a();
        wwd0Var.getClass();
        wwd0Var.k(null, xvf0VarA);
        return Unit.a;
    }
}
