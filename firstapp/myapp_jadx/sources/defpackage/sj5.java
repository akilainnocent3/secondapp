package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.core.model.MyLog;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class sj5 {
    @fae
    public static final <T> T a(Bundle bundle, String str, Class<T> cls) {
        Parcelable parcelable;
        bundle.getClass();
        try {
            zi50.a aVar = zi50.b;
            parcelable = Build.VERSION.SDK_INT >= 33 ? (T) bundle.getParcelable(str, cls) : bundle.getParcelable(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            parcelable = (T) new zi50.b(th);
        }
        Throwable thA = zi50.a(parcelable);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.o(thA);
        }
        if (parcelable instanceof zi50.b) {
            return null;
        }
        return (T) parcelable;
    }

    @fae
    public static final <T extends Serializable> T b(Bundle bundle, String str, Class<T> cls) {
        bundle.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getSerializable(str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (t != null) {
            return t;
        }
        return null;
    }
}
