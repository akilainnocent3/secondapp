package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jw0 implements Function2 {
    public final /* synthetic */ n54.b a;

    public /* synthetic */ jw0(n54.b bVar) {
        this.a = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(this.a.a(0, ((Integer) obj).intValue()));
    }
}
