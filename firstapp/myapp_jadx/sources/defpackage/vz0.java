package defpackage;

import androidx.compose.runtime.m;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vz0 implements twd0<Object> {
    public final List<z7i> a;
    public final w9h0 b;
    public final z01 c;
    public final Function1<z9h0.b, Unit> d;
    public final k70 e;
    public final ytw f;
    public boolean i = true;

    public vz0(List list, Object obj, w9h0 w9h0Var, z01 z01Var, Function1 function1, k70 k70Var) {
        this.a = list;
        this.b = w9h0Var;
        this.c = z01Var;
        this.d = function1;
        this.e = k70Var;
        this.f = m.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0061, B:27:0x006d, B:32:0x008f, B:35:0x00bc, B:20:0x004c, B:23:0x0058), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0061, B:27:0x006d, B:32:0x008f, B:35:0x00bc, B:20:0x004c, B:23:0x0058), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0061, B:27:0x006d, B:32:0x008f, B:35:0x00bc, B:20:0x004c, B:23:0x0058), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0061, B:27:0x006d, B:32:0x008f, B:35:0x00bc, B:20:0x004c, B:23:0x0058), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[PHI: r0 r4 r11
      0x00ce: PHI (r0v13 java.util.List<z7i>) = (r0v8 java.util.List<z7i>), (r0v14 java.util.List<z7i>) binds: [B:26:0x006b, B:38:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:26:0x006b, B:38:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:26:0x006b, B:38:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006b -> B:39:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ca -> B:38:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.x1b r18) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz0.b(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(z7i z7iVar, x1b x1bVar) {
        tz0 tz0Var;
        if (x1bVar instanceof tz0) {
            tz0Var = (tz0) x1bVar;
            int i = tz0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tz0Var.d = i - Integer.MIN_VALUE;
            } else {
                tz0Var = new tz0(this, x1bVar);
            }
        } else {
            tz0Var = new tz0(this, x1bVar);
        }
        Object obj = tz0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = tz0Var.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z7i z7iVar2 = tz0Var.a;
                uj50.b(obj);
                return obj;
            }
            uj50.b(obj);
            uz0 uz0Var = new uz0(this, z7iVar, null);
            tz0Var.a = z7iVar;
            tz0Var.d = 1;
            Object objC = vxf0.c(15000L, uz0Var, tz0Var);
            return objC == y5bVar ? y5bVar : objC;
        } catch (CancellationException e) {
            if (!i9p.h(tz0Var.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            l5b l5bVar = (l5b) tz0Var.getContext().get(l5b.a.a);
            if (l5bVar != null) {
                l5bVar.handleException(tz0Var.getContext(), new IllegalStateException("Unable to load font " + z7iVar, e2));
            }
            return null;
        }
    }

    @Override // defpackage.twd0
    public final Object getValue() {
        return ((x5a0) this.f).getValue();
    }
}
