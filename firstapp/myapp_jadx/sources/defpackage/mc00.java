package defpackage;

import androidx.navigation.fragment.NavHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mc00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mc00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(ac00.b.a);
                break;
            default:
                ohp<Object>[] ohpVarArr = hl80.N;
                yfx yfxVarA = NavHostFragment.a.a((hl80) obj);
                zix zixVarA = bjx.a(new r8a(1, new kkx()));
                yfxVarA.getClass();
                yfx.i(yfxVarA, "notification_settings_route", zixVarA, 4);
                break;
        }
        return Unit.a;
    }
}
