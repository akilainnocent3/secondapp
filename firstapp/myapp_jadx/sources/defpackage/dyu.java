package defpackage;

import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventAdapter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dyu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dyu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((MatchEventAdapter) obj).lambda$new$0();
            default:
                return Integer.valueOf(((List) obj).size());
        }
    }
}
