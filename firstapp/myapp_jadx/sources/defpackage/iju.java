package defpackage;

import android.content.Intent;
import com.sportybet.android.home.MainActivity;
import com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iju {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ t2k0 b;
    public final /* synthetic */ vak0 c;

    public /* synthetic */ iju(MainActivity mainActivity, t2k0 t2k0Var, vak0 vak0Var) {
        this.a = mainActivity;
        this.b = t2k0Var;
        this.c = vak0Var;
    }

    public final void a() {
        wae waeVar = this.c.d;
        int i = MainActivity.m0;
        MainActivity mainActivity = this.a;
        if (this.b != null) {
            mainActivity.U.a(s2k0.q.a, k00.d);
            int i2 = WorldCupPassActivity.e;
            Intent intent = new Intent(mainActivity, (Class<?>) WorldCupPassActivity.class);
            intent.putExtra("source", "za_register_success");
            mainActivity.startActivity(intent);
            return;
        }
        if (waeVar == wae.DEPOSIT) {
            mainActivity.I.S.a(ts40.a0.a, k00.c);
            oku okuVar = mainActivity.I;
            ej5.c(okuVar.Y, null, null, new flu(null, okuVar), 3);
            rdd0 rdd0Var = mainActivity.U;
            ts40.b bVar = new ts40.b(0);
            k00 k00Var = k00.d;
            rdd0Var.a(bVar, k00Var);
            mainActivity.U.a(new ts40.q("click"), k00Var);
        }
        sh8.c().e(o7d.a(waeVar));
    }
}
