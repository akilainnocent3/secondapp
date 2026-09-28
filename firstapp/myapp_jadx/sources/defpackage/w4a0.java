package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "animateDecay")
public final class w4a0 extends x1b {
    public float a;
    public aj0 b;
    public aq40 c;
    public /* synthetic */ Object d;
    public int e;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return ssi.b(null, 0.0f, null, null, null, this);
    }
}
