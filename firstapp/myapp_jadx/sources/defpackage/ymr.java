package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ymr {
    public final yho a;
    public final JsonSerializeService b;

    public ymr(yho yhoVar, JsonSerializeService jsonSerializeService) {
        this.a = yhoVar;
        this.b = jsonSerializeService;
    }

    public final Map<String, String> a(String str) {
        Map<String, String> map = (Map) this.b.fromJson(str, (Type) Map.class);
        if (map != null) {
            return map;
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r12.g(r0, r9) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, java.lang.String r11, defpackage.x1b r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.vmr
            if (r0 == 0) goto L13
            r0 = r12
            vmr r0 = (defpackage.vmr) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            vmr r0 = new vmr
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.d
            java.lang.String r9 = (java.lang.String) r9
            defpackage.uj50.b(r12)
            goto L94
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L35:
            java.lang.Object r10 = r0.d
            ymr r10 = (defpackage.ymr) r10
            wm20 r11 = r0.c
            java.lang.String r2 = r0.b
            java.lang.String r4 = r0.a
            defpackage.uj50.b(r12)
            r8 = r12
            r12 = r11
            r11 = r2
            r2 = r8
            goto L6c
        L47:
            defpackage.uj50.b(r12)
            yho r12 = r9.a
            rkd r2 = r12.e
            ohp<java.lang.Object>[] r6 = defpackage.yho.o
            r7 = 3
            r6 = r6[r7]
            wm20 r12 = r2.a(r12, r6)
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.d = r9
            r0.i = r4
            java.lang.String r2 = ""
            java.lang.Object r2 = r12.e(r0, r2)
            if (r2 != r1) goto L6a
            goto L93
        L6a:
            r4 = r10
            r10 = r9
        L6c:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r10 = r10.a(r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r10)
            r2.put(r4, r11)
            com.sporty.android.core.model.json.JsonSerializeService r9 = r9.b
            java.lang.String r9 = r9.toJson(r2)
            r9.getClass()
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.d = r9
            r0.i = r3
            java.lang.Object r9 = r12.g(r0, r9)
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymr.b(java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r12.g(r0, r9) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, java.lang.String r11, defpackage.x1b r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.wmr
            if (r0 == 0) goto L13
            r0 = r12
            wmr r0 = (defpackage.wmr) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            wmr r0 = new wmr
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.d
            java.lang.String r9 = (java.lang.String) r9
            defpackage.uj50.b(r12)
            goto L94
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L35:
            java.lang.Object r10 = r0.d
            ymr r10 = (defpackage.ymr) r10
            wm20 r11 = r0.c
            java.lang.String r2 = r0.b
            java.lang.String r4 = r0.a
            defpackage.uj50.b(r12)
            r8 = r12
            r12 = r11
            r11 = r2
            r2 = r8
            goto L6c
        L47:
            defpackage.uj50.b(r12)
            yho r12 = r9.a
            rkd r2 = r12.f
            ohp<java.lang.Object>[] r6 = defpackage.yho.o
            r7 = 4
            r6 = r6[r7]
            wm20 r12 = r2.a(r12, r6)
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.d = r9
            r0.i = r4
            java.lang.String r2 = ""
            java.lang.Object r2 = r12.e(r0, r2)
            if (r2 != r1) goto L6a
            goto L93
        L6a:
            r4 = r10
            r10 = r9
        L6c:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r10 = r10.a(r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r10)
            r2.put(r4, r11)
            com.sporty.android.core.model.json.JsonSerializeService r9 = r9.b
            java.lang.String r9 = r9.toJson(r2)
            r9.getClass()
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.d = r9
            r0.i = r3
            java.lang.Object r9 = r12.g(r0, r9)
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymr.c(java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r12.g(r0, r9) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, java.lang.String r11, defpackage.x1b r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.xmr
            if (r0 == 0) goto L13
            r0 = r12
            xmr r0 = (defpackage.xmr) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            xmr r0 = new xmr
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.d
            java.lang.String r9 = (java.lang.String) r9
            defpackage.uj50.b(r12)
            goto L94
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L35:
            java.lang.Object r10 = r0.d
            ymr r10 = (defpackage.ymr) r10
            wm20 r11 = r0.c
            java.lang.String r2 = r0.b
            java.lang.String r4 = r0.a
            defpackage.uj50.b(r12)
            r8 = r12
            r12 = r11
            r11 = r2
            r2 = r8
            goto L6c
        L47:
            defpackage.uj50.b(r12)
            yho r12 = r9.a
            rkd r2 = r12.g
            ohp<java.lang.Object>[] r6 = defpackage.yho.o
            r7 = 5
            r6 = r6[r7]
            wm20 r12 = r2.a(r12, r6)
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.d = r9
            r0.i = r4
            java.lang.String r2 = ""
            java.lang.Object r2 = r12.e(r0, r2)
            if (r2 != r1) goto L6a
            goto L93
        L6a:
            r4 = r10
            r10 = r9
        L6c:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r10 = r10.a(r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r10)
            r2.put(r4, r11)
            com.sporty.android.core.model.json.JsonSerializeService r9 = r9.b
            java.lang.String r9 = r9.toJson(r2)
            r9.getClass()
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.d = r9
            r0.i = r3
            java.lang.Object r9 = r12.g(r0, r9)
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymr.d(java.lang.String, java.lang.String, x1b):java.lang.Object");
    }
}
