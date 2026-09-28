package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bo extends ag {
    final /* synthetic */ bp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(bp bpVar, String str, long j) {
        super(str, j);
        Objects.requireNonNull(bpVar);
        this.a = bpVar;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final Task b(Activity activity, Bundle bundle) {
        bp bpVar = this.a;
        bundle.putLong("cloud.prj", bpVar.e);
        return bpVar.c.c(activity, bundle);
    }
}
