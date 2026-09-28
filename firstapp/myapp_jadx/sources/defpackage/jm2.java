package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class jm2 {
    public static final /* synthetic */ int a = 0;

    public static Object a(Object obj, Class cls) {
        if (obj instanceof h1k) {
            return cls.cast(obj);
        }
        if (obj instanceof i1k) {
            return a(((i1k) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + h1k.class + " or " + i1k.class);
    }

    public static final boolean b(ijf0 ijf0Var) {
        ijf0Var.getClass();
        String str = ijf0Var.a.b;
        for (int i = 0; i < str.length(); i++) {
            if (!StringsKt.N(".0123456789", str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
