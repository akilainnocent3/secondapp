package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class puh<T> {
    public final quh<T> a = new quh<>();
    public final tuw b = uuw.a();
    public int c = -1;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(x1b x1bVar) {
        nuh nuhVar;
        tuw tuwVar;
        if (x1bVar instanceof nuh) {
            nuhVar = (nuh) x1bVar;
            int i = nuhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nuhVar.e = i - Integer.MIN_VALUE;
            } else {
                nuhVar = new nuh(this, x1bVar);
            }
        } else {
            nuhVar = new nuh(this, x1bVar);
        }
        Object obj = nuhVar.c;
        y5b y5bVar = y5b.a;
        int i2 = nuhVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            nuhVar.a = this;
            tuwVar = this.b;
            nuhVar.b = tuwVar;
            nuhVar.e = 1;
            if (tuwVar.d(nuhVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = nuhVar.b;
            puh<T> puhVar = nuhVar.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            this = puhVar;
        }
        try {
            List<xmz<T>> listB = this.a.b();
            int size = (this.c - listB.size()) + 1;
            ArrayList arrayList = new ArrayList(l48.r(listB, 10));
            int i3 = 0;
            for (T t : listB) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                arrayList.add(new IndexedValue(i3 + size, (xmz) t));
                i3 = i4;
            }
            tuwVar.f(null);
            return arrayList;
        } catch (Throwable th) {
            tuwVar.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(IndexedValue indexedValue, x1b x1bVar) {
        ouh ouhVar;
        tuw tuwVar;
        if (x1bVar instanceof ouh) {
            ouhVar = (ouh) x1bVar;
            int i = ouhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ouhVar.f = i - Integer.MIN_VALUE;
            } else {
                ouhVar = new ouh(this, x1bVar);
            }
        } else {
            ouhVar = new ouh(this, x1bVar);
        }
        Object obj = ouhVar.d;
        y5b y5bVar = y5b.a;
        int i2 = ouhVar.f;
        if (i2 == 0) {
            uj50.b(obj);
            ouhVar.a = this;
            ouhVar.b = indexedValue;
            tuwVar = this.b;
            ouhVar.c = tuwVar;
            ouhVar.f = 1;
            if (tuwVar.d(ouhVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = ouhVar.c;
            indexedValue = ouhVar.b;
            puh<T> puhVar = ouhVar.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            this = puhVar;
        }
        try {
            this.c = indexedValue.a;
            this.a.a((xmz) indexedValue.b);
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }
}
