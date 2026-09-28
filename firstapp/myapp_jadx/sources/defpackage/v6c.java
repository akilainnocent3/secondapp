package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v6c implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                CustomCodeActivity customCodeActivity = (CustomCodeActivity) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                int i2 = CustomCodeActivity.f;
                str.getClass();
                str2.getClass();
                if (str.length() != 0 && str2.length() != 0) {
                    xyd0 xyd0VarA = xyd0.a.a(str, str2, false, null);
                    if (!customCodeActivity.isFinishing() && !customCodeActivity.isDestroyed()) {
                        int i3 = CustomCodeActivity.f;
                        xyd0VarA.show(customCodeActivity.getSupportFragmentManager(), "statisticsDialogFragment");
                        Unit unit = Unit.a;
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f980.a((dw7) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v6c(CustomCodeActivity customCodeActivity) {
        this.b = customCodeActivity;
    }
}
