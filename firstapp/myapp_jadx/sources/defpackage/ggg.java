package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class ggg extends BroadcastReceiver {
    public final /* synthetic */ fgg a;

    public ggg(fgg fggVar) {
        this.a = fggVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zBooleanValue;
        intent.getClass();
        boolean zL = c.l(intent.getAction(), "musicOnOff", false);
        fgg fggVar = this.a;
        if (zL) {
            fggVar.P0(intent.getBooleanExtra("state-change", false));
            fggVar.E0();
            return;
        }
        if (c.l(intent.getAction(), "soundOnOff", false)) {
            fggVar.Q0(intent.getBooleanExtra("state-change", false));
            fggVar.E0();
            return;
        }
        if (c.l(intent.getAction(), "soundOn", false)) {
            SharedPreferences sharedPreferences = fggVar.X;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("EVEN_ODD_MUSIC", true)) : null;
            if (boolValueOf == null || !(zBooleanValue = boolValueOf.booleanValue())) {
                return;
            }
            fggVar.P0(zBooleanValue);
            fggVar.E0();
            return;
        }
        if (c.l(intent.getAction(), "fbg_revert", false)) {
            double doubleExtra = intent.getDoubleExtra("betAmount", 0.0d);
            bo1 bo1Var = (bo1) fggVar.a;
            if (bo1Var != null) {
                bo1Var.z1(Double.valueOf(doubleExtra));
            }
            bo1 bo1Var2 = (bo1) fggVar.a;
            bo1.b bVarX1 = bo1Var2 != null ? bo1Var2.x1() : null;
            jhg jhgVar = (jhg) fggVar.b;
            if (jhgVar != null) {
                jhgVar.c.setBetAmount(bVarX1 != null ? Double.valueOf(bVarX1.a) : null, fggVar.W);
            }
            jhg jhgVar2 = (jhg) fggVar.b;
            if (jhgVar2 != null) {
                jhgVar2.i.setBetAmount(bVarX1 != null ? bVarX1.a : 0.0d, fggVar.W);
            }
            bo1 bo1Var3 = (bo1) fggVar.a;
            if (bo1Var3 != null) {
                bo1Var3.z1(bVarX1 != null ? Double.valueOf(bVarX1.a) : null);
            }
            bo1 bo1Var4 = (bo1) fggVar.a;
            if (bo1Var4 != null) {
                bo1Var4.A1(null);
            }
        }
    }
}
