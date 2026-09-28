package androidx.work;

import android.content.Context;
import defpackage.jgt;
import defpackage.rvj0;
import defpackage.svj0;
import defpackage.zhn;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements zhn<rvj0> {
    public static final String a = jgt.g("WrkMgrInitializer");

    @Override // defpackage.zhn
    public final rvj0 create(Context context) {
        jgt.e().a(a, "Initializing WorkManager with default configuration.");
        a aVar = new a(new a.C0076a());
        context.getClass();
        svj0.d(context, aVar);
        svj0 svj0VarC = svj0.c(context);
        svj0VarC.getClass();
        return svj0VarC;
    }

    @Override // defpackage.zhn
    public final List<Class<? extends zhn<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
