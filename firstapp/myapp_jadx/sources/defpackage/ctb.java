package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.SprThrowable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ctb {
    public static final void a(wsm wsmVar, String str, String str2, List<? extends Pair<String, String>> list, Throwable th) {
        wsmVar.getClass();
        str.getClass();
        str2.getClass();
        th.getClass();
        ArrayList arrayList = new ArrayList();
        if (th instanceof SprThrowable) {
            SprThrowable sprThrowable = (SprThrowable) th;
            arrayList.add(new Pair("BaseResponse.bizCode", String.valueOf(sprThrowable.getD())));
            arrayList.add(new Pair("BaseResponse.message", sprThrowable.getE()));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        wsmVar.g("Caught exception in ".concat(str), str2, th, CollectionsKt.A0(arrayList));
    }

    public static g1i c(lyh lyhVar, String str, wsm wsmVar) {
        lyhVar.getClass();
        wsmVar.getClass();
        return new g1i(lyhVar, new atb(wsmVar, "PocketRepo", str, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(wsm wsmVar, String str, String str2, Function1 function1, v1b v1bVar) {
        btb btbVar;
        if (v1bVar instanceof btb) {
            btbVar = (btb) v1bVar;
            int i = btbVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                btbVar.e = i - Integer.MIN_VALUE;
            } else {
                btbVar = new btb(v1bVar);
            }
        } else {
            btbVar = new btb(v1bVar);
        }
        Object bVar = btbVar.d;
        y5b y5bVar = y5b.a;
        int i2 = btbVar.e;
        try {
            if (i2 == 0) {
                uj50.b(bVar);
                zi50.a aVar = zi50.b;
                btbVar.a = wsmVar;
                btbVar.b = str;
                btbVar.c = str2;
                btbVar.e = 1;
                bVar = function1.invoke(btbVar);
                if (bVar == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = btbVar.c;
                str = btbVar.b;
                wsmVar = btbVar.a;
                uj50.b(bVar);
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            a(wsmVar, str, str2, null, thA);
        }
        uj50.b(bVar);
        return bVar;
    }
}
