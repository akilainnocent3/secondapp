package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pwm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ pwm(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                return Boolean.valueOf(!StringsKt.U(((INTVerifyFragment) fragment).r0().d));
            default:
                ((nn40) fragment).u0();
                return Unit.a;
        }
    }
}
