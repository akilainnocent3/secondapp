package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kb2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(((g980) obj).a());
            case 1:
                return (hh) ((qn70) obj).a(jq40.a(hh.class), null, null);
            case 2:
                ((fgb) obj).o2();
                return Unit.a;
            default:
                OpenBetsActivity openBetsActivity = (OpenBetsActivity) obj;
                int i2 = OpenBetsActivity.J;
                openBetsActivity.G.d.a();
                openBetsActivity.H1();
                return Unit.a;
        }
    }
}
