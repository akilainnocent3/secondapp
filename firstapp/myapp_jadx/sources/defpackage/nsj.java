package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.pocketrocket.model.response.RecentRoundMultiplier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nsj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nsj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecentRoundMultiplier recentRoundMultiplier;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fuj fujVar = (fuj) obj2;
                fujVar.getClass();
                msj msjVar = msj.a;
                if (msjVar.d()) {
                    msjVar.a();
                }
                fujVar.e.j(bbs.a.c);
                return Unit.a;
            case 1:
                a920 a920Var = (a920) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = a920.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    a920Var.a().w.setVisibility(8);
                    a920Var.a().e.setVisibility(0);
                    a920Var.a().b.setVisibility(0);
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (recentRoundMultiplier = (RecentRoundMultiplier) hTTPResponse.getData()) != null) {
                        a920Var.c(recentRoundMultiplier.getCoefficients());
                    }
                } else if (i2 == 2) {
                    a920Var.a().w.setVisibility(0);
                    a920Var.a().e.setVisibility(8);
                    a920Var.a().b.setVisibility(8);
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    a920Var.a().w.setVisibility(8);
                    a920Var.dismiss();
                    rlz rlzVar = rlz.d;
                    Context context = a920Var.getContext();
                    context.getClass();
                    ResultWrapper.GenericError error = loadingState.getError();
                    nj6 nj6Var = new nj6(a920Var, i3);
                    y820 y820Var = new y820();
                    z820 z820Var = new z820();
                    a920Var.getContext().getColor(R.color.try_again_color);
                    rlzVar.c(context, error, nj6Var, y820Var, z820Var, 0, (1728 & 128) != 0 ? new slz() : null, (1728 & 512) != 0 ? new tlz() : null, new ulz());
                }
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                ((ij60) obj2).d(str);
                return Unit.a;
        }
    }
}
