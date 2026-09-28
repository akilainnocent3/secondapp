package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.EligibleActivity;
import com.sporty.android.core.model.marketingactivities.ActivityKind;
import com.sporty.android.core.model.marketingactivities.EligibleActivityResponse;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class w5k {
    public final psm a;
    public final dsu b;
    public final yqm c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ActivityKind.values().length];
            try {
                iArr[ActivityKind.PAYDAY_GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public w5k(psm psmVar, dsu dsuVar, yqm yqmVar) {
        psmVar.getClass();
        dsuVar.getClass();
        yqmVar.getClass();
        this.a = psmVar;
        this.b = dsuVar;
        this.c = yqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0029, B:35:0x007e, B:36:0x008f, B:38:0x0095, B:44:0x00b0, B:49:0x00be, B:45:0x00b5, B:46:0x00ba, B:41:0x00a4, B:50:0x00c2, B:18:0x0035, B:25:0x005f, B:27:0x0063, B:29:0x0067, B:31:0x006c, B:52:0x00c5, B:53:0x00cc, B:22:0x004c), top: B:59:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0029, B:35:0x007e, B:36:0x008f, B:38:0x0095, B:44:0x00b0, B:49:0x00be, B:45:0x00b5, B:46:0x00ba, B:41:0x00a4, B:50:0x00c2, B:18:0x0035, B:25:0x005f, B:27:0x0063, B:29:0x0067, B:31:0x006c, B:52:0x00c5, B:53:0x00cc, B:22:0x004c), top: B:59:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0029, B:35:0x007e, B:36:0x008f, B:38:0x0095, B:44:0x00b0, B:49:0x00be, B:45:0x00b5, B:46:0x00ba, B:41:0x00a4, B:50:0x00c2, B:18:0x0035, B:25:0x005f, B:27:0x0063, B:29:0x0067, B:31:0x006c, B:52:0x00c5, B:53:0x00cc, B:22:0x004c), top: B:59:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(x1b x1bVar) {
        x5k x5kVar;
        q500 q500Var;
        ArrayList arrayList;
        ActivityKind activityKind;
        int i;
        EligibleActivity.PaydayGift paydayGiftA;
        if (x1bVar instanceof x5k) {
            x5kVar = (x5k) x1bVar;
            int i2 = x5kVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x5kVar.e = i2 - Integer.MIN_VALUE;
            } else {
                x5kVar = new x5k(this, x1bVar);
            }
        } else {
            x5kVar = new x5k(this, x1bVar);
        }
        Object objQ = x5kVar.c;
        y5b y5bVar = y5b.a;
        int i3 = x5kVar.e;
        try {
            if (i3 == 0) {
                uj50.b(objQ);
                x66 x66Var = (x66) z76.p.get(this.a.getCountryCode());
                if (x66Var == null) {
                    zi50.a aVar = zi50.b;
                    return m2g.a;
                }
                zi50.a aVar2 = zi50.b;
                yzh yzhVarJ = this.c.j(x66Var);
                x5kVar.a = this;
                x5kVar.e = 1;
                objQ = bm50.q(yzhVarJ, x5kVar);
                if (objQ == y5bVar) {
                }
                return y5bVar;
            }
            if (i3 == 1) {
                this = x5kVar.a;
                uj50.b(objQ);
            } else {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q500Var = x5kVar.b;
                uj50.b(objQ);
            }
            Iterable<EligibleActivityResponse> iterable = (Iterable) n52.b((BaseResponse) objQ);
            arrayList = new ArrayList();
            for (EligibleActivityResponse eligibleActivityResponse : iterable) {
                activityKind = eligibleActivityResponse.getActivityKind();
                if (activityKind == null) {
                    i = -1;
                } else {
                    i = a.a[activityKind.ordinal()];
                }
                if (i != -1) {
                    paydayGiftA = null;
                } else {
                    if (i == 1) {
                        throw new uwx();
                    }
                    paydayGiftA = y5k.a(eligibleActivityResponse, q500Var);
                }
                if (paydayGiftA != null) {
                    arrayList.add(paydayGiftA);
                }
            }
            zi50.a aVar3 = zi50.b;
            return arrayList;
            q500 q500Var2 = (q500) objQ;
            if (q500Var2 == null) {
                throw new IllegalStateException("Failed to fetch Payday Promo Modal test variant");
            }
            if (q500Var2 == q500.CONTROL) {
                zi50.a aVar4 = zi50.b;
                return m2g.a;
            }
            dsu dsuVar = this.b;
            x5kVar.a = null;
            x5kVar.b = q500Var2;
            x5kVar.e = 2;
            Object objA = dsuVar.a(x5kVar);
            if (objA != y5bVar) {
                objQ = objA;
                q500Var = q500Var2;
                Iterable<EligibleActivityResponse> iterable2 = (Iterable) n52.b((BaseResponse) objQ);
                arrayList = new ArrayList();
                while (r9.hasNext()) {
                    activityKind = eligibleActivityResponse.getActivityKind();
                    if (activityKind == null) {
                        i = -1;
                    } else {
                        i = a.a[activityKind.ordinal()];
                    }
                    if (i != -1) {
                        paydayGiftA = null;
                    } else {
                        if (i == 1) {
                            throw new uwx();
                        }
                        paydayGiftA = y5k.a(eligibleActivityResponse, q500Var);
                    }
                    if (paydayGiftA != null) {
                        arrayList.add(paydayGiftA);
                    }
                }
                zi50.a aVar5 = zi50.b;
                return arrayList;
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar6 = zi50.b;
            return new zi50.b(th);
        }
    }
}
