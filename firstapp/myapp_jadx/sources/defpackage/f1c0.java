package defpackage;

import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f1c0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rj60 rj60Var;
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                q1c0 q1c0Var = (q1c0) obj;
                e activity = q1c0Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (rj60Var = q1c0Var.o0) != null) {
                    Window window = rj60Var.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = rj60Var.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = rj60Var.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                    }
                    rj60Var.show();
                    Window window4 = rj60Var.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    rj60 rj60Var2 = q1c0Var.o0;
                    if (rj60Var2 == null) {
                        Intrinsics.n("gameLimit");
                        throw null;
                    }
                    rj60Var2.setOnDismissListener(new lv80());
                    GameDetails gameDetails = q1c0Var.W1;
                    wz.a("GameLimitsClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                }
                return Unit.a;
            default:
                return Integer.valueOf(((List) obj).size());
        }
    }
}
