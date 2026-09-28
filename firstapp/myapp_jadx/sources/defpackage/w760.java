package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w760 {
    public static final w760 a = new w760();

    public static final class a {
        public final tx60 a;
        public final ia60 b;
        public final boolean c;
        public final fg60 d;
        public final xc60 e;

        public a(tx60 tx60Var, ia60 ia60Var, boolean z, fg60 fg60Var, xc60 xc60Var) {
            tx60Var.getClass();
            ia60Var.getClass();
            fg60Var.getClass();
            xc60Var.getClass();
            this.a = tx60Var;
            this.b = ia60Var;
            this.c = z;
            this.d = fg60Var;
            this.e = xc60Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            return "InternalPoolData(fsm=" + this.a + ", betResult=" + this.b + ", supportExtraBall=" + this.c + ", animationPeriodConfig=" + this.d + ", extraBallResult=" + this.e + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:22:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.fg60 r7, defpackage.dw1 r8, defpackage.x1b r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.z760
            if (r0 == 0) goto L13
            r0 = r9
            z760 r0 = (defpackage.z760) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            z760 r0 = new z760
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.e
            y5b r9 = defpackage.y5b.a
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            int r7 = r0.d
            int r8 = r0.c
            dw1 r1 = r0.b
            fg60 r3 = r0.a
            defpackage.uj50.b(r6)
            r6 = r1
            r1 = r0
            r0 = r6
            r6 = r3
            goto L70
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L3a:
            defpackage.uj50.b(r6)
            r6 = 0
            r1 = 5
            r5 = r7
            r7 = r6
            r6 = r5
            r5 = r0
            r0 = r8
            r8 = r1
            r1 = r5
        L46:
            if (r7 >= r8) goto L72
            ov1$a r3 = ov1.a.a
            r0.getClass()
            r3.getClass()
            uf00<ytw<ov1>> r4 = r0.b
            java.lang.Object r4 = kotlin.collections.CollectionsKt.V(r7, r4)
            ytw r4 = (defpackage.ytw) r4
            if (r4 == 0) goto L5d
            r4.setValue(r3)
        L5d:
            long r3 = r6.a
            r1.a = r6
            r1.b = r0
            r1.c = r8
            r1.d = r7
            r1.i = r2
            java.lang.Object r3 = defpackage.hkd.b(r3, r1)
            if (r3 != r9) goto L70
            return r9
        L70:
            int r7 = r7 + r2
            goto L46
        L72:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w760.a(fg60, dw1, x1b):java.lang.Object");
    }
}
