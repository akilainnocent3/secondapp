package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nal0 implements Runnable {
    public final /* synthetic */ mnl0 a;

    public /* synthetic */ nal0(mnl0 mnl0Var) {
        this.a = mnl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final mnl0 mnl0Var = this.a;
            synchronized (mnl0Var) {
                try {
                    if (mnl0Var.a != 2) {
                        return;
                    }
                    if (mnl0Var.d.isEmpty()) {
                        mnl0Var.c();
                        return;
                    }
                    final csl0 csl0Var = (csl0) mnl0Var.d.poll();
                    mnl0Var.e.put(csl0Var.a, csl0Var);
                    mnl0Var.f.b.schedule(new Runnable() { // from class: ljl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mnl0 mnl0Var2 = mnl0Var;
                            int i = csl0Var.a;
                            synchronized (mnl0Var2) {
                                csl0 csl0Var2 = (csl0) mnl0Var2.e.get(i);
                                if (csl0Var2 != null) {
                                    Log.w("MessengerIpcClient", "Timing out request: " + i);
                                    mnl0Var2.e.remove(i);
                                    csl0Var2.c(new fsl0("Timed out waiting for response", null));
                                    mnl0Var2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", ACKxwYRsuWyGz.ZzdzQR.concat(String.valueOf(csl0Var)));
                    }
                    zsl0 zsl0Var = mnl0Var.f;
                    Messenger messenger = mnl0Var.b;
                    int i = csl0Var.c;
                    Context context = zsl0Var.a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = csl0Var.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", csl0Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", csl0Var.d);
                    messageObtain.setData(bundle);
                    try {
                        spl0 spl0Var = mnl0Var.c;
                        Messenger messenger2 = spl0Var.a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = spl0Var.b;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzdVar.a.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        mnl0Var.a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
