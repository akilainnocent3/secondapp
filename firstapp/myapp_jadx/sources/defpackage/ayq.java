package defpackage;

import com.sportybet.android.router.Sender;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntranceFromButton;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public class ayq extends j8i0 {
    public final odd a;
    public final String b;
    public final LNPlaceBetEntrance c;
    public final Sender d;
    public final LNPlaceBetEntranceFromButton e;
    public final String f;
    public final String i;

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:51:0x00dc, B:53:0x00f8, B:56:0x00fe, B:57:0x0105), top: B:65:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:51:0x00dc, B:53:0x00f8, B:56:0x00fe, B:57:0x0105), top: B:65:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:42:0x00b3->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0080 A[SYNTHETIC] */
    public ayq(vu60 vu60Var, odd oddVar) {
        LNPlaceBetEntrance lNPlaceBetEntrance;
        LNPlaceBetEntrance next;
        LNPlaceBetEntrance lNPlaceBetEntrance2;
        Object objB;
        Sender sender;
        Iterator<Sender> it;
        Sender next2;
        Sender sender2;
        Object objB2;
        q8r q8rVar;
        Object bVar;
        Object objA;
        q8r q8rVar2;
        vu60Var.getClass();
        this.a = oddVar;
        String str = (String) vu60Var.b("lotteryId");
        String str2 = str == null ? "" : str;
        Object objB3 = vu60Var.b("entrance");
        LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton = null;
        if (!(objB3 instanceof LNPlaceBetEntrance)) {
            if (objB3 instanceof String) {
                Iterator<LNPlaceBetEntrance> it2 = LNPlaceBetEntrance.getEntries().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.g(next.name(), objB3));
                lNPlaceBetEntrance2 = next;
            } else {
                lNPlaceBetEntrance = null;
            }
            objB = vu60Var.b("sender");
            if (objB instanceof Sender) {
                if (objB instanceof String) {
                    it = Sender.getEntries().iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.g(next2.name(), objB));
                    sender2 = next2;
                } else {
                    sender = null;
                }
                String str3 = (String) vu60Var.b("defaultSelectedMarketGroup");
                String str4 = (String) vu60Var.b("reBetOrderId");
                objB2 = vu60Var.b("fromButton");
                if (objB2 instanceof LNPlaceBetEntranceFromButton) {
                    lNPlaceBetEntranceFromButton = (LNPlaceBetEntranceFromButton) objB2;
                } else if (objB2 instanceof String) {
                    for (LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton2 : LNPlaceBetEntranceFromButton.getEntries()) {
                        if (Intrinsics.g(lNPlaceBetEntranceFromButton2.name(), objB2)) {
                            lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton2;
                            break;
                        }
                    }
                    lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton;
                }
                q8rVar = new q8r(str2, lNPlaceBetEntrance, sender, lNPlaceBetEntranceFromButton, str3, str4, 16);
                q8rVar2 = q8rVar;
                if (StringsKt.U(str2)) {
                    try {
                        zi50.a aVar = zi50.b;
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        objA = fnf.a(vu60Var, jq40.a(q8r.class), o2gVar);
                        if (!StringsKt.U(((q8r) objA).a)) {
                            throw new IllegalArgumentException("lotteryId cannot be blank");
                        }
                        bVar = (q8r) objA;
                        q8rVar2 = (q8r) (zi50.a(bVar) == null ? bVar : q8rVar);
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                }
                this.b = q8rVar2.a;
                this.c = q8rVar2.b;
                this.d = q8rVar2.c;
                this.e = q8rVar2.d;
                this.f = q8rVar2.g;
                this.i = q8rVar2.f;
            }
            sender2 = (Sender) objB;
            sender = sender2;
            String str5 = (String) vu60Var.b("defaultSelectedMarketGroup");
            String str6 = (String) vu60Var.b("reBetOrderId");
            objB2 = vu60Var.b("fromButton");
            if (objB2 instanceof LNPlaceBetEntranceFromButton) {
                lNPlaceBetEntranceFromButton = (LNPlaceBetEntranceFromButton) objB2;
            } else if (objB2 instanceof String) {
                while (r0.hasNext()) {
                    if (Intrinsics.g(lNPlaceBetEntranceFromButton2.name(), objB2)) {
                        lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton2;
                        break;
                    }
                }
                lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton;
            }
            q8rVar = new q8r(str2, lNPlaceBetEntrance, sender, lNPlaceBetEntranceFromButton, str5, str6, 16);
            q8rVar2 = q8rVar;
            if (StringsKt.U(str2)) {
                zi50.a aVar3 = zi50.b;
                o2g o2gVar2 = o2g.a;
                o2gVar2.getClass();
                objA = fnf.a(vu60Var, jq40.a(q8r.class), o2gVar2);
                if (!StringsKt.U(((q8r) objA).a)) {
                    throw new IllegalArgumentException("lotteryId cannot be blank");
                }
                bVar = (q8r) objA;
                q8rVar2 = (q8r) (zi50.a(bVar) == null ? bVar : q8rVar);
            }
            this.b = q8rVar2.a;
            this.c = q8rVar2.b;
            this.d = q8rVar2.c;
            this.e = q8rVar2.d;
            this.f = q8rVar2.g;
            this.i = q8rVar2.f;
        }
        lNPlaceBetEntrance2 = (LNPlaceBetEntrance) objB3;
        lNPlaceBetEntrance = lNPlaceBetEntrance2;
        objB = vu60Var.b("sender");
        if (objB instanceof Sender) {
            if (objB instanceof String) {
                it = Sender.getEntries().iterator();
                do {
                    if (it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.g(next2.name(), objB));
                sender2 = next2;
            } else {
                sender = null;
            }
            String str7 = (String) vu60Var.b("defaultSelectedMarketGroup");
            String str8 = (String) vu60Var.b("reBetOrderId");
            objB2 = vu60Var.b("fromButton");
            if (objB2 instanceof LNPlaceBetEntranceFromButton) {
                lNPlaceBetEntranceFromButton = (LNPlaceBetEntranceFromButton) objB2;
            } else if (objB2 instanceof String) {
                while (r0.hasNext()) {
                    if (Intrinsics.g(lNPlaceBetEntranceFromButton2.name(), objB2)) {
                        lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton2;
                        break;
                    }
                }
                lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton;
            }
            q8rVar = new q8r(str2, lNPlaceBetEntrance, sender, lNPlaceBetEntranceFromButton, str7, str8, 16);
            q8rVar2 = q8rVar;
            if (StringsKt.U(str2)) {
                zi50.a aVar4 = zi50.b;
                o2g o2gVar3 = o2g.a;
                o2gVar3.getClass();
                objA = fnf.a(vu60Var, jq40.a(q8r.class), o2gVar3);
                if (!StringsKt.U(((q8r) objA).a)) {
                    throw new IllegalArgumentException("lotteryId cannot be blank");
                }
                bVar = (q8r) objA;
                q8rVar2 = (q8r) (zi50.a(bVar) == null ? bVar : q8rVar);
            }
            this.b = q8rVar2.a;
            this.c = q8rVar2.b;
            this.d = q8rVar2.c;
            this.e = q8rVar2.d;
            this.f = q8rVar2.g;
            this.i = q8rVar2.f;
        }
        sender2 = (Sender) objB;
        sender = sender2;
        String str9 = (String) vu60Var.b("defaultSelectedMarketGroup");
        String str10 = (String) vu60Var.b("reBetOrderId");
        objB2 = vu60Var.b("fromButton");
        if (objB2 instanceof LNPlaceBetEntranceFromButton) {
            lNPlaceBetEntranceFromButton = (LNPlaceBetEntranceFromButton) objB2;
        } else if (objB2 instanceof String) {
            while (r0.hasNext()) {
                if (Intrinsics.g(lNPlaceBetEntranceFromButton2.name(), objB2)) {
                    lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton2;
                    break;
                }
            }
            lNPlaceBetEntranceFromButton = lNPlaceBetEntranceFromButton;
        }
        q8rVar = new q8r(str2, lNPlaceBetEntrance, sender, lNPlaceBetEntranceFromButton, str9, str10, 16);
        q8rVar2 = q8rVar;
        if (StringsKt.U(str2)) {
            zi50.a aVar5 = zi50.b;
            o2g o2gVar4 = o2g.a;
            o2gVar4.getClass();
            objA = fnf.a(vu60Var, jq40.a(q8r.class), o2gVar4);
            if (!StringsKt.U(((q8r) objA).a)) {
                throw new IllegalArgumentException("lotteryId cannot be blank");
            }
            bVar = (q8r) objA;
            q8rVar2 = (q8r) (zi50.a(bVar) == null ? bVar : q8rVar);
        }
        this.b = q8rVar2.a;
        this.c = q8rVar2.b;
        this.d = q8rVar2.c;
        this.e = q8rVar2.d;
        this.f = q8rVar2.g;
        this.i = q8rVar2.f;
    }

    public final <T> uwd0<T> x1(lyh<? extends T> lyhVar, T t) {
        return e1i.e(ozh.c(lyhVar, this.a), o8i0.d(this), q490.a.a, t);
    }
}
