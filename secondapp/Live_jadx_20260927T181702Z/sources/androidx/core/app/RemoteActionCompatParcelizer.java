package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import k.y0;
import w9.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e eVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f9194a = (IconCompat) eVar.h0(remoteActionCompat.f9194a, 1);
        remoteActionCompat.f9195b = eVar.w(remoteActionCompat.f9195b, 2);
        remoteActionCompat.f9196c = eVar.w(remoteActionCompat.f9196c, 3);
        remoteActionCompat.f9197d = (PendingIntent) eVar.W(remoteActionCompat.f9197d, 4);
        remoteActionCompat.f9198e = eVar.m(remoteActionCompat.f9198e, 5);
        remoteActionCompat.f9199f = eVar.m(remoteActionCompat.f9199f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e eVar) {
        eVar.j0(false, false);
        eVar.m1(remoteActionCompat.f9194a, 1);
        eVar.z0(remoteActionCompat.f9195b, 2);
        eVar.z0(remoteActionCompat.f9196c, 3);
        eVar.X0(remoteActionCompat.f9197d, 4);
        eVar.n0(remoteActionCompat.f9198e, 5);
        eVar.n0(remoteActionCompat.f9199f, 6);
    }
}
