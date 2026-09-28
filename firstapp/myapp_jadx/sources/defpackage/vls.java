package defpackage;

import androidx.media3.common.a;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes.dex */
public final class vls implements j00 {
    @Override // defpackage.j00
    public final void l(j00.a aVar, a aVar2, i5d i5dVar) {
        aVar2.getClass();
        itf0.a aVar3 = itf0.a;
        aVar3.q(MyLog.TAG_SPORTY_TV);
        aVar3.a("onVideoInputFormatChanged, format:%s, decoderReuseEvaluation:%s", aVar2, i5dVar);
    }

    @Override // defpackage.j00
    public final void o(j00.a aVar, int i, long j) {
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_SPORTY_TV);
        aVar2.a("onDroppedVideoFrames, droppedFrames:%s, elapsedMs:%s", Integer.valueOf(i), Long.valueOf(j));
    }
}
