package androidx.compose.ui.layout;

import defpackage.biv;
import defpackage.kt;
import defpackage.kxa;
import defpackage.r160;
import defpackage.rce0;
import defpackage.rtw;
import defpackage.tsr;
import defpackage.vhv;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends tsr.e {
    public final /* synthetic */ k b;
    public final /* synthetic */ Function2<rce0, kxa, biv> c;

    public static final class a implements biv {
        public final /* synthetic */ biv a;
        public final /* synthetic */ k b;
        public final /* synthetic */ int c;
        public final /* synthetic */ biv d;

        public a(biv bivVar, k kVar, int i, biv bivVar2) {
            this.b = kVar;
            this.c = i;
            this.d = bivVar2;
            this.a = bivVar;
        }

        @Override // defpackage.biv
        public final int b() {
            return this.a.b();
        }

        @Override // defpackage.biv
        public final int c() {
            return this.a.c();
        }

        @Override // defpackage.biv
        public final void l() {
            int i = this.c;
            k kVar = this.b;
            kVar.e = i;
            this.d.l();
            rtw<Object, g0.b> rtwVar = kVar.A;
            long[] jArr = rtwVar.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = rtwVar.b[i5];
                            g0.b bVar = (g0.b) rtwVar.c[i5];
                            int i6 = kVar.B.i(obj);
                            if (i6 < 0 || i6 >= kVar.e) {
                                bVar.dispose();
                                rtwVar.l(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        @Override // defpackage.biv
        public final Function1<r160, Unit> m() {
            return this.a.m();
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.a.s();
        }
    }

    public static final class b implements biv {
        public final /* synthetic */ biv a;
        public final /* synthetic */ k b;
        public final /* synthetic */ int c;
        public final /* synthetic */ biv d;

        public b(biv bivVar, k kVar, int i, biv bivVar2) {
            this.b = kVar;
            this.c = i;
            this.d = bivVar2;
            this.a = bivVar;
        }

        @Override // defpackage.biv
        public final int b() {
            return this.a.b();
        }

        @Override // defpackage.biv
        public final int c() {
            return this.a.c();
        }

        @Override // defpackage.biv
        public final void l() {
            int i = this.c;
            k kVar = this.b;
            kVar.d = i;
            this.d.l();
            kVar.d(kVar.d);
        }

        @Override // defpackage.biv
        public final Function1<r160, Unit> m() {
            return this.a.m();
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.a.s();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(k kVar, Function2<? super rce0, ? super kxa, ? extends biv> function2, String str) {
        super(str);
        this.b = kVar;
        this.c = function2;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        k kVar = this.b;
        k.c cVar = kVar.v;
        cVar.a = tVar.getLayoutDirection();
        cVar.b = tVar.getDensity();
        cVar.c = tVar.y1();
        boolean zQ0 = tVar.q0();
        Function2<rce0, kxa, biv> function2 = this.c;
        if (zQ0 || kVar.a.v == null) {
            kVar.d = 0;
            biv bivVarInvoke = function2.invoke(cVar, new kxa(j));
            return new b(bivVarInvoke, kVar, kVar.d, bivVarInvoke);
        }
        kVar.e = 0;
        biv bivVarInvoke2 = function2.invoke(kVar.w, new kxa(j));
        return new a(bivVarInvoke2, kVar, kVar.e, bivVarInvoke2);
    }
}
