package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r3t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GameSocektResponse.Info info;
        GameSocektResponse.Info.InfoDetails blue;
        String multiplier;
        zt50 zt50Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                View view = (View) obj2;
                ((Context) obj).getClass();
                return view;
            case 1:
                zy10 zy10Var = (zy10) obj2;
                ((String) obj).getClass();
                GameSocektResponse gameSocektResponse = zy10Var.Q;
                if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (blue = info.getBLUE()) != null && (multiplier = blue.getMultiplier()) != null && (zt50Var = zy10Var.b) != null) {
                    zy10Var.F0(zt50Var.z, multiplier, "BLUE");
                }
                return Unit.a;
            default:
                l560 l560Var = (l560) obj2;
                ((View) obj).getClass();
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null) {
                    eo80Var.c.setVisibility(0);
                }
                eo80 eo80Var2 = l560Var.l0;
                if (eo80Var2 != null) {
                    eo80Var2.d.setVisibility(8);
                }
                GameDetails gameDetails = l560Var.S;
                wz.a("FBGRemoved", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                eo80 eo80Var3 = l560Var.l0;
                if (eo80Var3 != null) {
                    TextView textView = eo80Var3.r0;
                    String str = l560Var.F0().d;
                    if (str == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
                l560Var.Z = null;
                c760 c760VarF0 = l560Var.F0();
                c760VarF0.e = null;
                c760VarF0.b = null;
                l560Var.K = false;
                l560Var.w0();
                l560Var.q0();
                l560Var.U0();
                return Unit.a;
        }
    }
}
