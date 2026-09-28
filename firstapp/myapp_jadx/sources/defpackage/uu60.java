package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uu60 extends kni0 {
    public final Bundle b;
    public final LinkedHashMap c;

    public uu60(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.b = bundle;
        this.c = linkedHashMap;
    }

    @Override // defpackage.kni0
    public final boolean f(String str) {
        str.getClass();
        Bundle bundle = this.b;
        bundle.getClass();
        return hv60.a(str, bundle);
    }

    @Override // defpackage.kni0
    public final Object h(String str) {
        str.getClass();
        djx djxVar = (djx) this.c.get(str);
        if (djxVar != null) {
            return djxVar.a(str, this.b);
        }
        return null;
    }
}
