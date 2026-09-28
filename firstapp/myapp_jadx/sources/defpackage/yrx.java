package defpackage;

import androidx.fragment.app.Fragment;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yrx implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ yrx(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                asx.a aVar = asx.b;
                ((asx) fragment).j0(AlertDialogCallbackType.Negative.a);
                break;
            default:
                l560 l560Var = (l560) fragment;
                l560Var.d = 1;
                l560Var.F0().y1();
                break;
        }
        return Unit.a;
    }
}
