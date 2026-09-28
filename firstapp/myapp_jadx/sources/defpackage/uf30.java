package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$reportCheckGiftEvent$1", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tf30 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf30(tf30 tf30Var, String str, String str2, String str3, String str4, String str5, v1b v1bVar) {
        super(2, v1bVar);
        this.a = tf30Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uf30(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.H.e(this.b, kpu.f(new Pair("pay", this.c), new Pair("stake", this.d), new Pair("order_type", "1"), new Pair("gift_id", this.e), new Pair("gift_value", this.f), new Pair("from", "quick_bet")));
        return Unit.a;
    }
}
