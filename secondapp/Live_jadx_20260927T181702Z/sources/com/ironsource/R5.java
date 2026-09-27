package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class R5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f59973e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f59974a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f59975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4429o f59976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4611yb f59977d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4429o interfaceC4429o = R5.this.f59976c;
            if (interfaceC4429o != null) {
                interfaceC4429o.a();
            }
        }
    }

    public R5(int i10, InterfaceC4429o interfaceC4429o) {
        this.f59976c = interfaceC4429o;
        this.f59975b = i10;
    }

    public boolean b() {
        return this.f59975b > 0;
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f59975b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f59976c.a();
                return;
            }
            a();
            this.f59977d = new C4611yb(millis, this.f59974a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public void a() {
        if (!b() || this.f59977d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f59977d.e();
        this.f59977d = null;
    }
}
