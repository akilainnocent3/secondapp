package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.a;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uee0 implements njg0 {
    public final njg0 a;
    public final ree0.a b;
    public ree0 g;
    public a h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = jrh0.b;
    public final nsz c = new nsz();

    public uee0(njg0 njg0Var, ree0.a aVar) {
        this.a = njg0Var;
        this.b = aVar;
    }

    @Override // defpackage.njg0
    public final void a(final long j, final int i, int i2, int i3, njg0.a aVar) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, aVar);
            return;
        }
        ly0.a("DRM on subtitles is not supported", aVar == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.a(this.f, i4, i2, ree0.b.c, new oya() { // from class: tee0
                    @Override // defpackage.oya
                    public final void accept(Object obj) {
                        q4c q4cVar = (q4c) obj;
                        uee0 uee0Var = this.a;
                        ly0.g(uee0Var.h);
                        pcn<j4c> pcnVar = q4cVar.a;
                        long j2 = q4cVar.c;
                        l4c l4cVar = new l4c();
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(pcnVar.size());
                        int size = pcnVar.size();
                        int i6 = 0;
                        while (i6 < size) {
                            j4c j4cVar = pcnVar.get(i6);
                            i6++;
                            arrayList.add((Bundle) l4cVar.apply(j4cVar));
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("c", arrayList);
                        bundle.putLong("d", j2);
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeBundle(bundle);
                        byte[] bArrMarshall = parcelObtain.marshall();
                        parcelObtain.recycle();
                        nsz nszVar = uee0Var.c;
                        nszVar.G(bArrMarshall.length, bArrMarshall);
                        uee0Var.a.f(bArrMarshall.length, nszVar);
                        long j3 = q4cVar.b;
                        a aVar2 = uee0Var.h;
                        long j4 = j;
                        if (j3 == -9223372036854775807L) {
                            ly0.f(aVar2.s == Long.MAX_VALUE);
                        } else {
                            long j5 = aVar2.s;
                            j4 = j5 == Long.MAX_VALUE ? j4 + j3 : j3 + j5;
                        }
                        uee0Var.a.a(j4, i | 1, bArrMarshall.length, 0, null);
                    }
                });
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                cft.h("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.njg0
    public final void b(nsz nszVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(nszVar, i, i2);
            return;
        }
        g(i);
        nszVar.h(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.njg0
    public final void d(a aVar) {
        aVar.n.getClass();
        String str = aVar.n;
        ly0.b(gqv.h(str) == 3);
        boolean zEquals = aVar.equals(this.h);
        ree0.a aVar2 = this.b;
        if (!zEquals) {
            this.h = aVar;
            this.g = aVar2.d(aVar) ? aVar2.f(aVar) : null;
        }
        ree0 ree0Var = this.g;
        njg0 njg0Var = this.a;
        if (ree0Var == null) {
            njg0Var.d(aVar);
            return;
        }
        a.C0062a c0062aA = aVar.a();
        c0062aA.m = gqv.m("application/x-media3-cues");
        c0062aA.j = str;
        c0062aA.r = Long.MAX_VALUE;
        c0062aA.K = aVar2.e(aVar);
        p0j0.a(c0062aA, njg0Var);
    }

    @Override // defpackage.njg0
    public final int e(tpc tpcVar, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.e(tpcVar, i, z);
        }
        g(i);
        int i2 = tpcVar.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void g(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
