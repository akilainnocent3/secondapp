package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 implements aiv {
    public final kh0 a;
    public boolean b;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ ArrayList a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a aVar2 = aVar;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aVar2.s((y) arrayList.get(i), 0, 0, 0.0f);
            }
            return Unit.a;
        }
    }

    public rf0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB0 = list.get(0).b0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB1 = list.get(i2).b0(i);
                if (iB1 > iB0) {
                    iB0 = iB1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iB0;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            y yVarD0 = list.get(i).d0(j);
            iMax = Math.max(iMax, yVarD0.a);
            iMax2 = Math.max(iMax2, yVarD0.b);
            arrayList.add(yVarD0);
        }
        boolean zQ0 = tVar.q0();
        kh0 kh0Var = this.a;
        if (zQ0) {
            this.b = true;
            ((x5a0) kh0Var.b).setValue(new jxo((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            ((x5a0) kh0Var.b).setValue(new jxo((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return t.z1(tVar, iMax, iMax2, new a(arrayList));
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = list.get(0).a0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA1 = list.get(i2).a0(i);
                if (iA1 > iA0) {
                    iA0 = iA1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA0;
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iX = list.get(0).x(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iX2 = list.get(i2).x(i);
                if (iX2 > iX) {
                    iX = iX2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iX;
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iR = list.get(0).R(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iR2 = list.get(i2).R(i);
                if (iR2 > iR) {
                    iR = iR2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iR;
    }
}
