package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class k41 {
    public static final /* synthetic */ int a = 0;

    public static final i41 a(AssetsInfo assetsInfo) {
        assetsInfo.getClass();
        int i = assetsInfo.auditStatus;
        if (i == 0) {
            return i41.d.a;
        }
        switch (i) {
            case 11:
                return i41.a.a;
            case 12:
                return i41.c.a;
            case 13:
                return i41.b.a;
            default:
                return new i41.e();
        }
    }
}
