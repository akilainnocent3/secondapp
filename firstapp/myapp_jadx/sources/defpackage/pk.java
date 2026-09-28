package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.pingpong.components.ShRoundHistoryContainer;
import com.sportygames.pingpong.components.ShRoundHistoryContainer$clearChips$2;
import com.sportygames.pingpong.remote.models.Coefficients;
import com.sportygames.pingpong.remote.models.PreviousMultiplierResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreviousMultiplierResponse previousMultiplierResponse;
        ty50 ty50Var;
        PreviousMultiplierResponse previousMultiplierResponse2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qk qkVar = (qk) obj2;
                qkVar.F.invoke((xdf0) obj, zma.a(qkVar, AndroidCompositionLocals_androidKt.b));
                return Unit.a;
            default:
                m410 m410Var = (m410) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = m410.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    ixi ixiVar = (ixi) m410Var.b;
                    if (ixiVar != null) {
                        ixiVar.U.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (previousMultiplierResponse2 = (PreviousMultiplierResponse) hTTPResponse.getData()) != null) {
                        ixi ixiVar2 = (ixi) m410Var.b;
                        if (ixiVar2 != null) {
                            ShRoundHistoryContainer shRoundHistoryContainer = ixiVar2.T;
                            y720 y720VarN0 = m410Var.N0();
                            ibs viewLifecycleOwner = m410Var.getViewLifecycleOwner();
                            viewLifecycleOwner.getClass();
                            try {
                                shRoundHistoryContainer.a = new ArrayList();
                                Context context = shRoundHistoryContainer.getContext();
                                if (context != null) {
                                    shRoundHistoryContainer.b = new py50(context, shRoundHistoryContainer.a, y720VarN0, viewLifecycleOwner);
                                }
                                shRoundHistoryContainer.binding.d.setItemAnimator(new h());
                                RecyclerView recyclerView = shRoundHistoryContainer.binding.d;
                                shRoundHistoryContainer.getContext();
                                recyclerView.setLayoutManager(new ShRoundHistoryContainer$clearChips$2(0, false));
                                RecyclerView recyclerView2 = shRoundHistoryContainer.binding.d;
                                py50 py50Var = shRoundHistoryContainer.b;
                                if (py50Var == null) {
                                    Intrinsics.n("chipListAdapter");
                                    throw null;
                                }
                                recyclerView2.setAdapter(py50Var);
                            } catch (Exception unused) {
                            }
                        }
                        ixi ixiVar3 = (ixi) m410Var.b;
                        if (ixiVar3 != null) {
                            ShRoundHistoryContainer shRoundHistoryContainer2 = ixiVar3.T;
                            y720 y720VarN1 = m410Var.N0();
                            ibs viewLifecycleOwner2 = m410Var.getViewLifecycleOwner();
                            viewLifecycleOwner2.getClass();
                            shRoundHistoryContainer2.setChips(previousMultiplierResponse2, y720VarN1, viewLifecycleOwner2);
                        }
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse2 != null && (previousMultiplierResponse = (PreviousMultiplierResponse) hTTPResponse2.getData()) != null && (ty50Var = m410Var.P) != null) {
                        int limit = previousMultiplierResponse.getLimit();
                        try {
                            if (ty50Var.w != null) {
                                ty50Var.v.clear();
                                wy50 wy50Var = ty50Var.w;
                                if (wy50Var == null) {
                                    Intrinsics.n("adapter");
                                    throw null;
                                }
                                wy50Var.notifyDataSetChanged();
                                List<Coefficients> coefficients = previousMultiplierResponse.getCoefficients();
                                coefficients.getClass();
                                List<Coefficients> listB = y8h0.b(coefficients);
                                ty50Var.v = listB;
                                ty50Var.i = limit;
                                wy50 wy50Var2 = new wy50(ty50Var.a, listB, ty50Var.b, ty50Var.c, limit);
                                ty50Var.w = wy50Var2;
                                RecyclerView recyclerView3 = ty50Var.d;
                                if (recyclerView3 == null) {
                                    Intrinsics.n("roundHistoryList");
                                    throw null;
                                }
                                recyclerView3.setAdapter(wy50Var2);
                            } else {
                                List<Coefficients> coefficients2 = previousMultiplierResponse.getCoefficients();
                                coefficients2.getClass();
                                ty50Var.v = y8h0.b(coefficients2);
                                ty50Var.i = limit;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    goa0 goa0Var = (goa0) m410Var.a;
                    if (goa0Var != null) {
                        goa0Var.F1();
                    }
                    goa0 goa0Var2 = (goa0) m410Var.a;
                    if (goa0Var2 != null) {
                        goa0Var2.B1();
                    }
                    ixi ixiVar4 = (ixi) m410Var.b;
                    if (ixiVar4 != null) {
                        ixiVar4.T.setVisibility(0);
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    ixi ixiVar5 = (ixi) m410Var.b;
                    if (ixiVar5 != null) {
                        ixiVar5.U.P();
                    }
                }
                return Unit.a;
        }
    }
}
