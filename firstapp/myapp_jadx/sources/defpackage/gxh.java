package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxh<T> extends Property<T, Float> {
    public gxh(String str) {
        super(Float.class, str);
    }

    public abstract void a(T t, float f);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        a(obj, f.floatValue());
    }
}
