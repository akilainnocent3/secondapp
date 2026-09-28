package defpackage;

import androidx.compose.runtime.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class una<T> extends d<T> {
    public final vna<T> b;

    public una(Function1<? super xma, ? extends T> function1) {
        super(new tna());
        this.b = new vna<>(function1);
    }

    @Override // androidx.compose.runtime.d
    public final j730<T> a(T t) {
        return new j730<>(this, t, t == null, null, true);
    }

    @Override // androidx.compose.runtime.d
    public final avh0 b() {
        return this.b;
    }
}
