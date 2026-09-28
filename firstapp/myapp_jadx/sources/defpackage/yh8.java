package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.sportyherov2.components.ShRoundHistoryContainer;
import com.sportygames.sportyherov2.components.ShRoundHistoryContainer$clearChips$2;
import com.sportygames.sportyherov2.remote.models.Coefficients;
import com.sportygames.sportyherov2.remote.models.PreviousMultiplierResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class yh8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yh8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreviousMultiplierResponse previousMultiplierResponse;
        bw80 bw80Var;
        PreviousMultiplierResponse previousMultiplierResponse2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                ((Function1) obj2).invoke(alertDialogCallbackType);
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = q1c0.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    w3c0 w3c0Var = (w3c0) q1c0Var.b;
                    if (w3c0Var != null) {
                        w3c0Var.d0.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (previousMultiplierResponse2 = (PreviousMultiplierResponse) hTTPResponse.getData()) != null) {
                        w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                        if (w3c0Var2 != null) {
                            ShRoundHistoryContainer shRoundHistoryContainer = w3c0Var2.c0;
                            c28 c28VarJ1 = q1c0Var.j1();
                            ibs viewLifecycleOwner = q1c0Var.getViewLifecycleOwner();
                            viewLifecycleOwner.getClass();
                            try {
                                shRoundHistoryContainer.a = new ArrayList();
                                Context context = shRoundHistoryContainer.getContext();
                                if (context != null) {
                                    shRoundHistoryContainer.b = new qy50(context, shRoundHistoryContainer.a, c28VarJ1, viewLifecycleOwner);
                                }
                                shRoundHistoryContainer.binding.d.setItemAnimator(new h());
                                RecyclerView recyclerView = shRoundHistoryContainer.binding.d;
                                shRoundHistoryContainer.getContext();
                                recyclerView.setLayoutManager(new ShRoundHistoryContainer$clearChips$2(0, false));
                                RecyclerView recyclerView2 = shRoundHistoryContainer.binding.d;
                                qy50 qy50Var = shRoundHistoryContainer.b;
                                if (qy50Var == null) {
                                    Intrinsics.n("chipListAdapter");
                                    throw null;
                                }
                                recyclerView2.setAdapter(qy50Var);
                            } catch (Exception unused) {
                            }
                        }
                        w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                        if (w3c0Var3 != null) {
                            ShRoundHistoryContainer shRoundHistoryContainer2 = w3c0Var3.c0;
                            c28 c28VarJ2 = q1c0Var.j1();
                            ibs viewLifecycleOwner2 = q1c0Var.getViewLifecycleOwner();
                            viewLifecycleOwner2.getClass();
                            shRoundHistoryContainer2.setChips(previousMultiplierResponse2, c28VarJ2, viewLifecycleOwner2);
                        }
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse2 != null && (previousMultiplierResponse = (PreviousMultiplierResponse) hTTPResponse2.getData()) != null && (bw80Var = q1c0Var.d0) != null) {
                        int limit = previousMultiplierResponse.getLimit();
                        try {
                            if (bw80Var.z != null) {
                                bw80Var.y.clear();
                                xy50 xy50Var = bw80Var.z;
                                if (xy50Var == null) {
                                    Intrinsics.n("adapter");
                                    throw null;
                                }
                                xy50Var.notifyDataSetChanged();
                                List<Coefficients> coefficients = previousMultiplierResponse.getCoefficients();
                                coefficients.getClass();
                                List<Coefficients> listB = y8h0.b(coefficients);
                                bw80Var.y = listB;
                                bw80Var.w = limit;
                                xy50 xy50Var2 = new xy50(bw80Var.a, listB, bw80Var.b, bw80Var.c, limit);
                                bw80Var.z = xy50Var2;
                                RecyclerView recyclerView3 = bw80Var.d;
                                if (recyclerView3 == null) {
                                    Intrinsics.n("roundHistoryList");
                                    throw null;
                                }
                                recyclerView3.setAdapter(xy50Var2);
                            } else {
                                List<Coefficients> coefficients2 = previousMultiplierResponse.getCoefficients();
                                coefficients2.getClass();
                                bw80Var.y = y8h0.b(coefficients2);
                                bw80Var.w = limit;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    foa0 foa0Var = (foa0) q1c0Var.a;
                    if (foa0Var != null) {
                        foa0Var.I1();
                    }
                    foa0 foa0Var2 = (foa0) q1c0Var.a;
                    if (foa0Var2 != null) {
                        foa0Var2.E1();
                    }
                    w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                    if (w3c0Var4 != null) {
                        w3c0Var4.c0.setVisibility(0);
                    }
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null) {
                        w3c0Var5.A.setVisibility(0);
                    }
                } else if (i2 == 2) {
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null) {
                        w3c0Var6.d0.P();
                    }
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
