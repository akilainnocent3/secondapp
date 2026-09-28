package defpackage;

import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class o8k0 {
    public static final o8k0 a = new o8k0();
    public static final XmlPullParserFactory b = XmlPullParserFactory.newInstance();

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:24:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.io.Reader r6, vn5.a r7, defpackage.x1b r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.n8k0
            if (r0 == 0) goto L13
            r0 = r8
            n8k0 r0 = (defpackage.n8k0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            n8k0 r0 = new n8k0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.c
            y5b r8 = defpackage.y5b.a
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            org.xmlpull.v1.XmlPullParser r6 = r0.b
            kotlin.jvm.functions.Function2 r7 = r0.a
            defpackage.uj50.b(r5)
            goto L7a
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r3
        L32:
            defpackage.uj50.b(r5)
            org.xmlpull.v1.XmlPullParserFactory r5 = defpackage.o8k0.b
            org.xmlpull.v1.XmlPullParser r5 = r5.newPullParser()
            r5.setInput(r6)
            int r6 = r5.getEventType()
        L42:
            if (r6 == r2) goto L80
            r1 = 2
            if (r6 != r1) goto L7b
            java.lang.String r6 = r5.getName()
            java.lang.String r1 = "string"
            boolean r6 = kotlin.jvm.internal.Intrinsics.g(r6, r1)
            if (r6 == 0) goto L7b
            java.lang.String r6 = "name"
            java.lang.String r6 = r5.getAttributeValue(r3, r6)
            java.lang.String r1 = r5.nextText()
            java.lang.String r1 = defpackage.r9e0.a(r1)
            m9e0 r4 = new m9e0
            r6.getClass()
            r1.getClass()
            r4.<init>(r6, r1)
            r0.a = r7
            r0.b = r5
            r0.e = r2
            java.lang.Object r6 = r7.invoke(r4, r0)
            if (r6 != r8) goto L79
            return r8
        L79:
            r6 = r5
        L7a:
            r5 = r6
        L7b:
            int r6 = r5.next()
            goto L42
        L80:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8k0.a(java.io.Reader, vn5$a, x1b):java.lang.Object");
    }
}
