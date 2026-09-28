package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes8.dex */
public final class nqa0 {
    public static final ek1 a = ek1.a(1, 10, "traceId");
    public static final ek1 b = ek1.a(2, 18, "spanId");
    public static final ek1 c = ek1.a(3, 26, "traceState");
    public static final ek1 d = ek1.a(4, 34, "parentSpanId");
    public static final ek1 e = ek1.a(16, 133, "flags");
    public static final ek1 f = ek1.a(5, 42, "name");
    public static final ek1 g = ek1.a(6, 48, "kind");
    public static final ek1 h = ek1.a(7, 57, "startTimeUnixNano");
    public static final ek1 i = ek1.a(8, 65, "endTimeUnixNano");
    public static final ek1 j = ek1.a(9, 74, "attributes");
    public static final ek1 k = ek1.a(10, 80, "droppedAttributesCount");
    public static final ek1 l = ek1.a(11, 90, "events");
    public static final ek1 m = ek1.a(12, 96, "droppedEventsCount");
    public static final ek1 n = ek1.a(13, 106, "links");
    public static final ek1 o = ek1.a(14, 112, "droppedLinksCount");
    public static final ek1 p = ek1.a(15, 122, AnalyticsParam.EVENT_STATUS);

    public static final class a {
        public static final ek1 a = ek1.a(1, 9, "timeUnixNano");
        public static final ek1 b = ek1.a(2, 18, yFmFZvuWxAYfEj.fTtI);
        public static final ek1 c = ek1.a(3, 26, TEFcJcMqR.EVJ);
        public static final ek1 d = ek1.a(4, 32, "droppedAttributesCount");
    }

    public static final class b {
        public static final ek1 a = ek1.a(1, 10, "traceId");
        public static final ek1 b = ek1.a(2, 18, "spanId");
        public static final ek1 c = ek1.a(3, 26, "traceState");
        public static final ek1 d = ek1.a(4, 34, "attributes");
        public static final ek1 e = ek1.a(5, 40, "droppedAttributesCount");
        public static final ek1 f = ek1.a(6, 53, "flags");
    }

    public static final class c {
        public static final dk1 a = new dk1(0, "SPAN_KIND_UNSPECIFIED");
        public static final dk1 b = new dk1(1, "SPAN_KIND_INTERNAL");
        public static final dk1 c = new dk1(2, "SPAN_KIND_SERVER");
        public static final dk1 d = new dk1(3, "SPAN_KIND_CLIENT");
        public static final dk1 e = new dk1(4, "SPAN_KIND_PRODUCER");
        public static final dk1 f = new dk1(5, "SPAN_KIND_CONSUMER");
    }
}
