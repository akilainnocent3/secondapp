package defpackage;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z310 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z310(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mj60 mj60Var;
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj;
                e activity = m410Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (mj60Var = m410Var.a0) != null) {
                    Window window = mj60Var.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = mj60Var.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = mj60Var.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.trans_black_45);
                    }
                    mj60Var.show();
                    Window window4 = mj60Var.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    mj60 mj60Var2 = m410Var.a0;
                    if (mj60Var2 == null) {
                        Intrinsics.n("gameLimit");
                        throw null;
                    }
                    mj60Var2.setOnDismissListener(new lv80());
                    GameDetails gameDetails = m410Var.r1;
                    wz.a("GameLimitsClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                }
                return Unit.a;
            default:
                Context context = ((zih0) obj).b.a.getContext();
                context.getClass();
                gby.c(context);
                return Unit.a;
        }
    }
}
