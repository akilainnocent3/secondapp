package defpackage;

import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import java.math.BigDecimal;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rhc implements pya, OddsFilterSettingView.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ rhc(Object obj) {
        this.a = obj;
    }

    @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.b
    public void a() {
        dfm dfmVar = (dfm) this.a;
        List<String> list = dfm.v2;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        dfmVar.O1 = bigDecimal;
        dfmVar.P1 = bigDecimal;
        kkl kklVar = dfmVar.W0;
        kklVar.E = bigDecimal;
        kklVar.F = bigDecimal;
        kklVar.m(kklVar.y, true);
        bzf0 bzf0Var = dfmVar.V0;
        BigDecimal bigDecimal2 = dfmVar.O1;
        BigDecimal bigDecimal3 = dfmVar.P1;
        bzf0Var.E = bigDecimal2;
        bzf0Var.F = bigDecimal3;
        bzf0Var.m(bzf0Var.i, bzf0Var.v, true);
        dfmVar.J1.setVisibility(0);
        dfmVar.L1.setVisibility(8);
        dfmVar.o0();
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((phc) this.a).invoke(obj);
    }
}
