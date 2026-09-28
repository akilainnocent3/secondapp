package defpackage;

import android.os.Bundle;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class hv60 {
    public static final boolean a(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static final int b(String str, Bundle bundle) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Reader.READ_DONE) != Integer.MAX_VALUE) {
            return i;
        }
        s5b.a(str);
        throw null;
    }

    public static final Bundle c(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        s5b.a(str);
        throw null;
    }

    public static final String d(String str, Bundle bundle) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        s5b.a(str);
        throw null;
    }

    public static final String[] e(String str, Bundle bundle) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        s5b.a(str);
        throw null;
    }

    public static final boolean f(String str, Bundle bundle) {
        str.getClass();
        return a(str, bundle) && bundle.get(str) == null;
    }
}
