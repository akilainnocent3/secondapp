package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.views.NavigationActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dlb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dlb(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((enb) fragment).C0());
            case 1:
                fgg fggVar = (fgg) fragment;
                if (!fggVar.j0 && !fggVar.f0) {
                    fggVar.f0 = true;
                    Intent intent = new Intent(fggVar.requireContext(), (Class<?>) NavigationActivity.class);
                    intent.putExtra("color", R.color.toolbar_strip_even_odd);
                    GameDetails gameDetails = fggVar.i;
                    intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null);
                    intent.putExtra("sound", fggVar.i);
                    intent.putExtra("userImage", fggVar.v);
                    intent.putExtra("userName", fggVar.w);
                    intent.putExtra("addMoneyBg", fggVar.l0);
                    intent.putExtra("gameDetail", fggVar.i);
                    fggVar.startActivityForResult(intent, 109);
                }
                return Unit.a;
            default:
                ((qub0) fragment).T3();
                return Unit.a;
        }
    }
}
