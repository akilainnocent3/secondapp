package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class xrw implements do5 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final tuw b = uuw.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, x1b x1bVar) {
        wrw wrwVar;
        tuw tuwVar;
        if (x1bVar instanceof wrw) {
            wrwVar = (wrw) x1bVar;
            int i = wrwVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wrwVar.f = i - Integer.MIN_VALUE;
            } else {
                wrwVar = new wrw(this, x1bVar);
            }
        } else {
            wrwVar = new wrw(this, x1bVar);
        }
        Object obj = wrwVar.d;
        y5b y5bVar = y5b.a;
        int i2 = wrwVar.f;
        if (i2 == 0) {
            uj50.b(obj);
            wrwVar.a = str;
            wrwVar.b = str2;
            tuwVar = this.b;
            wrwVar.c = tuwVar;
            wrwVar.f = 1;
            if (tuwVar.d(wrwVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = wrwVar.c;
            str2 = wrwVar.b;
            String str3 = wrwVar.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            str = str3;
        }
        try {
            this.a.put(str, str2);
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    @Override // defpackage.do5
    public final co5 build() {
        return new vrw(a4h.g(this.a));
    }

    @Override // defpackage.do5
    public final void release() {
    }
}
