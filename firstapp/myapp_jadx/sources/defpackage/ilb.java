package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ilb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ilb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (enbVar.b != null) {
                        enbVar.u0().x1(true);
                    }
                    SharedPreferences.Editor editor = enbVar.Y;
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[2], ((Boolean) ((x5a0) enbVar.u0().T).getValue()).booleanValue());
                    }
                    SharedPreferences.Editor editor2 = enbVar.Y;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    GameDetails gameDetails = enbVar.G;
                    wz.a("OneTapBet", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    ((x5a0) enbVar.p0().e).setValue(Boolean.FALSE);
                    if (enbVar.b != null) {
                        enbVar.u0().x1(false);
                    }
                    SharedPreferences.Editor editor3 = enbVar.Y;
                    if (editor3 != null) {
                        editor3.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[2], ((Boolean) ((x5a0) enbVar.u0().T).getValue()).booleanValue());
                    }
                    GameDetails gameDetails2 = enbVar.G;
                    wz.a("OneTapBet", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                SharedPreferences.Editor editor4 = enbVar.Y;
                if (editor4 != null) {
                    editor4.apply();
                }
                break;
            case 1:
                fgg fggVar = (fgg) obj2;
                ((View) obj).getClass();
                fggVar.J = true;
                jhg jhgVar = (jhg) fggVar.b;
                if (jhgVar != null) {
                    fggVar.v0("sporty", jhgVar.A);
                }
                fggVar.p0(fggVar.R);
                break;
            default:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                tcf.m0(lzaVar, ((j58) ((twd0) obj2).getValue()).a, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                break;
        }
        return Unit.a;
    }
}
