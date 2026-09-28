package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.a;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dpv extends b implements Handler.Callback {
    public final yov.a H;
    public final d.a I;
    public final Handler J;
    public final apv K;
    public y3l L;
    public boolean M;
    public boolean N;
    public long O;
    public uov P;
    public long Q;

    public dpv(d.a aVar, Looper looper) {
        super(5);
        this.I = aVar;
        this.J = looper == null ? null : new Handler(looper, this);
        this.H = yov.a;
        this.K = new apv(1);
        this.Q = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        this.P = null;
        this.L = null;
        this.Q = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.P = null;
        this.M = false;
        this.N = false;
    }

    @Override // androidx.media3.exoplayer.b
    public final void L(a[] aVarArr, long j, long j2, ekv.b bVar) {
        this.L = this.H.a(aVarArr[0]);
        uov uovVar = this.P;
        if (uovVar != null) {
            long j3 = uovVar.b;
            long j4 = (this.Q + j3) - j2;
            if (j3 != j4) {
                uovVar = new uov(j4, uovVar.a);
            }
            this.P = uovVar;
        }
        this.Q = j2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void N(uov uovVar, ArrayList arrayList) {
        int i = 0;
        while (true) {
            uov.a[] aVarArr = uovVar.a;
            if (i >= aVarArr.length) {
                return;
            }
            a aVarA = aVarArr[i].a();
            if (aVarA != null) {
                yov.a aVar = this.H;
                if (aVar.b(aVarA)) {
                    y3l y3lVarA = aVar.a(aVarA);
                    byte[] bArrC = aVarArr[i].c();
                    bArrC.getClass();
                    apv apvVar = this.K;
                    apvVar.j();
                    apvVar.l(bArrC.length);
                    ByteBuffer byteBuffer = apvVar.d;
                    String str = jrh0.a;
                    byteBuffer.put(bArrC);
                    apvVar.m();
                    uov uovVarC = y3lVarA.c(apvVar);
                    if (uovVarC != null) {
                        N(uovVarC, arrayList);
                    }
                } else {
                    arrayList.add(aVarArr[i]);
                }
            } else {
                arrayList.add(aVarArr[i]);
            }
            i++;
        }
    }

    public final long O(long j) {
        ly0.f(j != -9223372036854775807L);
        ly0.f(this.Q != -9223372036854775807L);
        return j - this.Q;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean b() {
        return this.N;
    }

    @Override // androidx.media3.exoplayer.l
    public final int d(a aVar) {
        if (this.H.b(aVar)) {
            return l.k(aVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return l.k(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) {
        boolean z = true;
        while (z) {
            int i = 0;
            if (!this.M && this.P == null) {
                apv apvVar = this.K;
                apvVar.j();
                yti ytiVar = this.c;
                ytiVar.a();
                int iM = M(ytiVar, apvVar, 0);
                if (iM == -4) {
                    if (apvVar.i(4)) {
                        this.M = true;
                    } else if (apvVar.f >= this.A) {
                        apvVar.w = this.O;
                        apvVar.m();
                        y3l y3lVar = this.L;
                        String str = jrh0.a;
                        uov uovVarC = y3lVar.c(apvVar);
                        if (uovVarC != null) {
                            ArrayList arrayList = new ArrayList(uovVarC.a.length);
                            N(uovVarC, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.P = new uov(O(apvVar.f), (uov.a[]) arrayList.toArray(new uov.a[0]));
                            }
                        }
                    }
                } else if (iM == -5) {
                    a aVar = ytiVar.b;
                    aVar.getClass();
                    this.O = aVar.s;
                }
            }
            uov uovVar = this.P;
            if (uovVar == null || uovVar.b > O(j)) {
                z = false;
            } else {
                uov uovVar2 = this.P;
                Handler handler = this.J;
                if (handler != null) {
                    handler.obtainMessage(1, uovVar2).sendToTarget();
                } else {
                    d.a aVar2 = this.I;
                    d dVar = d.this;
                    bjs<so10.c> bjsVar = dVar.m;
                    qjv.a aVarA = dVar.k0.a();
                    while (true) {
                        uov.a[] aVarArr = uovVar2.a;
                        if (i >= aVarArr.length) {
                            break;
                        }
                        aVarArr[i].b(aVarA);
                        i++;
                    }
                    dVar.k0 = new qjv(aVarA);
                    qjv qjvVarR0 = dVar.r0();
                    if (!qjvVarR0.equals(dVar.S)) {
                        dVar.S = qjvVarR0;
                        bjsVar.c(14, new dg3(aVar2));
                    }
                    bjsVar.c(28, new dyg(uovVar2));
                    bjsVar.b();
                }
                this.P = null;
                z = true;
            }
            if (this.M && this.P == null) {
                this.N = true;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = 0;
        if (message.what != 1) {
            fm20.a();
            return false;
        }
        uov uovVar = (uov) message.obj;
        d.a aVar = this.I;
        d dVar = d.this;
        bjs<so10.c> bjsVar = dVar.m;
        qjv.a aVarA = dVar.k0.a();
        while (true) {
            uov.a[] aVarArr = uovVar.a;
            if (i >= aVarArr.length) {
                break;
            }
            aVarArr[i].b(aVarA);
            i++;
        }
        dVar.k0 = new qjv(aVarA);
        qjv qjvVarR0 = dVar.r0();
        if (!qjvVarR0.equals(dVar.S)) {
            dVar.S = qjvVarR0;
            bjsVar.c(14, new dg3(aVar));
        }
        bjsVar.c(28, new dyg(uovVar));
        bjsVar.b();
        return true;
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean isReady() {
        return true;
    }
}
