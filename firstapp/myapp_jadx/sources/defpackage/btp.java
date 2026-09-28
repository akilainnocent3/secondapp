package defpackage;

import com.sporty.android.core.model.patron.DocumentAuditStatus;

/* JADX INFO: loaded from: classes6.dex */
public final class btp {
    public static final zsp a(int i, int i2, String str, String str2) {
        DocumentAuditStatus documentAuditStatus = DocumentAuditStatus.SUBMITTED;
        if (i2 == documentAuditStatus.getValue() && i == 325) {
            return new zsp(zsp.a.v, 6);
        }
        if (i2 == documentAuditStatus.getValue() && i == 310) {
            return new zsp(zsp.a.d, 6);
        }
        DocumentAuditStatus documentAuditStatus2 = DocumentAuditStatus.REJECTED;
        if (i2 == documentAuditStatus2.getValue() && i == 310) {
            return new zsp(zsp.a.i, str, str2);
        }
        if (i == 320) {
            return new zsp(zsp.a.b, 6);
        }
        if (i2 == documentAuditStatus.getValue()) {
            return new zsp(zsp.a.c, 6);
        }
        if (i2 == documentAuditStatus2.getValue()) {
            return new zsp(zsp.a.e, str, str2);
        }
        if (i == 310) {
            return new zsp(zsp.a.b, 6);
        }
        return i == 325 ? new zsp(zsp.a.f, 6) : new zsp(null, 7);
    }
}
