package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.pingpong.components.ShRoundHistoryContainer;
import com.sportygames.pingpong.remote.models.Coefficients;
import com.sportygames.pingpong.remote.models.PreviousMultiplierResponseSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mgi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mgi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0<Unit> onClick;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((wd0) obj2).d()).floatValue() * 720.0f);
                return Unit.a;
            case 1:
                LeftMenuButton leftMenuButton = (LeftMenuButton) obj2;
                ((View) obj).getClass();
                if (leftMenuButton != null && (onClick = leftMenuButton.getOnClick()) != null) {
                    onClick.invoke();
                }
                return Unit.a;
            default:
                m410 m410Var = (m410) obj2;
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    return Unit.a;
                }
                PreviousMultiplierResponseSocket previousMultiplierResponseSocket = (PreviousMultiplierResponseSocket) q97.a(PreviousMultiplierResponseSocket.class, str);
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null) {
                    ShRoundHistoryContainer shRoundHistoryContainer = ixiVar.T;
                    Coefficients data = previousMultiplierResponseSocket.getData();
                    data.getClass();
                    try {
                        if (shRoundHistoryContainer.a.size() > 0 && ((Coefficients) shRoundHistoryContainer.a.get(0)).getId() != data.getId()) {
                            shRoundHistoryContainer.a.add(0, data);
                            shRoundHistoryContainer.binding.d.setItemAnimator(new h());
                            py50 py50Var = shRoundHistoryContainer.b;
                            if (py50Var == null) {
                                Intrinsics.n("chipListAdapter");
                                throw null;
                            }
                            py50Var.e = true;
                            py50Var.notifyDataSetChanged();
                        }
                    } catch (Exception unused) {
                    }
                }
                ty50 ty50Var = m410Var.P;
                if (ty50Var != null) {
                    Coefficients data2 = previousMultiplierResponseSocket.getData();
                    data2.getClass();
                    try {
                        if (ty50Var.w != null && ty50Var.v.size() > 0 && ty50Var.v.get(0).getId() != data2.getId()) {
                            ty50Var.v.add(0, data2);
                            wy50 wy50Var = new wy50(ty50Var.a, ty50Var.v, ty50Var.b, ty50Var.c, ty50Var.i);
                            ty50Var.w = wy50Var;
                            RecyclerView recyclerView = ty50Var.d;
                            if (recyclerView == null) {
                                Intrinsics.n("roundHistoryList");
                                throw null;
                            }
                            recyclerView.setAdapter(wy50Var);
                        }
                    } catch (Exception unused2) {
                    }
                }
                return Unit.a;
        }
    }
}
