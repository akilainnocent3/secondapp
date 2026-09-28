package defpackage;

import androidx.work.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {97}, m = "setupAndRunConstraintTrackingWork")
public final class axa extends x1b {
    public ConstraintTrackingWorker a;
    public d b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ConstraintTrackingWorker d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa(ConstraintTrackingWorker constraintTrackingWorker, x1b x1bVar) {
        super(x1bVar);
        this.d = constraintTrackingWorker;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
