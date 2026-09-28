package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventSpinnerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ie8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ie8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                re8.a aVar = re8.P;
                e activity = ((re8) obj).getActivity();
                if (activity != null && !activity.isFinishing()) {
                    activity.finish();
                }
                return Unit.a;
            default:
                return ((MatchEventSpinnerAdapter) obj).lambda$new$0();
        }
    }
}
