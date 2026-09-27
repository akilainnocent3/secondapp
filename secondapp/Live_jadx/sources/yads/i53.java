package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f150439b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f150440a;

    public i53(Handler handler) {
        this.f150440a = handler;
    }

    public final h53 a(int i10, Object obj) {
        h53 h53VarA = a();
        h53VarA.f149941a = this.f150440a.obtainMessage(i10, obj);
        return h53VarA;
    }

    public static h53 a() {
        h53 h53Var;
        ArrayList arrayList = f150439b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    h53Var = new h53();
                } else {
                    h53Var = (h53) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h53Var;
    }
}
