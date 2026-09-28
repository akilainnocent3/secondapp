package defpackage;

import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class luy implements iuy {
    public final ouy a;
    public final wwd0 b = xwd0.a(vvy.a.a);
    public final tuw c = uuw.a();

    public luy(ouy ouyVar) {
        this.a = ouyVar;
    }

    @Override // defpackage.iuy
    public final void a(Map<ckf, EarlyPayoutConfig> map) {
        yvy yvyVarB = this.a.b();
        this.b.k(null, new vvy.b(new uvy(g2k.b(map.get(ckf.a)), yvyVarB.a, g2k.b(map.get(ckf.b)), yvyVarB.b)));
    }

    @Override // defpackage.iuy
    public final or60 b() {
        return new or60(new kuy(this, null));
    }

    @Override // defpackage.iuy
    public final zuy c() {
        return vuy.a(e());
    }

    @Override // defpackage.iuy
    public final v340 d() {
        return e1i.b(this.b);
    }

    @Override // defpackage.iuy
    public final uvy e() {
        Object value = this.b.getValue();
        vvy.b bVar = value instanceof vvy.b ? (vvy.b) value : null;
        return bVar != null ? bVar.a : new uvy(false, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [luy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.x1b r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.juy
            if (r0 == 0) goto L13
            r0 = r9
            juy r0 = (defpackage.juy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            juy r0 = new juy
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            wwd0 r3 = r8.b
            ouy r4 = r8.a
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L34
            quw r8 = r0.a
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r9 = move-exception
            goto Lab
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L3a:
            quw r8 = r0.a
            defpackage.uj50.b(r9)
            goto L50
        L40:
            defpackage.uj50.b(r9)
            tuw r8 = r8.c
            r0.a = r8
            r0.d = r6
            java.lang.Object r9 = r8.d(r0)
            if (r9 != r1) goto L50
            goto L6f
        L50:
            java.lang.Object r9 = r3.getValue()     // Catch: java.lang.Throwable -> L31
            boolean r2 = r9 instanceof vvy.b     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L5b
            vvy$b r9 = (vvy.b) r9     // Catch: java.lang.Throwable -> L31
            goto L5c
        L5b:
            r9 = r7
        L5c:
            if (r9 == 0) goto L61
            uvy r9 = r9.a     // Catch: java.lang.Throwable -> L31
            goto L62
        L61:
            r9 = r7
        L62:
            if (r9 == 0) goto L65
            goto La7
        L65:
            r0.a = r8     // Catch: java.lang.Throwable -> L31
            r0.d = r5     // Catch: java.lang.Throwable -> L31
            java.io.Serializable r9 = r4.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Throwable -> L31
            yvy r0 = r4.b()     // Catch: java.lang.Throwable -> L31
            uvy r1 = new uvy     // Catch: java.lang.Throwable -> L31
            ckf r2 = defpackage.ckf.a     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L31
            r4 = 0
            if (r2 == 0) goto L88
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L31
            goto L89
        L88:
            r2 = r4
        L89:
            boolean r5 = r0.a     // Catch: java.lang.Throwable -> L31
            ckf r6 = defpackage.ckf.b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r9.get(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L99
            boolean r4 = r9.booleanValue()     // Catch: java.lang.Throwable -> L31
        L99:
            boolean r9 = r0.b     // Catch: java.lang.Throwable -> L31
            r1.<init>(r2, r5, r4, r9)     // Catch: java.lang.Throwable -> L31
            vvy$b r9 = new vvy$b     // Catch: java.lang.Throwable -> L31
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r3.k(r7, r9)     // Catch: java.lang.Throwable -> L31
            r9 = r1
        La7:
            r8.f(r7)
            return r9
        Lab:
            r8.f(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luy.f(x1b):java.lang.Object");
    }
}
