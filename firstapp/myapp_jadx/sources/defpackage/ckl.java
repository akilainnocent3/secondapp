package defpackage;

import android.widget.LinearLayout;
import com.sportybet.android.bookingcode.presentation.activity.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ckl extends pf implements Function2<k2a0, v1b<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k2a0 k2a0Var, v1b<? super Unit> v1bVar) {
        k2a0 k2a0Var2 = k2a0Var;
        a aVar = (a) this.a;
        aVar.m0().e.setEnabled(!k2a0Var2.a);
        LinearLayout linearLayout = aVar.m0().d;
        boolean z = k2a0Var2.a;
        linearLayout.setEnabled(!z);
        aVar.m0().i.setVisibility(z ? 0 : 8);
        aVar.m0().v.setVisibility(z ? 0 : 8);
        return Unit.a;
    }
}
