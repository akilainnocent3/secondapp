package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@fae
public abstract class l620<T> extends aqc<Integer, T> {

    public static abstract class a<T> {
    }

    public static class b {
    }

    public static abstract class c<T> {
    }

    public static class d {
    }

    @Override // defpackage.aqc
    public final Integer a(Object obj) {
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aqc
    public final Object b(aqc.g gVar, w5s w5sVar) throws Throwable {
        kxs kxsVar = gVar.a;
        boolean z = gVar.d;
        K k = gVar.b;
        int iMin = gVar.e;
        kxs kxsVar2 = kxs.a;
        h0p<aqc.e> h0pVar = this.b;
        if (kxsVar != kxsVar2) {
            k.getClass();
            int iIntValue = ((Number) k).intValue();
            if (kxsVar == kxs.b) {
                iMin = Math.min(iMin, iIntValue);
                iIntValue -= iMin;
            }
            bc6 bc6Var = new bc6(1, yzo.b(w5sVar));
            bc6Var.q();
            List listSubList = ((jct.a) this).c.subList(iIntValue, iMin);
            listSubList.getClass();
            Integer numValueOf = iIntValue != 0 ? Integer.valueOf(iIntValue) : null;
            if (h0pVar.e) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(new aqc.c(m2g.a, null, null, 0, 0));
            } else {
                zi50.a aVar2 = zi50.b;
                bc6Var.resumeWith(new aqc.c(listSubList, numValueOf, Integer.valueOf(listSubList.size() + iIntValue), Integer.MIN_VALUE, Integer.MIN_VALUE));
            }
            Object objO = bc6Var.o();
            y5b y5bVar = y5b.a;
            return objO;
        }
        int iMax = gVar.c;
        int iMax2 = 0;
        if (k != 0) {
            int iIntValue2 = ((Number) k).intValue();
            if (z) {
                iMax = Math.max(iMax / iMin, 2) * iMin;
                iMax2 = Math.max(0, ((iIntValue2 - (iMax / 2)) / iMin) * iMin);
            } else {
                iMax2 = Math.max(0, iIntValue2 - (iMax / 2));
            }
        }
        if (iMax2 < 0) {
            q1b.a(hce0.a(iMax2, "invalid start position: "));
            throw null;
        }
        if (iMax < 0) {
            q1b.a(hce0.a(iMax, "invalid load size: "));
            throw null;
        }
        if (iMin < 0) {
            q1b.a(hce0.a(iMin, "invalid page size: "));
            throw null;
        }
        bc6 bc6Var2 = new bc6(1, yzo.b(w5sVar));
        bc6Var2.q();
        ArrayList arrayList = ((jct.a) this).c;
        int size = arrayList.size();
        if (h0pVar.e) {
            zi50.a aVar3 = zi50.b;
            bc6Var2.resumeWith(new aqc.c(m2g.a, null, null, 0, 0));
        } else {
            int size2 = arrayList.size();
            Integer numValueOf2 = size2 == size ? null : Integer.valueOf(size2);
            int size3 = size - arrayList.size();
            aqc.c cVar = new aqc.c(arrayList, null, numValueOf2, 0, size3);
            if (z) {
                if (size3 == Integer.MIN_VALUE) {
                    ib5.a("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
                    return null;
                }
                if (size3 > 0 && arrayList.size() % iMin != 0) {
                    int size4 = arrayList.size() + size3;
                    throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + arrayList.size() + ", position 0, totalCount " + size4 + ", pageSize " + iMin);
                }
                if (0 % iMin != 0) {
                    hb5.a(hce0.a(iMin, "Initial load must be pageSize aligned.Position = 0, pageSize = "));
                    return null;
                }
            }
            zi50.a aVar4 = zi50.b;
            bc6Var2.resumeWith(cVar);
        }
        Object objO2 = bc6Var2.o();
        y5b y5bVar2 = y5b.a;
        return objO2;
    }
}
