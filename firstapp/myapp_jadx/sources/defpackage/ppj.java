package defpackage;

import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.manager.gameplay.GameplayPayloadManager", f = "GameplayPayloadManager.kt", l = {r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "isUser", v = 1)
public final class ppj extends x1b {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rpj c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppj(rpj rpjVar, x1b x1bVar) {
        super(x1bVar);
        this.c = rpjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
