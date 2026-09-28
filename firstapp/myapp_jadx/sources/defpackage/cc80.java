package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX INFO: loaded from: classes8.dex */
public final class cc80 {
    public static final int a = zqe0.b(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final toe0 b = new toe0("PERMIT");
    public static final toe0 c = new toe0("TAKEN");
    public static final toe0 d = new toe0("BROKEN");
    public static final toe0 e = new toe0(PBBetHistoryItemDTO.STATUS_CANCELLED);
    public static final int f = zqe0.b(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    public static bc80 a(int i) {
        return new bc80(i, 0);
    }
}
