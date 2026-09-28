package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$selectSuggestedNickname$1", f = "MySocialCreationViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class c1x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d1x b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1x(d1x d1xVar, String str, List<String> list, v1b<? super c1x> v1bVar) {
        super(2, v1bVar);
        this.b = d1xVar;
        this.c = str;
        this.d = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c1x(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c1x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            d1x d1xVar = this.b;
            wwd0 wwd0Var = d1xVar.y;
            d1xVar.e.getClass();
            String str = this.c;
            boolean zA = cb.a(str);
            int length = str.length();
            k8a0.e eVar = new k8a0.e(str, zA, 4 <= length && length < 16, ogx.a("^[a-zA-Z0-9]+$", str), this.d, str);
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, eVar);
            if (Unit.a == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
