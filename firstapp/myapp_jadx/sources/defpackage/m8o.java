package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m8o implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ m8o(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((l8o.a) obj).a == this.a);
    }
}
