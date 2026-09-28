package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hc3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ hc3(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                zie zieVar = ((BetSuccessfulPageFragment) fragment).H;
                if (zieVar != null) {
                    zieVar.H.setVisibility(8);
                }
                break;
            default:
                ((c000) fragment).O0();
                break;
        }
        return Unit.a;
    }
}
