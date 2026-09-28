package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f3z<T> implements Comparator<T> {
    public <S extends T> f3z<S> a() {
        return new bp50(this);
    }
}
