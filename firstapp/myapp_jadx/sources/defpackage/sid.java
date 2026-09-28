package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sid implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        pid.i iVar = (pid.i) obj;
        pid.i iVar2 = (pid.i) obj2;
        boolean z = iVar.e;
        int i = iVar.y;
        Object objA = (z && iVar.v) ? pid.k : pid.k.a();
        iVar.f.getClass();
        return rl8.a.b(Integer.valueOf(iVar.z), Integer.valueOf(iVar2.z), objA).b(Integer.valueOf(i), Integer.valueOf(iVar2.y), objA).e();
    }
}
