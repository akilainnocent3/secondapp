package defpackage;

import android.os.Bundle;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class avk0 {
    public final Map a = Collections.synchronizedMap(new ox0());
    public int b = 0;
    public Bundle c;

    public final void a(String str, x9s x9sVar) {
        Map map = this.a;
        if (map.containsKey(str)) {
            hb5.a(tug.a("LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, x9sVar);
        if (this.b > 0) {
            new p5l0(Looper.getMainLooper()).post(new zrk0(this, x9sVar, str));
        }
    }

    public final void b(Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((x9s) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((x9s) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
