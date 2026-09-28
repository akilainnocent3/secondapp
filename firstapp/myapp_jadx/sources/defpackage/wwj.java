package defpackage;

import android.content.Intent;
import androidx.fragment.app.e;
import com.sporty.android.platform.features.newotp.agent.OTPAgentActivity;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wwj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wwj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e activity;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ywj ywjVar = (ywj) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "ENDED") && (activity = ywjVar.getActivity()) != null) {
                    String str = ywjVar.r0().c;
                    if (str == null) {
                        str = "Ongoing";
                    }
                    new z66(activity, str).a();
                }
                break;
            case 1:
                tyt tytVar = (tyt) obj;
                tytVar.getClass();
                ivt.e(tytVar, (Function1) obj2);
                break;
            default:
                OTPAgentActivity oTPAgentActivity = (OTPAgentActivity) obj2;
                OtpData otpData = (OtpData) obj;
                int i2 = OTPAgentActivity.b;
                otpData.getClass();
                Intent intent = new Intent();
                intent.putExtra("key - otp data", otpData);
                oTPAgentActivity.setResult(-1, intent);
                oTPAgentActivity.finish();
                break;
        }
        return Unit.a;
    }
}
