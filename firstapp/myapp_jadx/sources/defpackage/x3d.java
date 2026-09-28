package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x3d implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ x3d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                y3d.b bVar = (y3d.b) obj;
                y3d.b.a aVar = (y3d.b.a) obj2;
                bVar.getClass();
                aVar.getClass();
                return y3d.b.a(bVar, null, aVar, 1);
            default:
                ((Integer) obj2).intValue();
                return new s7l(qvr.a(1));
        }
    }
}
