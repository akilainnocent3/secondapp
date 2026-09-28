package defpackage;

import com.sportygames.crash.remote.models.ProvablySettingRequest;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.net.SocketException;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xha implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xha(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String message;
        String message2;
        int i = this.a;
        l830 l830Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m28 m28Var = (m28) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 0) {
                    m28Var.getClass();
                    ej5.c(o8i0.d(m28Var), null, null, new l28(m28Var, new ProvablySettingRequest(true, null), null), 3);
                }
                m28Var.z.m(num);
                return Unit.a;
            default:
                sbe0 sbe0Var = (sbe0) obj2;
                bbs bbsVar = (bbs) obj;
                bbsVar.getClass();
                int i2 = sbe0.d.a[bbsVar.a.ordinal()];
                if (i2 == 1) {
                    synchronized (sbe0Var.k) {
                        sbe0Var.l = false;
                        sbe0Var.k();
                        sbe0Var.m = null;
                        Unit unit = Unit.a;
                    }
                    sbe0Var.c.a(wyi0.b);
                } else if (i2 == 2) {
                    synchronized (sbe0Var.k) {
                        sbe0Var.l = true;
                        Set<sbe0.c> setKeySet = sbe0Var.i.keySet();
                        setKeySet.getClass();
                        for (sbe0.c cVar : setKeySet) {
                            cVar.getClass();
                            sbe0Var.j(cVar);
                        }
                        Unit unit2 = Unit.a;
                    }
                    sbe0Var.c.a(wyi0.a);
                    rlr rlrVar = sbe0Var.e;
                    if (rlrVar != null) {
                        xse.a(rlrVar);
                    }
                    try {
                        StompClient stompClient = sbe0Var.m;
                        if (stompClient != null) {
                            Field declaredField = stompClient.getClass().getDeclaredField("messageStream");
                            declaredField.setAccessible(true);
                            Object obj3 = declaredField.get(sbe0Var.m);
                            if (obj3 instanceof l830) {
                                l830Var = (l830) obj3;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (l830Var != null) {
                        final hbe0 hbe0Var = new hbe0(sbe0Var);
                        rlr rlrVar2 = new rlr(new pya() { // from class: ibe0
                            @Override // defpackage.pya
                            public final void accept(Object obj4) {
                                hbe0Var.invoke(obj4);
                            }
                        }, new kbe0(), taj.c);
                        l830Var.a(rlrVar2);
                        sbe0Var.e = rlrVar2;
                    }
                } else if (i2 == 3) {
                    for (Throwable cause = bbsVar.b; cause != null; cause = cause.getCause()) {
                        if ((cause instanceof EOFException) || (((cause instanceof SocketException) && (message2 = ((SocketException) cause).getMessage()) != null && StringsKt.M(message2, "Socket closed", true)) || ((message = cause.getMessage()) != null && StringsKt.M(message, "EOFException", true)))) {
                            synchronized (sbe0Var.k) {
                                sbe0Var.l = false;
                                sbe0Var.k();
                                sbe0Var.m = null;
                                Unit unit3 = Unit.a;
                            }
                            sbe0Var.c.a(wyi0.b);
                            return Unit.a;
                        }
                    }
                    synchronized (sbe0Var.k) {
                        sbe0Var.l = false;
                        Unit unit4 = Unit.a;
                    }
                    sbe0Var.c.a(wyi0.c);
                }
                return Unit.a;
        }
    }
}
