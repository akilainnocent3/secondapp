package defpackage;

import java.util.Random;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class nx30 extends vth {

    public static class a implements pb50 {
        public final ijt a;
        public final Supplier<Random> b;

        public a(Supplier<Random> supplier) {
            this.a = kl.a ? new ubp() : new w11();
            this.b = supplier;
        }

        @Override // defpackage.pb50
        public final int a(ob50[] ob50VarArr, long j) {
            return c(ob50VarArr);
        }

        @Override // defpackage.pb50
        public final int b(ob50[] ob50VarArr, double d) {
            return c(ob50VarArr);
        }

        public final int c(ob50[] ob50VarArr) {
            ijt ijtVar = this.a;
            int iSum = ((int) ijtVar.sum()) + 1;
            int iNextInt = this.b.get().nextInt(iSum > 0 ? iSum : 1);
            ijtVar.add(1L);
            if (iNextInt < ob50VarArr.length) {
                return iNextInt;
            }
            return -1;
        }
    }
}
