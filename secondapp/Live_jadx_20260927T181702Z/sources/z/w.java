package z;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class w extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d.b f160234b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends c.d.b {
        public a() {
        }

        @Override // c.d
        public void F(@NonNull c.a aVar, @Nullable Bundle bundle) throws RemoteException {
            aVar.E2(bundle);
        }

        @Override // c.d
        public void x2(@NonNull c.a aVar, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            aVar.u(str, bundle);
        }
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.f160234b;
    }
}
