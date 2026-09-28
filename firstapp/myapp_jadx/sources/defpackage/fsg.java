package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fsg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fsg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e) obj).O1(new sg2.n(0));
                return Unit.a;
            case 1:
                ((y4v) obj).requireContext();
                return new LinearLayoutManager();
            default:
                ((ytw) obj).setValue(t3g.a);
                return Unit.a;
        }
    }
}
