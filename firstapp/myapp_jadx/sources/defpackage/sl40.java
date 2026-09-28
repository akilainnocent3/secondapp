package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.redblack.remote.models.ChatRoomResponse;
import com.sportygames.redblack.remote.models.GameAvailableResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sl40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sl40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> sswVar;
        String name;
        loj lojVar;
        GameAvailableResponse gameAvailableResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final nn40 nn40Var = (nn40) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = nn40.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                int i4 = 2;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if ((hTTPResponse == null || (gameAvailableResponse = (GameAvailableResponse) hTTPResponse.getData()) == null) ? false : Intrinsics.g(gameAvailableResponse.isGameAvailable(), Boolean.FALSE)) {
                        e activity = nn40Var.getActivity();
                        if (activity != null) {
                            xo40 xo40Var = (xo40) nn40Var.b;
                            if (xo40Var != null) {
                                xo40Var.V.O(100);
                            }
                            jl40 jl40Var = jl40.e;
                            if (nn40Var.z == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            jcg.d(jl40Var, activity, "Red-Black", new ResultWrapper.GenericError(80001, new HTTPResponse(9005, nn40Var.getString(R.string.game_not_available), null, null, null, null, null, 64, null)), new Function0() { // from class: hn40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    nn40Var.u0();
                                    return Unit.a;
                                }
                            }, new Function0() { // from class: in40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    nn40Var.L0();
                                    return Unit.a;
                                }
                            }, null, 0, activity.getColor(R.color.try_again_color), null, null, null, new gs00(nn40Var, i3), null, 97728);
                        }
                        xo40 xo40Var2 = (xo40) nn40Var.b;
                        if (xo40Var2 != null) {
                            xo40Var2.A.setVisibility(0);
                        }
                        return Unit.a;
                    }
                    nn40Var.d0 = 1;
                    jqh0 jqh0Var = (jqh0) nn40Var.y.getValue();
                    ej5.c(o8i0.d(jqh0Var), null, null, new iqh0(jqh0Var, nn40Var.Z, null), 3);
                    GameDetails gameDetails = nn40Var.H;
                    if (gameDetails != null && (name = gameDetails.getName()) != null && (lojVar = (loj) nn40Var.a) != null) {
                        ej5.c(o8i0.d(lojVar), null, null, new ioj(lojVar, name, null), 3);
                    }
                    loj lojVar2 = (loj) nn40Var.a;
                    if (lojVar2 != null && (sswVar = lojVar2.c) != null) {
                        sswVar.f(nn40Var.getViewLifecycleOwner(), new nn40.e(new jsh(nn40Var, 2)));
                    }
                    xo40 xo40Var3 = (xo40) nn40Var.b;
                    if (xo40Var3 != null) {
                        xo40Var3.V.P();
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    e activity2 = nn40Var.getActivity();
                    if (activity2 != null) {
                        xo40 xo40Var4 = (xo40) nn40Var.b;
                        if (xo40Var4 != null) {
                            xo40Var4.V.O(100);
                        }
                        if (loadingState.getError() != null) {
                            ResultWrapper.GenericError error = loadingState.getError();
                            Integer code = loadingState.getError().getCode();
                            if (code == null || code.intValue() != 403) {
                                xbg xbgVar = nn40Var.S;
                                if (xbgVar == null) {
                                    Intrinsics.n("errorDialog");
                                    throw null;
                                }
                                if (!xbgVar.isShowing()) {
                                    xo40 xo40Var5 = (xo40) nn40Var.b;
                                    if (xo40Var5 != null) {
                                        xo40Var5.A.setVisibility(0);
                                    }
                                    jl40 jl40Var2 = jl40.e;
                                    if (nn40Var.z == null) {
                                        Intrinsics.n("soundViewModel");
                                        throw null;
                                    }
                                    jcg.d(jl40Var2, activity2, "Red-Black", error, new orh(nn40Var, i3), new Function0() { // from class: jn40
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            nn40Var.L0();
                                            return Unit.a;
                                        }
                                    }, null, 0, activity2.getColor(R.color.try_again_color), null, null, null, new k74(nn40Var, i4), null, 97728);
                                }
                            }
                        } else {
                            jl40 jl40Var3 = jl40.e;
                            if (nn40Var.z == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            jcg.d(jl40Var3, activity2, "Red-Black", loadingState.getError(), new l74(nn40Var, 2), new m74(nn40Var, i4), new Function0() { // from class: ln40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    loj lojVar3 = (loj) nn40Var.a;
                                    if (lojVar3 != null) {
                                        ej5.c(o8i0.d(lojVar3), null, null, new hoj(lojVar3, null), 3);
                                    }
                                    return Unit.a;
                                }
                            }, 0, activity2.getColor(R.color.try_again_color), null, null, null, new ps00(nn40Var, i3), null, 97664);
                        }
                    }
                }
                return Unit.a;
            default:
                ((Function1) obj2).invoke(new b.c.e(((Boolean) obj).booleanValue()));
                return Unit.a;
        }
    }
}
