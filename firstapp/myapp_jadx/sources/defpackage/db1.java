package defpackage;

import android.content.SharedPreferences;
import android.widget.ImageView;
import com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class db1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ db1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ide0.a aVar = (ide0.a) obj2;
                t91.e eVar = (t91.e) obj;
                List<i91> list = eVar.e;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (i91 i91VarA : list) {
                    ide0.a.C0675a c0675a = (ide0.a.C0675a) aVar;
                    if (Intrinsics.g(i91VarA.a, c0675a.a)) {
                        i91VarA = i91.a(i91VarA, c0675a.b, false, 1046527);
                    }
                    arrayList.add(i91VarA);
                }
                return t91.e.a(eVar, arrayList);
            case 1:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = PreMatchEventActivity.a2;
                bool.getClass();
                boolean z = preMatchEventActivity.J0 == 2 && bool.booleanValue();
                ImageView imageView = preMatchEventActivity.F0;
                if (imageView != null) {
                    imageView.setVisibility(z ? 0 : 8);
                }
                return Unit.a;
            case 2:
                a1b0 a1b0Var = (a1b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = a1b0Var.i;
                wz.a("SoundClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = a1b0Var.z;
                if (editor != null) {
                    editor.putBoolean("spin2win_sound", zBooleanValue);
                }
                a1b0Var.z0().y1().d = zBooleanValue;
                a1b0Var.z0().J1(a1b0Var.z0().y1().d);
                SharedPreferences.Editor editor2 = a1b0Var.z;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
            default:
                h2j0 h2j0Var = (h2j0) obj2;
                WelcomeRewardTimingConfig welcomeRewardTimingConfig = (WelcomeRewardTimingConfig) obj;
                welcomeRewardTimingConfig.getClass();
                wwd0 wwd0Var = h2j0Var.c;
                wwd0Var.getClass();
                wwd0Var.k(null, welcomeRewardTimingConfig);
                ej5.c(o8i0.d(h2j0Var), null, null, new k2j0(h2j0Var, null), 3);
                return Unit.a;
        }
    }
}
