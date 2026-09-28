package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class a4j0 implements aiv {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ niv b;
    public final /* synthetic */ twa c;
    public final /* synthetic */ ytw d;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ niv a;
        public final /* synthetic */ List b;
        public final /* synthetic */ LinkedHashMap c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(niv nivVar, List list, LinkedHashMap linkedHashMap) {
            super(1);
            this.a = nivVar;
            this.b = list;
            this.c = linkedHashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            List<? extends vhv> list = this.b;
            LinkedHashMap linkedHashMap = this.c;
            this.a.e(aVar, list, linkedHashMap);
            return Unit.a;
        }
    }

    public a4j0(ytw ytwVar, niv nivVar, twa twaVar, ytw ytwVar2) {
        this.a = ytwVar;
        this.b = nivVar;
        this.c = twaVar;
        this.d = ytwVar2;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a.getValue();
        long jF = this.b.f(j, tVar.getLayoutDirection(), this.c, list, linkedHashMap);
        this.d.getValue();
        return t.z1(tVar, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.b, list, linkedHashMap));
    }
}
