package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lvle;", "Lvkx;", "Lvle$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vkx.a("dialog")
public final class vle extends vkx<a> {

    public static final class a extends ygx implements jyh {
        public final yle i;
        public final op8 v;

        public a(vle vleVar, yle yleVar, op8 op8Var) {
            super(vleVar);
            this.i = yleVar;
            this.v = op8Var;
        }
    }

    @Override // defpackage.vkx
    public final ygx a() {
        return new a(this, new yle(false, false, 7), zy8.a);
    }

    @Override // defpackage.vkx
    public final void d(List list, zix zixVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().g((ifx) it.next());
        }
    }

    @Override // defpackage.vkx
    public final void i(ifx ifxVar, boolean z) {
        b().e(ifxVar, z);
        int iW = CollectionsKt.W((Iterable) b().f.a.getValue(), ifxVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            ifx ifxVar2 = (ifx) obj;
            if (i > iW) {
                b().b(ifxVar2);
            }
            i = i2;
        }
    }
}
