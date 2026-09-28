package defpackage;

import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.platform.ComposeView;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.crash.remote.models.RoundResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ffb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ffb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoundResponse roundResponse;
        RoundResponse.WaitingRound waitingRound;
        Integer code;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = fgb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    fgbVar.z0 = (hTTPResponse == null || (roundResponse = (RoundResponse) hTTPResponse.getData()) == null || (waitingRound = roundResponse.getWaitingRound()) == null) ? 0L : waitingRound.getId();
                    gvi gviVar = fgbVar.z;
                    if (gviVar != null) {
                        gviVar.Y.N();
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    fgbVar.n0(hTTPResponse2 != null ? (RoundResponse) hTTPResponse2.getData() : null);
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    gvi gviVar2 = fgbVar.z;
                    if (gviVar2 != null) {
                        gviVar2.Y.M(100);
                    }
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403 || fgbVar.F0) {
                        gvi gviVar3 = fgbVar.z;
                        if (gviVar3 != null) {
                            ComposeView composeView = gviVar3.J;
                            composeView.setViewCompositionStrategy(u6i0.c.a);
                            composeView.setContent(new op8(-642188360, new tab(composeView, fgbVar, loadingState, 0), true));
                        }
                    } else {
                        fgbVar.F0 = true;
                        gvi gviVar4 = fgbVar.z;
                        if (gviVar4 != null) {
                            gviVar4.Y.M(0);
                        }
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    }
                }
                return Unit.a;
            default:
                b bVar = (b) obj2;
                nk0 nk0Var = (nk0) obj;
                b.a aVar = bVar.T;
                if (aVar == null) {
                    b.a aVar2 = new b.a(bVar.D, nk0Var);
                    fkw fkwVar = new fkw(nk0Var, bVar.E, bVar.F, bVar.H, bVar.I, bVar.J, bVar.K, m2g.a, bVar.O);
                    fkwVar.d(bVar.q2().k);
                    aVar2.d = fkwVar;
                    bVar.T = aVar2;
                } else if (!Intrinsics.g(nk0Var, aVar.b)) {
                    aVar.b = nk0Var;
                    fkw fkwVar2 = aVar.d;
                    if (fkwVar2 != null) {
                        imf0 imf0Var = bVar.E;
                        f8i.a aVar3 = bVar.F;
                        int i3 = bVar.H;
                        boolean z = bVar.I;
                        int i4 = bVar.J;
                        int i5 = bVar.K;
                        m2g m2gVar = m2g.a;
                        if1 if1Var = bVar.O;
                        fkwVar2.a = nk0Var;
                        fkwVar2.f(imf0Var);
                        fkwVar2.b = aVar3;
                        fkwVar2.c = i3;
                        fkwVar2.d = z;
                        fkwVar2.e = i4;
                        fkwVar2.f = i5;
                        fkwVar2.g = m2gVar;
                        fkwVar2.h = if1Var;
                        fkwVar2.s = (fkwVar2.s << 2) | 2;
                        fkwVar2.m = null;
                        fkwVar2.o = null;
                        fkwVar2.q = -1;
                        fkwVar2.p = -1;
                        fkwVar2.r = null;
                    }
                }
                pkd.f(bVar).R();
                pkd.f(bVar).P();
                rcf.a(bVar);
                return Boolean.TRUE;
        }
    }
}
