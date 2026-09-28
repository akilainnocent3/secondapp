package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$fetchBannedList$1", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kf30 extends tje0 implements Function2<lk50<? extends List<? extends String>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tf30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf30(tf30 tf30Var, v1b<? super kf30> v1bVar) {
        super(2, v1bVar);
        this.b = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kf30 kf30Var = new kf30(this.b, v1bVar);
        kf30Var.a = obj;
        return kf30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends String>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((kf30) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            this.b.U.m(new UIState.Success((List) ((lk50.c) lk50Var).a));
        } else if (lk50Var instanceof lk50.a) {
            itf0.a.d("Unexpected result type: " + lk50Var, new Object[0]);
        }
        return Unit.a;
    }
}
