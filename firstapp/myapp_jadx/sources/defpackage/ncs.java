package defpackage;

import androidx.compose.ui.layout.y;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ncs implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ncs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y.a aVar = (y.a) obj;
                aVar.getClass();
                aVar.s((y) obj2, 0, 0, 0.0f);
                return Unit.a;
            default:
                kme kmeVar = (kme) obj;
                kmeVar.getClass();
                Boolean bool = (Boolean) ((g) obj2).G.a.b("pix_btg_should_complete_registration_with_facial_recognition");
                return bool != null ? bool.booleanValue() : false ? kme.a(kmeVar, null, null, false, false, false, false, true, false, null, 447) : kme.a(kmeVar, null, null, false, false, true, false, false, false, null, 495);
        }
    }
}
