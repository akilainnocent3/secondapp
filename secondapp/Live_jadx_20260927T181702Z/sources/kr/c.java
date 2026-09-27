package kr;

import cs.j;
import dr.f1;
import dr.w2;
import ds.l;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.m;
import ur.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j(name = "TimersKt")
public final class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<TimerTask, w2> f102871b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, w2> lVar) {
            this.f102871b = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f102871b.invoke(this);
        }
    }

    @f
    public static final Timer a(String str, boolean z10, long j10, long j11, l<? super TimerTask, w2> action) {
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    @f
    public static final Timer b(String str, boolean z10, Date startAt, long j10, l<? super TimerTask, w2> action) {
        m0.p(startAt, "startAt");
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    public static /* synthetic */ Timer c(String str, boolean z10, long j10, long j11, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    public static /* synthetic */ Timer d(String str, boolean z10, Date startAt, long j10, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m0.p(startAt, "startAt");
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    @f
    public static final TimerTask e(Timer timer, long j10, long j11, l<? super TimerTask, w2> action) {
        m0.p(timer, "<this>");
        m0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10, j11);
        return aVar;
    }

    @f
    public static final TimerTask f(Timer timer, long j10, l<? super TimerTask, w2> action) {
        m0.p(timer, "<this>");
        m0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10);
        return aVar;
    }

    @f
    public static final TimerTask g(Timer timer, Date time, long j10, l<? super TimerTask, w2> action) {
        m0.p(timer, "<this>");
        m0.p(time, "time");
        m0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j10);
        return aVar;
    }

    @f
    public static final TimerTask h(Timer timer, Date time, l<? super TimerTask, w2> action) {
        m0.p(timer, "<this>");
        m0.p(time, "time");
        m0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    public static final TimerTask i(Timer timer, long j10, long j11, l<? super TimerTask, w2> action) {
        m0.p(timer, "<this>");
        m0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j10, j11);
        return aVar;
    }

    @f
    public static final TimerTask j(Timer timer, Date time, long j10, l<? super TimerTask, w2> action) {
        m0.p(timer, "<this>");
        m0.p(time, "time");
        m0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j10);
        return aVar;
    }

    @f1
    @oy.l
    public static final Timer k(@m String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }

    @f
    public static final Timer l(String str, boolean z10, long j10, long j11, l<? super TimerTask, w2> action) {
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    @f
    public static final Timer m(String str, boolean z10, Date startAt, long j10, l<? super TimerTask, w2> action) {
        m0.p(startAt, "startAt");
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    public static /* synthetic */ Timer n(String str, boolean z10, long j10, long j11, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    public static /* synthetic */ Timer o(String str, boolean z10, Date startAt, long j10, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m0.p(startAt, "startAt");
        m0.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    @f
    public static final TimerTask p(l<? super TimerTask, w2> action) {
        m0.p(action, "action");
        return new a(action);
    }
}
