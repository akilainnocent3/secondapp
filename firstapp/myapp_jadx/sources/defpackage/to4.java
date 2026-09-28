package defpackage;

import android.widget.TextView;
import com.esotericsoftware.spine.android.b;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class to4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        ixi ixiVar;
        v720 binding4;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        v720 binding5;
        CharSequence text;
        v720 binding6;
        CharSequence text2;
        ixi ixiVar2;
        v720 binding7;
        v720 binding8;
        CharSequence text3;
        ixi ixiVar3;
        v720 binding9;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (b) obj;
            case 1:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            default:
                m410 m410Var = (m410) obj;
                ixi ixiVar4 = (ixi) m410Var.b;
                if (ixiVar4 != null && ixiVar4.M.getVisibility() == 0) {
                    ixi ixiVar5 = (ixi) m410Var.b;
                    if (ixiVar5 != null && (binding8 = ixiVar5.c.getBinding()) != null && (text3 = binding8.z.getText()) != null && text3.equals("0") && (ixiVar3 = (ixi) m410Var.b) != null && (binding9 = ixiVar3.c.getBinding()) != null) {
                        binding9.z.setText("1.01");
                    }
                    ixi ixiVar6 = (ixi) m410Var.b;
                    if (ixiVar6 != null && (binding6 = ixiVar6.b.getBinding()) != null && (text2 = binding6.z.getText()) != null && text2.equals("0") && (ixiVar2 = (ixi) m410Var.b) != null && (binding7 = ixiVar2.b.getBinding()) != null) {
                        binding7.z.setText("1.01");
                    }
                    ixi ixiVar7 = (ixi) m410Var.b;
                    if (ixiVar7 != null) {
                        ixiVar7.b.setBetDone();
                    }
                    ixi ixiVar8 = (ixi) m410Var.b;
                    Double dValueOf = null;
                    if (c.l((ixiVar8 == null || (binding5 = ixiVar8.b.getBinding()) == null || (text = binding5.b.getText()) == null) ? null : text.toString(), "0", false) && (ixiVar = (ixi) m410Var.b) != null && (binding4 = ixiVar.b.getBinding()) != null) {
                        TextView textView = binding4.b;
                        DetailResponseData detailResponseData = m410Var.w;
                        if (detailResponseData != null && (gameDetailsResponseList = detailResponseData.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get(0)) != null) {
                            dValueOf = Double.valueOf(detailResponse.getMinAmount());
                        }
                        textView.setText(String.valueOf(dValueOf));
                    }
                    ixi ixiVar9 = (ixi) m410Var.b;
                    if (ixiVar9 != null && (binding3 = ixiVar9.b.getBinding()) != null) {
                        binding3.i.setEnabled(false);
                    }
                    ixi ixiVar10 = (ixi) m410Var.b;
                    if (ixiVar10 != null && (binding2 = ixiVar10.c.getBinding()) != null) {
                        binding2.A.setEnabled(false);
                    }
                    ixi ixiVar11 = (ixi) m410Var.b;
                    if (ixiVar11 != null && (binding = ixiVar11.b.getBinding()) != null) {
                        binding.A.setEnabled(false);
                    }
                }
                m410Var.R0 = m410Var.T0;
                m410Var.q1(true);
                ixi ixiVar12 = (ixi) m410Var.b;
                if (ixiVar12 != null) {
                    ixiVar12.M.setVisibility(0);
                }
                return Unit.a;
        }
    }
}
