package defpackage;

import android.content.SharedPreferences;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.fruithunt.network.models.FHUserDataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$observeApiResponses$4", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class a3j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ n2j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3j(n2j n2jVar, v1b<? super a3j> v1bVar) {
        super(2, v1bVar);
        this.a = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a3j(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a3j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final n2j n2jVar = this.a;
        n2jVar.t0().e.f(n2jVar.getViewLifecycleOwner(), new n2j.c(new Function1() { // from class: x2j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                final LoadingState loadingState = (LoadingState) obj2;
                if (loadingState == null) {
                    return Unit.a;
                }
                final n2j n2jVar2 = n2jVar;
                n2jVar2.n0(new Function0() { // from class: y2j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        final LoadingState loadingState2 = loadingState;
                        Status status = loadingState2.getStatus();
                        ResultWrapper.GenericError error = loadingState2.getError();
                        final n2j n2jVar3 = n2jVar2;
                        n2jVar3.w0(status, error, new Function0() { // from class: z2j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                FHUserDataResponse fHUserDataResponse;
                                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                HTTPResponse hTTPResponse = (HTTPResponse) loadingState2.getData();
                                n2j n2jVar4 = n2jVar3;
                                if (hTTPResponse != null && (fHUserDataResponse = (FHUserDataResponse) hTTPResponse.getData()) != null) {
                                    sportyGamesManager.setUserId(String.valueOf(fHUserDataResponse.getId()));
                                    sportyGamesManager.setPatronId(fHUserDataResponse.getPatronId());
                                    sportyGamesManager.setUserImage(String.valueOf(fHUserDataResponse.getAvatarUrl()));
                                    sportyGamesManager.setNickName(String.valueOf(fHUserDataResponse.getNickName()));
                                    SharedPreferences sharedPreferences = n2jVar4.J;
                                    if (!Intrinsics.g(sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("FIXED_CO_EFF", false)) : null, fHUserDataResponse.getFixedOdds())) {
                                        SharedPreferences.Editor editor = n2jVar4.K;
                                        if (editor != null) {
                                            Boolean fixedOdds = fHUserDataResponse.getFixedOdds();
                                            editor.putBoolean("FIXED_CO_EFF", fixedOdds != null ? fixedOdds.booleanValue() : false);
                                        }
                                        SharedPreferences.Editor editor2 = n2jVar4.K;
                                        if (editor2 != null) {
                                            editor2.apply();
                                        }
                                    }
                                    n2jVar4.D0(n2jVar4.getActivity(), sportyGamesManager.getNickName(), sportyGamesManager.getUserImage());
                                }
                                n2jVar4.t0().y1();
                                n2jVar4.X0(true);
                                return Unit.a;
                            }
                        });
                        return Unit.a;
                    }
                });
                return Unit.a;
            }
        }));
        return Unit.a;
    }
}
