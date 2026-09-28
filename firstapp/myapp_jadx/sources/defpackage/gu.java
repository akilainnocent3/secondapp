package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.article.presentation.viewmodel.AllNewsViewModel$loadNews$1", f = "AllNewsViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class gu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(iu iuVar, v1b<? super gu> v1bVar) {
        super(2, v1bVar);
        this.b = iuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        eu euVar;
        String message;
        Object value2;
        iu iuVar = this.b;
        wwd0 wwd0Var = iuVar.d;
        wwd0 wwd0Var2 = iuVar.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lfk lfkVar = iuVar.a;
            String str = iuVar.c;
            this.a = 1;
            objB = lfk.b(lfkVar, str, null, this, 6);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        Throwable thA = zi50.a(objB);
        if (thA == null) {
            hqz hqzVar = (hqz) objB;
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, eu.a((eu) value2, null, false, new grx(hqzVar.a, hqzVar.b, hqzVar.c), 3)));
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
        } else {
            do {
                value = wwd0Var2.getValue();
                euVar = (eu) value;
                message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
                if (StringsKt.U(message)) {
                    message = "Failed to load news.";
                }
            } while (!wwd0Var2.g(value, eu.a(euVar, message, false, null, 6)));
            Boolean bool2 = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool2);
        }
        return Unit.a;
    }
}
