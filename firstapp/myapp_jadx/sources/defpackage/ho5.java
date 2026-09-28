package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.loader.music.CMSMusicLoader", f = "CMSMusicLoader.kt", l = {113}, m = "checkLongMusic", v = 1)
public final class ho5 extends x1b {
    public MediaPlayer a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mo5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho5(mo5 mo5Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mo5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
