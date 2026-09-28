package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cvh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ cvh(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                return " • 1 ".concat(sn5.d((evh) fragment, R.string.component_betslip__l_games_cut, new Object[0]));
            case 1:
                Bundle arguments = ((uu00) fragment).getArguments();
                return (arguments == null || (string = arguments.getString("key_game_name")) == null) ? "" : string;
            default:
                ((vzg0) fragment).dismiss();
                return Unit.a;
        }
    }
}
