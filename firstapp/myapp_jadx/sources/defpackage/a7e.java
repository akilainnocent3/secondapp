package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameUpdateResultPopupActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a7e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(uc8.b.a);
                return Unit.a;
            case 1:
                return new eru(((its) obj).d.b, new ArrayList(), true);
            default:
                NameUpdateResultPopupActivity nameUpdateResultPopupActivity = (NameUpdateResultPopupActivity) obj;
                NameUpdateResultPopupActivity.a aVar = NameUpdateResultPopupActivity.b;
                vdx vdxVar = (vdx) nameUpdateResultPopupActivity.a.getValue();
                ej5.c(o8i0.d(vdxVar), null, null, new udx(vdxVar, null), 3);
                nameUpdateResultPopupActivity.finish();
                return Unit.a;
        }
    }
}
