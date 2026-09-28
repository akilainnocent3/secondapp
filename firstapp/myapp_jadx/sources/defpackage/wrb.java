package defpackage;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class wrb implements ch80 {
    public final toc a;
    public final vrb b;

    public wrb(toc tocVar, xkh xkhVar) {
        this.a = tocVar;
        this.b = new vrb(xkhVar);
    }

    @Override // defpackage.ch80
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.ch80
    public final void b(ch80.b bVar) {
        String str = "App Quality Sessions session changed: " + bVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        vrb vrbVar = this.b;
        String str2 = bVar.a;
        synchronized (vrbVar) {
            if (!Objects.equals(vrbVar.c, str2)) {
                vrb.a(vrbVar.a, vrbVar.b, str2);
                vrbVar.c = str2;
            }
        }
    }

    @Override // defpackage.ch80
    public final void c() {
        ch80.a aVar = ch80.a.a;
    }

    public final void d(String str) {
        vrb vrbVar = this.b;
        synchronized (vrbVar) {
            if (!Objects.equals(vrbVar.b, str)) {
                vrb.a(vrbVar.a, str, vrbVar.c);
                vrbVar.b = str;
            }
        }
    }
}
