package defpackage;

import android.widget.ListAdapter;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSortType;
import com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView;
import com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class emh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ emh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                final ymh ymhVar = (ymh) obj;
                PopOneListView popOneListView = new PopOneListView(ymhVar.a);
                popOneListView.setDismissListener(new imh(ymhVar, objArr == true ? 1 : 0));
                ArrayList arrayList = ymhVar.j;
                h220 h220Var = popOneListView.b;
                h220Var.a = arrayList;
                popOneListView.a.setAdapter((ListAdapter) h220Var);
                popOneListView.setOnSelectListener(new PopOneListView.a() { // from class: jmh
                    @Override // com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView.a
                    public final void a(int i2) {
                        ymh ymhVar2 = ymhVar;
                        yec yecVar = ymhVar2.c;
                        ArrayList arrayList2 = ymhVar2.m;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                        Object objV = CollectionsKt.V(i2, ymhVar2.j);
                        if (!(objV instanceof qfb0)) {
                            objV = null;
                        }
                        qfb0 qfb0Var = (qfb0) objV;
                        if (qfb0Var != null) {
                            if (qfb0Var.c) {
                                qfb0Var = null;
                            }
                            if (qfb0Var != null) {
                                arrayList2.clear();
                                ((RegionsListView) ymhVar2.f.getValue()).d(arrayList2);
                                ArrayList arrayList3 = ymhVar2.l;
                                PreMatchSortType preMatchSortType = PreMatchSortType.DEFAULT;
                                ymh.d(String.valueOf(preMatchSortType.getValue()), arrayList3);
                                PreMatchSportActivity.b bVar = ymhVar2.b;
                                if (bVar != null) {
                                    String str = qfb0Var.d;
                                    str.getClass();
                                    String str2 = qfb0Var.b;
                                    str2.getClass();
                                    PreMatchSportActivity preMatchSportActivity = bVar.a;
                                    preMatchSportActivity.U = "";
                                    preMatchSportActivity.P = true;
                                    preMatchSportActivity.T = false;
                                    bVar.b.L.a.setTitle(str2);
                                    int value = preMatchSortType.getValue();
                                    hjd0 hjd0Var = preMatchSportActivity.b;
                                    if (hjd0Var == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    hjd0Var.c.c(value);
                                    preMatchSportActivity.I1().D = value;
                                    hjd0 hjd0Var2 = preMatchSportActivity.b;
                                    if (hjd0Var2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    hjd0Var2.c.a(preMatchSportActivity.getCMSString(R.string.common_functions__league, new Object[0]));
                                    preMatchSportActivity.T1(str, true);
                                    preMatchSportActivity.P1();
                                }
                            }
                        }
                    }
                });
                return popOneListView;
            default:
                dtg0 dtg0Var = (dtg0) obj;
                return Boolean.valueOf(!Intrinsics.g(((x5a0) dtg0Var.d).getValue(), dtg0Var.a.V()) || dtg0Var.h() || ((Boolean) ((x5a0) dtg0Var.h).getValue()).booleanValue());
        }
    }
}
