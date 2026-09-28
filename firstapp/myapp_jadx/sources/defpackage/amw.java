package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
public final class amw extends tje0 implements Function2<ez20<? super Unit>, v1b<? super Unit>, Object> {
    public zlw a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ File d;

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ wse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wse wseVar) {
            super(0);
            this.a = wseVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.dispose();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<String, Unit> {
        public final /* synthetic */ File a;
        public final /* synthetic */ ez20<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(File file, ez20<? super Unit> ez20Var) {
            super(1);
            this.a = file;
            this.b = ez20Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            if (Intrinsics.g(str, this.a.getName())) {
                Unit unit = Unit.a;
                ez20<Unit> ez20Var = this.b;
                Object objC = ez20Var.c(unit);
                if (objC instanceof h77.b) {
                    Object obj = ((h77) dj5.a(e.a, new q77(ez20Var, unit, null))).a;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amw(File file, v1b<? super amw> v1bVar) {
        super(2, v1bVar);
        this.d = file;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        amw amwVar = new amw(this.d, v1bVar);
        amwVar.c = obj;
        return amwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super Unit> ez20Var, v1b<? super Unit> v1bVar) {
        return ((amw) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (defpackage.az20.a(r4, r10, r9) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [wse] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [zlw] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            defpackage.uj50.b(r10)
            goto L97
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L18:
            zlw r1 = r9.a
            java.lang.Object r4 = r9.c
            ez20 r4 = (defpackage.ez20) r4
            defpackage.uj50.b(r10)
            goto L85
        L22:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.c
            ez20 r10 = (defpackage.ez20) r10
            amw$b r1 = new amw$b
            java.io.File r5 = r9.d
            r1.<init>(r5, r10)
            java.lang.Object r5 = defpackage.bmw.b
            java.io.File r5 = r9.d
            java.io.File r5 = r5.getParentFile()
            r5.getClass()
            java.io.File r5 = r5.getCanonicalFile()
            java.lang.String r5 = r5.getPath()
            java.lang.Object r6 = defpackage.bmw.b
            monitor-enter(r6)
            java.util.LinkedHashMap r7 = defpackage.bmw.c     // Catch: java.lang.Throwable -> L5a
            r5.getClass()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r8 = r7.get(r5)     // Catch: java.lang.Throwable -> L5a
            if (r8 != 0) goto L5c
            bmw r8 = new bmw     // Catch: java.lang.Throwable -> L5a
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L5a
            r7.put(r5, r8)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r9 = move-exception
            goto L9a
        L5c:
            bmw r8 = (defpackage.bmw) r8     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>> r7 = r8.a     // Catch: java.lang.Throwable -> L5a
            r7.add(r1)     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>> r7 = r8.a     // Catch: java.lang.Throwable -> L5a
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L5a
            if (r7 != r4) goto L6e
            r8.startWatching()     // Catch: java.lang.Throwable -> L5a
        L6e:
            monitor-exit(r6)
            zlw r6 = new zlw
            r6.<init>()
            kotlin.Unit r1 = kotlin.Unit.a
            r9.c = r10
            r9.a = r6
            r9.b = r4
            java.lang.Object r1 = r10.j(r9, r1)
            if (r1 != r0) goto L83
            goto L96
        L83:
            r4 = r10
            r1 = r6
        L85:
            amw$a r10 = new amw$a
            r10.<init>(r1)
            r9.c = r2
            r9.a = r2
            r9.b = r3
            java.lang.Object r9 = defpackage.az20.a(r4, r10, r9)
            if (r9 != r0) goto L97
        L96:
            return r0
        L97:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L9a:
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
