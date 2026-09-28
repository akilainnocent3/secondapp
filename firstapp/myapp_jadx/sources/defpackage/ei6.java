package defpackage;

import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ei6 {
    public final /* synthetic */ xh6 a;

    public ei6(xh6 xh6Var) {
        this.a = xh6Var;
    }

    public final void a(int i, String str) {
        Object next;
        q0z q0zVar = this.a.d.a.s0().a;
        q0zVar.getClass();
        sm6 sm6Var = q0zVar.b;
        ConcurrentHashMap.KeySetView<String> keySetView = sm6Var.e;
        s9e0.a.getClass();
        String[] strArrC = s9e0.c(str);
        if (strArrC.length < 5) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySetView) {
            s9e0.a.getClass();
            String[] strArrC2 = s9e0.c((String) obj);
            if (strArrC2.length == 8 && Intrinsics.g(strArrC[2], strArrC2[2]) && Intrinsics.g(strArrC[3], strArrC2[3])) {
                arrayList.add(obj);
            }
        }
        Set setE0 = CollectionsKt.E0(arrayList);
        ISocketPushManager iSocketPushManager = sm6Var.c;
        Set<String> set = setE0;
        for (String str2 : set) {
            iSocketPushManager.unsubscribeTopic(new GroupTopic(str2), sm6Var.c(str2));
        }
        for (String str3 : keySetView) {
            Iterator it = set.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(str3, (String) next));
            String strA0 = (String) next;
            if (strA0 != null) {
                boolean z = sm6Var.a.d().k;
                ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(strA0, new String[]{"^"}, false, 0, 6, null));
                if (arrayListC0.size() == 8) {
                    String str4 = "1";
                    if ((!z || !Intrinsics.g(arrayListC0.get(4), "~")) && (z || !Intrinsics.g(arrayListC0.get(4), "3"))) {
                        str4 = (!z && Intrinsics.g(arrayListC0.get(4), "1") && i == 2) ? "3" : (String) arrayListC0.get(4);
                    }
                    arrayListC0.set(4, str4);
                    strA0 = CollectionsKt.a0(arrayListC0, "^", null, null, null, 62);
                }
                iSocketPushManager.subscribeTopic(new GroupTopic(strA0), sm6Var.c(strA0));
            }
        }
    }
}
