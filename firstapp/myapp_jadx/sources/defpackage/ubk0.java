package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;
import com.sporty.android.core.model.welcomereward.Task;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ubk0 {
    public static final /* synthetic */ int h = 0;
    public final psm a;
    public final yqm b;
    public final x9k c;
    public final mgb0 d;
    public final z1d e;
    public final wwd0 f;
    public final v340 g;

    static {
        ohp<Object>[] ohpVarArr = z1d.f;
    }

    public ubk0(psm psmVar, yqm yqmVar, x9k x9kVar, mgb0 mgb0Var, z1d z1dVar) {
        psmVar.getClass();
        yqmVar.getClass();
        mgb0Var.getClass();
        this.a = psmVar;
        this.b = yqmVar;
        this.c = x9kVar;
        this.d = mgb0Var;
        this.e = z1dVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.f = wwd0VarA;
        this.g = e1i.b(wwd0VarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, x1b x1bVar) {
        rbk0 rbk0Var;
        List<Task> tasks;
        if (x1bVar instanceof rbk0) {
            rbk0Var = (rbk0) x1bVar;
            int i = rbk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbk0Var.c = i - Integer.MIN_VALUE;
            } else {
                rbk0Var = new rbk0(this, x1bVar);
            }
        } else {
            rbk0Var = new rbk0(this, x1bVar);
        }
        Object objC = rbk0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = rbk0Var.c;
        Object obj = null;
        if (i2 == 0) {
            uj50.b(objC);
            if (!z) {
                return Boolean.FALSE;
            }
            u9k u9kVarA = this.c.a();
            rbk0Var.c = 1;
            objC = s0i.c(u9kVarA, rbk0Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        NonFtdEngagement nonFtdEngagement = (NonFtdEngagement) objC;
        if (nonFtdEngagement != null && (tasks = nonFtdEngagement.getTasks()) != null) {
            for (Object obj2 : tasks) {
                if (((Task) obj2).getType() == NonFtdTaskType.FIRST_TIME_DEPOSIT) {
                    obj = obj2;
                    break;
                }
            }
            Task task = (Task) obj;
            if (task != null) {
                return Boolean.valueOf(!task.getCompleted());
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        sbk0 sbk0Var;
        long j;
        if (x1bVar instanceof sbk0) {
            sbk0Var = (sbk0) x1bVar;
            int i = sbk0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbk0Var.d = i - Integer.MIN_VALUE;
            } else {
                sbk0Var = new sbk0(this, x1bVar);
            }
        } else {
            sbk0Var = new sbk0(this, x1bVar);
        }
        Object objE = sbk0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = sbk0Var.d;
        if (i2 == 0) {
            uj50.b(objE);
            AccountInfo accountInfoLastAccountInfo = this.d.lastAccountInfo();
            if (accountInfoLastAccountInfo == null) {
                return Boolean.FALSE;
            }
            long createTime = accountInfoLastAccountInfo.getCreateTime();
            z1d z1dVar = this.e;
            wm20 wm20VarA = z1dVar.d.a(z1dVar, z1d.f[2]);
            Long l = new Long(0L);
            sbk0Var.a = createTime;
            sbk0Var.d = 1;
            objE = wm20VarA.e(sbk0Var, l);
            if (objE == y5bVar) {
                return y5bVar;
            }
            j = createTime;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = sbk0Var.a;
            uj50.b(objE);
        }
        Long l2 = new Long(((Number) objE).longValue());
        Long l3 = l2.longValue() > 0 ? l2 : null;
        return Boolean.valueOf(j > (l3 != null ? l3.longValue() : qbk0.a));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r8, defpackage.x1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tbk0
            if (r0 == 0) goto L13
            r0 = r9
            tbk0 r0 = (defpackage.tbk0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tbk0 r0 = new tbk0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            defpackage.uj50.b(r9)
            goto L97
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L34:
            boolean r8 = r0.a
            defpackage.uj50.b(r9)
            goto L6f
        L3a:
            boolean r8 = r0.a
            defpackage.uj50.b(r9)
            goto L59
        L40:
            defpackage.uj50.b(r9)
            psm r9 = r7.a
            boolean r9 = r9.O()
            if (r9 != 0) goto L4e
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L4e:
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L59
            goto L96
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L64
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L64:
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L6f
            goto L96
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            yqm r2 = r7.b
            if (r9 == 0) goto L80
            x66<m0e> r9 = defpackage.z76.r
            yzh r9 = r2.j(r9)
            goto L87
        L80:
            x66<m0e> r9 = defpackage.z76.r
            r4 = 0
            yzh r9 = r2.m(r9, r4)
        L87:
            sl50 r2 = new sl50
            r2.<init>(r9)
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.s0i.c(r2, r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            lk50 r9 = (defpackage.lk50) r9
            boolean r8 = r9 instanceof lk50.c
            if (r8 == 0) goto La0
            lk50$c r9 = (lk50.c) r9
            goto La1
        La0:
            r9 = r6
        La1:
            if (r9 == 0) goto La8
            T r8 = r9.a
            r6 = r8
            m0e r6 = (defpackage.m0e) r6
        La8:
            wwd0 r7 = r7.f
            r7.setValue(r6)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubk0.c(boolean, x1b):java.lang.Object");
    }
}
