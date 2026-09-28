package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.home.MainActivity;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class viu implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = MainActivity.m0;
        if (((lox) obj).equals(lox.a.a)) {
            final MainActivity mainActivity = this.a;
            rs1.a(new Runnable() { // from class: jju
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity mainActivity2 = mainActivity;
                    int i2 = MainActivity.m0;
                    try {
                        String strName = vox.c(mainActivity2).name();
                        mainActivity2.d0.log("NetworkType: " + strName);
                        List<String> listB = vox.b(mainActivity2);
                        mainActivity2.d0.log("DnsServers: " + listB);
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_FIREBASE);
                        aVar.a("networkType: %s, dnsServers: %s", strName, listB);
                    } catch (Throwable th) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_FIREBASE);
                        aVar2.o(th);
                    }
                }
            });
        }
    }
}
