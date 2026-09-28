package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.HighlightData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchHighlightEvents$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kim extends tje0 implements Function2<HighlightData, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ iim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kim(iim iimVar, v1b<? super kim> v1bVar) {
        super(2, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kim kimVar = new kim(this.b, v1bVar);
        kimVar.a = obj;
        return kimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HighlightData highlightData, v1b<? super Unit> v1bVar) {
        return ((kim) create(highlightData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        HighlightData highlightData = (HighlightData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.s0.m(new UIState.Success(highlightData));
        return Unit.a;
    }
}
