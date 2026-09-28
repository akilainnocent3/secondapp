package defpackage;

import android.widget.ListAdapter;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSortType;
import com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class smh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ smh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final ymh ymhVar = (ymh) obj;
                PopOneListView popOneListView = new PopOneListView(ymhVar.a);
                popOneListView.setDismissListener(new kmh(ymhVar, 0));
                ArrayList arrayList = ymhVar.l;
                h220 h220Var = popOneListView.b;
                h220Var.a = arrayList;
                popOneListView.a.setAdapter((ListAdapter) h220Var);
                popOneListView.setOnSelectListener(new PopOneListView.a() { // from class: lmh
                    @Override // com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView.a
                    public final void a(int i2) {
                        String str;
                        ymh ymhVar2 = ymhVar;
                        yec yecVar = ymhVar2.c;
                        ArrayList arrayList2 = ymhVar2.l;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                        Object objV = CollectionsKt.V(i2, arrayList2);
                        if (!(objV instanceof yoa0)) {
                            objV = null;
                        }
                        yoa0 yoa0Var = (yoa0) objV;
                        if (yoa0Var != null) {
                            yoa0 yoa0Var2 = yoa0Var.c ? null : yoa0Var;
                            if (yoa0Var2 != null) {
                                String str2 = yoa0Var2.a;
                                str2.getClass();
                                ymh.d(str2, arrayList2);
                                PreMatchSportActivity.b bVar = ymhVar2.b;
                                if (bVar != null) {
                                    int i3 = yoa0Var2.d;
                                    PreMatchSportActivity preMatchSportActivity = bVar.a;
                                    preMatchSportActivity.P = true;
                                    if (i3 == PreMatchSortType.DEFAULT.getValue()) {
                                        str = "Sort_DefaultClick";
                                    } else if (i3 == PreMatchSortType.TIME.getValue()) {
                                        str = "Sort_TimeClick";
                                    } else {
                                        str = i3 == PreMatchSortType.LEAGUE.getValue() ? "Sort_LeagueClick" : "";
                                    }
                                    vgb0.a(str);
                                    bVar.b.c.c(i3);
                                    jk20 jk20VarI1 = preMatchSportActivity.I1();
                                    jk20VarI1.D = i3;
                                    jk20VarI1.x1();
                                    preMatchSportActivity.P1();
                                }
                            }
                        }
                    }
                });
                return popOneListView;
            case 1:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.a.g.a);
                return Unit.a;
        }
    }
}
