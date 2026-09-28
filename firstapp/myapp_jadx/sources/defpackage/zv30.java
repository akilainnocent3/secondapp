package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.RainToastData;
import com.sportygames.sportyherov2.remote.models.PlaceBetRequest;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zv30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zv30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w3c0 w3c0Var;
        Context context;
        Double dValueOf;
        qq80 binding;
        ConstraintLayout constraintLayout;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        qq80 binding5;
        qq80 binding6;
        CharSequence text;
        String string;
        qq80 binding7;
        qq80 binding8;
        qq80 binding9;
        qq80 binding10;
        qq80 binding11;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                gw30 gw30Var = (gw30) obj2;
                ((cny) obj).getClass();
                ssw<RainToastData> sswVar = qv30.b;
                tv30[] tv30VarArr = tv30.a;
                sswVar.j(new RainToastData(0, AnalyticsEvent.BI_TRACKING_KIND_ERROR, "", "", 3000L, 0, null, 0, 128, null));
                gw30Var.v.invoke(Boolean.TRUE);
                gw30Var.requireActivity().getSupportFragmentManager().a0();
                return Unit.a;
            case 1:
                m020 m020Var = (m020) obj;
                ((fff0) obj2).e(ovo.h(m020Var, false));
                m020Var.a();
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                if (w3c0Var2 != null) {
                    w3c0Var2.e.E();
                }
                w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                if (w3c0Var3 != null) {
                    w3c0Var3.d.E();
                }
                q1c0Var.O = zBooleanValue;
                q1c0Var.Q = 0;
                q1c0Var.C1();
                wz.a("AutoBet", "Sporty Hero", "1", q1c0Var.O ? "On" : "Off");
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                if (w3c0Var4 != null && (binding7 = w3c0Var4.d.getBinding()) != null && binding7.h0.getVisibility() == 0) {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding11 = w3c0Var5.d.getBinding()) != null) {
                        binding11.h0.setVisibility(8);
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding10 = w3c0Var6.d.getBinding()) != null) {
                        binding10.L.setVisibility(8);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null && (binding9 = w3c0Var7.d.getBinding()) != null) {
                        binding9.j0.setVisibility(8);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding8 = w3c0Var8.d.getBinding()) != null) {
                        binding8.t0.setVisibility(0);
                    }
                    q1c0Var.b0 = false;
                }
                q1c0Var.n3();
                if (zBooleanValue && (w3c0Var = (w3c0) q1c0Var.b) != null && !w3c0Var.d.getBetPlaced() && (context = q1c0Var.getContext()) != null) {
                    if (q1c0Var.P) {
                        w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                        dValueOf = (w3c0Var9 == null || (binding6 = w3c0Var9.d.getBinding()) == null || (text = binding6.G.getText()) == null || (string = text.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string));
                    } else {
                        dValueOf = null;
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding5 = w3c0Var10.d.getBinding()) != null) {
                        binding5.v.setVisibility(4);
                    }
                    w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                    String strJ = new eal().j(new PlaceBetRequest(String.valueOf((w3c0Var11 == null || (binding4 = w3c0Var11.d.getBinding()) == null) ? null : binding4.b.getText()), q1c0Var.G.get(0).getBetCategoryType(), q1c0Var.G.get(0).getBetIndex(), q1c0Var.G.get(0).getCurrency(), q1c0Var.W, null, null, dValueOf, q1c0Var.T1, q1c0Var.J1));
                    foa0 foa0Var = (foa0) q1c0Var.a;
                    int i2 = 1;
                    if (foa0Var != null) {
                        foa0Var.N1(strJ, "CLASSIC", q1c0Var.W, q1c0Var.G.get(0).getBetIndex(), new mwz(i2, q1c0Var, strJ));
                    }
                    w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                    if (w3c0Var12 != null) {
                        w3c0Var12.d.setBetPlacedV2(true);
                    }
                    w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                    if (w3c0Var13 != null) {
                        w3c0Var13.d.setBetInProgress(true);
                    }
                    q1c0Var.X0();
                    SharedPreferences sharedPreferences = q1c0Var.j0;
                    if (sharedPreferences != null && sharedPreferences.getBoolean("SPORTY_HERO_SOUND", true)) {
                        ypa0 ypa0Var = q1c0Var.D;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string2 = q1c0Var.getString(R.string.revamp_place_bet);
                        string2.getClass();
                        ypa0Var.A1(0L, string2);
                    }
                    int i3 = q1c0Var.Q + 1;
                    q1c0Var.Q = i3;
                    if (q1c0Var.M1 && i3 == q1c0Var.S) {
                        q1c0Var.O = false;
                        q1c0Var.Q = 0;
                        w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                        if (w3c0Var14 != null && (binding3 = w3c0Var14.d.getBinding()) != null) {
                            binding3.d.setStatus(false);
                        }
                    }
                    wz.a("AutoBetPlaced", "Sporty Hero", "1", String.valueOf(q1c0Var.Q));
                    q1c0Var.N1("1", null, "CLASSIC", false);
                    q1c0Var.X0();
                    q1c0Var.n3();
                    w3c0 w3c0Var15 = (w3c0) q1c0Var.b;
                    if (w3c0Var15 != null && (binding2 = w3c0Var15.d.getBinding()) != null) {
                        binding2.t0.setVisibility(0);
                    }
                    w3c0 w3c0Var16 = (w3c0) q1c0Var.b;
                    if (w3c0Var16 != null && (binding = w3c0Var16.d.getBinding()) != null && (constraintLayout = binding.F) != null) {
                        constraintLayout.setBackground(context.getDrawable(R.drawable.card_waiting_v2));
                    }
                    if (q1c0Var.X0) {
                        String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("br") || lowerCase.equals("int") || lowerCase.equals("mx") || lowerCase.equals("za") || lowerCase.equals("gh")) {
                            q1c0Var.w0(q1c0Var.X0);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
