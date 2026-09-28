package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wjl extends pf implements Function2<k2a0, v1b<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k2a0 k2a0Var, v1b<? super Unit> v1bVar) {
        HighLiabilityCodeActivity highLiabilityCodeActivity = (HighLiabilityCodeActivity) this.a;
        int i = HighLiabilityCodeActivity.y;
        highLiabilityCodeActivity.getClass();
        if (k2a0Var.b != null && !(highLiabilityCodeActivity.z1() instanceof l9s)) {
            FragmentManager supportFragmentManager = highLiabilityCodeActivity.getSupportFragmentManager();
            a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            feb0 feb0Var = highLiabilityCodeActivity.d;
            if (feb0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            aVarA.f(feb0Var.a.getId(), new l9s(), "SmartRemixConfirmationFragment");
            aVarA.d();
        }
        return Unit.a;
    }
}
