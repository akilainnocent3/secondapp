package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lre implements AutoCloseable {
    public static final Regex G = new Regex("[a-z0-9_-]{1,120}");
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final mre F;
    public final cxz a;
    public final long b;
    public final cxz c;
    public final cxz d;
    public final cxz e;
    public final LinkedHashMap f;
    public final j1b i;
    public final Object v;
    public long w;
    public int y;
    public x740 z;

    public final class a {
        public final b a;
        public boolean b;
        public final boolean[] c = new boolean[2];

        public a(b bVar) {
            this.a = bVar;
        }

        public final void a(boolean z) {
            lre lreVar = lre.this;
            synchronized (lreVar.v) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.g(this.a.g, this)) {
                        lreVar.d(this, z);
                    }
                    this.b = true;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final cxz b(int i) {
            cxz cxzVar;
            lre lreVar = lre.this;
            synchronized (lreVar.v) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                cxz cxzVar2 = this.a.d.get(i);
                dlh.a(lreVar.F, cxzVar2);
                cxzVar = cxzVar2;
            }
            return cxzVar;
        }
    }

    public final class b {
        public final String a;
        public final long[] b = new long[2];
        public final ArrayList<cxz> c = new ArrayList<>(2);
        public final ArrayList<cxz> d = new ArrayList<>(2);
        public boolean e;
        public boolean f;
        public a g;
        public int h;

        public b(String str) {
            this.a = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(lre.this.a.e(sb.toString()));
                sb.append(".tmp");
                this.d.add(lre.this.a.e(sb.toString()));
                sb.setLength(length);
            }
        }

        public final c a() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList<cxz> arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                lre lreVar = lre.this;
                if (i >= size) {
                    this.h++;
                    return lreVar.new c(this);
                }
                if (!lreVar.F.exists(arrayList.get(i))) {
                    try {
                        lreVar.G(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    public final class c implements AutoCloseable {
        public final b a;
        public boolean b;

        public c(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            lre lreVar = lre.this;
            synchronized (lreVar.v) {
                try {
                    b bVar = this.a;
                    int i = bVar.h - 1;
                    bVar.h = i;
                    if (i == 0 && bVar.f) {
                        lreVar.G(bVar);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @c0d(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return lre.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lre lreVar = lre.this;
            synchronized (lreVar.v) {
                if (!lreVar.B || lreVar.C) {
                    return Unit.a;
                }
                try {
                    lreVar.H();
                } catch (IOException unused) {
                    lreVar.D = true;
                }
                try {
                    if (lreVar.y >= 2000) {
                        lreVar.P();
                    }
                } catch (IOException unused2) {
                    lreVar.E = true;
                    lreVar.z = new x740(new bf4());
                }
                return Unit.a;
            }
        }
    }

    public lre(long j, blh blhVar, cxz cxzVar, CoroutineContext coroutineContext) {
        this.a = cxzVar;
        this.b = j;
        if (j <= 0) {
            hb5.a("maxSize <= 0");
            throw null;
        }
        this.c = cxzVar.e("journal");
        this.d = cxzVar.e("journal.tmp");
        this.e = cxzVar.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(lfe0.a());
        k5b k5bVar = (k5b) coroutineContext.get(k5b.a);
        if (k5bVar == null) {
            pfd pfdVar = fse.a;
            k5bVar = odd.b;
        }
        this.i = w5b.a(coroutineContextPlus.plus(k5bVar.g0(1)));
        this.v = new Object();
        this.F = new mre(blhVar);
    }

    public static void J(String str) {
        if (G.f(str)) {
            return;
        }
        kb5.a(zdf0.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void F(String str) throws IOException {
        String strSubstring;
        int iS = StringsKt.S(str, ' ', 0, 6);
        if (iS == -1) {
            i08.a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iS + 1;
        int iS2 = StringsKt.S(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f;
        if (iS2 == -1) {
            strSubstring = str.substring(i);
            if (iS == 6 && kotlin.text.c.u(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iS2);
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iS2 == -1 || iS != 5 || !kotlin.text.c.u(str, "CLEAN", false)) {
            if (iS2 == -1 && iS == 5 && kotlin.text.c.u(str, "DIRTY", false)) {
                bVar2.g = new a(bVar2);
                return;
            } else {
                if (iS2 == -1 && iS == 4 && kotlin.text.c.u(str, "READ", false)) {
                    return;
                }
                i08.a("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listF0 = StringsKt.f0(str.substring(iS2 + 1), new char[]{' '});
        bVar2.e = true;
        bVar2.g = null;
        if (listF0.size() != 2) {
            jre.a(listF0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listF0.size();
            for (int i2 = 0; i2 < size; i2++) {
                bVar2.b[i2] = Long.parseLong((String) listF0.get(i2));
            }
        } catch (NumberFormatException unused) {
            jre.a(listF0, "unexpected journal line: ");
        }
    }

    public final void G(b bVar) {
        x740 x740Var;
        int i = bVar.h;
        String str = bVar.a;
        if (i > 0 && (x740Var = this.z) != null) {
            x740Var.R("DIRTY");
            x740Var.writeByte(32);
            x740Var.R(str);
            x740Var.writeByte(10);
            x740Var.flush();
        }
        if (bVar.h > 0 || bVar.g != null) {
            bVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.F.delete(bVar.c.get(i2));
            long j = this.w;
            long[] jArr = bVar.b;
            this.w = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.y++;
        x740 x740Var2 = this.z;
        if (x740Var2 != null) {
            x740Var2.R("REMOVE");
            x740Var2.writeByte(32);
            x740Var2.R(str);
            x740Var2.writeByte(10);
            x740Var2.flush();
        }
        this.f.remove(str);
        if (this.y >= 2000) {
            m();
        }
    }

    public final void H() {
        while (this.w > this.b) {
            for (b bVar : this.f.values()) {
                if (!bVar.f) {
                    G(bVar);
                }
            }
            return;
        }
        this.D = false;
    }

    public final void P() {
        Throwable th;
        synchronized (this.v) {
            try {
                x740 x740Var = this.z;
                if (x740Var != null) {
                    x740Var.close();
                }
                x740 x740VarA = z7b.a(this.F.sink(this.d, false));
                try {
                    x740VarA.R("libcore.io.DiskLruCache");
                    x740VarA.writeByte(10);
                    x740VarA.R("1");
                    x740VarA.writeByte(10);
                    x740VarA.s0(3L);
                    x740VarA.writeByte(10);
                    x740VarA.s0(2L);
                    x740VarA.writeByte(10);
                    x740VarA.writeByte(10);
                    for (b bVar : this.f.values()) {
                        if (bVar.g != null) {
                            x740VarA.R("DIRTY");
                            x740VarA.writeByte(32);
                            x740VarA.R(bVar.a);
                            x740VarA.writeByte(10);
                        } else {
                            x740VarA.R("CLEAN");
                            x740VarA.writeByte(32);
                            x740VarA.R(bVar.a);
                            for (long j : bVar.b) {
                                x740VarA.writeByte(32);
                                x740VarA.s0(j);
                            }
                            x740VarA.writeByte(10);
                        }
                    }
                    Unit unit = Unit.a;
                    try {
                        x740VarA.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        x740VarA.close();
                    } catch (Throwable th4) {
                        rtg.a(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zExists = this.F.exists(this.c);
                mre mreVar = this.F;
                if (zExists) {
                    mreVar.atomicMove(this.c, this.e);
                    this.F.atomicMove(this.d, this.c);
                    this.F.delete(this.e);
                } else {
                    mreVar.atomicMove(this.d, this.c);
                }
                this.z = new x740(new z9h(this.F.appendingSink(this.c), new hy0(this, 1)));
                this.y = 0;
                this.A = false;
                this.E = false;
                Unit unit2 = Unit.a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.v) {
            try {
                if (this.B && !this.C) {
                    for (b bVar : (b[]) this.f.values().toArray(new b[0])) {
                        a aVar = bVar.g;
                        if (aVar != null) {
                            b bVar2 = aVar.a;
                            if (Intrinsics.g(bVar2.g, aVar)) {
                                bVar2.f = true;
                            }
                        }
                    }
                    H();
                    w5b.c(this.i, null);
                    x740 x740Var = this.z;
                    x740Var.getClass();
                    x740Var.close();
                    this.z = null;
                    this.C = true;
                    Unit unit = Unit.a;
                    return;
                }
                this.C = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010b A[Catch: all -> 0x0033, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:12:0x0018, B:14:0x001e, B:16:0x002e, B:24:0x003c, B:27:0x0056, B:29:0x0065, B:31:0x0073, B:33:0x007a, B:28:0x005a, B:37:0x009a, B:39:0x00a1, B:42:0x00a6, B:44:0x00b7, B:47:0x00bc, B:52:0x00f7, B:54:0x0102, B:59:0x010e, B:58:0x010b, B:48:0x00d4, B:50:0x00e9, B:51:0x00f4, B:36:0x008a, B:62:0x0112, B:63:0x0119), top: B:66:0x0003 }] */
    public final void d(a aVar, boolean z) {
        synchronized (this.v) {
            b bVar = aVar.a;
            if (!Intrinsics.g(bVar.g, aVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || bVar.f) {
                for (int i = 0; i < 2; i++) {
                    this.F.delete(bVar.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (aVar.c[i2] && !this.F.exists(bVar.d.get(i2))) {
                        aVar.a(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    cxz cxzVar = bVar.d.get(i3);
                    cxz cxzVar2 = bVar.c.get(i3);
                    boolean zExists = this.F.exists(cxzVar);
                    mre mreVar = this.F;
                    if (zExists) {
                        mreVar.atomicMove(cxzVar, cxzVar2);
                    } else {
                        dlh.a(mreVar, bVar.c.get(i3));
                    }
                    long j = bVar.b[i3];
                    Long l = this.F.metadata(cxzVar2).d;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    bVar.b[i3] = jLongValue;
                    this.w = (this.w - j) + jLongValue;
                }
            }
            bVar.g = null;
            if (bVar.f) {
                G(bVar);
                return;
            }
            this.y++;
            x740 x740Var = this.z;
            x740Var.getClass();
            if (z || bVar.e) {
                bVar.e = true;
                x740Var.R("CLEAN");
                x740Var.writeByte(32);
                x740Var.R(bVar.a);
                for (long j2 : bVar.b) {
                    x740Var.writeByte(32);
                    x740Var.s0(j2);
                }
                x740Var.writeByte(10);
            } else {
                this.f.remove(bVar.a);
                x740Var.R("REMOVE");
                x740Var.writeByte(32);
                x740Var.R(bVar.a);
                x740Var.writeByte(10);
            }
            x740Var.flush();
            if (this.w > this.b) {
                m();
            } else if (this.y >= 2000) {
                m();
            }
            Unit unit = Unit.a;
        }
    }

    public final a f(String str) {
        synchronized (this.v) {
            if (this.C) {
                throw new IllegalStateException("cache is closed");
            }
            J(str);
            l();
            b bVar = (b) this.f.get(str);
            if ((bVar != null ? bVar.g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.h != 0) {
                return null;
            }
            if (!this.D && !this.E) {
                x740 x740Var = this.z;
                x740Var.getClass();
                x740Var.R("DIRTY");
                x740Var.writeByte(32);
                x740Var.R(str);
                x740Var.writeByte(10);
                x740Var.flush();
                if (this.A) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(str);
                    this.f.put(str, bVar);
                }
                a aVar = new a(bVar);
                bVar.g = aVar;
                return aVar;
            }
            m();
            return null;
        }
    }

    public final c g(String str) {
        c cVarA;
        synchronized (this.v) {
            if (this.C) {
                throw new IllegalStateException("cache is closed");
            }
            J(str);
            l();
            b bVar = (b) this.f.get(str);
            if (bVar != null && (cVarA = bVar.a()) != null) {
                boolean z = true;
                this.y++;
                x740 x740Var = this.z;
                x740Var.getClass();
                x740Var.R("READ");
                x740Var.writeByte(32);
                x740Var.R(str);
                x740Var.writeByte(10);
                x740Var.flush();
                if (this.y < 2000) {
                    z = false;
                }
                if (z) {
                    m();
                }
                return cVarA;
            }
            return null;
        }
    }

    public final void l() {
        synchronized (this.v) {
            try {
                if (this.B) {
                    return;
                }
                this.F.delete(this.d);
                if (this.F.exists(this.e)) {
                    boolean zExists = this.F.exists(this.c);
                    mre mreVar = this.F;
                    cxz cxzVar = this.e;
                    if (zExists) {
                        mreVar.delete(cxzVar);
                    } else {
                        mreVar.atomicMove(cxzVar, this.c);
                    }
                }
                if (this.F.exists(this.c)) {
                    try {
                        u();
                        o();
                        this.B = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            dlh.b(this.F, this.a);
                            this.C = false;
                            P();
                            this.B = true;
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            this.C = false;
                            throw th;
                        }
                    }
                }
                P();
                this.B = true;
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        ej5.c(this.i, null, null, new d(null), 3);
    }

    public final void o() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i = 0;
            if (bVar.g == null) {
                while (i < 2) {
                    j += bVar.b[i];
                    i++;
                }
            } else {
                bVar.g = null;
                while (i < 2) {
                    cxz cxzVar = bVar.c.get(i);
                    mre mreVar = this.F;
                    mreVar.delete(cxzVar);
                    mreVar.delete(bVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.w = j;
    }

    public final void u() throws Throwable {
        mre mreVar = this.F;
        cxz cxzVar = this.c;
        y740 y740VarB = z7b.b(mreVar.source(cxzVar));
        try {
            String strM = y740VarB.M(Long.MAX_VALUE);
            String strM2 = y740VarB.M(Long.MAX_VALUE);
            String strM3 = y740VarB.M(Long.MAX_VALUE);
            String strM4 = y740VarB.M(Long.MAX_VALUE);
            String strM5 = y740VarB.M(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM) || !"1".equals(strM2) || !Intrinsics.g(String.valueOf(3), strM3) || !Intrinsics.g(String.valueOf(2), strM4) || strM5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM3 + ", " + strM4 + ", " + strM5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    F(y740VarB.M(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.y = i - this.f.size();
                    if (y740VarB.N0()) {
                        this.z = new x740(new z9h(mreVar.appendingSink(cxzVar), new hy0(this, 1)));
                    } else {
                        P();
                    }
                    Unit unit = Unit.a;
                    try {
                        y740VarB.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                y740VarB.close();
            } catch (Throwable th3) {
                rtg.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }
}
