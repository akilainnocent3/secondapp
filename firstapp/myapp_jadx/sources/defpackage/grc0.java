package defpackage;

import android.text.TextUtils;
import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyMediaHostFragment$collectData$1$2", f = "SportyMediaHostFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class grc0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyMediaHostFragment b;
    public final /* synthetic */ xxi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grc0(v1b v1bVar, xxi xxiVar, SportyMediaHostFragment sportyMediaHostFragment) {
        super(2, v1bVar);
        this.b = sportyMediaHostFragment;
        this.c = xxiVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        grc0 grc0Var = new grc0(v1bVar, this.c, this.b);
        grc0Var.a = obj;
        return grc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((grc0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!TextUtils.isEmpty(str)) {
            this.b.F = str;
            this.c.b.f.setText(str);
        }
        return Unit.a;
    }
}
