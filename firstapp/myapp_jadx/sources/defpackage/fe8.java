package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.CustomProgressButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.social.data.local.CreatorCreditEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fe8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                re8 re8Var = (re8) obj2;
                fsd fsdVar = (fsd) obj;
                re8.a aVar = re8.P;
                CustomProgressButton customProgressButton = re8Var.n0().H;
                customProgressButton.setEnabled(fsdVar.a);
                ResourceUiText resourceUiText = fsdVar.b;
                Context contextRequireContext = re8Var.requireContext();
                contextRequireContext.getClass();
                customProgressButton.setText(resourceUiText.e(contextRequireContext));
                UiText uiText = fsdVar.c;
                Context contextRequireContext2 = re8Var.requireContext();
                contextRequireContext2.getClass();
                CharSequence charSequenceE = uiText.e(contextRequireContext2);
                Context contextRequireContext3 = re8Var.requireContext();
                contextRequireContext3.getClass();
                customProgressButton.setDescView(uiText.e(contextRequireContext3));
                customProgressButton.setDescTextVisible(charSequenceE.length() > 0);
                return Unit.a;
            default:
                bw50 bw50Var = (bw50) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(bw50Var.a);
                bw50Var.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, "batch_id");
                    int iB2 = l0b.b(hq60VarH1, "claimed_amount");
                    int iB3 = l0b.b(hq60VarH1, "currency");
                    int iB4 = l0b.b(hq60VarH1, "end_time");
                    int iB5 = l0b.b(hq60VarH1, "last_claimed_time");
                    int iB6 = l0b.b(hq60VarH1, "potential_reward");
                    int iB7 = l0b.b(hq60VarH1, "start_time");
                    int iB8 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_STATUS);
                    int iB9 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_USER_ID);
                    int iB10 = l0b.b(hq60VarH1, "source_index");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        int i2 = iB2;
                        int i3 = iB3;
                        arrayList.add(new CreatorCreditEntity(hq60VarH1.k1(iB), hq60VarH1.getLong(iB2), hq60VarH1.k1(iB3), hq60VarH1.getLong(iB4), hq60VarH1.getLong(iB5), hq60VarH1.getLong(iB6), hq60VarH1.getLong(iB7), (int) hq60VarH1.getLong(iB8), hq60VarH1.k1(iB9), (int) hq60VarH1.getLong(iB10)));
                        iB2 = i2;
                        iB3 = i3;
                    }
                    hq60VarH1.close();
                    return arrayList;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
        }
    }
}
