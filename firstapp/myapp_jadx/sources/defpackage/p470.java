package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResult;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResultTimeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class p470 {
    public static final o470 a(NetworkScheduledFootballEventResult networkScheduledFootballEventResult, long j) {
        List list;
        Object next;
        Iterator it;
        Object next2;
        Object next3;
        networkScheduledFootballEventResult.getClass();
        String eventId = networkScheduledFootballEventResult.getEventId();
        String str = eventId == null ? "" : eventId;
        String finalScore = networkScheduledFootballEventResult.getFinalScore();
        String str2 = finalScore == null ? "" : finalScore;
        String resultSequence = networkScheduledFootballEventResult.getResultSequence();
        String str3 = resultSequence == null ? "" : resultSequence;
        long totalDurationMs = networkScheduledFootballEventResult.getTotalDurationMs() + j;
        List<NetworkScheduledFootballEventResultTimeline> timeline = networkScheduledFootballEventResult.getTimeline();
        if (timeline != null) {
            ArrayList arrayList = new ArrayList(l48.r(timeline, 10));
            Iterator it2 = timeline.iterator();
            while (it2.hasNext()) {
                NetworkScheduledFootballEventResultTimeline networkScheduledFootballEventResultTimeline = (NetworkScheduledFootballEventResultTimeline) it2.next();
                long startOffsetMs = networkScheduledFootballEventResultTimeline.getStartOffsetMs() + j;
                long durationMs = networkScheduledFootballEventResultTimeline.getDurationMs() + startOffsetMs;
                long j2 = durationMs - 1000;
                int segmentId = networkScheduledFootballEventResultTimeline.getSegmentId();
                t470.a aVar = t470.a;
                String type = networkScheduledFootballEventResultTimeline.getType();
                aVar.getClass();
                Iterator<T> it3 = t470.d.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    ((t470) next).getClass();
                } while (!"lottie".equalsIgnoreCase(type));
                t470 t470Var = (t470) next;
                r470.a aVar2 = r470.b;
                String action = networkScheduledFootballEventResultTimeline.getAction();
                aVar2.getClass();
                Iterator<T> it4 = r470.i.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        it = it2;
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    it = it2;
                    if (((r470) next2).a.equalsIgnoreCase(action)) {
                        break;
                    }
                    it2 = it;
                }
                r470 r470Var = (r470) next2;
                s470.a aVar3 = s470.b;
                String side = networkScheduledFootballEventResultTimeline.getSide();
                aVar3.getClass();
                Iterator<T> it5 = s470.f.iterator();
                do {
                    if (!it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!((s470) next3).a.equalsIgnoreCase(side));
                s470 s470Var = (s470) next3;
                String src = networkScheduledFootballEventResultTimeline.getSrc();
                arrayList.add(new q470(segmentId, startOffsetMs, durationMs, j2, t470Var, r470Var, s470Var, src == null ? "" : src));
                it2 = it;
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (list == null) {
            list = m2g.a;
        }
        return new o470(str, str2, str3, totalDurationMs, list);
    }
}
