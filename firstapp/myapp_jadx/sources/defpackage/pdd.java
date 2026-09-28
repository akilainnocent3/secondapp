package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pdd {
    public boolean c;
    public float e;
    public int a = -1;
    public final duw<gyr.b> b = new duw<>(new gyr.b[16]);
    public int d = -1;

    public static int a(cvr cvrVar, boolean z) {
        return z ? ((nur) CollectionsKt.b0(cvrVar.k())).getIndex() + 1 : ((nur) CollectionsKt.T(cvrVar.k())).getIndex() - 1;
    }

    public static int b(cvr cvrVar, boolean z) {
        if (z) {
            nur nurVar = (nur) CollectionsKt.b0(cvrVar.k());
            return (cvrVar.a() == i3z.a ? nurVar.g() : nurVar.i()) + 1;
        }
        nur nurVar2 = (nur) CollectionsKt.T(cvrVar.k());
        return (cvrVar.a() == i3z.a ? nurVar2.g() : nurVar2.i()) - 1;
    }
}
