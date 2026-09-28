package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class gtb implements dtb {
    public static final a c = new a();
    public final njd<dtb> a;
    public final AtomicReference<dtb> b = new AtomicReference<>(null);

    public static final class a implements wex {
    }

    public gtb(njd<dtb> njdVar) {
        this.a = njdVar;
        ((q2z) njdVar).a(new njd.a() { // from class: etb
            @Override // njd.a
            public final void a(n730 n730Var) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                this.a.b.set((dtb) n730Var.get());
            }
        });
    }

    @Override // defpackage.dtb
    public final wex a(String str) {
        dtb dtbVar = this.b.get();
        return dtbVar == null ? c : dtbVar.a(str);
    }

    @Override // defpackage.dtb
    public final boolean b() {
        dtb dtbVar = this.b.get();
        return dtbVar != null && dtbVar.b();
    }

    @Override // defpackage.dtb
    public final void c(final String str, final long j, final tk1 tk1Var) {
        String strA = inm.a("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strA, null);
        }
        ((q2z) this.a).a(new njd.a() { // from class: ftb
            @Override // njd.a
            public final void a(n730 n730Var) {
                ((dtb) n730Var.get()).c(str, j, tk1Var);
            }
        });
    }

    @Override // defpackage.dtb
    public final boolean d(String str) {
        dtb dtbVar = this.b.get();
        return dtbVar != null && dtbVar.d(str);
    }
}
