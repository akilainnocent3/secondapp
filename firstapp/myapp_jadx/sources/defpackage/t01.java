package defpackage;

import androidx.recyclerview.widget.b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class t01 extends rqz<Object> {
    public final /* synthetic */ v01<Object> m;

    /* JADX WARN: Illegal instructions before constructor call */
    public t01(v01<Object> v01Var, CoroutineContext coroutineContext) {
        this.m = v01Var;
        if ((2 & 1) != 0) {
            pfd pfdVar = fse.a;
            coroutineContext = gku.a;
        }
        super(coroutineContext, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.rqz
    public final Object c(qqz qqzVar, x1b x1bVar) {
        r01 r01Var;
        t01 t01Var;
        qqz.e eVar;
        v01<Object> v01Var = this.m;
        b bVar = v01Var.b;
        if (x1bVar instanceof r01) {
            r01Var = (r01) x1bVar;
            int i = r01Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r01Var.f = i - Integer.MIN_VALUE;
            } else {
                r01Var = new r01(this, x1bVar);
            }
        } else {
            r01Var = new r01(this, x1bVar);
        }
        Object objD = r01Var.d;
        y5b y5bVar = y5b.a;
        int i2 = r01Var.f;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                if (qqzVar instanceof qqz.e) {
                    qqz.e eVar2 = (qqz.e) qqzVar;
                    ynz ynzVar = eVar2.a;
                    mi10<Object> mi10Var = eVar2.b;
                    if (mi10Var.a() == 0) {
                        if (ynzVar.a() > 0) {
                            bVar.onInserted(0, ynzVar.a());
                        }
                    } else if (ynzVar.a() != 0) {
                        v01Var.g.set(mi10Var);
                        CoroutineContext coroutineContext = v01Var.d;
                        s01 s01Var = new s01(eVar2, v01Var, null);
                        r01Var.a = this;
                        r01Var.b = v01Var;
                        r01Var.c = eVar2;
                        r01Var.f = 1;
                        objD = ej5.d(coroutineContext, s01Var, r01Var);
                        if (objD == y5bVar) {
                            return y5bVar;
                        }
                        t01Var = this;
                        eVar = eVar2;
                    } else if (mi10Var.a() > 0) {
                        bVar.onRemoved(0, mi10Var.a());
                    }
                } else if (qqzVar instanceof qqz.d) {
                    qqz.d dVar = (qqz.d) qqzVar;
                    int i3 = dVar.c;
                    int size = dVar.a.size();
                    int iMin = Math.min(i3, size);
                    int i4 = i3 - iMin;
                    int i5 = size - iMin;
                    if (iMin > 0) {
                        bVar.onChanged(i4, iMin, null);
                    }
                    if (i5 > 0) {
                        bVar.onInserted(0, i5);
                    }
                    int i6 = (dVar.b - i3) + iMin;
                    if (i6 > 0) {
                        bVar.onInserted(0, i6);
                    } else if (i6 < 0) {
                        bVar.onRemoved(0, -i6);
                    }
                } else if (qqzVar instanceof qqz.a) {
                    qqz.a aVar = (qqz.a) qqzVar;
                    int i7 = aVar.a;
                    int i8 = aVar.d;
                    int size2 = aVar.b.size();
                    int iMin2 = Math.min(i8, size2);
                    int i9 = size2 - iMin2;
                    int i10 = i7 + iMin2;
                    if (iMin2 > 0) {
                        bVar.onChanged(i7, iMin2, null);
                    }
                    if (i9 > 0) {
                        bVar.onInserted(i10, i9);
                    }
                    int i11 = aVar.c;
                    int i12 = (i11 - i8) + iMin2;
                    int i13 = i7 + size2 + i11;
                    if (i12 > 0) {
                        bVar.onInserted(i13 - i12, i12);
                    } else if (i12 < 0) {
                        bVar.onRemoved(i13, -i12);
                    }
                } else if (qqzVar instanceof qqz.c) {
                    qqz.c cVar = (qqz.c) qqzVar;
                    int i14 = cVar.c;
                    int i15 = cVar.b;
                    int i16 = (i15 - cVar.a) - i14;
                    if (i16 > 0) {
                        bVar.onInserted(0, i16);
                    } else if (i16 < 0) {
                        bVar.onRemoved(0, -i16);
                    }
                    int iMax = Math.max(0, i14 + i16);
                    int i17 = i15 - iMax;
                    if (i17 > 0) {
                        bVar.onChanged(iMax, i17, null);
                    }
                } else if (qqzVar instanceof qqz.b) {
                    qqz.b bVar2 = (qqz.b) qqzVar;
                    int i18 = bVar2.a;
                    int i19 = bVar2.c;
                    int i20 = bVar2.d;
                    int i21 = (i19 - bVar2.b) - i20;
                    int i22 = i18 + i19;
                    if (i21 > 0) {
                        bVar.onInserted(i22 - i21, i21);
                    } else if (i21 < 0) {
                        bVar.onRemoved(i22, -i21);
                    }
                    int iMin3 = (i19 - i20) + (i21 < 0 ? Math.min(i20, -i21) : 0);
                    if (iMin3 > 0) {
                        bVar.onChanged(i18, iMin3, null);
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = r01Var.c;
            v01Var = r01Var.b;
            t01Var = r01Var.a;
            uj50.b(objD);
            li10 li10Var = (li10) objD;
            v01Var.g.set(null);
            mi10<T> mi10Var2 = eVar.b;
            ynz ynzVar2 = eVar.a;
            ni10.b(mi10Var2, v01Var.b, ynzVar2, li10Var);
            int iC = ni10.c(eVar.b, li10Var, ynzVar2, v01Var.f);
            v01Var.f = iC;
            t01Var.a(iC);
            return Unit.a;
        } catch (Throwable th) {
            v01Var.g.set(null);
            throw th;
        }
    }
}
