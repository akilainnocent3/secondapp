package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class hrz<K, V> extends onp<K, V, Pair<? extends K, ? extends V>> {
    public final sd80 c;

    public hrz(php<K> phpVar, php<V> phpVar2) {
        super(phpVar, phpVar2);
        pd80[] pd80VarArr = new pd80[0];
        if (StringsKt.U("kotlin.Pair")) {
            hb5.a("Blank serial names are prohibited");
            throw null;
        }
        eq7 eq7Var = new eq7("kotlin.Pair");
        eq7.a(eq7Var, "first", phpVar.getDescriptor());
        eq7.a(eq7Var, "second", phpVar2.getDescriptor());
        Unit unit = Unit.a;
        this.c = new sd80("kotlin.Pair", ebe0.a.a, eq7Var.c.size(), ay0.S(pd80VarArr), eq7Var);
    }

    @Override // defpackage.onp
    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return pair.a;
    }

    @Override // defpackage.onp
    public final Object b(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return pair.b;
    }

    @Override // defpackage.onp
    public final Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.c;
    }
}
