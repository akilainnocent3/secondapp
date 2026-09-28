package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.PayBaseFragmentLegacy$collectEnableState$1", f = "PayBaseFragmentLegacy.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d000 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ c000 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d000(c000 c000Var, v1b<? super d000> v1bVar) {
        super(2, v1bVar);
        this.b = c000Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d000 d000Var = new d000(this.b, v1bVar);
        d000Var.a = ((Boolean) obj).booleanValue();
        return d000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((d000) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        View viewW0 = this.b.w0();
        if (viewW0 != null) {
            viewW0.setEnabled(z);
        }
        return Unit.a;
    }
}
