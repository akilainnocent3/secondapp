package defpackage;

import android.os.Bundle;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventSpinnerAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class le8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le8(Object obj, int i) {
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
                return Long.valueOf(arguments != null ? arguments.getLong("minDepositAmount") : 0L);
            default:
                return ((MatchEventSpinnerAdapter) obj).lambda$new$3();
        }
    }
}
