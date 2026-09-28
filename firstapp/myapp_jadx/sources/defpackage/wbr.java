package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$updateItem$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wbr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ztw<scn<String, Object>> a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbr(ztw ztwVar, String str, Boolean bool, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ztwVar;
        this.b = str;
        this.c = bool;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wbr(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wbr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ztw<scn<String, Object>> ztwVar;
        scn<String, Object> value;
        LinkedHashMap linkedHashMapM;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            linkedHashMapM = kpu.m(value);
            linkedHashMapM.put(this.b, this.c);
        } while (!ztwVar.g(value, a4h.d(linkedHashMapM)));
        return Unit.a;
    }
}
