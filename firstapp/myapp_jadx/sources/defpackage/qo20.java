package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qo20 {
    public static final a a;

    static {
        a = dtp.b(Build.FINGERPRINT, "robolectric", Locale.ROOT) ? new a() : null;
    }

    public static final class a implements po20 {
        @Override // defpackage.po20
        public final void a(lo20.a aVar) {
        }
    }
}
