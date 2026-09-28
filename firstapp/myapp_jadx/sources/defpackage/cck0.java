package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class cck0 extends blh {
    public static final cxz d;
    public final cxz a;
    public final blh b;
    public final LinkedHashMap c;

    static {
        String str = cxz.b;
        d = cxz.a.a("/");
    }

    public cck0(cxz cxzVar, blh blhVar, LinkedHashMap linkedHashMap) {
        blhVar.getClass();
        this.a = cxzVar;
        this.b = blhVar;
        this.c = linkedHashMap;
    }

    @Override // defpackage.blh
    public final uw90 appendingSink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.blh
    public final void atomicMove(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.blh
    public final cxz canonicalize(cxz cxzVar) throws FileNotFoundException {
        cxzVar.getClass();
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        cxz cxzVarA = i.a(cxzVar2, cxzVar, true);
        if (this.c.containsKey(cxzVarA)) {
            return cxzVarA;
        }
        throw new FileNotFoundException(String.valueOf(cxzVar));
    }

    @Override // defpackage.blh
    public final void createDirectory(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.blh
    public final void createSymlink(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final List<cxz> d(cxz cxzVar, boolean z) throws IOException {
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        cxzVar.getClass();
        bck0 bck0Var = (bck0) this.c.get(i.a(cxzVar2, cxzVar, true));
        if (bck0Var != null) {
            return CollectionsKt.A0(bck0Var.q);
        }
        if (!z) {
            return null;
        }
        i08.a(alh.a(cxzVar, "not a directory: "));
        return null;
    }

    @Override // defpackage.blh
    public final void delete(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.blh
    public final List<cxz> list(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        List<cxz> listD = d(cxzVar, true);
        listD.getClass();
        return listD;
    }

    @Override // defpackage.blh
    public final List<cxz> listOrNull(cxz cxzVar) {
        cxzVar.getClass();
        return d(cxzVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.blh
    public final kkh metadataOrNull(cxz cxzVar) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        cxzVar.getClass();
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        bck0 bck0VarF = (bck0) this.c.get(i.a(cxzVar2, cxzVar, true));
        if (bck0VarF == null) {
            return null;
        }
        long j = bck0VarF.h;
        if (j != -1) {
            bkh bkhVarOpenReadOnly = this.b.openReadOnly(this.a);
            try {
                y740 y740Var = new y740(bkhVarOpenReadOnly.l(j));
                try {
                    bck0VarF = ick0.f(y740Var, bck0VarF);
                    bck0VarF.getClass();
                    try {
                        y740Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        y740Var.close();
                    } catch (Throwable th5) {
                        rtg.a(th4, th5);
                    }
                    th2 = th4;
                    bck0VarF = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    bkhVarOpenReadOnly.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (bkhVarOpenReadOnly != null) {
                    try {
                        bkhVarOpenReadOnly.close();
                    } catch (Throwable th8) {
                        rtg.a(th7, th8);
                    }
                }
                th = th7;
                bck0VarF = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = bck0VarF.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(bck0VarF.f);
        Long l2 = bck0VarF.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = bck0VarF.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = bck0VarF.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = bck0VarF.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = bck0VarF.j;
                if (i != -1) {
                    int i2 = bck0VarF.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = bck0VarF.l;
        if (l4 == null) {
            Integer num3 = bck0VarF.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new kkh(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new kkh(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.blh
    public final bkh openReadOnly(cxz cxzVar) {
        cxzVar.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.blh
    public final bkh openReadWrite(cxz cxzVar, boolean z, boolean z2) throws IOException {
        cxzVar.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.blh
    public final uw90 sink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.blh
    public final zpa0 source(cxz cxzVar) throws Throwable {
        y740 y740Var;
        Throwable th;
        cxzVar.getClass();
        cxz cxzVar2 = d;
        cxzVar2.getClass();
        bck0 bck0Var = (bck0) this.c.get(i.a(cxzVar2, cxzVar, true));
        if (bck0Var == null) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
        long j = bck0Var.f;
        bkh bkhVarOpenReadOnly = this.b.openReadOnly(this.a);
        try {
            y740Var = new y740(bkhVarOpenReadOnly.l(bck0Var.h));
            try {
                bkhVarOpenReadOnly.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (bkhVarOpenReadOnly != null) {
                try {
                    bkhVarOpenReadOnly.close();
                } catch (Throwable th4) {
                    rtg.a(th3, th4);
                }
            }
            y740Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        y740Var.getClass();
        ick0.f(y740Var, null);
        return bck0Var.g == 0 ? new sth(y740Var, j, true) : new sth(new lgn(new sth(y740Var, bck0Var.e, true), new Inflater(true)), j, false);
    }
}
