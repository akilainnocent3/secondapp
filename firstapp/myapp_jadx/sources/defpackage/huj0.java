package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sportybet.feature.winning.domain.model.WinningShareData;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl", f = "WonPopupSharingManagerImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "generateWinningBitmap", v = 2)
public final class huj0 extends x1b {
    public WinningShareData a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ euj0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huj0(euj0 euj0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = euj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, this);
    }
}
