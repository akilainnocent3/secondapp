package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import com.sportygames.rush.model.response.UserValidateResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pfe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pfe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String nickName;
        FragmentManager supportFragmentManager;
        String avatarUrl;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                p9g p9gVar = (p9g) obj2;
                OtpData.DeviceBlocking deviceBlocking = (OtpData.DeviceBlocking) obj;
                deviceBlocking.getClass();
                OTPResult<OTPGeneralResult> oTPResult = deviceBlocking.e;
                if (oTPResult instanceof OTPResult.Success) {
                    p9gVar.x1(new c9g.a(((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken()));
                }
                break;
            case 1:
                zy10 zy10Var = (zy10) obj2;
                String str = (String) obj;
                str.getClass();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null) {
                    BetContainer betContainer = zt50Var.R;
                    List<DetailResponse> list = zy10Var.M;
                    if (list != null) {
                        zy10Var.u0(betContainer, zy10Var.Z, list.get(1), str, "PURPLE");
                        SharedPreferences sharedPreferences = zy10Var.w;
                        if (sharedPreferences != null && !sharedPreferences.getBoolean("ROCKET_ONE_TAP", false)) {
                            zy10Var.i = true;
                        }
                    }
                }
                break;
            case 2:
                l560 l560Var = (l560) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = l560Var.P;
                if (editor != null) {
                    editor.putBoolean("rush_one_tap", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = l560Var.P;
                if (editor2 != null) {
                    editor2.apply();
                }
                UserValidateResponse userValidateResponse = l560Var.a0;
                String str2 = "";
                if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
                    nickName = "";
                }
                UserValidateResponse userValidateResponse2 = l560Var.a0;
                if (userValidateResponse2 != null && (avatarUrl = userValidateResponse2.getAvatarUrl()) != null) {
                    str2 = avatarUrl;
                }
                l560Var.L0(nickName, str2);
                e activity = l560Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.a0();
                }
                break;
            default:
                vki0 vki0Var = (vki0) obj;
                vki0Var.getClass();
                ((Function1) obj2).invoke(new kli0.r(vki0Var));
                break;
        }
        return Unit.a;
    }
}
