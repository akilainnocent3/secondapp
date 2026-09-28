package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xdk0 extends tdk0 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient wdk0 b;

    public abstract void e();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdk0) {
            ((xdk0) obj).e();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
