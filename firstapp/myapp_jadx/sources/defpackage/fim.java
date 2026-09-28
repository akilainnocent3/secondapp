package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.SportGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchCountries$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fim extends tje0 implements Function2<SportGroup, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ iim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fim(iim iimVar, v1b<? super fim> v1bVar) {
        super(2, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fim fimVar = new fim(this.b, v1bVar);
        fimVar.a = obj;
        return fimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SportGroup sportGroup, v1b<? super Unit> v1bVar) {
        return ((fim) create(sportGroup, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SportGroup sportGroup = (SportGroup) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.w0.m(new UIState.Success(sportGroup));
        return Unit.a;
    }
}
