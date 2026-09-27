package com.bytedance.sdk.component.ok;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.weu;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class tq implements Comparable, Runnable {
    private ok hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f34949sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f34950tq;
    private Thread vy = null;

    public tq(ok okVar, hww hwwVar) {
        this.f34949sd = 0L;
        this.hww = okVar;
        this.f34950tq = hwwVar;
        this.f34949sd = SystemClock.uptimeMillis();
    }

    private void hww(String str, String str2, long j10) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof tq) {
            return this.hww.compareTo(((tq) obj).hww());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        ok okVar;
        return (obj instanceof tq) && (okVar = this.hww) != null && okVar.equals(((tq) obj).hww());
    }

    public int hashCode() {
        return this.hww.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.vy = Thread.currentThread();
        ok okVar = this.hww;
        if (okVar != null) {
            okVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.f34950tq != null) {
            vy.hww();
        }
        if (weu.hww()) {
            hww hwwVar = this.f34950tq;
            if (hwwVar != null) {
                hwwVar.hww();
            }
            ok okVar2 = this.hww;
            if (okVar2 != null) {
                okVar2.getName();
            }
            String strHww = this.f34950tq.hww();
            strHww.getClass();
            byte b10 = -1;
            switch (strHww.hashCode()) {
                case 3107:
                    if (strHww.equals("ad")) {
                        b10 = 0;
                    }
                    break;
                case 3366:
                    if (strHww.equals("io")) {
                        b10 = 1;
                    }
                    break;
                case 107332:
                    if (strHww.equals("log")) {
                        b10 = 2;
                    }
                    break;
                case 3237136:
                    if (strHww.equals("init")) {
                        b10 = 3;
                    }
                    break;
                case 212371911:
                    if (strHww.equals("computation")) {
                        b10 = 4;
                    }
                    break;
            }
            String name = b.f85379f;
            switch (b10) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        hww hwwVar2 = this.f34950tq;
                        String strHww2 = hwwVar2 != null ? hwwVar2.hww() : b.f85379f;
                        ok okVar3 = this.hww;
                        if (okVar3 != null) {
                            name = okVar3.getName();
                        }
                        hww(strHww2, name, jUptimeMillis2);
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        hww hwwVar3 = this.f34950tq;
                        String strHww3 = hwwVar3 != null ? hwwVar3.hww() : b.f85379f;
                        ok okVar4 = this.hww;
                        if (okVar4 != null) {
                            name = okVar4.getName();
                        }
                        hww(strHww3, name, jUptimeMillis2);
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > 3000) {
                        hww hwwVar4 = this.f34950tq;
                        String strHww4 = hwwVar4 != null ? hwwVar4.hww() : b.f85379f;
                        ok okVar5 = this.hww;
                        if (okVar5 != null) {
                            name = okVar5.getName();
                        }
                        hww(strHww4, name, jUptimeMillis2);
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        hww hwwVar5 = this.f34950tq;
                        String strHww5 = hwwVar5 != null ? hwwVar5.hww() : b.f85379f;
                        ok okVar6 = this.hww;
                        if (okVar6 != null) {
                            name = okVar6.getName();
                        }
                        hww(strHww5, name, jUptimeMillis2);
                    }
                    break;
            }
        }
    }

    public ok hww() {
        return this.hww;
    }
}
