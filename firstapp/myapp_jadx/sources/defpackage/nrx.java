package defpackage;

import com.sportybet.feature.dedicatedteampage.article.data.model.VideoDetailDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nrx implements krx {
    public final frx a;

    public nrx(frx frxVar) {
        this.a = frxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.krx
    public final Object a(String str, x1b x1bVar) {
        lrx lrxVar;
        Object objA;
        if (x1bVar instanceof lrx) {
            lrxVar = (lrx) x1bVar;
            int i = lrxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrxVar.c = i - Integer.MIN_VALUE;
            } else {
                lrxVar = new lrx(this, x1bVar);
            }
        } else {
            lrxVar = new lrx(this, x1bVar);
        }
        Object obj = lrxVar.a;
        y5b y5bVar = y5b.a;
        int i2 = lrxVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            lrxVar.c = 1;
            objA = this.a.a(str, lrxVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objA instanceof zi50.b) {
            return objA;
        }
        try {
            List list = (List) objA;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p3i0.a((VideoDetailDto) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.krx
    public final Object b(String str, x1b x1bVar) {
        mrx mrxVar;
        Object objB;
        if (x1bVar instanceof mrx) {
            mrxVar = (mrx) x1bVar;
            int i = mrxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrxVar.c = i - Integer.MIN_VALUE;
            } else {
                mrxVar = new mrx(this, x1bVar);
            }
        } else {
            mrxVar = new mrx(this, x1bVar);
        }
        Object obj = mrxVar.a;
        y5b y5bVar = y5b.a;
        int i2 = mrxVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            mrxVar.c = 1;
            objB = this.a.b(str, mrxVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objB instanceof zi50.b) {
            return objB;
        }
        try {
            return p3i0.a((VideoDetailDto) objB);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }
}
