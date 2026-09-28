package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffDialogFragment", f = "InstantVirtualShowOffDialogFragment.kt", l = {361}, m = "saveBitmapToInternalStorage", v = 2)
public final class e6o extends x1b {
    public File a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q5o c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6o(q5o q5oVar, x1b x1bVar) {
        super(x1bVar);
        this.c = q5oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.r0(null, null, null, this);
    }
}
