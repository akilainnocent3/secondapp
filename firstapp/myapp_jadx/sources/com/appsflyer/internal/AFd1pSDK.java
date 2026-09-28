package com.appsflyer.internal;

import defpackage.qlr;
import defpackage.rtg;
import defpackage.tug;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1pSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "AFAdRevenueData", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends qlr implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass2 getMonetizationNetwork = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            stackTraceElement.getClass();
            return "at " + stackTraceElement;
        }
    }

    public static final AFc1cSDK AFAdRevenueData(Throwable th, String str) {
        th.getClass();
        str.getClass();
        th.getClass();
        return new AFc1cSDK(tug.a(th.getClass().getName(), ": ", str), getRevenue(th), rtg.b(th), 0, 8, null);
    }

    private static String getRevenue(Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!kotlin.text.c.u(className, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return AFd1rSDK.AFAdRevenueData(th + "\n" + CollectionsKt.a0(arrayList, "\n", null, null, AnonymousClass2.getMonetizationNetwork, 30), "SHA-256");
    }
}
