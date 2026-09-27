package c7;

import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class h {
    public static int a(j jVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = jVar.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = jVar.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || jVar.getEventTime(nextEventTimeIndex + (-1)) != j10) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    public static void b(j jVar, int i10, x4.q<d> qVar) {
        long eventTime = jVar.getEventTime(i10);
        List<w4.a> cues = jVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i10 == jVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = jVar.getEventTime(i10 + 1) - jVar.getEventTime(i10);
        if (eventTime2 > 0) {
            qVar.accept(new d(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void c(j jVar, s.b bVar, x4.q<d> qVar) {
        boolean z10;
        int iA = a(jVar, bVar.f22544a);
        if (bVar.f22544a == -9223372036854775807L || iA >= jVar.getEventTimeCount()) {
            z10 = false;
        } else {
            List<w4.a> cues = jVar.getCues(bVar.f22544a);
            long eventTime = jVar.getEventTime(iA);
            if (cues.isEmpty()) {
                z10 = false;
            } else {
                long j10 = bVar.f22544a;
                if (j10 < eventTime) {
                    qVar.accept(new d(cues, j10, eventTime - j10));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iA; i10 < jVar.getEventTimeCount(); i10++) {
            b(jVar, i10, qVar);
        }
        if (bVar.f22545b) {
            if (z10) {
                iA--;
            }
            for (int i11 = 0; i11 < iA; i11++) {
                b(jVar, i11, qVar);
            }
            if (z10) {
                qVar.accept(new d(jVar.getCues(bVar.f22544a), jVar.getEventTime(iA), bVar.f22544a - jVar.getEventTime(iA)));
            }
        }
    }
}
