package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.SportGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchCountries$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eim extends tje0 implements Function2<myh<? super SportGroup>, v1b<? super Unit>, Object> {
    public final /* synthetic */ iim a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eim(iim iimVar, v1b<? super eim> v1bVar) {
        super(2, v1bVar);
        this.a = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eim(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super SportGroup> myhVar, v1b<? super Unit> v1bVar) {
        return ((eim) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.w0.m(new UIState.Loading(null, 1, null));
        return Unit.a;
    }
}
