package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sty {
    public final v5b a;
    public final wty b;
    public final ksy c;
    public final gx0<b> d;
    public final Object e;
    public final tb5 f;

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpSelectionAttributionDispatcher$1", f = "OneUpSelectionAttributionDispatcher.kt", l = {30, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public c77 a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sty.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r1
          0x002e: PHI (r1v3 c77) = (r1v1 c77), (r1v2 c77), (r1v5 c77) binds: [B:10:0x0021, B:17:0x004e, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0039 A[PHI: r1 r6
          0x0039: PHI (r1v2 c77) = (r1v3 c77), (r1v4 c77) binds: [B:12:0x0036, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x0039: PHI (r6v2 java.lang.Object) = (r6v7 java.lang.Object), (r6v0 java.lang.Object) binds: [B:12:0x0036, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.b
                sty r2 = defpackage.sty.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L14
                c77 r1 = r5.a
                defpackage.uj50.b(r6)
                goto L2e
            L14:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L1b:
                c77 r1 = r5.a
                defpackage.uj50.b(r6)
                goto L39
            L21:
                defpackage.uj50.b(r6)
                tb5 r6 = r2.f
                r6.getClass()
                tb5$a r1 = new tb5$a
                r1.<init>()
            L2e:
                r5.a = r1
                r5.b = r4
                java.lang.Object r6 = r1.b(r5)
                if (r6 != r0) goto L39
                goto L50
            L39:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                r1.next()
                kotlin.Unit r6 = kotlin.Unit.a
                r5.a = r1
                r5.b = r3
                java.lang.Object r6 = r2.a(r5)
                if (r6 != r0) goto L2e
            L50:
                return r0
            L51:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: sty.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public interface b {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -902453238;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* JADX INFO: renamed from: sty$b$b, reason: collision with other inner class name */
        public static final class C1102b implements b {
            public final yty a;
            public final boolean b;

            public C1102b(yty ytyVar, boolean z) {
                this.a = ytyVar;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1102b)) {
                    return false;
                }
                C1102b c1102b = (C1102b) obj;
                return this.a.equals(c1102b.a) && this.b == c1102b.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "SelectionChanged(context=" + this.a + ", droppable=" + this.b + ")";
            }
        }
    }

    public sty(@ApplicationScope v5b v5bVar, wty wtyVar, ksy ksyVar) {
        v5bVar.getClass();
        wtyVar.getClass();
        ksyVar.getClass();
        this.a = v5bVar;
        this.b = wtyVar;
        this.c = ksyVar;
        this.d = new gx0<>();
        this.e = new Object();
        this.f = d77.b(-1, 6, null);
        ej5.c(v5bVar, null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        tty ttyVar;
        b bVarRemoveFirst;
        if (x1bVar instanceof tty) {
            ttyVar = (tty) x1bVar;
            int i = ttyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttyVar.c = i - Integer.MIN_VALUE;
            } else {
                ttyVar = new tty(this, x1bVar);
            }
        } else {
            ttyVar = new tty(this, x1bVar);
        }
        Object obj = ttyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ttyVar.c;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        while (true) {
            synchronized (this.e) {
                bVarRemoveFirst = this.d.isEmpty() ? null : this.d.removeFirst();
            }
            if (bVarRemoveFirst == null) {
                return Unit.a;
            }
            if (bVarRemoveFirst.equals(b.a.a)) {
                wty wtyVar = this.b;
                ttyVar.c = 1;
                if (wtyVar.a(ttyVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (!(bVarRemoveFirst instanceof b.C1102b)) {
                    uhc.a();
                    return null;
                }
                wty wtyVar2 = this.b;
                yty ytyVar = ((b.C1102b) bVarRemoveFirst).a;
                ttyVar.c = 2;
                if (wtyVar2.b(ytyVar, ttyVar) == y5bVar) {
                    return y5bVar;
                }
            }
        }
    }

    public final void b(b bVar) {
        boolean zC;
        synchronized (this.e) {
            try {
                if (Intrinsics.g(bVar, b.a.a)) {
                    this.d.clear();
                    this.d.addLast(bVar);
                    zC = true;
                } else {
                    if (!(bVar instanceof b.C1102b)) {
                        throw new uwx();
                    }
                    zC = c((b.C1102b) bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!zC) {
            itf0.a.n("1UP attribution mutation buffer is full", new Object[0]);
        } else if (this.f.c(Unit.a) instanceof h77.b) {
            itf0.a.n("1UP attribution dispatcher is unavailable", new Object[0]);
        }
    }

    public final boolean c(b.C1102b c1102b) {
        gx0<b> gx0Var = this.d;
        if (gx0Var.c >= 64) {
            Iterator<b> it = gx0Var.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                b next = it.next();
                if ((next instanceof b.C1102b) && ((b.C1102b) next).b) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                gx0Var.c(i);
            } else {
                if (c1102b.b) {
                    return false;
                }
                gx0Var.clear();
                gx0Var.addLast(b.a.a);
            }
        }
        gx0Var.addLast(c1102b);
        return true;
    }
}
