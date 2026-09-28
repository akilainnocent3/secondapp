package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.loyalty.LoyaltyMissionTaskType;
import com.sporty.android.core.model.loyalty.MissionStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld95;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d95 extends j8i0 {
    public static final long A;
    public static final /* synthetic */ int B = 0;
    public final b9k a;
    public final etz b;
    public final uti c;
    public final yqm d;
    public final mgb0 e;
    public final ytv f;
    public final h85 i;
    public final e85 v;
    public final v5b w;
    public final wwd0 y;
    public final ku90<com.sporty.android.common.uievent.a> z;

    @c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel$1", f = "BrRegistrationSuccessfulViewModel.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return d95.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                int i2 = d95.B;
                d95 d95Var = d95.this;
                if (uzh.b(new i95(d95Var.e.getAccountInfoFlow())).collect(new j95(d95Var), this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel$2", f = "BrRegistrationSuccessfulViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return d95.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                int i2 = d95.B;
                if (d95.this.y1(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[q85.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                q85 q85Var = q85.CONTROL;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                q85 q85Var2 = q85.CONTROL;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MissionStatus.values().length];
            try {
                iArr2[MissionStatus.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MissionStatus.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MissionStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr2;
            int[] iArr3 = new int[LoyaltyMissionTaskType.values().length];
            try {
                iArr3[LoyaltyMissionTaskType.BET_TOTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.DEPOSIT_TOTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.PURCHASE_PAY_TOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.PLACE_TOTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.VERIFY_EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr3;
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.b;
        A = kotlin.time.c.h(2, rgf.SECONDS);
    }

    public d95(b9k b9kVar, etz etzVar, uti utiVar, yqm yqmVar, mgb0 mgb0Var, ytv ytvVar, h85 h85Var, e85 e85Var, @ApplicationScope v5b v5bVar) {
        b9kVar.getClass();
        etzVar.getClass();
        yqmVar.getClass();
        mgb0Var.getClass();
        e85Var.getClass();
        v5bVar.getClass();
        this.a = b9kVar;
        this.b = etzVar;
        this.c = utiVar;
        this.d = yqmVar;
        this.e = mgb0Var;
        this.f = ytvVar;
        this.i = h85Var;
        this.v = e85Var;
        this.w = v5bVar;
        this.y = xwd0.a(new c95(0));
        this.z = new ku90<>();
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public static boolean x1(qlw qlwVar) {
        MissionStatus missionStatus = qlwVar.k;
        int i = missionStatus == null ? -1 : c.a[missionStatus.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                return true;
            }
            if (i != 3) {
                uhc.a();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object A1(yvv yvvVar, String str, double d, x1b x1bVar) {
        k95 k95Var;
        if (x1bVar instanceof k95) {
            k95Var = (k95) x1bVar;
            int i = k95Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k95Var.d = i - Integer.MIN_VALUE;
            } else {
                k95Var = new k95(this, x1bVar);
            }
        } else {
            k95Var = new k95(this, x1bVar);
        }
        k95 k95Var2 = k95Var;
        Object objG = k95Var2.b;
        y5b y5bVar = y5b.a;
        int i2 = k95Var2.d;
        if (i2 == 0) {
            uj50.b(objG);
            int i3 = c.b[yvvVar.a.ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                if (i3 == 4) {
                    return d40.a((int) d, (int) yvvVar.c, " / ");
                }
                if (i3 == 5) {
                    return null;
                }
                uhc.a();
                return null;
            }
            String strE = s5y.e(new Double(d));
            k95Var2.a = yvvVar;
            k95Var2.d = 1;
            objG = uti.g(this.c, strE, str, false, k95Var2, 20);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yvvVar = k95Var2.a;
            uj50.b(objG);
        }
        return oxc.a((String) objG, " / ", s5y.d(new Double(yvvVar.c)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:39:0x0151  */
    /* JADX WARN: Code duplicated, block: B:42:0x017e  */
    /* JADX WARN: Code duplicated, block: B:44:0x019c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0102 -> B:31:0x0109). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object B1(defpackage.qlw r30, boolean r31, defpackage.x1b r32) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d95.B1(qlw, boolean, x1b):java.lang.Object");
    }

    public final void C1(d85 d85Var) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.y;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, c95.a((c95) value, null, null, d85Var, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dc, code lost:
    
        if (r11 == r1) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d95.y1(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(boolean z, x1b x1bVar) {
        g95 g95Var;
        qlw qlwVar;
        if (x1bVar instanceof g95) {
            g95Var = (g95) x1bVar;
            int i = g95Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                g95Var.e = i - Integer.MIN_VALUE;
            } else {
                g95Var = new g95(this, x1bVar);
            }
        } else {
            g95Var = new g95(this, x1bVar);
        }
        Object objD = g95Var.c;
        Object obj = y5b.a;
        int i2 = g95Var.e;
        Object next = null;
        if (i2 == 0) {
            uj50.b(objD);
            h95 h95Var = new h95(this, null);
            g95Var.a = z;
            g95Var.e = 1;
            objD = vxf0.d(A, h95Var, g95Var);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = g95Var.a;
            uj50.b(objD);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qlwVar = g95Var.b;
            uj50.b(objD);
        }
        this.v.a.set(qlwVar.a);
        return new d85.a((g85) objD, false);
        List list = (List) objD;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                qlw qlwVar2 = (qlw) obj2;
                if (Intrinsics.g(qlwVar2.n, "LOYALTY_REGISTRATION_MISSION") && (qlwVar2.j || x1(qlwVar2))) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long j = ((qlw) next).a;
                    do {
                        Object next2 = it.next();
                        long j2 = ((qlw) next2).a;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            qlw qlwVar3 = (qlw) next;
            if (qlwVar3 != null) {
                g95Var.b = qlwVar3;
                g95Var.a = z;
                g95Var.e = 2;
                Object objB1 = B1(qlwVar3, z, g95Var);
                if (objB1 != obj) {
                    objD = objB1;
                    qlwVar = qlwVar3;
                    this.v.a.set(qlwVar.a);
                    return new d85.a((g85) objD, false);
                }
                return obj;
            }
        }
        return d85.c.a;
    }
}
