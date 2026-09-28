package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bg {
    public final i1p a;

    public bg(i1p i1pVar) {
        i1pVar.getClass();
        this.a = i1pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, x1b x1bVar) {
        ag agVar;
        ArrayList arrayList2;
        if (x1bVar instanceof ag) {
            agVar = (ag) x1bVar;
            int i = agVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                agVar.d = i - Integer.MIN_VALUE;
            } else {
                agVar = new ag(this, x1bVar);
            }
        } else {
            agVar = new ag(this, x1bVar);
        }
        Object objA = agVar.b;
        y5b y5bVar = y5b.a;
        int i2 = agVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            ArrayList arrayListC0 = CollectionsKt.C0(arrayList);
            agVar.a = arrayListC0;
            agVar.d = 1;
            objA = this.a.a(true, agVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
            arrayList2 = arrayListC0;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = agVar.a;
            uj50.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            arrayList2.add(0, OtpSelection.Bio);
        }
        return a4h.f(arrayList2);
    }
}
