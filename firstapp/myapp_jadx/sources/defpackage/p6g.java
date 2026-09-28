package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p6g implements dyo {
    public final a840 a;
    public final mb0 b;
    public final pa0 c;
    public final kgt d;
    public final wlv e;

    public static final class a {
        public final u7n a;
        public final boolean b;
        public final bqc c;
        public final String d;

        public a(u7n u7nVar, boolean z, bqc bqcVar, String str) {
            this.a = u7nVar;
            this.b = z;
            this.c = bqcVar;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExecuteResult(image=");
            sb.append(this.a);
            sb.append(", isSampled=");
            sb.append(this.b);
            sb.append(", dataSource=");
            sb.append(this.c);
            sb.append(", diskCacheKey=");
            return j26.a(sb, this.d, ')');
        }
    }

    public p6g(a840 a840Var, mb0 mb0Var, pa0 pa0Var, kgt kgtVar) {
        this.a = a840Var;
        this.b = mb0Var;
        this.c = pa0Var;
        this.d = kgtVar;
        this.e = new wlv(a840Var, pa0Var, kgtVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // defpackage.dyo
    public final Object a(h840 h840Var, x1b x1bVar) throws Throwable {
        u6g u6gVar;
        h840 h840Var2 = h840Var;
        wlv wlvVar = this.e;
        if (x1bVar instanceof u6g) {
            u6gVar = (u6g) x1bVar;
            int i = u6gVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6gVar.d = i - Integer.MIN_VALUE;
            } else {
                u6gVar = new u6g(this, x1bVar);
            }
        } else {
            u6gVar = new u6g(this, x1bVar);
        }
        u6g u6gVar2 = u6gVar;
        Object obj = u6gVar2.b;
        y5b y5bVar = y5b.a;
        int i2 = u6gVar2.d;
        if (i2 == 0) {
            uj50.b(obj);
            try {
                nan nanVar = h840Var2.d;
                Object obj2 = nanVar.b;
                ww90 ww90Var = h840Var2.e;
                rpg rpgVar = h840Var2.f;
                u2z u2zVarC = this.c.c(nanVar, ww90Var);
                vy60 vy60Var = u2zVarC.c;
                List<Pair<bpu<? extends Object, ? extends Object>, ygp<? extends Object>>> list = this.a.d.b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Pair<bpu<? extends Object, ? extends Object>, ygp<? extends Object>> pair = list.get(i3);
                    bpu<? extends Object, ? extends Object> bpuVar = pair.a;
                    if (pair.b.h(obj2)) {
                        bpuVar.getClass();
                        kmh0 kmh0VarA = bpuVar.a(obj2, u2zVarC);
                        if (kmh0VarA != null) {
                            obj2 = kmh0VarA;
                        }
                    }
                }
                vlv.b bVarB = wlvVar.b(nanVar, obj2, u2zVarC, rpgVar);
                vlv.c cVarA = bVarB != null ? wlvVar.a(nanVar, bVarB, ww90Var, vy60Var) : null;
                if (cVarA == null) {
                    CoroutineContext coroutineContext = nanVar.i;
                    v6g v6gVar = new v6g(this, nanVar, obj2, u2zVarC, rpgVar, bVarB, h840Var2, null);
                    u6gVar2.a = h840Var2;
                    u6gVar2.d = 1;
                    Object objD = ej5.d(coroutineContext, v6gVar, u6gVar2);
                    return objD == y5bVar ? y5bVar : objD;
                }
                Map<String, Object> map = cVarA.b;
                u7n u7nVar = cVarA.a;
                bqc bqcVar = bqc.a;
                Object obj3 = map.get("coil#disk_cache_key");
                String str = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("coil#is_sampled");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new dfe0(u7nVar, nanVar, bqcVar, bVarB, str, bool != null ? bool.booleanValue() : false, h840Var2.g);
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h840 h840Var3 = u6gVar2.a;
            try {
                uj50.b(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                h840Var2 = h840Var3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return ush0.a(h840Var2.a(), th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077 A[LOOP:0: B:16:0x0055->B:20:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:26:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.aqa0 r9, defpackage.ap8 r10, defpackage.nan r11, java.lang.Object r12, defpackage.u2z r13, defpackage.rpg r14, defpackage.x1b r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6g.b(aqa0, ap8, nan, java.lang.Object, u2z, rpg, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0232  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #7 {all -> 0x01a6, blocks: (B:52:0x016a, B:54:0x0175), top: B:121:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:59:0x019c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa A[Catch: all -> 0x01a3, TryCatch #3 {all -> 0x01a3, blocks: (B:60:0x019e, B:56:0x017e, B:65:0x01aa, B:67:0x01b1), top: B:116:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #3 {all -> 0x01a3, blocks: (B:60:0x019e, B:56:0x017e, B:65:0x01aa, B:67:0x01b1), top: B:116:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
    
        if (r1 == r9) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [aqa0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r17v0, types: [T, ap8] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, ap8] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, u2z] */
    /* JADX WARN: Type inference failed for: r26v0, types: [T, u2z] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [dq40] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [dq40] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [dq40] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.nan r24, java.lang.Object r25, defpackage.u2z r26, defpackage.rpg r27, defpackage.x1b r28) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6g.c(nan, java.lang.Object, u2z, rpg, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b1 -> B:28:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.ap8 r9, defpackage.nan r10, java.lang.Object r11, defpackage.u2z r12, defpackage.rpg r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6g.d(ap8, nan, java.lang.Object, u2z, rpg, x1b):java.lang.Object");
    }
}
