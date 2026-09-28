package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sportybet.android.data.LaunchOTP;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m3j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m3j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qo80 binding;
        qo80 binding2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState.getStatus() == Status.SUCCESS) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    djh djhVar = n2jVar.b;
                    op5.r(op5Var, b.f(djhVar != null ? djhVar.w.B : null, djhVar != null ? djhVar.w.D : null, djhVar != null ? djhVar.w.C : null, djhVar != null ? djhVar.y.i : null, djhVar != null ? djhVar.w.G : null), null, 6);
                    e activity = n2jVar.getActivity();
                    String strA = inm.a("+ ", activity != null ? m7i0.b(activity, R.string.fh_add_money_cms, R.string.fh_add_money) : null);
                    djh djhVar2 = n2jVar.b;
                    if (djhVar2 != null) {
                        djhVar2.H.setText(strA);
                    }
                    djh djhVar3 = n2jVar.b;
                    if (djhVar3 != null && (binding2 = djhVar3.C.getBinding()) != null) {
                        binding2.c.setText(strA);
                    }
                    djh djhVar4 = n2jVar.b;
                    if (djhVar4 != null && (binding = djhVar4.C.getBinding()) != null) {
                        TextView textView = binding.f;
                        e activity2 = n2jVar.getActivity();
                        textView.setText(activity2 != null ? m7i0.b(activity2, R.string.fh_game_name_cms, R.string.fh_game_name) : null);
                    }
                    n2jVar.D0(n2jVar.getActivity(), SportyGamesManager.getInstance().getNickName(), SportyGamesManager.getInstance().getUserImage());
                    o8j o8jVarT0 = n2jVar.t0();
                    e activity3 = n2jVar.getActivity();
                    String strB = activity3 != null ? m7i0.b(activity3, R.string.fh_select_stake_cms, R.string.fh_select_stake) : null;
                    wwd0 wwd0Var = o8jVarT0.C;
                    if (strB == null) {
                        strB = "";
                    }
                    wwd0Var.getClass();
                    wwd0Var.k(null, strB);
                    e activity4 = n2jVar.getActivity();
                    if (activity4 != null) {
                        djh djhVar5 = n2jVar.b;
                        if (djhVar5 != null) {
                            ProgressMeterComponent progressMeterComponent = djhVar5.G;
                            String[] stringArray = activity4.getResources().getStringArray(R.array.images_array);
                            stringArray.getClass();
                            GameDetails gameDetails = n2jVar.c;
                            String name = gameDetails != null ? gameDetails.getName() : null;
                            int i2 = ProgressMeterComponent.N;
                            progressMeterComponent.G(activity4, stringArray, name, true);
                        }
                        djh djhVar6 = n2jVar.b;
                        if (djhVar6 != null) {
                            ProgressMeterComponent progressMeterComponent2 = djhVar6.G;
                            String[] stringArray2 = activity4.getResources().getStringArray(R.array.fruit_hunt_array_bg);
                            stringArray2.getClass();
                            GameDetails gameDetails2 = n2jVar.c;
                            progressMeterComponent2.G(activity4, stringArray2, gameDetails2 != null ? gameDetails2.getName() : null, false);
                        }
                    }
                    SharedPreferences sharedPreferences = n2jVar.J;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SOUND", true)) : null;
                    SharedPreferences sharedPreferences2 = n2jVar.J;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("MUSIC", true)) : null;
                    Context context = n2jVar.getContext();
                    if (context != null) {
                        djh djhVar7 = n2jVar.b;
                        if (djhVar7 != null) {
                            ProgressMeterComponent progressMeterComponent3 = djhVar7.G;
                            String string = n2jVar.getString(R.string.fh_game_name);
                            string.getClass();
                            progressMeterComponent3.setSoundManager("Fruit Hunt/", string, boolValueOf, boolValueOf2, rk60.b.w, n2jVar.c, context);
                        }
                        djh djhVar8 = n2jVar.b;
                        if (djhVar8 != null) {
                            djhVar8.G.H(n2jVar.v0());
                        }
                    }
                }
                return Unit.a;
            case 1:
                NameUpdateWebViewActivity nameUpdateWebViewActivity = (NameUpdateWebViewActivity) obj2;
                LaunchOTP launchOTP = (LaunchOTP) obj;
                if (launchOTP instanceof LaunchOTP.Success) {
                    ee<OtpModule<OtpData.NameUpdate>> eeVar = nameUpdateWebViewActivity.d;
                    if (nameUpdateWebViewActivity.c == null) {
                        Intrinsics.n("otpModuleFactory");
                        throw null;
                    }
                    LaunchOTP.Success success = (LaunchOTP.Success) launchOTP;
                    String phone = success.getPhone();
                    String strP = nameUpdateWebViewActivity.getCountryManager().P();
                    String otpToken = success.getOtpToken();
                    String callbackName = success.getCallbackName();
                    phone.getClass();
                    strP.getClass();
                    otpToken.getClass();
                    callbackName.getClass();
                    eeVar.b(new OtpModule(new OtpData.NameUpdate(phone, strP, j6c.UPDATE_NAME, otpToken, callbackName, OTPResult.NoResult.a), new OtpViewModelClasses(odx.class, aex.class, hex.class, xdx.class, dex.class, ldx.class)));
                } else {
                    int i3 = NameUpdateWebViewActivity.e;
                    if (!(launchOTP instanceof LaunchOTP.Failed)) {
                        uhc.a();
                        return null;
                    }
                    ime.b(nameUpdateWebViewActivity, new ple(nameUpdateWebViewActivity.getCMSString(R.string.common_feedback__something_went_wrong, new Object[0]), (String) null, (DialogInterface.OnClickListener) null, (String) null, (ny1) null, (String) null, WebSocketProtocol.PAYLOAD_SHORT));
                }
                return Unit.a;
            default:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                return ((jrd0) obj2).T(bOConfigValueBundle);
        }
    }
}
