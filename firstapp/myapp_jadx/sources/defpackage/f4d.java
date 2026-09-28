package defpackage;

import defpackage.csm;
import java.lang.Enum;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantViewModel", f = "DebugVariantViewModel.kt", l = {128}, m = "toReadoutState", v = 2)
public final class f4d<E extends Enum<E> & csm<E>> extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ y3d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4d(y3d y3dVar, x1b x1bVar) {
        super(x1bVar);
        this.b = y3dVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(null, this);
    }
}
