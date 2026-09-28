package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spin2win.model.response.GameInfoResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xrj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xrj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(msj.f.a((String) obj2, (f1e0) obj));
            default:
                final a1b0 a1b0Var = (a1b0) obj2;
                ((View) obj).getClass();
                Context context = a1b0Var.getContext();
                if (context != null) {
                    GameInfoResponse gameInfoResponse = a1b0Var.S;
                    List<List<String>> statListByCategory = gameInfoResponse != null ? gameInfoResponse.getStatListByCategory() : null;
                    fq80 fq80Var = new fq80(context);
                    fq80Var.setCancelable(false);
                    dq80 dq80Var = new dq80();
                    fq80Var.a = statListByCategory;
                    fq80Var.b = dq80Var;
                    Window window = fq80Var.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = fq80Var.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = fq80Var.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                    }
                    fq80Var.show();
                    Window window4 = fq80Var.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    wxi wxiVar = a1b0Var.v;
                    if (wxiVar != null) {
                        wxiVar.c.setVisibility(8);
                    }
                    GameDetails gameDetails = a1b0Var.i;
                    wz.a("StatsClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    fq80Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tza0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            a1b0 a1b0Var2 = a1b0Var;
                            wxi wxiVar2 = a1b0Var2.v;
                            if (wxiVar2 != null) {
                                wxiVar2.c.setVisibility(0);
                            }
                            GameDetails gameDetails2 = a1b0Var2.i;
                            String name = gameDetails2 != null ? gameDetails2.getName() : null;
                            if (name == null) {
                                name = "";
                            }
                            wz.a("PopupAction", name, "Logged in", "Stats", "Close");
                        }
                    });
                }
                return Unit.a;
        }
    }
}
