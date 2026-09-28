package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g16 implements h16.a {
    @Override // h16.a
    public final int a(ArrayList arrayList) {
        wg1 wg1Var = h16.a;
        if (arrayList.contains(35)) {
            return 35;
        }
        if (arrayList.contains(256)) {
            return 256;
        }
        return arrayList.contains(4101) ? 4101 : 0;
    }
}
