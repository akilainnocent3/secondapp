package defpackage;

import android.widget.TextView;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jwb0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jwb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qq80 binding;
        qq80 binding2;
        qq80 binding3;
        w3c0 w3c0Var;
        qq80 binding4;
        qq80 binding5;
        CharSequence text;
        qq80 binding6;
        CharSequence text2;
        w3c0 w3c0Var2;
        qq80 binding7;
        qq80 binding8;
        CharSequence text3;
        w3c0 w3c0Var3;
        qq80 binding9;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                q1c0 q1c0Var = (q1c0) obj;
                String str = "0.00";
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                if (w3c0Var4 != null && w3c0Var4.R.getVisibility() == 0) {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding8 = w3c0Var5.e.getBinding()) != null && (text3 = binding8.G.getText()) != null && text3.equals("0") && (w3c0Var3 = (w3c0) q1c0Var.b) != null && (binding9 = w3c0Var3.e.getBinding()) != null) {
                        binding9.G.setText("1.01");
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding6 = w3c0Var6.d.getBinding()) != null && (text2 = binding6.G.getText()) != null && text2.equals("0") && (w3c0Var2 = (w3c0) q1c0Var.b) != null && (binding7 = w3c0Var2.d.getBinding()) != null) {
                        binding7.G.setText("1.01");
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null) {
                        w3c0Var7.d.setBetDone();
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (c.l((w3c0Var8 == null || (binding5 = w3c0Var8.d.getBinding()) == null || (text = binding5.b.getText()) == null) ? null : text.toString(), "0", false) && (w3c0Var = (w3c0) q1c0Var.b) != null && (binding4 = w3c0Var.d.getBinding()) != null) {
                        TextView textView = binding4.b;
                        try {
                            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(q1c0Var.G.get(0).getMinAmount());
                            str2.getClass();
                            str = str2;
                        } catch (Exception unused) {
                        }
                        textView.setText(str);
                    }
                    w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                    if (w3c0Var9 != null && (binding3 = w3c0Var9.d.getBinding()) != null) {
                        binding3.i.setEnabled(false);
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding2 = w3c0Var10.e.getBinding()) != null) {
                        binding2.H.setEnabled(false);
                    }
                    w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                    if (w3c0Var11 != null && (binding = w3c0Var11.d.getBinding()) != null) {
                        binding.H.setEnabled(false);
                    }
                }
                q1c0Var.s1 = q1c0Var.u1;
                w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                if (w3c0Var12 != null) {
                    w3c0Var12.R.setVisibility(0);
                }
                break;
            default:
                jzf0 jzf0Var = (jzf0) obj;
                jzf0Var.b0.invoke(Boolean.valueOf(!jzf0Var.a0));
                break;
        }
        return Unit.a;
    }
}
