package defpackage;

import com.sportygames.commons.views.NavigationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dio implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dio(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((eio) obj).dismiss();
                break;
            default:
                int i2 = NavigationActivity.y;
                gd gdVar = (gd) ((NavigationActivity) obj).a;
                if (gdVar != null) {
                    gdVar.b.d();
                }
                break;
        }
        return Unit.a;
    }
}
