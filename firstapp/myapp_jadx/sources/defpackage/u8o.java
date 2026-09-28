package defpackage;

import android.os.SystemClock;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import kotlin.Unit;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class u8o implements Interceptor {
    public final rdd0 a;

    public u8o(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
    }

    public final void a(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            this.a.a(instantWinApiTrackingEvent, k00.d);
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.p(thA, "Failed to send instant win API response time tracking event", new Object[0]);
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Object bVar;
        Integer bizType;
        InstantWinApiTrackingEvent instantWinApiTrackingEventCreateOkrEvent;
        chain.getClass();
        Request request = chain.request();
        InstantWinApiTracking instantWinApiTracking = (InstantWinApiTracking) request.tag(InstantWinApiTracking.class);
        InstantWinBizTypeTag instantWinBizTypeTag = (InstantWinBizTypeTag) request.tag(InstantWinBizTypeTag.class);
        if (instantWinApiTracking == null && instantWinBizTypeTag == null) {
            return chain.proceed(request);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zi50.a aVar = zi50.b;
            bVar = chain.proceed(request);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        Response response = (Response) (bVar instanceof zi50.b ? null : bVar);
        boolean z = response != null && response.getIsSuccessful();
        String strEncodedPath = request.url().encodedPath();
        if (instantWinApiTracking == null || (bizType = instantWinApiTracking.getBizType()) == null) {
            bizType = instantWinBizTypeTag != null ? instantWinBizTypeTag.getBizType() : null;
        }
        a(new InstantWinApiTrackingEvent.CommonApiResponseTimeEvent(jElapsedRealtime2, strEncodedPath, bizType != null ? String.valueOf(bizType.intValue()) : null, z));
        if (instantWinApiTracking != null && (instantWinApiTrackingEventCreateOkrEvent = instantWinApiTracking.createOkrEvent(jElapsedRealtime2, z)) != null) {
            a(instantWinApiTrackingEventCreateOkrEvent);
        }
        uj50.b(bVar);
        return (Response) bVar;
    }
}
