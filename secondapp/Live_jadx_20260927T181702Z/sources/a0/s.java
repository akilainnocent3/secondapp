package a0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f3298a;

    public s(@NonNull d.a aVar) {
        this.f3298a = aVar;
    }

    @Nullable
    public static s a(@Nullable IBinder iBinder) {
        d.a aVarN2 = iBinder == null ? null : d.a.b.N2(iBinder);
        if (aVarN2 == null) {
            return null;
        }
        return new s(aVarN2);
    }

    public void b(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.f3298a.D2(str, bundle);
    }
}
