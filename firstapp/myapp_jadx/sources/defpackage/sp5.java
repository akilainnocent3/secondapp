package defpackage;

import com.sporty.android.core.model.cms.CMSLanguage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase$downloadPage$4$1$1", f = "CMSUpdateUseCase.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class sp5 extends tje0 implements Function2<n9e0, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xp5 c;
    public final /* synthetic */ no5 d;
    public final /* synthetic */ CMSLanguage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp5(xp5 xp5Var, no5 no5Var, CMSLanguage cMSLanguage, v1b<? super sp5> v1bVar) {
        super(2, v1bVar);
        this.c = xp5Var;
        this.d = no5Var;
        this.e = cMSLanguage;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sp5 sp5Var = new sp5(this.c, this.d, this.e, v1bVar);
        sp5Var.b = obj;
        return sp5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(n9e0 n9e0Var, v1b<? super Unit> v1bVar) {
        return ((sp5) create(n9e0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        n9e0 n9e0Var = (n9e0) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            db40 db40Var = this.c.c;
            no5 no5Var = this.d;
            hb40 hb40Var = new hb40(no5Var.a, n9e0Var.a, this.e.getLanguageCode(), n9e0Var.b, no5Var.b, true);
            this.b = null;
            this.a = 1;
            if (db40Var.d(hb40Var, this) == y5bVar) {
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
