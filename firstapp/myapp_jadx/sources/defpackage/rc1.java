package defpackage;

import com.sportybet.android.cashoutphase3.AutoCashoutSettingView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.UploadImageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rc1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ShareBetData shareBetData;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AutoCashoutSettingView.e eVar = (AutoCashoutSettingView.e) obj2;
                int i2 = AutoCashoutSettingView.M;
                if (eVar != null) {
                    eVar.b();
                }
                return null;
            case 1:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                bi50 bi50Var = (bi50) obj;
                int i3 = PreMatchEventActivity.a2;
                if (bi50Var != null) {
                    UploadImageResponse uploadImageResponse = (UploadImageResponse) bi50Var.b;
                    String imageUrl = uploadImageResponse != null ? uploadImageResponse.getImageUrl() : null;
                    if (imageUrl == null || imageUrl.length() == 0 || (shareBetData = preMatchEventActivity.e1) == null) {
                        ResponseBody responseBody = bi50Var.c;
                        if (responseBody != null) {
                            zyf0.d(ui8.c(responseBody));
                        }
                    } else {
                        shareBetData.setImageUrl(imageUrl);
                        preMatchEventActivity.W0 = new eal().j(preMatchEventActivity.e1);
                        preMatchEventActivity.T1(preMatchEventActivity.B1(preMatchEventActivity.J1));
                    }
                } else {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__failed_to_send_please_try_again, new Object[0]));
                }
                return Unit.a;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                h2j0.x1((h2j0) obj2, num, null, null, 6);
                return Unit.a;
        }
    }
}
