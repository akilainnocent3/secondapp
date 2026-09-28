package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class nwo<T> extends Property<T, Integer> {
    public nwo(String str) {
        super(Integer.class, str);
    }

    public abstract void a(int i, Object obj);

    @Override // android.util.Property
    public final void set(Object obj, Integer num) {
        a(num.intValue(), obj);
    }
}
