package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v3a0 {
    public final tuw a = uuw.a();
    public final ytw b = m.b(null);

    public static final class a implements j3a0 {
        public final n4a0 a;
        public final bc6 b;

        public a(n4a0 n4a0Var, bc6 bc6Var) {
            this.a = n4a0Var;
            this.b = bc6Var;
        }

        @Override // defpackage.j3a0
        public final n4a0 a() {
            return this.a;
        }

        @Override // defpackage.j3a0
        public final void b() {
            bc6 bc6Var = this.b;
            if (bc6Var.p() instanceof bzx) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(j4a0.b);
            }
        }

        @Override // defpackage.j3a0
        public final void dismiss() {
            bc6 bc6Var = this.b;
            if (bc6Var.p() instanceof bzx) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(j4a0.a);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public static final class b implements n4a0 {
        public final String a;
        public final String b;
        public final boolean c;
        public final k3a0 d;

        public b(String str, String str2, boolean z, k3a0 k3a0Var) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = k3a0Var;
        }

        @Override // defpackage.n4a0
        public final String a() {
            return this.b;
        }

        @Override // defpackage.n4a0
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        @Override // defpackage.n4a0
        public final k3a0 getDuration() {
            return this.d;
        }

        @Override // defpackage.n4a0
        public final String getMessage() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + mtg0.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
        }
    }

    public static Object b(v3a0 v3a0Var, String str, String str2, boolean z, k3a0 k3a0Var, v1b v1bVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            k3a0Var = str2 == null ? k3a0.a : k3a0.b;
        }
        v3a0Var.getClass();
        return v3a0Var.a(new b(str, str2, z, k3a0Var), v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [v3a0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r7v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(v3a0.b r8, defpackage.v1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.w3a0
            if (r0 == 0) goto L13
            r0 = r9
            w3a0 r0 = (defpackage.w3a0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            w3a0 r0 = new w3a0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            ytw r3 = r7.b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            quw r7 = r0.b
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L2f:
            r8 = move-exception
            goto L7e
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L37:
            quw r7 = r0.b
            n4a0 r8 = r0.a
            defpackage.uj50.b(r9)
            goto L51
        L3f:
            defpackage.uj50.b(r9)
            r0.a = r8
            tuw r7 = r7.a
            r0.b = r7
            r0.e = r5
            java.lang.Object r9 = r7.d(r0)
            if (r9 != r1) goto L51
            goto L74
        L51:
            r0.a = r8     // Catch: java.lang.Throwable -> L2f
            r0.b = r7     // Catch: java.lang.Throwable -> L2f
            r0.e = r4     // Catch: java.lang.Throwable -> L2f
            bc6 r9 = new bc6     // Catch: java.lang.Throwable -> L2f
            v1b r0 = defpackage.yzo.b(r0)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2f
            r9.q()     // Catch: java.lang.Throwable -> L2f
            v3a0$a r0 = new v3a0$a     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2f
            r8 = r3
            x5a0 r8 = (defpackage.x5a0) r8     // Catch: java.lang.Throwable -> L2f
            r8.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.o()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            x5a0 r3 = (defpackage.x5a0) r3     // Catch: java.lang.Throwable -> L84
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L84
            r7.f(r6)
            return r9
        L7e:
            x5a0 r3 = (defpackage.x5a0) r3     // Catch: java.lang.Throwable -> L84
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            r7.f(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3a0.a(v3a0$b, v1b):java.lang.Object");
    }
}
