package defpackage;

import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class shc implements pya, OddsFilterSettingView.c {
    public final /* synthetic */ Object a;

    public /* synthetic */ shc(Object obj) {
        this.a = obj;
    }

    @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.c
    public void a() {
        dfm dfmVar = (dfm) this.a;
        List<String> list = dfm.v2;
        dfmVar.M1.dismiss();
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((qhc) this.a).invoke(obj);
    }
}
