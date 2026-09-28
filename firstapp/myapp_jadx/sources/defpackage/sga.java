package defpackage;

import androidx.compose.animation.d;
import androidx.compose.animation.g;
import androidx.compose.runtime.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lsga;", "Lvkx;", "Lsga$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vkx.a("composable")
public final class sga extends vkx<a> {
    public final ytw<Boolean> c = m.b(Boolean.FALSE);

    public static final class a extends ygx {
        public final iaj<pf0, ifx, androidx.compose.runtime.a, Integer, Unit> i;
        public Function1<d<ifx>, s9g> v;
        public Function1<d<ifx>, g> w;
        public Function1<d<ifx>, s9g> y;
        public Function1<d<ifx>, g> z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(sga sgaVar, iaj<? super pf0, ifx, ? super androidx.compose.runtime.a, ? super Integer, Unit> iajVar) {
            super(sgaVar);
            this.i = iajVar;
        }
    }

    @Override // defpackage.vkx
    public final ygx a() {
        return new a(this, iv8.a);
    }

    @Override // defpackage.vkx
    public final void d(List list, zix zixVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((ifx) it.next());
        }
        ((x5a0) this.c).setValue(Boolean.FALSE);
    }

    @Override // defpackage.vkx
    public final void i(ifx ifxVar, boolean z) {
        b().e(ifxVar, z);
        ((x5a0) this.c).setValue(Boolean.TRUE);
    }
}
