package androidx.compose.animation;

import androidx.compose.ui.layout.y;
import defpackage.aiv;
import defpackage.asr;
import defpackage.biv;
import defpackage.jxo;
import defpackage.mzo;
import defpackage.nzo;
import defpackage.qlr;
import defpackage.vhv;
import defpackage.x5a0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements aiv {
    public final AnimatedContentTransitionScopeImpl<?> a;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y[] a;
        public final /* synthetic */ c b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y[] yVarArr, c cVar, int i, int i2) {
            super(1);
            this.a = yVarArr;
            this.b = cVar;
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a aVar2 = aVar;
            for (y yVar : this.a) {
                if (yVar != null) {
                    long jA = this.b.a.b.a((((long) yVar.a) << 32) | (((long) yVar.b) & 4294967295L), (((long) this.c) << 32) | (((long) this.d) & 4294967295L), asr.a);
                    aVar2.s(yVar, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                }
            }
            return Unit.a;
        }
    }

    public c(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.a = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).b0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).b0(i));
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.aiv
    public final biv c(androidx.compose.ui.layout.t tVar, List<? extends vhv> list, long j) {
        y yVar;
        int i;
        y yVar2;
        int i2;
        int i3;
        int size = list.size();
        y[] yVarArr = new y[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            yVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            vhv vhvVar = list.get(i4);
            Object objG = vhvVar.g();
            AnimatedContentTransitionScopeImpl.a aVar = objG instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) objG : null;
            if (aVar != null && ((Boolean) ((x5a0) aVar.b).getValue()).booleanValue()) {
                y yVarD0 = vhvVar.d0(j);
                long j3 = (((long) yVarD0.b) & 4294967295L) | (((long) yVarD0.a) << 32);
                Unit unit = Unit.a;
                yVarArr[i4] = yVarD0;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            vhv vhvVar2 = list.get(i5);
            if (yVarArr[i5] == null) {
                yVarArr[i5] = vhvVar2.d0(j);
            }
        }
        if (tVar.q0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                yVar2 = yVarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = yVar2 != null ? yVar2.a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            y yVar3 = yVarArr[i8];
                            int i9 = yVar3 != null ? yVar3.a : 0;
                            if (i7 < i9) {
                                yVar2 = yVar3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                yVar2 = null;
            }
            i2 = yVar2 != null ? yVar2.a : 0;
        }
        if (tVar.q0()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                yVar = yVarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = yVar != null ? yVar.b : 0;
                    if (1 <= i10) {
                        while (true) {
                            y yVar4 = yVarArr[i];
                            int i12 = yVar4 != null ? yVar4.b : 0;
                            if (i11 < i12) {
                                yVar = yVar4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = yVar != null ? yVar.b : 0;
        }
        if (!tVar.q0()) {
            ((x5a0) this.a.c).setValue(new jxo((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return androidx.compose.ui.layout.t.z1(tVar, i2, i3, new a(yVarArr, this, i2, i3));
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).a0(i));
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
