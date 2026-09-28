package defpackage;

import com.sportybet.feature.dedicatedteampage.shared.data.model.PaginatedResponseDto;

/* JADX INFO: loaded from: classes6.dex */
public final class jrx implements frx {
    public final brx a;

    public jrx(brx brxVar) {
        this.a = brxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.frx
    public final Object a(String str, x1b x1bVar) {
        hrx hrxVar;
        Object objA;
        if (x1bVar instanceof hrx) {
            hrxVar = (hrx) x1bVar;
            int i = hrxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrxVar.c = i - Integer.MIN_VALUE;
            } else {
                hrxVar = new hrx(this, x1bVar);
            }
        } else {
            hrxVar = new hrx(this, x1bVar);
        }
        Object obj = hrxVar.a;
        y5b y5bVar = y5b.a;
        int i2 = hrxVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            hrxVar.c = 1;
            objA = this.a.a(str, "", 3, hrxVar);
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
            return ((PaginatedResponseDto) objA).getData();
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.frx
    public final Object b(String str, x1b x1bVar) {
        irx irxVar;
        if (x1bVar instanceof irx) {
            irxVar = (irx) x1bVar;
            int i = irxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irxVar.c = i - Integer.MIN_VALUE;
            } else {
                irxVar = new irx(this, x1bVar);
            }
        } else {
            irxVar = new irx(this, x1bVar);
        }
        Object obj = irxVar.a;
        y5b y5bVar = y5b.a;
        int i2 = irxVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            irxVar.c = 1;
            Object objB = this.a.b(str, irxVar);
            return objB == y5bVar ? y5bVar : objB;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
