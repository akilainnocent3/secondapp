package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sportybet.plugin.realsports.activities.ForcedPasswordResetActivity;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sah implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ sah(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j01<GameDetails> j01Var;
        znz<GameDetails> znzVarA;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                final bbh bbhVar = (bbh) fragment;
                int i2 = bbh.a.a[((LoadingState) obj).getStatus().ordinal()];
                int iA = 0;
                if (i2 == 1) {
                    bbhVar.d = false;
                    bbhVar.f = true;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tah
                        @Override // java.lang.Runnable
                        public final void run() {
                            bbh bbhVar2 = bbhVar;
                            bbhVar2.v = false;
                            jah jahVar = bbhVar2.c;
                            if (jahVar != null) {
                                jahVar.notifyDataSetChanged();
                            }
                        }
                    }, 1200L);
                } else if (i2 == 2) {
                    bbhVar.d = true;
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    bbhVar.v = false;
                    bbhVar.f = true;
                    jah jahVar = bbhVar.c;
                    if (jahVar != null && (j01Var = jahVar.e) != null && (znzVarA = j01Var.a()) != null) {
                        iA = znzVarA.d.a();
                    }
                    jct jctVar = (jct) bbhVar.a;
                    if (jctVar != null) {
                        jctVar.E1(bbhVar, iA);
                    }
                }
                return Unit.a;
            case 1:
                dfm dfmVar = (dfm) fragment;
                List<String> list = dfm.v2;
                if (((Boolean) obj).booleanValue()) {
                    e eVarRequireActivity = dfmVar.requireActivity();
                    int i3 = ForcedPasswordResetActivity.b;
                    eVarRequireActivity.getClass();
                    dfmVar.startActivity(new Intent(eVarRequireActivity, (Class<?>) ForcedPasswordResetActivity.class));
                }
                return Unit.a;
            default:
                m9c0 m9c0Var = (m9c0) fragment;
                cgb.a(m9c0Var.e1(), (String) ((x5a0) m9c0Var.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
