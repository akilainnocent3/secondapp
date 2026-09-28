package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la5 implements ia5 {
    public final duw<ma5> a = new duw<>(new ma5[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ia5
    public final java.lang.Object a(defpackage.lk40 r8, defpackage.x1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ka5
            if (r0 == 0) goto L13
            r0 = r9
            ka5 r0 = (defpackage.ka5) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ka5 r0 = new ka5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L31
            int r7 = r0.d
            int r8 = r0.c
            java.lang.Object[] r2 = r0.b
            lk40 r5 = r0.a
            defpackage.uj50.b(r9)
            r9 = r5
            goto L60
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L38:
            defpackage.uj50.b(r9)
            duw<ma5> r7 = r7.a
            T[] r9 = r7.a
            int r7 = r7.c
            r2 = r9
            r9 = r8
            r8 = r3
        L44:
            if (r8 >= r7) goto L62
            r5 = r2[r8]
            ma5 r5 = (defpackage.ma5) r5
            ja5 r6 = new ja5
            r6.<init>(r9, r3)
            r0.a = r9
            r0.b = r2
            r0.c = r8
            r0.d = r7
            r0.i = r4
            java.lang.Object r5 = defpackage.ea5.a(r5, r6, r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            int r8 = r8 + r4
            goto L44
        L62:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la5.a(lk40, x1b):java.lang.Object");
    }
}
