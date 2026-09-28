package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rub implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rub(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bwb bwbVar = (bwb) obj;
                bwbVar.S0().T1(true);
                bwbVar.R0().T1(false);
                ((x5a0) bwbVar.j1).setValue(Boolean.FALSE);
                bwbVar.R0().R1(false);
                bwbVar.S0().R1(false);
                return Unit.a;
            default:
                int i2 = SearchLivePanel.S;
                gid0 gid0Var = ((SearchLivePanel) obj).M;
                if (gid0Var != null) {
                    return new eru(gid0Var.b, new ArrayList(), true);
                }
                Intrinsics.n("marketTitleBinding");
                throw null;
        }
    }
}
