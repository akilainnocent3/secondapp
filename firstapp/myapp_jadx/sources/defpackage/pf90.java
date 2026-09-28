package defpackage;

import android.view.Window;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pf90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(8388613);
                }
                if (window != null) {
                    window.setWindowAnimations(R.style.AnimRight);
                }
                break;
            default:
                ((Function1) obj).invoke(b.q.a);
                break;
        }
        return Unit.a;
    }
}
