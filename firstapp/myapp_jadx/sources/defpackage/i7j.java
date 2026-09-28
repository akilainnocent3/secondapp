package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import com.sportygames.fruithunt.network.models.FHPlaceBetResponse;
import com.sportygames.fruithunt.utils.objects.FruitMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i7j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ i7j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double giftAmount;
        Float colX;
        int i = this.a;
        final View view = null;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                final u6j u6jVar = (u6j) fragment;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState == null) {
                    return Unit.a;
                }
                int i2 = u6j.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    FHPlaceBetResponse fHPlaceBetResponse = hTTPResponse != null ? (FHPlaceBetResponse) hTTPResponse.getData() : null;
                    if (fHPlaceBetResponse != null) {
                        FruitMap fruitMap = (FruitMap) u6jVar.t0().Q.getValue();
                        c9i0 c9i0Var = u6jVar.i;
                        if (fruitMap != null && (colX = fruitMap.getColX()) != null) {
                            float fFloatValue = colX.floatValue();
                            Float colY = fruitMap.getColY();
                            if (colY != null) {
                                float fFloatValue2 = colY.floatValue();
                                u6jVar.M0 = fruitMap.getPath();
                                int i3 = (int) (c9i0Var.c * 250.0f);
                                djh djhVar = u6jVar.b;
                                if (djhVar != null) {
                                    djhVar.b.setLayoutParams(new ViewGroup.LayoutParams(i3, i3));
                                }
                                djh djhVar2 = u6jVar.b;
                                if (djhVar2 != null) {
                                    djhVar2.b.setX(fFloatValue - (i3 / 2));
                                }
                                djh djhVar3 = u6jVar.b;
                                if (djhVar3 != null) {
                                    djhVar3.b.setY(fFloatValue2 - (i3 / 2));
                                }
                                String multiplier = fHPlaceBetResponse.getMultiplier();
                                djh djhVar4 = u6jVar.b;
                                if (djhVar4 != null) {
                                    ConstraintLayout constraintLayout = djhVar4.w.y;
                                    int i4 = u6jVar.L0;
                                    constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(i4, i4));
                                    constraintLayout.setX(fFloatValue - (u6jVar.L0 / 2));
                                    if (u6jVar.M0 != 0) {
                                        fFloatValue2 -= (int) (((double) c9i0Var.b) * 0.05d);
                                    }
                                    constraintLayout.setY(fFloatValue2);
                                }
                                djh djhVar5 = u6jVar.b;
                                int i5 = 0;
                                if (djhVar5 != null) {
                                    AppCompatImageView appCompatImageView = djhVar5.w.f;
                                    int i6 = u6jVar.L0;
                                    appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(i6, i6));
                                    e activity = u6jVar.getActivity();
                                    if (activity != null) {
                                        r750.d(u6jVar.t0(), new a6j(i5, activity, appCompatImageView));
                                        appCompatImageView.setColorFilter(activity.getColor(i0j.a(multiplier)), PorterDuff.Mode.SRC_IN);
                                    }
                                }
                                djh djhVar6 = u6jVar.b;
                                if (djhVar6 != null) {
                                    AppCompatTextView appCompatTextView = djhVar6.w.E;
                                    if (multiplier != null) {
                                        if (multiplier.equals("Rotten")) {
                                            e activity2 = u6jVar.getActivity();
                                            appCompatTextView.setText(activity2 != null ? m7i0.b(activity2, R.string.fh_rotten_cms, R.string.fh_rotten) : null);
                                            appCompatTextView.setTextSize(2, 16.0f);
                                            Context context = u6jVar.getContext();
                                            if (context != null) {
                                                appCompatTextView.setTextColor(context.getColor(R.color.fh_rotten_text));
                                            }
                                        } else {
                                            appCompatTextView.setText(multiplier);
                                            appCompatTextView.setTextColor(-1);
                                            appCompatTextView.setTextSize(2, StringsKt.M(multiplier, ".", false) ? 24.0f : 36.0f);
                                        }
                                    }
                                }
                                if (Intrinsics.c(fHPlaceBetResponse.getActualCreditedAmt(), 0.0d) || Intrinsics.g(fHPlaceBetResponse.getMultiplier(), "Rotten")) {
                                    ypa0 ypa0VarV0 = u6jVar.v0();
                                    e activity3 = u6jVar.getActivity();
                                    r750.c(ypa0VarV0, activity3 != null ? activity3.getString(R.string.sg_fruit_hunt_knife_cut_rotten_fruit) : null);
                                    pfd pfdVar = fse.a;
                                    ej5.c(w5b.a(gku.a), null, null, new q7j(u6jVar, fruitMap, fFloatValue, null), 3);
                                    ej5.c(o8i0.d(u6jVar.t0()), null, null, new s7j(u6jVar, null), 3);
                                } else {
                                    ypa0 ypa0VarV1 = u6jVar.v0();
                                    e activity4 = u6jVar.getActivity();
                                    r750.c(ypa0VarV1, activity4 != null ? activity4.getString(R.string.sg_fruit_hunt_knife_cut_fruit) : null);
                                    if (Intrinsics.g(fHPlaceBetResponse.getMultiplier(), "0.5x")) {
                                        pfd pfdVar2 = fse.a;
                                        ej5.c(w5b.a(gku.a), null, null, new t7j(u6jVar, fruitMap, fFloatValue, null), 3);
                                    } else {
                                        pfd pfdVar3 = fse.a;
                                        ej5.c(w5b.a(gku.a), null, null, new u7j(u6jVar, fruitMap, fFloatValue, null), 3);
                                    }
                                    r750.b(u6jVar.t0(), 1000L, new x5j(i5, u6jVar, fHPlaceBetResponse));
                                }
                                ej5.c(o8i0.d(u6jVar.t0()), null, null, new s750(new s4j(u6jVar, i5), null), 3);
                            }
                        }
                        if (((Number) u6jVar.t0().L.getValue()).intValue() == 0) {
                            ajh ajhVarL1 = u6jVar.l1();
                            if (ajhVarL1 != null) {
                                view = ajhVarL1.v;
                            }
                        } else {
                            ajh ajhVarL2 = u6jVar.l1();
                            if (ajhVarL2 != null) {
                                view = ajhVarL2.i;
                            }
                        }
                        if (view != null) {
                            ViewPropertyAnimator viewPropertyAnimatorScaleY = view.animate().scaleY(1.0f);
                            Long l = u6jVar.H0;
                            long jLongValue = 800 - (l != null ? l.longValue() : 0L);
                            u6jVar.G0 = viewPropertyAnimatorScaleY.setDuration(jLongValue > 0 ? jLongValue : 100L).withEndAction(new Runnable(u6jVar, view) { // from class: v4j
                                public final /* synthetic */ View a;

                                {
                                    this.a = view;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view2 = this.a;
                                    view2.setPivotY(view2.getY());
                                    view2.animate().scaleY(0.0f).setDuration(100L);
                                }
                            });
                        }
                        u6jVar.F0.resume();
                        Double actualCreditedAmt = fHPlaceBetResponse.getActualCreditedAmt();
                        if (actualCreditedAmt != null) {
                            double dDoubleValue = actualCreditedAmt.doubleValue();
                            Double actualDebitedAmt = fHPlaceBetResponse.getActualDebitedAmt();
                            if (actualDebitedAmt != null) {
                                u6jVar.P = dDoubleValue - actualDebitedAmt.doubleValue();
                            }
                        }
                    } else {
                        u6jVar.n1(loadingState.getError());
                    }
                    if (((fHPlaceBetResponse == null || (giftAmount = fHPlaceBetResponse.getGiftAmount()) == null) ? 0.0d : giftAmount.doubleValue()) > 0.0d) {
                        u6jVar.t0().x1();
                    }
                } else if (i2 == 2) {
                    u6jVar.n1(loadingState.getError());
                }
                return Unit.a;
            default:
                final m0t m0tVar = (m0t) fragment;
                final Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    d2t d2tVar = m0tVar.v;
                    if (d2tVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    final LobbyConfig lobbyConfig = d2tVar.c;
                    if (lobbyConfig != null) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l0t
                            @Override // java.lang.Runnable
                            public final void run() {
                                m0t m0tVar2 = m0tVar;
                                if (m0tVar2.A != null) {
                                    LobbyConfig lobbyConfig2 = lobbyConfig;
                                    boolean zNewLobby = lobbyConfig2.newLobby();
                                    new Handler(Looper.getMainLooper()).post(new k0t(m0tVar2, lobbyConfig2.webViewLobby(), zNewLobby, bundle));
                                    d2t d2tVar2 = m0tVar2.v;
                                    if (d2tVar2 != null) {
                                        d2tVar2.b.m(null);
                                    } else {
                                        Intrinsics.n("viewModel");
                                        throw null;
                                    }
                                }
                            }
                        }, 100L);
                    }
                }
                return Unit.a;
        }
    }
}
