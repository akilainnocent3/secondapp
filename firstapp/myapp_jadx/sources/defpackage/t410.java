package defpackage;

import com.sportybet.plugin.sportypicks.ui.SportyPicksActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t410 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t410(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((m410) obj).J0();
                break;
            default:
                int i2 = SportyPicksActivity.c;
                ((SportyPicksActivity) obj).getOnBackPressedDispatcher().d();
                break;
        }
        return Unit.a;
    }
}
