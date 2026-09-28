package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pah implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pah(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer code;
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bbh bbhVar = (bbh) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = bbh.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    bbhVar.d = false;
                    bbhVar.f = false;
                    bbhVar.e = true;
                    ej5.c(ebs.a(bbhVar.getLifecycle()), null, null, new dbh(bbhVar, null), 3);
                } else if (i2 == 2) {
                    bbhVar.d = true;
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    bbhVar.f = true;
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                        bbhVar.e = true;
                        Context context = bbhVar.getContext();
                        if (context != null) {
                            op5 op5Var = op5.a;
                            String string = context.getString(R.string.try_again_long_cms);
                            Toast.makeText(context, at6.a(string, context, R.string.other_error, op5Var, string), 0).show();
                        }
                        ej5.c(ebs.a(bbhVar.getLifecycle()), null, null, new ebh(bbhVar, null), 3);
                    } else {
                        GamesLobbyMainFragment gamesLobbyMainFragment = bbhVar.A;
                        if (gamesLobbyMainFragment != null) {
                            gamesLobbyMainFragment.a0();
                        }
                    }
                }
                return Unit.a;
            default:
                w540 w540Var = (w540) obj2;
                t640 t640VarJ = w540.j(w540Var, ((Integer) obj).intValue());
                if (t640VarJ != null && (str = t640VarJ.a) != null) {
                    w540Var.w.invoke(str);
                }
                return Unit.a;
        }
    }
}
