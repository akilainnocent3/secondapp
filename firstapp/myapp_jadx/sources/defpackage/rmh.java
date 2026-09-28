package defpackage;

import android.view.View;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rmh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rmh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xo40 xo40Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final ymh ymhVar = (ymh) obj;
                OddsFilterSettingView oddsFilterSettingView = new OddsFilterSettingView(ymhVar.a);
                oddsFilterSettingView.setDismissListener(new View.OnClickListener() { // from class: xmh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        yec yecVar = ymhVar.c;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                    }
                });
                oddsFilterSettingView.setNoShowTitle();
                oddsFilterSettingView.setOnRangeChangeListener(new fmh(ymhVar));
                oddsFilterSettingView.setOnApplyClickListener(new OddsFilterSettingView.a() { // from class: gmh
                    @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.a
                    public final void a(String str, String str2) {
                        ymh ymhVar2 = ymhVar;
                        yec yecVar = ymhVar2.c;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                        PreMatchSportActivity.b bVar = ymhVar2.b;
                        if (bVar != null) {
                            str.getClass();
                            str2.getClass();
                            bVar.a(str, str2);
                        }
                    }
                });
                oddsFilterSettingView.setOnClearClickListener(new OddsFilterSettingView.b() { // from class: hmh
                    @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.b
                    public final void a() {
                        ymh ymhVar2 = ymhVar;
                        yec yecVar = ymhVar2.c;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                        PreMatchSportActivity.b bVar = ymhVar2.b;
                        if (bVar != null) {
                            bVar.a("", "");
                        }
                    }
                });
                return oddsFilterSettingView;
            case 1:
                nn40 nn40Var = (nn40) obj;
                if (!nn40Var.h0 && (xo40Var = (xo40) nn40Var.b) != null) {
                    xo40Var.B.n(8388613);
                }
                return Unit.a;
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(b.m.a);
                function1.invoke(b.a.g.a);
                return Unit.a;
        }
    }
}
