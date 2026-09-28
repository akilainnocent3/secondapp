package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.bj50;

/* JADX INFO: loaded from: classes4.dex */
public final class gik0<R extends bj50> extends BasePendingResult<R> {
    public final Status k;

    public gik0(Status status) {
        super(null);
        this.k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R b(Status status) {
        return this.k;
    }
}
