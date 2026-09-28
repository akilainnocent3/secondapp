package defpackage;

import androidx.fragment.app.e;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p5b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p5b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        iny onBackPressedDispatcher;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((r5b) obj).m = null;
                return Unit.a;
            case 1:
                hjd0 hjd0Var = ((PreMatchSportActivity) obj).b;
                if (hjd0Var != null) {
                    return Boolean.valueOf(!hjd0Var.B.a.e.isChecked());
                }
                Intrinsics.n("binding");
                throw null;
            default:
                kab0 kab0Var = (kab0) obj;
                kab0Var.D0(true);
                e activity = kab0Var.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.a;
        }
    }
}
