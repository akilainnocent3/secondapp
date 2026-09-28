package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.featuredGames.model.FeaturedResponse;
import com.sportygames.pingpong.components.ShBetContainer;
import com.sportygames.pingpong.remote.models.DetailResponse;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class aeh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aeh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i = this.a;
        String strB = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FeaturedResponse.GameList gameList = (FeaturedResponse.GameList) obj2;
                wz.a("FeaturedGamesLaunchGame", null, String.valueOf(gameList.getDisplayName()));
                ((beh) obj).d.j(String.valueOf(gameList.getDeepLinkUrl()));
                break;
            default:
                ShBetContainer shBetContainer = (ShBetContainer) obj2;
                DetailResponse detailResponse = (DetailResponse) obj;
                int i2 = ShBetContainer.S;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        int i3 = shBetContainer.fbgAvailable ? 1 : 2;
                        if (shBetContainer.d) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(i3).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView = shBetContainer.binding.b;
                                TreeMap treeMap = pw.a;
                                textView.setText(pw.n(dDoubleValue));
                            }
                            shBetContainer.binding.N.setVisibility(0);
                        } else {
                            TextView textView2 = shBetContainer.binding.b;
                            TreeMap treeMap2 = pw.a;
                            Double d = detailResponse.getDefaultChips().get(i3);
                            d.getClass();
                            textView2.setText(pw.n(d.doubleValue()));
                            shBetContainer.b = false;
                            shBetContainer.c = false;
                            shBetContainer.d = true;
                            shBetContainer.e = false;
                            shBetContainer.binding.J.setVisibility(8);
                            shBetContainer.binding.L.setVisibility(8);
                            shBetContainer.binding.N.setVisibility(0);
                            shBetContainer.binding.P.setVisibility(8);
                        }
                        double d2 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) - detailResponse.getStepAmount();
                        double minAmount = detailResponse.getMinAmount();
                        v720 v720Var = shBetContainer.binding;
                        if (d2 < minAmount) {
                            v720Var.X.setClickable(false);
                            shBetContainer.binding.X.setAlpha(0.5f);
                        } else {
                            v720Var.X.setClickable(true);
                            shBetContainer.binding.X.setAlpha(1.0f);
                        }
                        double d3 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) + detailResponse.getStepAmount();
                        double maxAmount = detailResponse.getMaxAmount();
                        v720 v720Var2 = shBetContainer.binding;
                        if (d3 > maxAmount) {
                            v720Var2.b0.setClickable(false);
                            shBetContainer.binding.b0.setAlpha(0.5f);
                        } else {
                            v720Var2.b0.setClickable(true);
                            shBetContainer.binding.b0.setAlpha(1.0f);
                        }
                        TextView textView3 = shBetContainer.binding.Z;
                        Context context = shBetContainer.getContext();
                        if (context != null && (string = context.getString(R.string.place_bet_text_sh)) != null) {
                            op5 op5Var = op5.a;
                            String string2 = shBetContainer.getContext().getString(R.string.place_bet_cms);
                            string2.getClass();
                            op5Var.getClass();
                            strB = op5.b(string2, string, null);
                        }
                        op5 op5Var2 = op5.a;
                        String currency = detailResponse.getCurrency();
                        op5Var2.getClass();
                        textView3.setText(strB + "\n" + op5.i(currency) + " " + ((Object) shBetContainer.binding.b.getText()) + "?");
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.z.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.z.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("1.01");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(3);
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
