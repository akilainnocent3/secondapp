package defpackage;

import com.sporty.android.core.model.pocket.deposit.intouch.NonSuccessfulInTouchDeposit;
import com.sportybet.android.globalpay.mobileMoney.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uyv implements Function0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;

    public /* synthetic */ uyv(c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Double dH;
        Object next;
        c cVar = this.a;
        y9k y9kVar = cVar.e;
        String str = this.b;
        if (str == null || (dH = b.h(str)) == null) {
            return Unit.a;
        }
        String strD1 = cVar.D1();
        qqe0 qqe0Var = y9kVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<NonSuccessfulInTouchDeposit> listA = y9kVar.a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            NonSuccessfulInTouchDeposit nonSuccessfulInTouchDeposit = (NonSuccessfulInTouchDeposit) obj;
            if (Intrinsics.a(nonSuccessfulInTouchDeposit.getAmount(), dH) && Intrinsics.g(nonSuccessfulInTouchDeposit.getChannelId(), strD1) && Intrinsics.g(nonSuccessfulInTouchDeposit.getPhoneNumber(), y9kVar.b.getPhoneNumber()) && jCurrentTimeMillis - nonSuccessfulInTouchDeposit.getTimestampMs() <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long timestampMs = ((NonSuccessfulInTouchDeposit) next).getTimestampMs();
                do {
                    Object next2 = it.next();
                    long timestampMs2 = ((NonSuccessfulInTouchDeposit) next2).getTimestampMs();
                    if (timestampMs < timestampMs2) {
                        next = next2;
                        timestampMs = timestampMs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        NonSuccessfulInTouchDeposit nonSuccessfulInTouchDeposit2 = (NonSuccessfulInTouchDeposit) next;
        jvd0 jvd0Var = cVar.Q;
        if (nonSuccessfulInTouchDeposit2 != null) {
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            cVar.Q = ej5.c(o8i0.d(cVar), null, null, new azv(cVar, nonSuccessfulInTouchDeposit2, null), 3);
        } else {
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            cVar.R = false;
            cVar.H.setValue(null);
            cVar.J.setValue(cVar.z);
        }
        return Unit.a;
    }
}
