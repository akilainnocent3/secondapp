package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f1g0 implements aiv {
    public final fxh a;
    public final n54.a b;
    public final float c;

    public f1g0(fxh fxhVar, n54.a aVar, float f) {
        this.a = fxhVar;
        this.b = aVar;
        this.c = f;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        int size = list.size();
        int iB0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iB0 += list.get(i2).b0(i);
        }
        return iB0;
    }

    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, final long j) {
        int i;
        int size = list.size();
        final int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            vhv vhvVar = list.get(i3);
            if (Intrinsics.g(i.a(vhvVar), "navigationIcon")) {
                final y yVarD0 = vhvVar.d0(kxa.b(0, 0, 0, 0, 14, j));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    vhv vhvVar2 = list.get(i4);
                    if (Intrinsics.g(i.a(vhvVar2), "actionIcons")) {
                        final y yVarD1 = vhvVar2.d0(kxa.b(0, 0, 0, 0, 14, j));
                        if (kxa.i(j) == Integer.MAX_VALUE) {
                            i = kxa.i(j);
                        } else {
                            i = (kxa.i(j) - yVarD0.a) - yVarD1.a;
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            vhv vhvVar3 = list.get(i6);
                            if (Intrinsics.g(i.a(vhvVar3), "title")) {
                                final y yVarD2 = vhvVar3.d0(kxa.b(0, i5, 0, 0, 12, j));
                                mjm mjmVar = mt.b;
                                final int iF0 = yVarD2.f0(mjmVar) != Integer.MIN_VALUE ? yVarD2.f0(mjmVar) : 0;
                                float fInvoke = this.a.invoke();
                                int iB = Float.isNaN(fInvoke) ? 0 : ycv.b(fInvoke);
                                final int iMax = Math.max(tVar.y0(this.c), yVarD2.b);
                                if (kxa.h(j) == Integer.MAX_VALUE) {
                                    i2 = iMax;
                                } else {
                                    int i7 = iB + iMax;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                return t.z1(tVar, kxa.i(j), i2, new Function1(i2, yVarD2, yVarD1, j, tVar, this, iF0, iMax) { // from class: e1g0
                                    public final /* synthetic */ int b;
                                    public final /* synthetic */ y c;
                                    public final /* synthetic */ y d;
                                    public final /* synthetic */ long e;
                                    public final /* synthetic */ t f;
                                    public final /* synthetic */ f1g0 i;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i8;
                                        y.a aVar = (y.a) obj;
                                        y yVar = this.a;
                                        int i9 = yVar.b;
                                        int i10 = this.b;
                                        y.a.A(aVar, yVar, 0, (i10 - i9) / 2);
                                        int iMax2 = Math.max(this.f.y0(vp0.c), yVar.a);
                                        y yVar2 = this.d;
                                        int i11 = yVar2.a;
                                        n54.a aVar2 = this.i.b;
                                        y yVar3 = this.c;
                                        int i12 = yVar3.a;
                                        long j2 = this.e;
                                        int iA = aVar2.a(i12, kxa.i(j2), asr.a);
                                        if (iA >= iMax2) {
                                            if (yVar3.a + iA > kxa.i(j2) - i11) {
                                                i8 = (kxa.i(j2) - i11) - (yVar3.a + iA);
                                            }
                                            y.a.A(aVar, yVar3, iA, (i10 - yVar3.b) / 2);
                                            y.a.A(aVar, yVar2, kxa.i(j2) - yVar2.a, (i10 - yVar2.b) / 2);
                                            return Unit.a;
                                        }
                                        i8 = iMax2 - iA;
                                        iA += i8;
                                        y.a.A(aVar, yVar3, iA, (i10 - yVar3.b) / 2);
                                        y.a.A(aVar, yVar2, kxa.i(j2) - yVar2.a, (i10 - yVar2.b) / 2);
                                        return Unit.a;
                                    }
                                });
                            }
                            i6++;
                            this = this;
                        }
                        throw hu1.a("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    this = this;
                }
                throw hu1.a("Collection contains no element matching the predicate.");
            }
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        int size = list.size();
        int iA0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA0 += list.get(i2).a0(i);
        }
        return iA0;
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
        int iY0 = nzoVar.y0(this.c);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).x(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).x(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iY0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
        int iY0 = nzoVar.y0(this.c);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).R(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).R(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iY0, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
