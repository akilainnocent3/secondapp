package sg.bigo.ads.controller.f;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.d.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f134283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<InterfaceC1366a> f134284b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.controller.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1366a {
        void a(boolean z10);
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        boolean zB = sg.bigo.ads.common.aa.c.b(context);
        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(zB)));
        synchronized (this.f134284b) {
            try {
                for (InterfaceC1366a interfaceC1366a : this.f134284b) {
                    if (interfaceC1366a != null) {
                        interfaceC1366a.a(zB);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void a(Context context, @Nullable InterfaceC1366a interfaceC1366a) {
        try {
            if (f134283a == null) {
                f134283a = new a();
                sg.bigo.ads.common.d.a.a().a(context, f134283a);
            }
            synchronized (f134283a.f134284b) {
                if (interfaceC1366a != null) {
                    try {
                        f134283a.f134284b.add(interfaceC1366a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
