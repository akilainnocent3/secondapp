package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.components.ShBetContainer;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kfm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kfm(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dfm dfmVar = dfm.this;
                dfmVar.E0.setVisibility(8);
                iim iimVar = dfmVar.w1;
                Context contextRequireContext = dfmVar.requireContext();
                iimVar.getClass();
                contextRequireContext.getClass();
                cup cupVar = iimVar.D;
                cupVar.getClass();
                vn20.f(contextRequireContext, "kyc_reminder", cupVar.a((KYCReminder) obj), true, true);
                break;
            default:
                ShBetContainer shBetContainer = (ShBetContainer) obj2;
                Function1 function1 = (Function1) obj;
                int i2 = ShBetContainer.s0;
                String str = "0.00";
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        shBetContainer.F();
                        double d = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse = shBetContainer.h0;
                        if (d < (detailResponse != null ? detailResponse.getMaxAmount() : 0.0d)) {
                            double d2 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            DetailResponse detailResponse2 = shBetContainer.h0;
                            double stepAmount = d2 + (detailResponse2 != null ? detailResponse2.getStepAmount() : 0.0d);
                            DetailResponse detailResponse3 = shBetContainer.h0;
                            if (stepAmount <= (detailResponse3 != null ? detailResponse3.getMaxAmount() : 0.0d)) {
                                TextView textView = shBetContainer.binding.b;
                                try {
                                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(stepAmount);
                                    str2.getClass();
                                    str = str2;
                                } catch (Exception unused) {
                                }
                                textView.setText(str);
                                shBetContainer.K();
                                shBetContainer.L();
                                shBetContainer.G();
                                shBetContainer.setBetText();
                                if (shBetContainer.d0) {
                                    shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                                }
                                shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                                function1.invoke("Decrease");
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
