package defpackage;

import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Selection selectionUpdateSelection;
        e eVar;
        ssw<List<Selection>> sswVar;
        List<Selection> listD;
        ArrayList arrayList;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                e880 e880Var = (e880) obj;
                if (e880Var != null) {
                    PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
                    if (preMatchEventAdapter != null && (selectionUpdateSelection = preMatchEventAdapter.updateSelection(e880Var)) != null && (eVar = preMatchEventActivity.L1) != null && ((listD = (sswVar = eVar.W).d()) == null || listD.contains(selectionUpdateSelection))) {
                        List<Selection> listD2 = sswVar.d();
                        if (listD2 != null) {
                            arrayList = new ArrayList(l48.r(listD2, 10));
                            for (Selection selection : listD2) {
                                if (selection.j().equals(selectionUpdateSelection.j())) {
                                    selection = selectionUpdateSelection;
                                }
                                arrayList.add(selection);
                            }
                        } else {
                            arrayList = null;
                        }
                        sswVar.m(arrayList);
                    }
                } else {
                    int i2 = PreMatchEventActivity.a2;
                }
                break;
            default:
                int i3 = (int) (((jxo) obj).a & 4294967295L);
                u5a0 u5a0Var = (u5a0) ((n27) obj2).k;
                if (u5a0Var.D() != i3) {
                    u5a0Var.k(i3);
                }
                break;
        }
        return Unit.a;
    }
}
