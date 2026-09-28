package defpackage;

import android.content.Intent;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i6i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n6i n6iVar = (n6i) obj2;
                b6i.d dVar = (b6i.d) obj;
                dVar.getClass();
                Integer num = dVar.g;
                List<Event> list = dVar.c;
                if (num != null && num.intValue() == 10000) {
                    Intent intent = new Intent(n6iVar.requireContext(), (Class<?>) HighLiabilityCodeActivity.class);
                    intent.putExtra("share_code", dVar.a);
                    intent.putExtra("code_hub_edit", true);
                    intent.putExtra("action_load_booking_code_from", "FOLLOWING_AT_CODEHUB");
                    intent.putExtra("is_smart_remix_available", dVar.f);
                    bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                    intent.putExtra("multi_maker_code_action", 3);
                    String strH1 = iu2.a.j().h1(list != null ? list.size() : 0, false);
                    Integer num2 = dVar.d;
                    Locale locale = Locale.getDefault();
                    Double d = dVar.e;
                    intent.putExtra("summary", strH1 + " " + num2 + " x " + String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d != null ? d.doubleValue() : 0.0d)}, 1)));
                    list.getClass();
                    intent.putParcelableArrayListExtra("booking_code_event", (ArrayList) list);
                    n6iVar.startActivity(intent);
                } else {
                    n6iVar.n0(null);
                }
                break;
            default:
                ew40 ew40Var = (ew40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ew40Var.b = OtpData.Register.a((OtpData.Register) ew40Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
