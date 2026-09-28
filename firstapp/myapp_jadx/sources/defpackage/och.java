package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.components.ShBetContainer;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class och implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ och(int i, Object obj, Object obj2) {
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
                ((nch) obj2).onClick(view);
                ((OutcomeButton) obj).d();
                break;
            default:
                ShBetContainer shBetContainer = (ShBetContainer) obj2;
                DetailResponse detailResponse = (DetailResponse) obj;
                int i2 = ShBetContainer.s0;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        String str = "0.00";
                        if (shBetContainer.G) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(0).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView = shBetContainer.binding.b;
                                try {
                                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                                    str2.getClass();
                                    str = str2;
                                } catch (Exception unused) {
                                }
                                textView.setText(str);
                            }
                            shBetContainer.binding.S.setVisibility(0);
                        } else {
                            TextView textView2 = shBetContainer.binding.b;
                            Double d = detailResponse.getDefaultChips().get(0);
                            d.getClass();
                            try {
                                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d.doubleValue());
                                str3.getClass();
                                str = str3;
                            } catch (Exception unused2) {
                            }
                            textView2.setText(str);
                            shBetContainer.G = true;
                            shBetContainer.H = false;
                            shBetContainer.I = false;
                            shBetContainer.J = false;
                            shBetContainer.binding.S.setVisibility(0);
                            shBetContainer.binding.U.setVisibility(8);
                            shBetContainer.binding.W.setVisibility(8);
                            shBetContainer.binding.Y.setVisibility(8);
                        }
                        shBetContainer.K();
                        shBetContainer.L();
                        shBetContainer.G();
                        shBetContainer.setBetText();
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.G.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.G.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("5");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(1);
                    }
                } catch (Exception unused3) {
                    return;
                }
                break;
        }
    }
}
