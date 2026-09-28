package defpackage;

import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ham {
    public final urr a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final etw<d.c> f = new etw<>((Object) null);
    public final jxx g = new jxx();
    public final vsw<etw<vwx>> h = new vsw<>(10);

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ d.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ham.this.d(this.b);
            return Unit.a;
        }
    }

    public ham(urr urrVar) {
        this.a = urrVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    public final void a(long j, List<? extends d.c> list, boolean z) {
        long[] jArr;
        vwx vwxVar;
        Object objD;
        vwx vwxVar2;
        vsw<etw<vwx>> vswVar = this.h;
        vswVar.a();
        int size = list.size();
        jxx jxxVar = this.g;
        jxx jxxVar2 = jxxVar;
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            d.c cVar = list.get(i);
            if (cVar.C) {
                cVar.B = new a(cVar);
                if (z2) {
                    duw<vwx> duwVar = jxxVar2.a;
                    vwx[] vwxVarArr = duwVar.a;
                    int i2 = duwVar.c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            vwxVar2 = null;
                            break;
                        }
                        vwxVar2 = vwxVarArr[i3];
                        if (Intrinsics.g(vwxVar2.c, cVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    vwxVar = vwxVar2;
                    if (vwxVar != null) {
                        vwxVar.i = true;
                        vwxVar.d.a(j);
                        Object objD2 = vswVar.d(j);
                        if (objD2 == null) {
                            objD2 = new etw((Object) null);
                            vswVar.g(objD2, j);
                        }
                        ((etw) objD2).g(vwxVar);
                    } else {
                        z2 = false;
                        vwxVar = new vwx(cVar);
                        vwxVar.d.a(j);
                        objD = vswVar.d(j);
                        if (objD == null) {
                            objD = new etw((Object) null);
                            vswVar.g(objD, j);
                        }
                        ((etw) objD).g(vwxVar);
                        jxxVar2.a.b(vwxVar);
                    }
                } else {
                    vwxVar = new vwx(cVar);
                    vwxVar.d.a(j);
                    objD = vswVar.d(j);
                    if (objD == null) {
                        objD = new etw((Object) null);
                        vswVar.g(objD, j);
                    }
                    ((etw) objD).g(vwxVar);
                    jxxVar2.a.b(vwxVar);
                }
                jxxVar2 = vwxVar;
            }
        }
        if (!z) {
            return;
        }
        long[] jArr2 = vswVar.b;
        Object[] objArr = vswVar.c;
        long[] jArr3 = vswVar.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j2 = jArr3[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j2) < 128) {
                        int i8 = (i4 << 3) + i7;
                        long j3 = jArr2[i8];
                        etw<vwx> etwVar = (etw) objArr[i8];
                        duw<vwx> duwVar2 = jxxVar.a;
                        vwx[] vwxVarArr2 = duwVar2.a;
                        int i9 = duwVar2.c;
                        int i10 = 0;
                        while (i10 < i9) {
                            vwxVarArr2[i10].f(j3, etwVar);
                            i10++;
                            jArr2 = jArr2;
                        }
                    }
                    j2 >>= i5;
                    i7++;
                    i5 = i5;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i6 != i5) {
                    return;
                }
            } else {
                jArr = jArr2;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            jArr2 = jArr;
        }
    }

    public final boolean b(czo czoVar, boolean z) {
        jxx jxxVar = this.g;
        duw<vwx> duwVar = jxxVar.a;
        if (!jxxVar.a(czoVar.a, this.a, czoVar, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        vwx[] vwxVarArr = duwVar.a;
        int i = duwVar.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = vwxVarArr[i2].e(czoVar, z) || z3;
        }
        vwx[] vwxVarArr2 = duwVar.a;
        int i3 = duwVar.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = vwxVarArr2[i4].d(czoVar) || z4;
        }
        jxxVar.b(czoVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            etw<d.c> etwVar = this.f;
            int i5 = etwVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d(etwVar.b(i6));
            }
            etwVar.i();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            jxxVar.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        jxx jxxVar = this.g;
        duw<vwx> duwVar = jxxVar.a;
        vwx[] vwxVarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            vwxVarArr[i2].c();
        }
        if (this.d) {
            this.d = true;
        } else {
            jxxVar.a.g();
        }
    }

    public final void d(d.c cVar) {
        if (this.b) {
            this.e = true;
            this.f.g(cVar);
            return;
        }
        jxx jxxVar = this.g;
        etw<jxx> etwVar = jxxVar.b;
        etwVar.i();
        etwVar.g(jxxVar);
        while (etwVar.e()) {
            jxx jxxVarK = etwVar.k(etwVar.b - 1);
            int i = 0;
            while (true) {
                duw<vwx> duwVar = jxxVarK.a;
                if (i < duwVar.c) {
                    vwx vwxVar = duwVar.a[i];
                    if (Intrinsics.g(vwxVar.c, cVar)) {
                        jxxVarK.a.j(vwxVar);
                        vwxVar.c();
                    } else {
                        etwVar.g(vwxVar);
                        i++;
                    }
                }
            }
        }
    }
}
