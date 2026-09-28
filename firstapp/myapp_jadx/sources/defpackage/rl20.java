package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rl20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rl20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        DetailResponse detailResponse;
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj;
                rdd0 rdd0Var = preMatchSportActivity.b0;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(s2k0.s.a, k00.d);
                int i2 = SportyTvRedirectActivity.c;
                preMatchSportActivity.startActivity(SportyTvRedirectActivity.a.a(preMatchSportActivity));
                return Unit.a;
            default:
                final kab0 kab0Var = (kab0) obj;
                GameDetails gameDetails = kab0Var.b;
                wz.a("GameLimitClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                e activity = kab0Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (context = kab0Var.getContext()) != null && (detailResponse = kab0Var.z) != null) {
                    bkj bkjVar = new bkj(context);
                    bkjVar.w = new ArrayList<>();
                    bkjVar.y = "";
                    bkjVar.setCancelable(true);
                    bkjVar.setCanceledOnTouchOutside(false);
                    p8b p8bVar = new p8b(1);
                    op5 op5Var = op5.a;
                    String str = kab0Var.L;
                    op5Var.getClass();
                    String strI = op5.i(str);
                    bkjVar.a = detailResponse;
                    bkjVar.y = strI;
                    bkjVar.b = p8bVar;
                    Window window = bkjVar.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = bkjVar.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = bkjVar.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                    }
                    bkjVar.show();
                    Window window4 = bkjVar.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    bkjVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hab0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            GameDetails gameDetails2 = kab0Var.b;
                            wz.a("PopupAction", gameDetails2 != null ? gameDetails2.getName() : null, "Logged in", "Game Limit", "Close");
                        }
                    });
                }
                return Unit.a;
        }
    }
}
