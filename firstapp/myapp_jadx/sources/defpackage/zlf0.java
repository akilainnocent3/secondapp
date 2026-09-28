package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.a;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zlf0 extends b implements Handler.Callback {
    public final k4c H;
    public final g5d I;
    public p4c J;
    public final mee0 K;
    public boolean L;
    public int M;
    public kee0 N;
    public nee0 O;
    public oee0 P;
    public oee0 Q;
    public int R;
    public final Handler S;
    public final d.a T;
    public final yti U;
    public boolean V;
    public boolean W;
    public a X;
    public long Y;
    public long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlf0(d.a aVar, Looper looper) {
        super(3);
        mee0.a aVar2 = mee0.a;
        this.T = aVar;
        this.S = looper == null ? null : new Handler(looper, this);
        this.K = aVar2;
        this.H = new k4c();
        this.I = new g5d(1);
        this.U = new yti();
        this.Z = -9223372036854775807L;
        this.Y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        this.X = null;
        this.Z = -9223372036854775807L;
        O();
        this.Y = -9223372036854775807L;
        if (this.N != null) {
            S();
            kee0 kee0Var = this.N;
            kee0Var.getClass();
            kee0Var.release();
            this.N = null;
            this.M = 0;
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void L(a[] aVarArr, long j, long j2, ekv.b bVar) {
        a aVar = aVarArr[0];
        this.X = aVar;
        if (Objects.equals(aVar.n, "application/x-media3-cues")) {
            this.J = this.X.L == 1 ? new lnv() : new i950();
            return;
        }
        N();
        if (this.N != null) {
            this.M = 1;
        } else {
            R();
        }
    }

    public final void N() {
        ly0.e("Legacy decoding is disabled, can't handle " + this.X.n + " samples (expected application/x-media3-cues).", Objects.equals(this.X.n, "application/cea-608") || Objects.equals(this.X.n, "application/x-mp4-cea-608") || Objects.equals(this.X.n, "application/cea-708"));
    }

    public final void O() {
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        Q(this.Y);
        o4c o4cVar = new o4c(c150Var);
        Handler handler = this.S;
        if (handler != null) {
            handler.obtainMessage(1, o4cVar).sendToTarget();
            return;
        }
        d.a aVar = this.T;
        d.this.m.f(27, new eyg(o4cVar.a));
        d dVar = d.this;
        dVar.e0 = o4cVar;
        dVar.m.f(27, new cyg(o4cVar));
    }

    public final long P() {
        if (this.R == -1) {
            return Long.MAX_VALUE;
        }
        this.P.getClass();
        if (this.R >= this.P.d()) {
            return Long.MAX_VALUE;
        }
        return this.P.c(this.R);
    }

    public final long Q(long j) {
        ly0.f(j != -9223372036854775807L);
        return j - this.z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    public final void R() {
        kee0 kldVar;
        byte b = 1;
        this.L = true;
        a aVar = this.X;
        aVar.getClass();
        ugd ugdVar = ((mee0.a) this.K).b;
        String str = aVar.n;
        int i = aVar.K;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    kldVar = new tu6(str, i);
                    break;
                case 2:
                    kldVar = new vu6(i, aVar.q);
                    break;
                default:
                    if (ugdVar.d(aVar)) {
                        hb5.a(inm.a("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    ree0 ree0VarF = ugdVar.f(aVar);
                    ree0VarF.getClass().getSimpleName().concat("Decoder");
                    kldVar = new kld(ree0VarF);
                    break;
                    break;
            }
        } else if (ugdVar.d(aVar)) {
            hb5.a(inm.a("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            ree0 ree0VarF2 = ugdVar.f(aVar);
            ree0VarF2.getClass().getSimpleName().concat("Decoder");
            kldVar = new kld(ree0VarF2);
        }
        this.N = kldVar;
        kldVar.d(this.A);
    }

    public final void S() {
        this.O = null;
        this.R = -1;
        oee0 oee0Var = this.P;
        if (oee0Var != null) {
            oee0Var.k();
            this.P = null;
        }
        oee0 oee0Var2 = this.Q;
        if (oee0Var2 != null) {
            oee0Var2.k();
            this.Q = null;
        }
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean b() {
        return this.W;
    }

    @Override // androidx.media3.exoplayer.l
    public final int d(a aVar) {
        boolean zEquals = Objects.equals(aVar.n, "application/x-media3-cues");
        String str = aVar.n;
        if (!zEquals) {
            mee0.a aVar2 = (mee0.a) this.K;
            aVar2.getClass();
            if (!aVar2.b.d(aVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return gqv.k(str) ? l.k(1, 0, 0, 0) : l.k(0, 0, 0, 0);
            }
        }
        return l.k(aVar.O == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "TextRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) {
        boolean z;
        yti ytiVar;
        boolean z2;
        boolean z3;
        long jC;
        if (this.C) {
            long j3 = this.Z;
            if (j3 != -9223372036854775807L && j >= j3) {
                S();
                this.W = true;
            }
        }
        if (this.W) {
            return;
        }
        a aVar = this.X;
        aVar.getClass();
        boolean zEquals = Objects.equals(aVar.n, "application/x-media3-cues");
        d.a aVar2 = this.T;
        Handler handler = this.S;
        yti ytiVar2 = this.U;
        boolean zA = false;
        zA = false;
        zA = false;
        if (zEquals) {
            this.J.getClass();
            if (!this.V) {
                g5d g5dVar = this.I;
                if (M(ytiVar2, g5dVar, 0) == -4) {
                    if (g5dVar.i(4)) {
                        this.V = true;
                    } else {
                        g5dVar.m();
                        ByteBuffer byteBuffer = g5dVar.d;
                        byteBuffer.getClass();
                        long j4 = g5dVar.f;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.H.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        dd3 dd3Var = new dd3();
                        pcn.b bVar = pcn.b;
                        pcn.a aVar3 = new pcn.a();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            aVar3.c(dd3Var.apply(bundle2));
                        }
                        q4c q4cVar = new q4c(j4, bundle.getLong("d"), aVar3.g());
                        g5dVar.j();
                        zA = this.J.a(q4cVar, j);
                    }
                }
            }
            long jD = this.J.d(this.Y);
            if (jD == Long.MIN_VALUE && this.V && !zA) {
                this.W = true;
            }
            if (jD != Long.MIN_VALUE && jD <= j) {
                zA = true;
            }
            if (zA) {
                pcn<j4c> pcnVarB = this.J.b(j);
                long jC2 = this.J.c(j);
                Q(jC2);
                o4c o4cVar = new o4c(pcnVarB);
                if (handler != null) {
                    handler.obtainMessage(1, o4cVar).sendToTarget();
                } else {
                    d.this.m.f(27, new eyg(o4cVar.a));
                    d dVar = d.this;
                    dVar.e0 = o4cVar;
                    dVar.m.f(27, new cyg(o4cVar));
                }
                this.J.e(jC2);
            }
            this.Y = j;
            return;
        }
        N();
        this.Y = j;
        if (this.Q == null) {
            kee0 kee0Var = this.N;
            kee0Var.getClass();
            kee0Var.a(j);
            try {
                kee0 kee0Var2 = this.N;
                kee0Var2.getClass();
                this.Q = kee0Var2.b();
            } catch (lee0 e) {
                cft.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.X, e);
                O();
                S();
                kee0 kee0Var3 = this.N;
                kee0Var3.getClass();
                kee0Var3.release();
                this.N = null;
                this.M = 0;
                R();
                return;
            }
        }
        if (this.v != 2) {
            return;
        }
        if (this.P != null) {
            long jP = P();
            z = false;
            while (jP <= j) {
                this.R++;
                jP = P();
                z = true;
            }
        } else {
            z = false;
        }
        oee0 oee0Var = this.Q;
        if (oee0Var == null) {
            ytiVar = ytiVar2;
            z2 = z;
        } else if (oee0Var.i(4)) {
            if (!z && P() == Long.MAX_VALUE) {
                if (this.M == 2) {
                    S();
                    kee0 kee0Var4 = this.N;
                    kee0Var4.getClass();
                    kee0Var4.release();
                    this.N = null;
                    this.M = 0;
                    R();
                } else {
                    S();
                    this.W = true;
                }
            }
            ytiVar = ytiVar2;
            z2 = z;
        } else {
            ytiVar = ytiVar2;
            if (oee0Var.b <= j) {
                oee0 oee0Var2 = this.P;
                if (oee0Var2 != null) {
                    z2 = z;
                    oee0Var2.k();
                }
                z2 = z;
                this.R = oee0Var.a(j);
                this.P = oee0Var;
                this.Q = null;
                z2 = true;
            }
        }
        if (z2) {
            this.P.getClass();
            int iA = this.P.a(j);
            if (iA == 0 || this.P.d() == 0) {
                jC = this.P.b;
            } else {
                oee0 oee0Var3 = this.P;
                jC = iA == -1 ? oee0Var3.c(oee0Var3.d() - 1) : oee0Var3.c(iA - 1);
            }
            Q(jC);
            o4c o4cVar2 = new o4c(this.P.b(j));
            if (handler != null) {
                handler.obtainMessage(1, o4cVar2).sendToTarget();
            } else {
                d.this.m.f(27, new eyg(o4cVar2.a));
                d dVar2 = d.this;
                dVar2.e0 = o4cVar2;
                dVar2.m.f(27, new cyg(o4cVar2));
            }
        }
        if (this.M == 2) {
            return;
        }
        while (!this.V) {
            try {
                nee0 nee0VarE = this.O;
                if (nee0VarE == null) {
                    kee0 kee0Var5 = this.N;
                    kee0Var5.getClass();
                    nee0VarE = kee0Var5.e();
                    if (nee0VarE == null) {
                        return;
                    } else {
                        this.O = nee0VarE;
                    }
                }
                if (this.M == 1) {
                    nee0VarE.a = 4;
                    kee0 kee0Var6 = this.N;
                    kee0Var6.getClass();
                    kee0Var6.c(nee0VarE);
                    this.O = null;
                    this.M = 2;
                    return;
                }
                yti ytiVar3 = ytiVar;
                int iM = M(ytiVar3, nee0VarE, 0);
                if (iM == -4) {
                    if (nee0VarE.i(4)) {
                        this.V = true;
                        this.L = false;
                        z3 = false;
                    } else {
                        a aVar4 = ytiVar3.b;
                        if (aVar4 == null) {
                            return;
                        }
                        nee0VarE.w = aVar4.s;
                        nee0VarE.m();
                        z3 = this.L & (!nee0VarE.i(1));
                        this.L = z3;
                    }
                    if (!z3) {
                        kee0 kee0Var7 = this.N;
                        kee0Var7.getClass();
                        kee0Var7.c(nee0VarE);
                        this.O = null;
                    }
                } else if (iM == -3) {
                    return;
                }
                ytiVar = ytiVar3;
            } catch (lee0 e2) {
                cft.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.X, e2);
                O();
                S();
                kee0 kee0Var8 = this.N;
                kee0Var8.getClass();
                kee0Var8.release();
                this.N = null;
                this.M = 0;
                R();
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            fm20.a();
            return false;
        }
        o4c o4cVar = (o4c) message.obj;
        c150 c150Var = o4cVar.a;
        d.a aVar = this.T;
        d.this.m.f(27, new eyg(c150Var));
        d dVar = d.this;
        dVar.e0 = o4cVar;
        dVar.m.f(27, new cyg(o4cVar));
        return true;
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean isReady() {
        a aVar = this.X;
        if (aVar != null) {
            if (!Objects.equals(aVar.n, "application/x-media3-cues")) {
                if (!this.W) {
                    if (this.V) {
                        oee0 oee0Var = this.P;
                        long j = this.Y;
                        if (oee0Var == null || oee0Var.d() <= 0 || oee0Var.c(oee0Var.d() - 1) <= j) {
                            oee0 oee0Var2 = this.Q;
                            long j2 = this.Y;
                            if ((oee0Var2 == null || oee0Var2.d() <= 0 || oee0Var2.c(oee0Var2.d() - 1) <= j2) && this.O != null) {
                            }
                        }
                    }
                }
                return false;
            }
            p4c p4cVar = this.J;
            p4cVar.getClass();
            if (p4cVar.d(this.Y) == Long.MIN_VALUE) {
                try {
                    o();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.Y = j;
        p4c p4cVar = this.J;
        if (p4cVar != null) {
            p4cVar.clear();
        }
        O();
        this.V = false;
        this.W = false;
        this.Z = -9223372036854775807L;
        a aVar = this.X;
        if (aVar == null || Objects.equals(aVar.n, yFmFZvuWxAYfEj.jhYsxbO)) {
            return;
        }
        if (this.M == 0) {
            S();
            kee0 kee0Var = this.N;
            kee0Var.getClass();
            kee0Var.flush();
            kee0Var.d(this.A);
            return;
        }
        S();
        kee0 kee0Var2 = this.N;
        kee0Var2.getClass();
        kee0Var2.release();
        this.N = null;
        this.M = 0;
        R();
    }
}
