package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ob80<T> {
    public final String a;
    public final Function2<T, T, T> b;
    public final boolean c;

    public ob80() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ob80(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ ob80(String str) {
        this(str, nb80.a);
    }

    public ob80(String str, int i) {
        this(str);
        this.c = true;
    }

    public ob80(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
