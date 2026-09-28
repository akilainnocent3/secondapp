package defpackage;

import android.content.SharedPreferences;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0b0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a1b0 a1b0Var = (a1b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = a1b0Var.i;
                wz.a("OneTapBetClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = a1b0Var.z;
                if (editor != null) {
                    editor.putBoolean("spin2win_one_tap", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = a1b0Var.z;
                if (editor2 != null) {
                    editor2.apply();
                }
                break;
            default:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                Integer intOrNull = StringsKt.toIntOrNull(str);
                function1.invoke(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
                break;
        }
        return Unit.a;
    }
}
