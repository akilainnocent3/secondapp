package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class yd10 {
    public final sr10 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("SUCCESS", 0);
            a = aVar;
            a aVar2 = new a("TIME_OUT", 1);
            b = aVar2;
            a aVar3 = new a("FAILED_STATUS", 2);
            c = aVar3;
            a aVar4 = new a("ERROR_WHILE_GETTING_STATUS", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public yd10(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        zd10 zd10Var;
        if (x1bVar instanceof zd10) {
            zd10Var = (zd10) x1bVar;
            int i = zd10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zd10Var.c = i - Integer.MIN_VALUE;
            } else {
                zd10Var = new zd10(this, x1bVar);
            }
        } else {
            zd10Var = new zd10(this, x1bVar);
        }
        Object objM = zd10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = zd10Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objM);
                sr10 sr10Var = this.a;
                zd10Var.c = 1;
                objM = sr10Var.m(str, zd10Var);
                if (objM == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objM);
            }
            return (BankTradeData) n52.b((BaseResponse) objM);
        } catch (Throwable th) {
            itf0.a.e(th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(f810 f810Var, String str, x1b x1bVar) {
        ae10 ae10Var;
        if (x1bVar instanceof ae10) {
            ae10Var = (ae10) x1bVar;
            int i = ae10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ae10Var.c = i - Integer.MIN_VALUE;
            } else {
                ae10Var = new ae10(this, x1bVar);
            }
        } else {
            ae10Var = new ae10(this, x1bVar);
        }
        Object objD = ae10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ae10Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            b.a aVar = b.b;
            int i3 = f810Var.a;
            rgf rgfVar = rgf.MILLISECONDS;
            long jH = c.h(i3, rgfVar);
            long jH2 = c.h(f810Var.b, rgfVar);
            be10 be10Var = new be10(this, str, jH, null);
            ae10Var.c = 1;
            objD = vxf0.d(jH2, be10Var, ae10Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        a aVar2 = (a) objD;
        return aVar2 == null ? a.b : aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b7 -> B:17:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Enum c(long r17, defpackage.x1b r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd10.c(long, x1b, java.lang.String):java.lang.Enum");
    }
}
