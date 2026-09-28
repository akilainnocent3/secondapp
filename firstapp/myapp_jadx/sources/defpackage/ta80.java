package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ta80 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends qlr implements Function0<T> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(sa80 sa80Var, ob80<T> ob80Var) {
        T t = (T) sa80Var.a.d(ob80Var);
        return t == null ? a.a.invoke() : t;
    }
}
