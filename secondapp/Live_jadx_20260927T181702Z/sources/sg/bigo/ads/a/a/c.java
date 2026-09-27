package sg.bigo.ads.a.a;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import z.i;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<d> f130686a;

    public c(d dVar) {
        this.f130686a = new WeakReference<>(dVar);
    }

    @Override // z.i
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull z.d dVar) {
        d dVar2 = this.f130686a.get();
        if (dVar2 != null) {
            dVar2.a(dVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f130686a.get();
        if (dVar != null) {
            dVar.b();
        }
    }
}
