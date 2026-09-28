package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.evenodd.remote.models.WalletInfo;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$observeApiResponses$5", f = "FruitHuntBase.kt", l = {541}, m = "invokeSuspend", v = 1)
public final class c3j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n2j b;

    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$observeApiResponses$5$1", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<LoadingState<HTTPResponse<WalletInfo>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ n2j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2j n2jVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = n2jVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LoadingState<HTTPResponse<WalletInfo>> loadingState, v1b<? super Unit> v1bVar) {
            return ((a) create(loadingState, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            final LoadingState loadingState = (LoadingState) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (loadingState == null) {
                return Unit.a;
            }
            final n2j n2jVar = this.b;
            n2jVar.n0(new Function0() { // from class: b3j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    WalletInfo walletInfo;
                    WalletInfo walletInfo2;
                    WalletInfo walletInfo3;
                    LoadingState loadingState2 = loadingState;
                    int i = n2j.a.a[loadingState2.getStatus().ordinal()];
                    final n2j n2jVar2 = n2jVar;
                    if (i == 1) {
                        n2jVar2.O0(loadingState2.getError());
                    } else if (i == 2) {
                        n2jVar2.o0(new Function0() { // from class: c1j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n2j n2jVar3 = n2jVar2;
                                djh djhVar = n2jVar3.b;
                                if (djhVar != null) {
                                    djhVar.I.setVisibility(0);
                                }
                                djh djhVar2 = n2jVar3.b;
                                if (djhVar2 != null) {
                                    WalletText walletText = djhVar2.I;
                                    walletText.d.setVisibility(0);
                                    walletText.b.setText("");
                                    TextView textView = walletText.bottom;
                                    Context context = walletText.getContext();
                                    context.getClass();
                                    textView.setTextColor(context.getColor(R.color.fh_amount_won));
                                    TextView textView2 = walletText.c;
                                    Context context2 = walletText.getContext();
                                    context2.getClass();
                                    textView2.setTextColor(context2.getColor(R.color.fh_amount_lost));
                                }
                                return Unit.a;
                            }
                        });
                    } else {
                        if (i != 3) {
                            uhc.a();
                            return null;
                        }
                        n2jVar2.X0(true);
                        o8j o8jVarT0 = n2jVar2.t0();
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState2.getData();
                        o8jVarT0.D.setValue((hTTPResponse == null || (walletInfo3 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo3.getBalance());
                        o8j o8jVarT1 = n2jVar2.t0();
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState2.getData();
                        o8jVarT1.F = (hTTPResponse2 == null || (walletInfo2 = (WalletInfo) hTTPResponse2.getData()) == null) ? null : walletInfo2.getCurrency();
                        HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState2.getData();
                        String currency = (hTTPResponse3 == null || (walletInfo = (WalletInfo) hTTPResponse3.getData()) == null) ? null : walletInfo.getCurrency();
                        if (currency == null || StringsKt.U(currency)) {
                            n2jVar2.O0(loadingState2.getError());
                        } else {
                            n2jVar2.O = 0;
                            n2jVar2.o0(new d1j(0, n2jVar2, loadingState2));
                            n2jVar2.t0().A1();
                            if (n2jVar2.t0().V) {
                                GameDetails gameDetails = n2jVar2.c;
                                String name = gameDetails != null ? gameDetails.getName() : null;
                                n2jVar2.g0 = false;
                                o8j o8jVarT2 = n2jVar2.t0();
                                ej5.c(o8i0.d(o8jVarT2), null, null, new q8j(o8jVarT2, null), 3);
                                if (name != null) {
                                    aij aijVarU0 = n2jVar2.u0();
                                    ej5.c(o8i0.d(aijVarU0), null, null, new yhj(aijVarU0, name, null), 3);
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
            });
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3j(n2j n2jVar, v1b<? super c3j> v1bVar) {
        super(2, v1bVar);
        this.b = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c3j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c3j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n2j n2jVar = this.b;
            wwd0 wwd0Var = n2jVar.t0().i;
            a aVar = new a(n2jVar, null);
            this.a = 1;
            if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
