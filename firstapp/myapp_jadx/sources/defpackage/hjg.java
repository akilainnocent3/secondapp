package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.sportybet.android.globalpay.kyc.za.a;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hjg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hjg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = EventActivity.U0;
                ((EventActivity) obj).finish();
                break;
            case 1:
                int i3 = MatchEventActivity.a0;
                ((MatchEventActivity) obj).U1(new a5o.d(0));
                break;
            case 2:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(48);
                }
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                break;
            default:
                a aVar = (a) obj;
                a.InterfaceC0227a interfaceC0227a = aVar.a;
                if (interfaceC0227a != null) {
                    interfaceC0227a.a(wae.HOME);
                }
                aVar.dismiss();
                break;
        }
        return Unit.a;
    }
}
