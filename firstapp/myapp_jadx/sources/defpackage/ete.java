package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ete {
    public static final Class<? extends Object>[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof w5a0) {
            w5a0 w5a0Var = (w5a0) obj;
            if (w5a0Var.h() == epx.a || w5a0Var.h() == bbe0.b || w5a0Var.h() == gq40.b) {
                T value = w5a0Var.getValue();
                if (value == 0) {
                    return true;
                }
                return a(value);
            }
        } else if (!(obj instanceof haj) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
