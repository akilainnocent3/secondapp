package cm;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import sj.q;
import yl.h0;
import yl.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cr.f
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f24894c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final o f24895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final o f24896b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @oy.l
        public final j a() {
            return ((com.google.firebase.sessions.b) q.c(sj.d.f135357a).l(com.google.firebase.sessions.b.class)).a();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @rr.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {androidx.constraintlayout.widget.g.S1, 99}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    public static final class b extends rr.d {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f24897s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f24898t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24900v;

        public b(or.f<? super b> fVar) {
            super(fVar);
        }

        @Override // rr.a
        @oy.m
        public final Object invokeSuspend(@oy.l Object obj) {
            this.f24898t = obj;
            this.f24900v |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    @cr.a
    public j(@oy.l @v o localOverrideSettings, @oy.l @h0 o remoteSettings) {
        m0.p(localOverrideSettings, "localOverrideSettings");
        m0.p(remoteSettings, "remoteSettings");
        this.f24895a = localOverrideSettings;
        this.f24896b = remoteSettings;
    }

    public final double a() {
        Double dA = this.f24895a.a();
        if (dA != null) {
            double dDoubleValue = dA.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dA2 = this.f24896b.a();
        if (dA2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dA2.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        ev.h hVarC = this.f24895a.c();
        if (hVarC != null) {
            long jK0 = hVarC.k0();
            if (e(jK0)) {
                return jK0;
            }
        }
        ev.h hVarC2 = this.f24896b.c();
        if (hVarC2 != null) {
            long jK1 = hVarC2.k0();
            if (e(jK1)) {
                return jK1;
            }
        }
        ev.h.a aVar = ev.h.f81657c;
        return ev.j.w(30, ev.k.MINUTES);
    }

    public final boolean c() {
        Boolean boolB = this.f24895a.b();
        if (boolB != null) {
            return boolB.booleanValue();
        }
        Boolean boolB2 = this.f24896b.b();
        if (boolB2 != null) {
            return boolB2.booleanValue();
        }
        return true;
    }

    public final boolean d(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final boolean e(long j10) {
        return ev.h.R(j10) && ev.h.M(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.d(r0) == r1) goto L22;
     */
    @oy.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@oy.l or.f<? super dr.w2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cm.j.b
            if (r0 == 0) goto L13
            r0 = r6
            cm.j$b r0 = (cm.j.b) r0
            int r1 = r0.f24900v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24900v = r1
            goto L18
        L13:
            cm.j$b r0 = new cm.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24898t
            java.lang.Object r1 = qr.d.l()
            int r2 = r0.f24900v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dr.j1.n(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f24897s
            cm.j r2 = (cm.j) r2
            dr.j1.n(r6)
            goto L4d
        L3c:
            dr.j1.n(r6)
            cm.o r6 = r5.f24895a
            r0.f24897s = r5
            r0.f24900v = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            cm.o r6 = r2.f24896b
            r2 = 0
            r0.f24897s = r2
            r0.f24900v = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            dr.w2 r6 = dr.w2.f79517a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.j.f(or.f):java.lang.Object");
    }
}
