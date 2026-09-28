package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class iv4 implements vrm {
    public final rt70 a;
    public final cs4 b;

    public iv4(rt70 rt70Var, cs4 cs4Var) {
        rt70Var.getClass();
        cs4Var.getClass();
        this.a = rt70Var;
        this.b = cs4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.vrm
    public final Object a(int i, int i2, String str, x1b x1bVar) {
        hv4 hv4Var;
        if (x1bVar instanceof hv4) {
            hv4Var = (hv4) x1bVar;
            int i3 = hv4Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hv4Var.c = i3 - Integer.MIN_VALUE;
            } else {
                hv4Var = new hv4(this, x1bVar);
            }
        } else {
            hv4Var = new hv4(this, x1bVar);
        }
        Object objA = hv4Var.a;
        y5b y5bVar = y5b.a;
        int i4 = hv4Var.c;
        boolean z = false;
        try {
            if (i4 == 0) {
                uj50.b(objA);
                cs4 cs4Var = this.b;
                hr4 hr4Var = new hr4(i2, str);
                hv4Var.c = 1;
                objA = cs4Var.a(i, hr4Var, hv4Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            Integer bizCode = ((HTTPResponse) objA).getBizCode();
            if (bizCode != null && bizCode.intValue() == 10000) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.vrm
    public final Object b(List list, x1b x1bVar) {
        gv4 gv4Var;
        if (x1bVar instanceof gv4) {
            gv4Var = (gv4) x1bVar;
            int i = gv4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gv4Var.c = i - Integer.MIN_VALUE;
            } else {
                gv4Var = new gv4(this, x1bVar);
            }
        } else {
            gv4Var = new gv4(this, x1bVar);
        }
        Object objA = gv4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = gv4Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                rt70 rt70Var = this.a;
                String strA0 = CollectionsKt.a0(list, ",", null, null, null, 62);
                gv4Var.c = 1;
                objA = rt70Var.a(strA0, gv4Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            return (List) ((HTTPResponse) objA).getData();
        } catch (Exception unused) {
            return null;
        }
    }
}
