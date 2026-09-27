package jv;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final String f100923a = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final String f100924b = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f100925c = "auto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f100926d = "on";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f100927e = "off";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f100928f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f100929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f100930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final AtomicLong f100931i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.equals(jv.w0.f100926d) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = qv.c1.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L2f
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L2f:
            r0 = r2
            goto L64
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = r1
            goto L64
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            jv.w0.f100929g = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = qv.c1.f(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            jv.w0.f100930h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            jv.w0.f100931i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.w0.<clinit>():void");
    }

    public static final boolean b() {
        return f100928f;
    }

    @oy.l
    public static final AtomicLong c() {
        return f100931i;
    }

    public static final boolean d() {
        return f100929g;
    }

    public static final boolean e() {
        return f100930h;
    }

    public static final void g() {
        f100931i.set(0L);
    }

    @dr.f1
    public static /* synthetic */ void f() {
    }

    @ur.f
    public static final void a(ds.a<Boolean> aVar) {
    }
}
