package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinQuickBetViewViewModel$setUniversalSpecifier$1", f = "InstantWinQuickBetViewViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class ujo extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ MarketType c;
    public final /* synthetic */ vjo d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujo(MarketType marketType, vjo vjoVar, String str, v1b<? super ujo> v1bVar) {
        super(2, v1bVar);
        this.c = marketType;
        this.d = vjoVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ujo(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ujo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        int i = this.b;
        String str2 = this.e;
        if (i == 0) {
            uj50.b(obj);
            eo20[] eo20VarArr = eo20.a;
            String strA = inm.a("universal_specifiers_", this.c.type);
            m2l m2lVar = this.d.a;
            this.a = strA;
            this.b = 1;
            if (m2lVar.a.putString(strA, str2, this) == y5bVar) {
                return y5bVar;
            }
            str = strA;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            uj50.b(obj);
        }
        itf0.a aVar = itf0.a;
        aVar.q(str);
        aVar.a("Specifier saved: ".concat(str2), new Object[0]);
        return Unit.a;
    }
}
