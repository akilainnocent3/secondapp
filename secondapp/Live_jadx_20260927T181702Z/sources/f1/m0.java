package f1;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f82263c = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e1.b.AbstractBinderC0784b f82264b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends e1.b.AbstractBinderC0784b {
        public a() {
        }

        @Override // e1.b
        public void t1(@Nullable e1.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            m0.this.a(new l0(aVar));
        }
    }

    public abstract void a(@NonNull l0 l0Var);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.f82264b;
    }
}
