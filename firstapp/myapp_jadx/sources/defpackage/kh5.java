package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameMismatchCSActivity;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kh5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        djh djhVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(d.p.a);
                return Unit.a;
            case 1:
                azm.c(((p5e) obj).F0(), "https://ibank.zenithbank.com/InternetBanking/App/Security/Login", null, null, 6);
                return Unit.a;
            case 2:
                n2j n2jVar = (n2j) obj;
                SharedPreferences sharedPreferences = n2jVar.J;
                if (sharedPreferences != null && sharedPreferences.getBoolean("MUSIC", true) && n2jVar.isResumed() && n2jVar.a) {
                    SharedPreferences sharedPreferences2 = n2jVar.J;
                    Boolean boolValueOf = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SOUND", true)) : null;
                    Context context = n2jVar.getContext();
                    if (context != null && n2jVar.isAdded() && (djhVar = n2jVar.b) != null) {
                        ProgressMeterComponent progressMeterComponent = djhVar.G;
                        String string = n2jVar.getString(R.string.fh_game_name);
                        string.getClass();
                        rk60.b bVar = rk60.b.w;
                        GameDetails gameDetails = n2jVar.c;
                        ypa0 ypa0VarV0 = n2jVar.v0();
                        Boolean bool = Boolean.TRUE;
                        String string2 = n2jVar.getString(R.string.bg_music);
                        string2.getClass();
                        progressMeterComponent.I("Fruit Hunt/", string, boolValueOf, bVar, gameDetails, context, ypa0VarV0, bool, string2);
                    }
                }
                return Unit.a;
            case 3:
                int i2 = NameMismatchCSActivity.c;
                ((NameMismatchCSActivity) obj).finish();
                return Unit.a;
            case 4:
                PlayTimeControlDialogActivity playTimeControlDialogActivity = (PlayTimeControlDialogActivity) obj;
                d0n d0nVar = playTimeControlDialogActivity.b;
                if (d0nVar == null) {
                    Intrinsics.n("utils");
                    throw null;
                }
                d0nVar.b(playTimeControlDialogActivity, snb0.SELF_EXCLUSION);
                playTimeControlDialogActivity.finish();
                return Unit.a;
            default:
                h0s h0sVar = (h0s) obj;
                if (h0sVar.d().f && !h0sVar.d().g && h0sVar.c() == 0) {
                    h0sVar.f();
                }
                return Unit.a;
        }
    }
}
