package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.rush.model.entity.DetailResponseEntity;
import com.sportygames.rush.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o2t implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        DetailResponseEntity detailResponseEntity;
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((zpz) obj).k());
            default:
                final l560 l560Var = (l560) obj;
                GameDetails gameDetails = l560Var.S;
                wz.a("GameLimitClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                e activity = l560Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (context = l560Var.getContext()) != null && (detailResponseEntity = l560Var.T) != null) {
                    sp80 sp80Var = new sp80(context);
                    sp80Var.y = "";
                    sp80Var.setCancelable(true);
                    sp80Var.setCanceledOnTouchOutside(false);
                    l560Var.X = sp80Var;
                    rm0 rm0Var = new rm0(3);
                    op5 op5Var = op5.a;
                    WalletInfoResponse walletInfoResponse = l560Var.U;
                    String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                    String str = currency != null ? currency : "";
                    op5Var.getClass();
                    String strI = op5.i(str);
                    sp80Var.a = detailResponseEntity;
                    sp80Var.y = strI;
                    sp80Var.b = rm0Var;
                    Window window = sp80Var.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = sp80Var.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = sp80Var.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                    }
                    sp80Var.show();
                    Window window4 = sp80Var.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    sp80 sp80Var2 = l560Var.X;
                    if (sp80Var2 != null) {
                        sp80Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: y260
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                GameDetails gameDetails2 = l560Var.S;
                                String name = gameDetails2 != null ? gameDetails2.getName() : null;
                                if (name == null) {
                                    name = "";
                                }
                                wz.a("PopupAction", name, "Logged in", "Game Limit", "Close");
                            }
                        });
                    }
                }
                return Unit.a;
        }
    }
}
