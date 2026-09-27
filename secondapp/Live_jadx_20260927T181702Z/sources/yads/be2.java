package yads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class be2 extends Exception implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147155c;

    static {
        new wq() { // from class: yads.wx3
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return new be2(bundle);
            }
        };
    }

    public be2(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    public static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, be2.class.getClassLoader());
            Throwable th2 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th2 == null ? new RemoteException(string2) : th2;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    public be2(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f147154b = i10;
        this.f147155c = j10;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
