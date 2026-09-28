package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lxc implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                j6b j6bVar = (j6b) obj;
                j6bVar.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", j6bVar);
                return zf80.b;
        }
    }
}
