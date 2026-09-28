package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.settings.shortcutwidget.ShortcutWidgetConfigureActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nnr implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vnr.g((d) obj3, (a) obj, qj40.a(1));
                break;
            default:
                ShortcutWidgetConfigureActivity shortcutWidgetConfigureActivity = (ShortcutWidgetConfigureActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = ShortcutWidgetConfigureActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    CountryCodeName countryCode = shortcutWidgetConfigureActivity.getCountryManager().getCountryCode();
                    boolean zA = aVar.A(shortcutWidgetConfigureActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        ShortcutWidgetConfigureActivity.a aVar2 = new ShortcutWidgetConfigureActivity.a(0, shortcutWidgetConfigureActivity, ShortcutWidgetConfigureActivity.class, "onCancelClicked", "onCancelClicked()V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    chp chpVar = (chp) objY;
                    boolean zA2 = aVar.A(shortcutWidgetConfigureActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        ShortcutWidgetConfigureActivity.b bVar = new ShortcutWidgetConfigureActivity.b(0, shortcutWidgetConfigureActivity, ShortcutWidgetConfigureActivity.class, "onSaveClicked", "onSaveClicked()V", 0);
                        aVar.r(bVar);
                        objY2 = bVar;
                    }
                    o890.e(null, null, countryCode, (Function0) ((chp) objY2), (Function0) chpVar, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nnr(ShortcutWidgetConfigureActivity shortcutWidgetConfigureActivity) {
        this.b = shortcutWidgetConfigureActivity;
    }
}
