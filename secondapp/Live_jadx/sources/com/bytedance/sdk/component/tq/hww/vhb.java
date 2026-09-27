package com.bytedance.sdk.component.tq.hww;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vhb implements Cloneable {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public long f35080hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public TimeUnit f35081hv;
    public List<ok> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public TimeUnit f35082sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public long f35083tq;
    public TimeUnit vgm;
    public long vy;

    public vhb(hww hwwVar) {
        this.f35083tq = hwwVar.f35087tq;
        this.vy = hwwVar.vy;
        this.f35080hu = hwwVar.f35084hu;
        List<ok> list = hwwVar.hww;
        this.f35082sd = hwwVar.f35086sd;
        this.f35081hv = hwwVar.f35085hv;
        this.vgm = hwwVar.vgm;
        this.hww = list;
    }

    public abstract tq hww(ny nyVar);

    public abstract vy hww();

    public hww tq() {
        return new hww(this);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        public long f35084hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        public TimeUnit f35085hv;
        public final List<ok> hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public TimeUnit f35086sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public long f35087tq;
        public TimeUnit vgm;
        public long vy;

        public hww() {
            this.hww = new ArrayList();
            this.f35087tq = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f35086sd = timeUnit;
            this.vy = 10000L;
            this.f35085hv = timeUnit;
            this.f35084hu = 10000L;
            this.vgm = timeUnit;
        }

        public hww hww(long j10, TimeUnit timeUnit) {
            this.f35087tq = j10;
            this.f35086sd = timeUnit;
            return this;
        }

        public hww sd(long j10, TimeUnit timeUnit) {
            this.f35084hu = j10;
            this.vgm = timeUnit;
            return this;
        }

        public hww tq(long j10, TimeUnit timeUnit) {
            this.vy = j10;
            this.f35085hv = timeUnit;
            return this;
        }

        public hww hww(ok okVar) {
            this.hww.add(okVar);
            return this;
        }

        public vhb hww() {
            return com.bytedance.sdk.component.tq.hww.hww.hww.hww(this);
        }

        public hww(String str) {
            this.hww = new ArrayList();
            this.f35087tq = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f35086sd = timeUnit;
            this.vy = 10000L;
            this.f35085hv = timeUnit;
            this.f35084hu = 10000L;
            this.vgm = timeUnit;
        }

        public hww(vhb vhbVar) {
            this.hww = new ArrayList();
            this.f35087tq = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f35086sd = timeUnit;
            this.vy = 10000L;
            this.f35085hv = timeUnit;
            this.f35084hu = 10000L;
            this.vgm = timeUnit;
            this.f35087tq = vhbVar.f35083tq;
            this.f35086sd = vhbVar.f35082sd;
            this.vy = vhbVar.vy;
            this.f35085hv = vhbVar.f35081hv;
            this.f35084hu = vhbVar.f35080hu;
            this.vgm = vhbVar.vgm;
        }
    }
}
