package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$setRecentlyUsedMethod$2", f = "PaymentDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m700 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m700(String str, String str2, v1b<? super m700> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m700 m700Var = new m700(this.b, this.c, v1bVar);
        m700Var.a = obj;
        return m700Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((m700) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.c;
        String str2 = this.b;
        if (str2 == null || StringsKt.U(str2)) {
            jtwVar.f(new zn20.a(str));
        } else {
            zn20.a<?> aVar = new zn20.a<>(str);
            jtwVar.getClass();
            jtwVar.h(aVar, str2);
        }
        return Unit.a;
    }
}
