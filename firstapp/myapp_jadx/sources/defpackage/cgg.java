package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cgg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ cgg(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                fgg fggVar = (fgg) fragment;
                ((View) obj).getClass();
                GameDetails gameDetails = fggVar.i;
                String name = gameDetails != null ? gameDetails.getName() : null;
                if (name == null) {
                    name = "";
                }
                wz.a("FBGRemoved", name, new String[0]);
                fggVar.H0();
                break;
            default:
                ((qub0) fragment).u4(((Integer) obj).intValue());
                break;
        }
        return Unit.a;
    }
}
