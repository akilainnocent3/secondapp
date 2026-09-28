package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.settings.shortcutwidget.ShortcutWidgetConfigureActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xq40 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ir40.a((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                ShortcutWidgetConfigureActivity shortcutWidgetConfigureActivity = (ShortcutWidgetConfigureActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = ShortcutWidgetConfigureActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-1020343805, new nnr(shortcutWidgetConfigureActivity), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xq40(ShortcutWidgetConfigureActivity shortcutWidgetConfigureActivity) {
        this.b = shortcutWidgetConfigureActivity;
    }
}
