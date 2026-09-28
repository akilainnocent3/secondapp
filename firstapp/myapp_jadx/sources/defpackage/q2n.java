package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.animation.IbMatchTrackerAnimator", f = "IbMatchTrackerAnimator.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 43, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 61, 67, 75, 81, 86}, m = "playFullMatch", v = 2)
public final class q2n extends x1b {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ x2n v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2n(x2n x2nVar, x1b x1bVar) {
        super(x1bVar);
        this.v = x2nVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(0, 0, this, null, null);
    }
}
