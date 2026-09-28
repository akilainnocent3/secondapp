package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$resetToInitOddsRange$1", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ojw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tjw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.a = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ojw(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ojw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mhw mhwVar = mhw.a;
        Pair pair = new Pair(mhwVar, tjw.z1(mhwVar));
        mhw mhwVar2 = mhw.b;
        this.a.b0.setValue(b.k(pair, new Pair(mhwVar2, tjw.z1(mhwVar2))));
        return Unit.a;
    }
}
