package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes6.dex */
public final class plf0 {
    public static final olf0 a(a aVar) {
        f8i.a aVar2 = (f8i.a) aVar.O(kna.k);
        mmd mmdVar = (mmd) aVar.O(kna.h);
        asr asrVar = (asr) aVar.O(kna.n);
        boolean zM = aVar.M(aVar2) | aVar.M(mmdVar) | aVar.d(asrVar.ordinal()) | aVar.d(8);
        Object objY = aVar.y();
        if (zM || objY == a.C0041a.a) {
            objY = new olf0(aVar2, mmdVar, asrVar);
            aVar.r(objY);
        }
        return (olf0) objY;
    }
}
