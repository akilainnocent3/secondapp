package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class sfx {
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    public sfx(ifx ifxVar, int i) {
        this.a = ifxVar.f;
        this.b = i;
        lfx lfxVar = ifxVar.v;
        this.c = lfxVar.a();
        o2g.a.getClass();
        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.d = bundleA;
        lfxVar.h.b(bundleA);
    }

    public sfx(Bundle bundle) {
        bundle.getClass();
        bundle.getClass();
        this.a = hv60.d("nav-entry-state:id", bundle);
        this.b = hv60.b("nav-entry-state:destination-id", bundle);
        this.c = hv60.c("nav-entry-state:args", bundle);
        this.d = hv60.c("nav-entry-state:saved-state", bundle);
    }
}
