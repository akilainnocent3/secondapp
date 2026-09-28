package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class w4x extends fjf0 {

    public static final /* synthetic */ class a extends saj implements Function1<String, Boolean> {
        public static final a a = new a(1, x4x.class, "isNINErrorFree", "isNINErrorFree(Ljava/lang/String;)Z", 1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String str2 = str;
            str2.getClass();
            return Boolean.valueOf(str2.length() == 11 || str2.length() == 0);
        }
    }

    public w4x() {
        super(a.a, new v4x());
    }
}
