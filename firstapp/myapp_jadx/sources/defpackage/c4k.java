package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c4k {
    public final sr10 a;
    public final psm b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[log0.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                log0 log0Var = log0.a;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c4k(psm psmVar, sr10 sr10Var) {
        sr10Var.getClass();
        psmVar.getClass();
        this.a = sr10Var;
        this.b = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(log0 log0Var, String str, x1b x1bVar) {
        d4k d4kVar;
        if (x1bVar instanceof d4k) {
            d4kVar = (d4k) x1bVar;
            int i = d4kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4kVar.d = i - Integer.MIN_VALUE;
            } else {
                d4kVar = new d4k(this, x1bVar);
            }
        } else {
            d4kVar = new d4k(this, x1bVar);
        }
        Object objB = d4kVar.b;
        Object obj = y5b.a;
        int i2 = d4kVar.d;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(objB);
            d4kVar.a = str;
            d4kVar.d = 1;
            objB = b(log0Var, d4kVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = d4kVar.a;
            uj50.b(objB);
        }
        List list = (List) objB;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (Intrinsics.g(((ChannelAsset.Channel) obj3).getChannelSendName(), str)) {
                obj2 = obj3;
                break;
            }
        }
        return (ChannelAsset.Channel) obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(log0 log0Var, x1b x1bVar) {
        e4k e4kVar;
        g1i g1iVarR;
        if (x1bVar instanceof e4k) {
            e4kVar = (e4k) x1bVar;
            int i = e4kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4kVar.c = i - Integer.MIN_VALUE;
            } else {
                e4kVar = new e4k(this, x1bVar);
            }
        } else {
            e4kVar = new e4k(this, x1bVar);
        }
        Object objQ = e4kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = e4kVar.c;
        if (i2 == 0) {
            uj50.b(objQ);
            int iOrdinal = log0Var.ordinal();
            sr10 sr10Var = this.a;
            if (iOrdinal == 0) {
                g1iVarR = sr10Var.R(pu0.b.a);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                g1iVarR = sr10Var.q0(pu0.b.a);
            }
            sl50 sl50Var = new sl50(g1iVarR);
            e4kVar.c = 1;
            objQ = bm50.q(sl50Var, e4kVar);
            if (objQ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objQ);
        }
        ChannelAsset channelAsset = (ChannelAsset) objQ;
        if (channelAsset != null) {
            return channelAsset.getEntityList();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(log0 log0Var, String str, x1b x1bVar) {
        f4k f4kVar;
        if (x1bVar instanceof f4k) {
            f4kVar = (f4k) x1bVar;
            int i = f4kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f4kVar.d = i - Integer.MIN_VALUE;
            } else {
                f4kVar = new f4k(this, x1bVar);
            }
        } else {
            f4kVar = new f4k(this, x1bVar);
        }
        Object objB = f4kVar.b;
        Object obj = y5b.a;
        int i2 = f4kVar.d;
        if (i2 == 0) {
            uj50.b(objB);
            f4kVar.a = str;
            f4kVar.d = 1;
            objB = b(log0Var, f4kVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = f4kVar.a;
            uj50.b(objB);
        }
        List list = (List) objB;
        if (list != null) {
            return w3w.a(str, list);
        }
        return null;
    }

    public final Object d(log0 log0Var, String str, x1b x1bVar) {
        int i = a.a[this.b.getCountryCode().ordinal()];
        if (i == 1 || i == 2) {
            return a(log0Var, str, x1bVar);
        }
        if (i == 3) {
            return c(log0Var, str, x1bVar);
        }
        if (i == 4) {
            return null;
        }
        hb5.a("Unsupported country code");
        return null;
    }
}
