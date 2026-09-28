package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbg;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class wnl0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ ynl0 d;

    public wnl0(ynl0 ynl0Var, String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = ynl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        iol0 iol0Var = this.d.a;
        yol0 yol0VarK0 = iol0Var.k0();
        iol0Var.e().getClass();
        zzbg zzbgVarJ = yol0VarK0.J(this.b, this.c, StompClient.DEFAULT_ACK, System.currentTimeMillis(), false);
        hm20.h(zzbgVarJ);
        iol0Var.h(zzbgVarJ, this.a);
    }
}
