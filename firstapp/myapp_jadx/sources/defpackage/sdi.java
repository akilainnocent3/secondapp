package defpackage;

import android.widget.TextView;
import com.sportybet.android.instantwin.presentation.footballfamilysettlement.a;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sdi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sdi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        ixi ixiVar;
        v720 binding5;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        v720 binding6;
        CharSequence text;
        ixi ixiVar2;
        v720 binding7;
        List<DetailResponse> gameDetailsResponseList2;
        DetailResponse detailResponse2;
        v720 binding8;
        CharSequence text2;
        v720 binding9;
        CharSequence text3;
        ixi ixiVar3;
        v720 binding10;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.h.a);
                break;
            default:
                m410 m410Var = (m410) obj;
                ixi ixiVar4 = (ixi) m410Var.b;
                if (ixiVar4 != null && ixiVar4.M.getVisibility() == 0) {
                    ixi ixiVar5 = (ixi) m410Var.b;
                    if (ixiVar5 != null && (binding9 = ixiVar5.b.getBinding()) != null && (text3 = binding9.z.getText()) != null && text3.equals("0") && (ixiVar3 = (ixi) m410Var.b) != null && (binding10 = ixiVar3.b.getBinding()) != null) {
                        binding10.z.setText("1.01");
                    }
                    ixi ixiVar6 = (ixi) m410Var.b;
                    Double dValueOf = null;
                    if (c.l((ixiVar6 == null || (binding8 = ixiVar6.c.getBinding()) == null || (text2 = binding8.b.getText()) == null) ? null : text2.toString(), "0", false) && (ixiVar2 = (ixi) m410Var.b) != null && (binding7 = ixiVar2.c.getBinding()) != null) {
                        TextView textView = binding7.b;
                        DetailResponseData detailResponseData = m410Var.w;
                        textView.setText(String.valueOf((detailResponseData == null || (gameDetailsResponseList2 = detailResponseData.getGameDetailsResponseList()) == null || (detailResponse2 = gameDetailsResponseList2.get(1)) == null) ? null : Double.valueOf(detailResponse2.getMinAmount())));
                    }
                    ixi ixiVar7 = (ixi) m410Var.b;
                    if (c.l((ixiVar7 == null || (binding6 = ixiVar7.b.getBinding()) == null || (text = binding6.b.getText()) == null) ? null : text.toString(), "0", false) && (ixiVar = (ixi) m410Var.b) != null && (binding5 = ixiVar.b.getBinding()) != null) {
                        TextView textView2 = binding5.b;
                        DetailResponseData detailResponseData2 = m410Var.w;
                        if (detailResponseData2 != null && (gameDetailsResponseList = detailResponseData2.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get(0)) != null) {
                            dValueOf = Double.valueOf(detailResponse.getMinAmount());
                        }
                        textView2.setText(String.valueOf(dValueOf));
                    }
                    ixi ixiVar8 = (ixi) m410Var.b;
                    if (ixiVar8 != null && (binding4 = ixiVar8.c.getBinding()) != null) {
                        binding4.i.setEnabled(false);
                    }
                    ixi ixiVar9 = (ixi) m410Var.b;
                    if (ixiVar9 != null && (binding3 = ixiVar9.b.getBinding()) != null) {
                        binding3.i.setEnabled(false);
                    }
                    ixi ixiVar10 = (ixi) m410Var.b;
                    if (ixiVar10 != null && (binding2 = ixiVar10.b.getBinding()) != null) {
                        binding2.A.setEnabled(false);
                    }
                }
                ixi ixiVar11 = (ixi) m410Var.b;
                if (ixiVar11 != null && (binding = ixiVar11.c.getBinding()) != null) {
                    binding.A.setEnabled(true);
                }
                m410Var.R0 = m410Var.V0;
                m410Var.d0 = false;
                ixi ixiVar12 = (ixi) m410Var.b;
                if (ixiVar12 != null) {
                    ixiVar12.M.setVisibility(0);
                }
                m410Var.l1();
                m410Var.q1(false);
                m410Var.p1(m410Var.R0);
                break;
        }
        return Unit.a;
    }
}
