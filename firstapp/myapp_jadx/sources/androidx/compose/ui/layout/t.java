package androidx.compose.ui.layout;

import defpackage.biv;
import defpackage.kt;
import defpackage.nzo;
import defpackage.o2g;
import defpackage.r160;
import defpackage.wkn;
import defpackage.xkt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface t extends nzo {

    public static final class a implements biv {
        public final int a;
        public final int b;
        public final Map<kt, Integer> c;
        public final Function1<r160, Unit> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ t f;
        public final /* synthetic */ Function1<y.a, Unit> g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, t tVar, Function1<? super y.a, Unit> function2) {
            this.e = i;
            this.f = tVar;
            this.g = function2;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
        }

        @Override // defpackage.biv
        public final int b() {
            return this.b;
        }

        @Override // defpackage.biv
        public final int c() {
            return this.a;
        }

        @Override // defpackage.biv
        public final void l() {
            t tVar = this.f;
            boolean z = tVar instanceof xkt;
            Function1<y.a, Unit> function1 = this.g;
            if (z) {
                function1.invoke(((xkt) tVar).A);
                return;
            }
            function1.invoke(new e0(this.e, tVar.getLayoutDirection(), tVar.getDensity(), tVar.y1()));
        }

        @Override // defpackage.biv
        public final Function1<r160, Unit> m() {
            return this.d;
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.c;
        }
    }

    static biv X0(t tVar, int i, int i2, Function1 function1, Function1 function2) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return tVar.K1(i, i2, o2gVar, function1, function2);
    }

    static biv z1(t tVar, int i, int i2, Function1 function1) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return tVar.e1(i, i2, o2gVar, function1);
    }

    default biv K1(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wkn.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, function1, this, function2);
    }

    default biv e1(int i, int i2, Map<kt, Integer> map, Function1<? super y.a, Unit> function1) {
        return K1(i, i2, map, null, function1);
    }
}
