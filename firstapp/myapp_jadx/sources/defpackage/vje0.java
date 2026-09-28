package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vje0<Key, Value> implements Function0<wqz<Key, Value>> {
    public final k5b a;
    public final ypc b;

    public vje0(k5b k5bVar, ypc ypcVar) {
        this.a = k5bVar;
        this.b = ypcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.b.invoke();
    }
}
