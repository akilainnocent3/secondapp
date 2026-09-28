package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gpb implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ gpb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((qn70) obj).getClass();
                ((wrz) obj2).getClass();
                return new dug0();
            default:
                boolean z = QuickBetView.j1;
                return new Pair((ej90) obj, (Boolean) obj2);
        }
    }
}
