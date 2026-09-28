package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventSpinnerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class je8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ je8(Object obj, int i) {
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
                Bundle arguments = ((re8) obj).getArguments();
                if (arguments != null) {
                    return (PayHintData) arguments.getParcelable("notifyContent");
                }
                return null;
            case 1:
                ((Function1) obj).invoke(jmq.g.a);
                return Unit.a;
            case 2:
                return ((MatchEventSpinnerAdapter) obj).lambda$new$1();
            default:
                return ((k480) obj).a.a();
        }
    }
}
