package z;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import k.e0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public final class t implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f160232b = "EngagementSigsCallbkRmt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.c f160233a;

    public t(@NonNull c.c cVar) {
        this.f160233a = cVar;
    }

    @NonNull
    public static t a(@NonNull IBinder iBinder) {
        return new t(c.c.b.N2(iBinder));
    }

    @Override // z.s
    public void onGreatestScrollPercentageIncreased(@e0(from = 1, to = 100) int i10, @NonNull Bundle bundle) {
        try {
            this.f160233a.onGreatestScrollPercentageIncreased(i10, bundle);
        } catch (RemoteException unused) {
            Log.e(f160232b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // z.s
    public void onSessionEnded(boolean z10, @NonNull Bundle bundle) {
        try {
            this.f160233a.onSessionEnded(z10, bundle);
        } catch (RemoteException unused) {
            Log.e(f160232b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // z.s
    public void onVerticalScrollEvent(boolean z10, @NonNull Bundle bundle) {
        try {
            this.f160233a.onVerticalScrollEvent(z10, bundle);
        } catch (RemoteException unused) {
            Log.e(f160232b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
