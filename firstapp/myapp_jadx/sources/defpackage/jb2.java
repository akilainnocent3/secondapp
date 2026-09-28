package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jb2 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                return l;
            default:
                t2q.b bVar = (t2q.b) obj;
                bVar.getClass();
                return Boolean.valueOf(bVar instanceof t2q.d);
        }
    }
}
