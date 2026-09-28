package defpackage;

import android.app.Application;
import android.provider.Settings;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes4.dex */
public final class yeh0 implements xeh0 {
    public final Application a;

    public yeh0(Application application) {
        this.a = application;
    }

    @Override // defpackage.xeh0
    public final Integer a() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        boolean z = bVar instanceof zi50.b;
        if (!z) {
            itf0.a aVar3 = itf0.a;
            aVar3.g(yv0.a(aVar3, MyLog.TAG_COMMON, "Device uniqueId obtained: ", (String) bVar), new Object[0]);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_COMMON);
            aVar4.p(thA, "Obtain uniqueId with failure.", new Object[0]);
        }
        if (z) {
            bVar = null;
        }
        String str = (String) bVar;
        if (str == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (('a' <= cCharAt && cCharAt < '{') || ('A' <= cCharAt && cCharAt < '[')) {
                i = (cCharAt - '`') + i;
            }
        }
        return Integer.valueOf(i % 100);
    }
}
