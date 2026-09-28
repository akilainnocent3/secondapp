package defpackage;

import android.content.SharedPreferences;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class znf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ znf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jof jofVar = (jof) obj2;
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                jofVar.y1(new hof(jofVar, ijf0Var, null));
                break;
            default:
                kab0 kab0Var = (kab0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = kab0Var.b;
                wz.a(TEFcJcMqR.etCm, gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = kab0Var.E;
                if (editor != null) {
                    editor.putBoolean("spin_match_sound", zBooleanValue);
                }
                kab0Var.v0().y1().d = zBooleanValue;
                SharedPreferences.Editor editor2 = kab0Var.E;
                if (editor2 != null) {
                    editor2.apply();
                }
                kab0Var.v0().J1(kab0Var.v0().y1().d);
                break;
        }
        return Unit.a;
    }
}
