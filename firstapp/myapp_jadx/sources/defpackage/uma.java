package defpackage;

import android.os.Trace;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.e;
import androidx.compose.runtime.g;
import androidx.compose.runtime.h;
import androidx.window.layout.oKr.TEFcJcMqR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uma implements t2b, mo50, rj40, kzz {
    public final o47 A;
    public final rtw<Object, Object> B;
    public rtw<Object, Object> C;
    public boolean D;
    public atr E;
    public mzz F;
    public uma G;
    public int H;
    public final mna I;
    public final a350 J;
    public final b K;
    public int L;
    public Function2<? super a, ? super Integer, Unit> M;
    public final mma a;
    public final fch0 b;
    public final AtomicReference<Object> c;
    public final Object d;
    public final utw e;
    public final g f;
    public final rtw<Object, Object> i;
    public final stw<e> v;
    public final stw<e> w;
    public final rtw<Object, Object> y;
    public final o47 z;

    public uma() {
        throw null;
    }

    public uma(mma mmaVar, fch0 fch0Var) {
        this.a = mmaVar;
        this.b = fch0Var;
        this.c = new AtomicReference<>(null);
        this.d = new Object();
        utw utwVar = new utw(new stw((Object) null));
        this.e = utwVar;
        g gVar = new g();
        if (mmaVar.e()) {
            gVar.z = new msw<>();
        }
        if (mmaVar.g()) {
            gVar.c();
        }
        this.f = gVar;
        this.i = fz60.b();
        this.v = new stw<>((Object) null);
        this.w = new stw<>((Object) null);
        this.y = fz60.b();
        o47 o47Var = new o47();
        this.z = o47Var;
        o47 o47Var2 = new o47();
        this.A = o47Var2;
        this.B = fz60.b();
        this.C = fz60.b();
        mna mnaVar = new mna(mmaVar);
        this.I = mnaVar;
        this.J = new a350();
        b bVar = new b(fch0Var, mmaVar, gVar, utwVar, o47Var, o47Var2, mnaVar, this);
        mmaVar.q(bVar);
        this.K = bVar;
        op8 op8Var = jv8.a;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0121 A[EDGE_INSN: B:152:0x0121->B:68:0x0121 BREAK  A[LOOP:2: B:135:0x00d4->B:66:0x0117], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0117 A[Catch: all -> 0x0107, LOOP:2: B:135:0x00d4->B:66:0x0117, LOOP_END, TryCatch #4 {all -> 0x0107, blocks: (B:50:0x00d4, B:52:0x00e3, B:54:0x00ed, B:56:0x00f3, B:58:0x0103, B:62:0x010c, B:68:0x0121, B:76:0x0143, B:79:0x0156, B:66:0x0117, B:71:0x012b, B:85:0x0174, B:87:0x0180), top: B:135:0x00d4 }] */
    public final void A(o47 o47Var) throws Throwable {
        a350 a350Var;
        long[] jArr;
        int i;
        long[] jArr2;
        a350 a350Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zB;
        long j3;
        o47 o47Var2 = this.A;
        b bVar = this.K;
        rma rmaVarI0 = bVar.i0();
        a350 a350Var3 = this.J;
        a350Var3.g(this.e, rmaVarI0);
        if (o47Var.c.isEmpty()) {
            try {
                if (o47Var2.c.isEmpty() && this.F == null) {
                    a350Var3.b();
                }
                return;
            } finally {
                a350Var3.a();
            }
        }
        try {
            Trace.beginSection("Compose:applyChanges");
            try {
                mzz mzzVar = this.F;
                fv0<?> fv0Var = mzzVar != null ? mzzVar.k : this.b;
                a350 a350Var4 = mzzVar != null ? mzzVar.j : a350Var3;
                fv0Var.getClass();
                h hVarE = this.f.e();
                int i3 = 0;
                try {
                    o47Var.X(fv0Var, hVarE, a350Var4, bVar.i0());
                    Unit unit = Unit.a;
                    hVarE.e(true);
                    fv0Var.f();
                    Trace.endSection();
                    a350Var3.c();
                    a350Var3.d();
                    if (this.D) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.D = false;
                            rtw<Object, Object> rtwVar = this.i;
                            long[] jArr3 = rtwVar.a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    long j4 = jArr3[i4];
                                    char c2 = 7;
                                    long j5 = -9187201950435737472L;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8;
                                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                                        int i7 = i3;
                                        while (i7 < i6) {
                                            if ((j4 & 255) < 128) {
                                                c = c2;
                                                int i8 = (i4 << 3) + i7;
                                                j2 = j5;
                                                Object obj = rtwVar.b[i8];
                                                Object obj2 = rtwVar.c[i8];
                                                if (obj2 instanceof stw) {
                                                    stw stwVar = (stw) obj2;
                                                    Object[] objArr = stwVar.b;
                                                    long[] jArr4 = stwVar.a;
                                                    int i9 = i5;
                                                    int length2 = jArr4.length - 2;
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    a350Var2 = a350Var3;
                                                    if (length2 >= 0) {
                                                        int i10 = 0;
                                                        while (true) {
                                                            try {
                                                                long j6 = jArr4[i10];
                                                                j = j4;
                                                                long[] jArr5 = jArr4;
                                                                if ((((~j6) << c) & j6 & j2) == j2) {
                                                                    if (i10 != length2) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr4 = jArr5;
                                                                    j4 = j;
                                                                    i9 = 8;
                                                                } else {
                                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                    for (int i12 = 0; i12 < i11; i12++) {
                                                                        if ((j6 & 255) < 128) {
                                                                            j3 = j6;
                                                                            int i13 = (i10 << 3) + i12;
                                                                            if (!((e) objArr[i13]).a()) {
                                                                                stwVar.m(i13);
                                                                            }
                                                                        } else {
                                                                            j3 = j6;
                                                                        }
                                                                        j6 = j3 >> i9;
                                                                    }
                                                                    if (i11 != i9) {
                                                                        break;
                                                                    }
                                                                    if (i10 != length2) {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr4 = jArr5;
                                                                    j4 = j;
                                                                    i9 = 8;
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                Trace.endSection();
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        j = j4;
                                                    }
                                                    zB = stwVar.b();
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    a350Var2 = a350Var3;
                                                    j = j4;
                                                    obj2.getClass();
                                                    zB = !((e) obj2).a();
                                                }
                                                if (zB) {
                                                    rtwVar.l(i8);
                                                }
                                                i2 = 8;
                                            } else {
                                                i = i7;
                                                jArr2 = jArr3;
                                                a350Var2 = a350Var3;
                                                j = j4;
                                                c = c2;
                                                j2 = j5;
                                                i2 = i5;
                                            }
                                            j4 = j >> i2;
                                            i7 = i + 1;
                                            i5 = i2;
                                            c2 = c;
                                            j5 = j2;
                                            a350Var3 = a350Var2;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        a350Var = a350Var3;
                                        if (i6 != i5) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                        a350Var = a350Var3;
                                    }
                                    if (i4 == length) {
                                        break;
                                    }
                                    i4++;
                                    a350Var3 = a350Var;
                                    jArr3 = jArr;
                                    i3 = 0;
                                }
                            } else {
                                a350Var = a350Var3;
                            }
                            B();
                            Unit unit2 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        a350Var = a350Var3;
                    }
                    try {
                        if (o47Var2.c.isEmpty() && this.F == null) {
                            a350Var.b();
                        }
                        return;
                    } finally {
                        a350Var.a();
                    }
                } catch (Throwable th3) {
                    try {
                        hVarE.e(false);
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        Trace.endSection();
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        try {
            if (o47Var2.c.isEmpty() && this.F == null) {
                a350Var3.b();
            }
            throw th;
        } finally {
            a350Var3.a();
        }
    }

    public final void B() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zB;
        int i4;
        int i5;
        rtw<Object, Object> rtwVar = this.y;
        long[] jArr3 = rtwVar.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = rtwVar.b[i10];
                            Object obj2 = rtwVar.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof stw;
                            j5 = j8;
                            rtw<Object, Object> rtwVar2 = this.i;
                            if (z) {
                                stw stwVar = (stw) obj2;
                                Object[] objArr = stwVar.b;
                                long[] jArr4 = stwVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!rtwVar2.b((nae) objArr[i15])) {
                                                        stwVar.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zB = stwVar.b();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zB = !rtwVar2.b((nae) obj2);
                            }
                            if (zB) {
                                rtwVar.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        stw<e> stwVar2 = this.w;
        if (!stwVar2.c()) {
            return;
        }
        Object[] objArr2 = stwVar2.b;
        long[] jArr5 = stwVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((e) objArr2[i20]).g == null) {
                            stwVar2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean C() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.L != 1) {
                z = false;
            }
            if (z) {
                this.L = 0;
            }
        }
        return z;
    }

    public final mzz D(boolean z, Function2 function2) {
        if (this.F != null) {
            lm20.b("A pausable composition is in progress");
        }
        mzz mzzVar = new mzz(this, this.a, this.K, this.e, function2, z, this.b, this.d);
        this.F = mzzVar;
        return mzzVar;
    }

    public final void E() {
        AtomicReference<Object> atomicReference = this.c;
        Object obj = vma.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                c.c("pending composition has not been applied");
                fkd.a();
                return;
            }
            if (andSet instanceof Set) {
                z((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                c.c("corrupt pendingModifications drain: " + atomicReference);
                fkd.a();
                return;
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, true);
            }
        }
    }

    public final void F() {
        AtomicReference<Object> atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.g(andSet, vma.a)) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, false);
            }
            return;
        }
        if (andSet == null) {
            c.c("calling recordModificationsOf and applyChanges concurrently is not supported");
            fkd.a();
        } else {
            c.c("corrupt pendingModifications drain: " + atomicReference);
            fkd.a();
        }
    }

    public final void G() {
        t3g t3gVar = t3g.a;
        AtomicReference<Object> atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(t3gVar);
        if (Intrinsics.g(andSet, vma.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            c.c("corrupt pendingModifications drain: " + atomicReference);
            fkd.a();
            return;
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            z(set, false);
        }
    }

    public final void H() {
        String str;
        int i = this.L;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            lm20.b(str);
        }
        if (this.F == null) {
            return;
        }
        lm20.b("A pausable composition is in progress");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[Catch: all -> 0x0042, LOOP:0: B:48:0x0089->B:62:0x00ca, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:66:0x00d2->B:67:0x00d7 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d2 A[SYNTHETIC] */
    public final k0p I(e eVar, l00 l00Var, Object obj) {
        synchronized (this.d) {
            try {
                uma umaVar = this.G;
                uma umaVar2 = null;
                if (umaVar != null) {
                    g gVar = this.f;
                    int i = this.H;
                    if (gVar.i) {
                        c.b("Writer is active");
                    }
                    if (i < 0 || i >= gVar.b) {
                        c.b("Invalid group index");
                    }
                    if (gVar.f(l00Var)) {
                        int i2 = gVar.a[(i * 5) + 3] + i;
                        int i3 = l00Var.a;
                        if (i > i3 || i3 >= i2) {
                            umaVar = null;
                        }
                    } else {
                        umaVar = null;
                    }
                    umaVar2 = umaVar;
                }
                if (umaVar2 == null) {
                    b bVar = this.K;
                    if (!(bVar.F && bVar.E0(eVar, obj))) {
                        if (obj != null) {
                            boolean z = obj instanceof nae;
                            rtw<Object, Object> rtwVar = this.C;
                            if (z) {
                                Object objD = rtwVar.d(eVar);
                                if (objD != null) {
                                    if (!(objD instanceof stw)) {
                                        if (objD != wn70.a) {
                                            yn70.a(this.C, eVar, obj);
                                            break;
                                        }
                                    } else {
                                        stw stwVar = (stw) objD;
                                        Object[] objArr = stwVar.b;
                                        long[] jArr = stwVar.a;
                                        int length = jArr.length - 2;
                                        if (length < 0) {
                                            yn70.a(this.C, eVar, obj);
                                            break;
                                        }
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i4 == length) {
                                                    yn70.a(this.C, eVar, obj);
                                                    break;
                                                }
                                                i4++;
                                            } else {
                                                int i5 = 8;
                                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                int i7 = 0;
                                                while (i7 < i6) {
                                                    if ((j & 255) < 128 && objArr[(i4 << 3) + i7] == wn70.a) {
                                                        break loop0;
                                                    }
                                                    j >>= i5;
                                                    i7++;
                                                    i5 = i5;
                                                }
                                                if (i6 == i5) {
                                                    if (i4 == length) {
                                                        i4++;
                                                    }
                                                }
                                                yn70.a(this.C, eVar, obj);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    yn70.a(this.C, eVar, obj);
                                    break;
                                }
                            } else {
                                rtwVar.m(eVar, wn70.a);
                            }
                        } else {
                            this.C.m(eVar, wn70.a);
                        }
                    } else {
                        return k0p.d;
                    }
                }
                if (umaVar2 != null) {
                    return umaVar2.I(eVar, l00Var, obj);
                }
                this.a.l(this);
                return this.K.F ? k0p.c : k0p.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(Object obj) {
        Object objD = this.i.d(obj);
        if (objD == null) {
            return;
        }
        boolean z = objD instanceof stw;
        rtw<Object, Object> rtwVar = this.B;
        if (!z) {
            e eVar = (e) objD;
            if (eVar.b(obj) == k0p.d) {
                yn70.a(rtwVar, obj, eVar);
                return;
            }
            return;
        }
        stw stwVar = (stw) objD;
        Object[] objArr = stwVar.b;
        long[] jArr = stwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        e eVar2 = (e) objArr[(i << 3) + i3];
                        if (eVar2.b(obj) == k0p.d) {
                            yn70.a(rtwVar, obj, eVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[LOOP:0: B:30:0x0078->B:45:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce A[EDGE_INSN: B:52:0x00ce->B:46:0x00ce BREAK  A[LOOP:0: B:30:0x0078->B:45:0x00ca], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // defpackage.t2b, defpackage.rj40
    public final void a(Object obj) {
        e eVarG0;
        int i;
        boolean z;
        b bVar = this.K;
        if (bVar.A <= 0 && (eVarG0 = bVar.g0()) != null) {
            int i2 = eVarG0.b | 1;
            eVarG0.b = i2;
            if ((i2 & 32) == 0) {
                dtw<Object> dtwVar = eVarG0.f;
                if (dtwVar == null) {
                    dtwVar = new dtw<>((Object) null);
                    eVarG0.f = dtwVar;
                }
                int i3 = eVarG0.e;
                int iC = dtwVar.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = dtwVar.c[iC];
                }
                dtwVar.b[iC] = obj;
                dtwVar.c[iC] = i3;
                if (i == eVarG0.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.I.a();
            if (z) {
                return;
            }
            if (obj instanceof oxd0) {
                ((oxd0) obj).N(1);
            }
            yn70.a(this.i, obj, eVarG0);
            if (obj instanceof nae) {
                nae<?> naeVar = (nae) obj;
                mae.a aVarL = naeVar.L();
                rtw<Object, Object> rtwVar = this.y;
                yn70.c(rtwVar, obj);
                dtw dtwVar2 = aVarL.e;
                Object[] objArr = dtwVar2.b;
                long[] jArr = dtwVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    nxd0 nxd0Var = (nxd0) objArr[(i4 << 3) + i7];
                                    if (nxd0Var instanceof oxd0) {
                                        ((oxd0) nxd0Var).N(1);
                                    }
                                    yn70.a(rtwVar, nxd0Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = aVarL.f;
                rtw<nae<?>, Object> rtwVar2 = eVarG0.g;
                if (rtwVar2 == null) {
                    rtwVar2 = new rtw<>((Object) null);
                    eVarG0.g = rtwVar2;
                }
                rtwVar2.m(naeVar, obj2);
            }
        }
    }

    @Override // defpackage.t2b
    public final void b(Function2<? super a, ? super Integer, Unit> function2) {
        try {
            synchronized (this.d) {
                E();
                rtw<Object, Object> rtwVar = this.C;
                this.C = fz60.b();
                try {
                    b bVar = this.K;
                    atr atrVar = this.E;
                    if (!bVar.e.c.isEmpty()) {
                        c.b("Expected applyChanges() to have been called");
                    }
                    bVar.P = atrVar;
                    try {
                        bVar.V(rtwVar, function2);
                        bVar.P = null;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        bVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.C = rtwVar;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.e.a.b()) {
                    a350 a350Var = this.J;
                    try {
                        a350Var.g(this.e, this.K.i0());
                        a350Var.b();
                    } finally {
                        a350Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                v();
                throw th4;
            }
        }
    }

    @Override // defpackage.rj40
    public final void c() {
        this.D = true;
        this.I.a();
    }

    @Override // defpackage.t2b
    public final void d() {
        synchronized (this.d) {
            try {
                if (this.A.c.Y()) {
                    A(this.A);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        a350 a350Var = this.J;
                        try {
                            a350Var.g(this.e, this.K.i0());
                            a350Var.b();
                        } finally {
                            a350Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    v();
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.mo50
    public final void deactivate() {
        synchronized (this.d) {
            try {
                if (this.F != null) {
                    lm20.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b > 0;
                if (z || !this.e.a.b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        a350 a350Var = this.J;
                        try {
                            a350Var.g(this.e, this.K.i0());
                            if (z) {
                                this.b.getClass();
                                h hVarE = this.f.e();
                                try {
                                    hVarE.m(hVarE.t, new cma(this.J, hVarE));
                                    Unit unit = Unit.a;
                                    hVarE.e(true);
                                    this.b.f();
                                    a350Var.c();
                                } catch (Throwable th) {
                                    hVarE.e(false);
                                    throw th;
                                }
                            }
                            a350Var.b();
                            a350Var.a();
                            Unit unit2 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            a350Var.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.i.g();
                this.y.g();
                this.C.g();
                this.z.c.clear();
                this.A.c.clear();
                b bVar = this.K;
                bVar.E.clear();
                bVar.s.clear();
                bVar.e.c.clear();
                bVar.v = null;
                this.L = 1;
                Unit unit3 = Unit.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // defpackage.lma
    public final void dispose() {
        synchronized (this.d) {
            try {
                if (this.K.F) {
                    lm20.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.L != 3) {
                    this.L = 3;
                    this.M = jv8.b;
                    o47 o47Var = this.K.L;
                    if (o47Var != null) {
                        A(o47Var);
                    }
                    boolean z = this.f.b > 0;
                    if (z || !this.e.a.b()) {
                        a350 a350Var = this.J;
                        try {
                            a350Var.g(this.e, this.K.i0());
                            if (z) {
                                this.b.getClass();
                                h hVarE = this.f.e();
                                try {
                                    hVarE.m(hVarE.t, new bma(this.J));
                                    hVarE.H();
                                    Unit unit = Unit.a;
                                    hVarE.e(true);
                                    this.b.clear();
                                    this.b.f();
                                    a350Var.c();
                                } catch (Throwable th) {
                                    hVarE.e(false);
                                    throw th;
                                }
                            }
                            a350Var.b();
                            a350Var.a();
                        } catch (Throwable th2) {
                            a350Var.a();
                            throw th2;
                        }
                    }
                    b bVar = this.K;
                    bVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        bVar.b.u(bVar);
                        bVar.E.clear();
                        bVar.s.clear();
                        bVar.e.c.clear();
                        bVar.v = null;
                        bVar.a.clear();
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit3 = Unit.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.v(this);
    }

    @Override // defpackage.kzz
    public final mzz e(Function2 function2) {
        return D(C(), function2);
    }

    @Override // defpackage.t2b
    public final <R> R f(t2b t2bVar, int i, Function0<? extends R> function0) {
        if (t2bVar == null || t2bVar.equals(this) || i < 0) {
            return function0.invoke();
        }
        this.G = (uma) t2bVar;
        this.H = i;
        try {
            return function0.invoke();
        } finally {
            this.G = null;
            this.H = 0;
        }
    }

    @Override // defpackage.lma
    public final void g(Function2<? super a, ? super Integer, Unit> function2) {
        boolean zC = C();
        H();
        mma mmaVar = this.a;
        if (!zC) {
            this.M = function2;
            mmaVar.a(this, function2);
            return;
        }
        b bVar = this.K;
        bVar.z = 100;
        bVar.y = true;
        this.M = function2;
        mmaVar.a(this, function2);
        bVar.a0();
    }

    @Override // defpackage.t2b
    public final void h(y6w y6wVar) {
        a350 a350Var = this.J;
        try {
            a350Var.g(this.e, this.K.i0());
            h hVarE = y6wVar.a.e();
            try {
                hVarE.m(hVarE.t, new bma(a350Var));
                hVarE.H();
                Unit unit = Unit.a;
                hVarE.e(true);
                a350Var.c();
                a350Var.a();
            } catch (Throwable th) {
                hVarE.e(false);
                throw th;
            }
        } catch (Throwable th2) {
            a350Var.a();
            throw th2;
        }
    }

    @Override // defpackage.t2b
    public final void i(vj40 vj40Var) {
        b bVar = this.K;
        if (bVar.F) {
            c.b("Preparing a composition while composing is not supported");
        }
        bVar.F = true;
        try {
            vj40Var.invoke();
        } finally {
            bVar.F = false;
        }
    }

    @Override // defpackage.lma
    public final boolean isDisposed() {
        return this.L == 3;
    }

    @Override // defpackage.t2b
    public final boolean j() {
        synchronized (this.d) {
            mzz mzzVar = this.F;
            boolean zY = false;
            if (mzzVar != null && mzzVar.h.get() != ozz.e) {
                mzzVar.e();
                return false;
            }
            E();
            try {
                rtw<Object, Object> rtwVar = this.C;
                this.C = fz60.b();
                try {
                    b bVar = this.K;
                    atr atrVar = this.E;
                    f2z f2zVar = bVar.e.c;
                    if (!f2zVar.isEmpty()) {
                        c.b("Expected applyChanges() to have been called");
                    }
                    if (rtwVar.e > 0 || !bVar.s.isEmpty()) {
                        bVar.P = atrVar;
                        try {
                            bVar.V(rtwVar, null);
                            bVar.P = null;
                            zY = f2zVar.Y();
                        } catch (Throwable th) {
                            bVar.P = null;
                            throw th;
                        }
                    }
                    if (!zY) {
                        F();
                    }
                    return zY;
                } catch (Throwable th2) {
                    this.C = rtwVar;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.a.b()) {
                        a350 a350Var = this.J;
                        try {
                            a350Var.g(this.e, this.K.i0());
                            a350Var.b();
                        } finally {
                            a350Var.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    v();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    @Override // defpackage.t2b
    public final boolean l(Set<? extends Object> set) {
        boolean z = set instanceof iz60;
        rtw<Object, Object> rtwVar = this.y;
        rtw<Object, Object> rtwVar2 = this.i;
        if (z) {
            gz60<T> gz60Var = ((iz60) set).a;
            Object[] objArr = gz60Var.b;
            long[] jArr = gz60Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (rtwVar2.b(obj) || rtwVar.b(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (rtwVar2.b(obj2) || rtwVar.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t2b
    public final void m(ArrayList arrayList) {
        utw utwVar = this.e;
        b bVar = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((z6w) ((Pair) arrayList.get(i)).a).c.equals(this)) {
                c.b("Check failed");
                break;
            }
        }
        try {
            bVar.getClass();
            try {
                bVar.j0(arrayList);
                bVar.R();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                bVar.P();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!utwVar.a.b()) {
                    a350 a350Var = this.J;
                    try {
                        a350Var.g(utwVar, bVar.i0());
                        a350Var.b();
                    } finally {
                        a350Var.a();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                v();
                throw th3;
            }
        }
    }

    @Override // defpackage.rj40
    public final k0p n(e eVar, Object obj) {
        uma umaVar;
        int i = eVar.b;
        if ((i & 2) != 0) {
            eVar.b = i | 4;
        }
        l00 l00Var = eVar.c;
        if (l00Var == null || !l00Var.a()) {
            return k0p.a;
        }
        if (this.f.f(l00Var)) {
            if (eVar.d == null) {
                return k0p.a;
            }
            k0p k0pVarI = I(eVar, l00Var, obj);
            if (k0pVarI != k0p.a) {
                this.I.a();
            }
            return k0pVarI;
        }
        synchronized (this.d) {
            umaVar = this.G;
        }
        if (umaVar != null) {
            b bVar = umaVar.K;
            if (bVar.F && bVar.E0(eVar, obj)) {
                return k0p.d;
            }
        }
        return k0p.a;
    }

    @Override // defpackage.t2b
    public final void o() {
        synchronized (this.d) {
            try {
                A(this.z);
                F();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        a350 a350Var = this.J;
                        try {
                            a350Var.g(this.e, this.K.i0());
                            a350Var.b();
                        } finally {
                            a350Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    v();
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.t2b
    public final boolean p() {
        return this.K.F;
    }

    @Override // defpackage.mo50
    public final void q(Function2<? super a, ? super Integer, Unit> function2) {
        C();
        H();
        b bVar = this.K;
        bVar.z = 100;
        bVar.y = true;
        this.M = function2;
        this.a.a(this, function2);
        bVar.a0();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // defpackage.t2b
    public final void r(Object obj) {
        synchronized (this.d) {
            try {
                J(obj);
                Object objD = this.y.d(obj);
                if (objD != null) {
                    if (objD instanceof stw) {
                        stw stwVar = (stw) objD;
                        Object[] objArr = stwVar.b;
                        long[] jArr = stwVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            J((nae) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        J((nae) objD);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lma
    public final boolean s() {
        boolean z;
        synchronized (this.d) {
            z = this.C.e > 0;
        }
        return z;
    }

    @Override // defpackage.t2b
    public final atr t(atr atrVar) {
        atr atrVar2 = this.E;
        this.E = atrVar;
        return atrVar2;
    }

    @Override // defpackage.kzz
    public final mzz u(Function2 function2) {
        C();
        H();
        return D(true, function2);
    }

    @Override // defpackage.t2b
    public final void v() {
        this.c.set(null);
        this.z.c.clear();
        this.A.c.clear();
        utw utwVar = this.e;
        if (utwVar.a.b()) {
            return;
        }
        a350 a350Var = this.J;
        try {
            a350Var.g(utwVar, this.K.i0());
            a350Var.b();
        } finally {
            a350Var.a();
        }
    }

    @Override // defpackage.t2b
    public final void w() {
        synchronized (this.d) {
            try {
                this.K.v = null;
                if (!this.e.a.b()) {
                    a350 a350Var = this.J;
                    try {
                        a350Var.g(this.e, this.K.i0());
                        a350Var.b();
                        a350Var.a();
                    } catch (Throwable th) {
                        a350Var.a();
                        throw th;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                try {
                    if (!this.e.a.b()) {
                        a350 a350Var2 = this.J;
                        try {
                            a350Var2.g(this.e, this.K.i0());
                            a350Var2.b();
                        } finally {
                            a350Var2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    v();
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.t2b
    public final void x() {
        synchronized (this.d) {
            try {
                for (Object obj : this.f.c) {
                    e eVar = obj instanceof e ? (e) obj : null;
                    if (eVar != null) {
                        eVar.invalidate();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Object obj, boolean z) {
        Object objD = this.i.d(obj);
        if (objD == null) {
            return;
        }
        boolean z2 = objD instanceof stw;
        stw<e> stwVar = this.v;
        stw<e> stwVar2 = this.w;
        rtw<Object, Object> rtwVar = this.B;
        if (!z2) {
            e eVar = (e) objD;
            if (yn70.b(rtwVar, obj, eVar) || eVar.b(obj) == k0p.a) {
                return;
            }
            if (eVar.g == null || z) {
                stwVar.d(eVar);
                return;
            } else {
                stwVar2.d(eVar);
                return;
            }
        }
        stw stwVar3 = (stw) objD;
        Object[] objArr = stwVar3.b;
        long[] jArr = stwVar3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        e eVar2 = (e) objArr[(i << 3) + i3];
                        if (!yn70.b(rtwVar, obj, eVar2) && eVar2.b(obj) != k0p.a) {
                            if (eVar2.g == null || z) {
                                stwVar.d(eVar2);
                            } else {
                                stwVar2.d(eVar2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:217:0x0196 A[EDGE_INSN: B:217:0x0196->B:77:0x0196 BREAK  A[LOOP:13: B:64:0x015a->B:75:0x018e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[LOOP:13: B:64:0x015a->B:75:0x018e, LOOP_END] */
    public final void z(Set<? extends Object> set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zA;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zB;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof iz60;
        rtw<Object, Object> rtwVar = this.y;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            gz60<T> gz60Var = ((iz60) set).a;
            Object[] objArr = gz60Var.b;
            long[] jArr9 = gz60Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof e) {
                                    ((e) obj2).b(obj);
                                    jArr8 = jArr9;
                                    j8 = j9;
                                    i = length;
                                } else {
                                    y(obj2, z);
                                    Object objD = rtwVar.d(obj2);
                                    if (objD == null) {
                                        jArr8 = jArr9;
                                        j8 = j9;
                                        i = length;
                                    } else if (objD instanceof stw) {
                                        stw stwVar = (stw) objD;
                                        Object[] objArr2 = stwVar.b;
                                        long[] jArr10 = stwVar.a;
                                        int length2 = jArr10.length - 2;
                                        if (length2 >= 0) {
                                            int i7 = i3;
                                            i = length;
                                            int i8 = 0;
                                            while (true) {
                                                long j10 = jArr10[i8];
                                                j8 = j9;
                                                long[] jArr11 = jArr10;
                                                if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                    int i10 = 0;
                                                    while (i10 < i9) {
                                                        if ((j10 & 255) < 128) {
                                                            y((nae) objArr2[(i8 << 3) + i10], z);
                                                        }
                                                        j10 >>= i7;
                                                        i10++;
                                                        jArr9 = jArr9;
                                                    }
                                                    jArr8 = jArr9;
                                                    if (i9 != i7) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr8 = jArr9;
                                                }
                                                if (i8 == length2) {
                                                    break;
                                                }
                                                i8++;
                                                jArr10 = jArr11;
                                                j9 = j8;
                                                jArr9 = jArr8;
                                                i7 = 8;
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                        }
                                    } else {
                                        jArr8 = jArr9;
                                        j8 = j9;
                                        i = length;
                                        y((nae) objD, z);
                                    }
                                    Unit unit = Unit.a;
                                }
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof e) {
                    ((e) obj3).b(null);
                } else {
                    y(obj3, z);
                    Object objD2 = rtwVar.d(obj3);
                    if (objD2 != null) {
                        if (objD2 instanceof stw) {
                            stw stwVar2 = (stw) objD2;
                            Object[] objArr3 = stwVar2.b;
                            long[] jArr12 = stwVar2.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                y((nae) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            y((nae) objD2, z);
                        }
                    }
                    Unit unit2 = Unit.a;
                }
            }
        }
        rtw<Object, Object> rtwVar2 = this.i;
        stw<e> stwVar3 = this.v;
        if (z) {
            stw<e> stwVar4 = this.w;
            if (stwVar4.c()) {
                long[] jArr13 = rtwVar2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = rtwVar2.b[i18];
                                    Object obj5 = rtwVar2.c[i18];
                                    if (obj5 instanceof stw) {
                                        stw stwVar5 = (stw) obj5;
                                        Object[] objArr4 = stwVar5.b;
                                        long[] jArr14 = stwVar5.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            e eVar = (e) objArr5[i22];
                                                            if (stwVar4.a(eVar) || stwVar3.a(eVar)) {
                                                                stwVar5.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zB = stwVar5.b();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        e eVar2 = (e) obj5;
                                        zB = stwVar4.a(eVar2) || stwVar3.a(eVar2);
                                    }
                                    if (zB) {
                                        rtwVar2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                stwVar4.e();
                B();
                return;
            }
        }
        if (stwVar3.c()) {
            long[] jArr16 = rtwVar2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = rtwVar2.b[i26];
                                Object obj7 = rtwVar2.c[i26];
                                if (obj7 instanceof stw) {
                                    stw stwVar6 = (stw) obj7;
                                    Object[] objArr6 = stwVar6.b;
                                    long[] jArr17 = stwVar6.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (stwVar3.a((e) objArr7[i30])) {
                                                            stwVar6.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zA = stwVar6.b();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zA = stwVar3.a((e) obj7);
                                }
                                if (zA) {
                                    rtwVar2.l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            B();
            stwVar3.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t2b
    public final void k(iz60 iz60Var) {
        Object obj;
        while (true) {
            Object obj2 = this.c.get();
            if (obj2 == null || obj2.equals(vma.a)) {
                obj = iz60Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, iz60Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    s52.a(this.c, TEFcJcMqR.ydjwBbufjkuZs);
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = iz60Var;
                obj = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.d) {
                            F();
                            Unit unit = Unit.a;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }
}
