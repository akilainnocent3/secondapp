package defpackage;

import androidx.drawerlayout.widget.DrawerLayout;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class taf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ taf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((abf) obj).a();
            default:
                DrawerLayout drawerLayout = ((PreMatchEventActivity) obj).r1;
                if (drawerLayout != null) {
                    drawerLayout.n(5);
                }
                return Unit.a;
        }
    }
}
